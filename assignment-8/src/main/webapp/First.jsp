<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>enter details to find simple interest</h2>
   <form action="<%= request.getContextPath() %>/HelloServelet" method="post">
   principle Amount :<input type="number" name="princ"><br>
   time :<input type="number" name="rate"><br>
   interest :<input type="number" name="Time"><br>
   <button type="submit">Submit</button>
   </form>
</body>
</html>