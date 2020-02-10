<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
        <script>
            $(function () {
                $( "#date" ).datepicker();
                $( "#date" ).datepicker("option", "dateFormat", "yy/mm/dd");
            });
        </script>
    </head>
    <body style="padding: 20px">
        <form:form modelAttribute="student" method="post" action="/Spring_0117/mvc/student/${action}" class="pure-form">
            <fieldset>
                <legend>Student Form</legend>
                <form:input path="id" readonly="true"/><p />
                <form:input path="name" placeholder="請輸入name"/> <form:errors path="name" style="color: red" /><p />
                <form:input path="age" placeholder="請輸入age" type="number" /> <form:errors path="age" style="color: red" /><p />
                <form:input path="date" placeholder="請輸入date" readonly="true" /> <form:errors path="date" style="color: red" /><p />
                <button type="submit" class="pure-button pure-button-primary">${action}</button>
                <hr />
                <form:errors path="*" />
            </fieldset>
        </form:form>
        <table class="pure-table pure-table-bordered">
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>age</th>
                    <th>date</th>
                    <th>update</th>
                    <th>delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${students}">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.age}</td>
                    <td><fmt:formatDate value="${s.date}" pattern="yyyy/MM/dd"/></td>
                    <td><a href="/Spring_0117/mvc/student/get/${s.id}">update</a></td>
                    <td><a href="/Spring_0117/mvc/student/delete/${s.id}">delete</a></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
