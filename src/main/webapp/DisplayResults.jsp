<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import= "java.util.ArrayList" %>
    <%@page import= "st.STUDENT"%>
    <%@page import= "st.RESULTS"%>
    <%@page import= "st.STUDENTDBUTILL"%>
    <%@page import = "java.sql.*" %>
	<%@page import = "java.sql.DriverManager" %>
	<%@page import = "java.sql.Connection" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Results</title>

</head>
<body>

<h1>Student resutls</h1>   

<table boarder = "2px" action = "DESPLAYRESULTS" >


<%

   String res = (String)session.getAttribute("result");
   RESULTS resutls = STUDENTDBUTILL.getMarks(res);
   System.out.println(res);
  
  
%>



 <tr>
    <th>Student ID</th>
    <th>Student Name</th>
    <th>Marks</th>
  </tr>
  <tr>
    <td><%=resutls.getId() %></td>
    <td><%=resutls.getmName() %></td>
    <td><%=resutls.getMarks() %></td>
  </tr>
 </table>








 <style>
    h1{
        top: 5%;
        color: aliceblue;
        text-align: center;
    }
    table {
      border-collapse: collapse;
      width: 90%;
      position: absolute;
      top: 40%;
      left: 80px;;
      right: 30px;
        }
    
    th, td {
      padding: 8px;
      text-align: center;
      color: rgb(64, 26, 26);
      border-bottom: 1px solid #ddd;
    }
    
    tr:hover {background-color: coral;}
    </style>

<!-- Script for Sidebar, Tabs, Accordions, Progress bars and slideshows -->
<style>
body {
    background-image: linear-gradient(to right , #d5142b , #d91d1d);
}

.searchBox {
    position: absolute;
    top: 50%;
    left: 50%;
    transform:  translate(-50%,50%);
    background: #2f3640;
    height: 40px;
    border-radius: 40px;
    padding: 10px;

}

.searchBox:hover > .searchInput {
    width: 240px;
    padding: 0 6px;
}

.searchBox:hover > .searchButton {
  background: white;
  color : #2f3640;
}

.searchButton {
    color: white;
    float: right;
    width: 40px;
    height: 40px;
    border-radius: 50%;
    background: #2f3640;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: 0.4s;
}

.searchInput {
    border:none;
    background: none;
    outline:none;
    float:left;
    padding: 0;
    color: white;
    font-size: 16px;
    transition: 0.4s;
    line-height: 40px;
    width: 0px;

}

@media screen and (max-width: 620px) {
.searchBox:hover > .searchInput {
    width: 150px;
    padding: 0 6px;
}
}
</style>


</body>
</html>