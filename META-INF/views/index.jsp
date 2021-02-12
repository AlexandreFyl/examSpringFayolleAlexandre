<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>News Manager</title>
</head>
<body>
<div align="center">
    <h2>News Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">Nouvelle news</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Tile</th>
            <th>Content</th>
            <th>Image</th>
            <th>Date de publication</th>
        </tr>
        <c:forEach items="${listCustomer}" var="news">
            <tr>
                <td>${news.id}</td>
                <td>${news.title}</td>
                <td>${news.content}</td>
                <td><img src="${news.image}" alt=""></td>
                <td>${news.publishing_date}</td>
                <td>
                    <a href="/edit?id=${news.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/delete?id=${news.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>