<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css">
        <title>JSP Page</title>
    </head>
    <body style="padding: 20px">
        <form:form modelAttribute="javaExam" method="post" action="/Spring_0117/mvc/javaexam/${action}" class="pure-form">
            <fieldset>
                <legend>Java Exam Form</legend>
                <form:input path="id" readonly="true"/><p />
                <form:select path="student.id" items="${students}" itemLabel="name" itemValue="id" /><p />
                <form:input path="score" placeholder="請輸入score"/><p />
                <button type="submit" class="pure-button pure-button-primary">${action}</button>
            </fieldset>
        </form:form>
        <table class="pure-table pure-table-bordered">
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>score</th>
                    <th>update</th>
                    <th>delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="j" items="${javaexams}">
                <tr>
                    <td>${j.id}</td>
                    <td>${j.student.name}</td>
                    <td>${j.score}</td>
                    <td><a href="/Spring_0117/mvc/javaexam/get/${j.id}">update</a></td>
                    <td><a href="/Spring_0117/mvc/javaexam/delete/${j.id}">delete</a></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
