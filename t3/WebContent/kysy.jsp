<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 3px;
  box-sizing: border-box;
  font-size: 100%;
}

input[type=submit] {
  width: 33%;
  text-align: center;
  background-color: green;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 3px;
  font-size: 110%;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  width: 500px;
  font-family: Verdana;
  margin: 20px;
  padding-bottom: 30px;
}
h3 {
  color: green;
  margin-bottom: 30px;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<h3>Anna seuraavat tiedot:</h3>
<form action="nayta.jsp" method="POST">
	<label for="etunimi">Etunimi</label><br>
	<input type="text" name="etunimi"><br>
	<label for="sukunimi">Sukunimi</label><br>
	<input type="text" name="sukunimi"><br>
	<label for="sposti">Sähköposti</label><br>
	<input type="text" name="sposti"><br>
	<label for="puhelin">Puhelin</label><br>
	<input type="text" name="puhelin"><br>
	<label for="vuosi">Syntymävuosi</label><br>
	<input type="text" name="vuosi"><br>
	<input type="submit" value="Lähetä">
</form>
</div>
</body>
</html>
<!-- 2)	Tee sivulle kysy.jsp lomake, jossa pyydät käyttäjltä seuraavat tiedot:
a.	Etunimi
b.	Sukunimi
c.	Sähköposti
d.	Puhelin
e.	Syntymävuosi
 -->