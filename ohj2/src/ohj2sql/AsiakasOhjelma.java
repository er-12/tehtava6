package ohj2sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AsiakasOhjelma {

	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null; 
	private String sql;
	private String db ="Myynti.sqlite";
	private Lukija lukija = new Lukija();
	
	private Connection yhdista(){		
    	Connection con = null;    	
    	String path = System.getProperty("user.dir")+"/";    	
    	String url = "jdbc:sqlite:"+path+db;    	
    	try {	       
    		Class.forName("org.sqlite.JDBC");
	        con = DriverManager.getConnection(url);	
	        
	     }catch (Exception e){	
	    	 System.out.println("Yhteyden avaus epäonnistui.");
	        e.printStackTrace();	         
	     }
	     return con;
	}
	
	private void naytaValikko() {
		System.out.println("1. Näytä kaikki asiakkaat");
		System.out.println("2. Lisää asiakas");
		System.out.println("3. Päivitä asiakkaan tiedot");
		System.out.println("4. Poista asiakas");
		System.out.println("0. Lopeta");
		switch (lukija.lueKokonaisluku("Valintasi: ")) {
		case 1:
			listaaAsiakkaat();
			break;
		case 2:
			lisaaAsiakas();
			break;
		case 3:
			muutaAsiakas();
			break;
		case 4:
			poistaAsiakas();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Väärä valinta!");
			break;
		}
		naytaValikko();		
	}
	
	private void listaaAsiakkaat(){
		sql = "SELECT * FROM asiakkaat";       
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);        		
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){ //jos kysely onnistui					
					System.out.println();
					while(rs.next()){
						System.out.print(rs.getInt(1) +"\t\t");
						System.out.print(rs.getString(2)+"\t\t");
						System.out.print(rs.getString(3)+"\t\t");	
						System.out.print(rs.getString(4)+"\t\t");
						System.out.print(rs.getString(5)+"\t\t");
						System.out.println();
					}
					System.out.println();
				}
				con.close();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void lisaaAsiakas() {
		String en = lukija.lueTeksti("Anna lisättävän asiakkaan etunimi: ");
		String sn = lukija.lueTeksti("Anna lisättävän asiakkaan sukunimi: ");
		String puh = lukija.lueTeksti("Anna lisättävän asiakkaan puhelinnro: ");
		String sp = lukija.lueTeksti("Anna lisättävän asiakkaan sposti: ");
		if(en.length()>1 && sn.length()>1 && puh.length()>1 && sp.length()>1){
			sql="INSERT INTO asiakkaat (etunimi, sukunimi, puhelin, sposti) VALUES (?,?,?,?)";						  
			try {
				con = yhdista();
				stmtPrep=con.prepareStatement(sql); 
				stmtPrep.setString(1, en);
				stmtPrep.setString(2, sn);
				stmtPrep.setString(3, puh);
				stmtPrep.setString(4, sp);
				stmtPrep.executeUpdate();
		        con.close();
		        System.out.println("Asiakkaan lisääminen onnistui.");
		        listaaAsiakkaat();
			} catch (SQLException e) {	
				System.out.println("Asiakkaan lisääminen epäonnistui.");
				e.printStackTrace();
			}
		}		
	}
	
	private void muutaAsiakas() {
		listaaAsiakkaat();
		int nro = lukija.lueKokonaisluku("Anna muutettavan asiakkaan id: ");
		sql = "SELECT * FROM asiakkaat WHERE asiakas_id=?";       
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql); 
				stmtPrep.setInt(1, nro);
        		rs = stmtPrep.executeQuery();  
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli id on käytössä
        			String uusien = lukija.lueTeksti("Anna uusi etunimi (enter ohittaa): ");
        			String uusisn = lukija.lueTeksti("Anna uusi sukunimi (enter ohittaa): ");
        			String uusipuh = lukija.lueTeksti("Anna uusi puhelinnro (enter ohittaa): ");
        			String uusisp = lukija.lueTeksti("Anna uusi sposti (enter ohittaa): ");
        			
					if(uusien.equals("")) {
						uusien=rs.getString("etunimi");
					}
					if(uusisn.equals("")) {
						uusisn=rs.getString("sukunimi");
					}
					if(uusipuh.equals("")) {
						uusipuh=rs.getString("puhelin");
					}
					if(uusisp.equals("")) {
						uusisp=rs.getString("sposti");										
					}
					sql="UPDATE asiakkaat SET etunimi=?, sukunimi=?, puhelin=?, sposti=? WHERE asiakas_id=?";	        				
					stmtPrep=con.prepareStatement(sql);
					stmtPrep.setString(1, uusien);
					stmtPrep.setString(2, uusisn);
					stmtPrep.setString(3, uusipuh);
					stmtPrep.setString(4, uusisp);
					stmtPrep.setInt(5, nro);
					stmtPrep.executeUpdate();					
				}else{
					System.out.println("Antamasi asiakastunnus ei ole käytössä");
				}
        		con.close();
    			listaaAsiakkaat();
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void poistaAsiakas() {
		listaaAsiakkaat();
		String id = lukija.lueTeksti("Anna poistettavan asiakkaan asiakas_id: ");
		sql = "SELECT * FROM asiakkaat WHERE asiakas_id=?";      
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql); 
				stmtPrep.setString(1, id);
        		rs = stmtPrep.executeQuery();  
        		if(rs.isBeforeFirst()){ //jos kysely tuotti dataa, eli rekisterinumero on käytössä
        			rs.next(); //siirrytään 1. tietueriville
        			if(lukija.lueTeksti("Haluatko varmasti poistaa asiakkaan "
        					+id+" "+rs.getString("etunimi")+" "+rs.getString("sukunimi")
        					+ "(k/e): ").equalsIgnoreCase("k")){        				
        				sql="DELETE FROM asiakkaat WHERE asiakas_id=?";	        				
    					stmtPrep=con.prepareStatement(sql);     					
    					stmtPrep.setString(1, id);
    					System.out.println(id);    					
    					stmtPrep.executeUpdate(); 
        			}	       			
				}else{
					System.out.println("Antamasi asiakas_id ei ole käytössä!\n");
				}				
			}	
			con.close();
			listaaAsiakkaat();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
		
	public static void main(String[] args) {
		AsiakasOhjelma ohjelma = new AsiakasOhjelma();
		ohjelma.naytaValikko();	
	}

}
