<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>    
<!DOCTYPE html>
<html>
<style>
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  line-height: 1.5;
  width: 500px;
  padding-bottom: 50px;
  font-family: Verdana;
  margin: 20px;
  }
  h3 {
  text-align: center;
  }
</style>
<head>
<meta charset="UTF-8">
<script src="scripts/main.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
	String etunimi = request.getParameter("etunimi");
	String sukunimi = request.getParameter("sukunimi");
	String vuosiS = request.getParameter("vuosi");
	String sposti = request.getParameter("sposti");
	String puhelin = request.getParameter("puhelin");
	
	int vuosi = Integer.parseInt(vuosiS);
	int nyt = Calendar.getInstance().get(Calendar.YEAR);
	if (nyt - vuosi >= 18){
		out.print("<div><h4>Käyttäjän tiedot:</h4> Nimi: " +  etunimi + " " + sukunimi + "<br>");
		out.print("Puhelin: " + puhelin + "<br>Sähköposti: " + sposti);
		out.print("<br>Ikä: " + (nyt - vuosi) + "</div>");
	} else {
		out.print("<div><h3>Alaikäinen</h3></div>");
%>
	<script>
		
	 	setTimeout(function () {
		   window.location.href = "kysy.jsp";
		}, 5000)
		
	</script>
<%	
	}
%>
<script type="text/javascript">
$(document).ready(function(){
	var nimi = requestURLParam("etunimi");
	console.log(nimi);
});
</script>

</body>
</html>
<!-- 3)	Ota tiedot vastaan sivulla nayta.jsp, 
jossa näytät käyttäjän tiedot ja iän. 
Jos käyttäjä on alle 18-vuotias, älä näytä tietoja, 
vaan kirjoita ”Alaikäinen” ja lähetä käyttäjä 5 sekunnin viiveen jälkeen
 takaisin kysy.jsp-sivulle. 
 -->