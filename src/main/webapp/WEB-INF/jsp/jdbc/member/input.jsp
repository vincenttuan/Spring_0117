<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css">
        <title>Member</title>
    </head>
    <body style="padding: 15px">
        <table>
            <td valign="top" style="padding: 10px">
                <form:form modelAttribute="member" id="myform"  class="pure-form" method="post" action="${pageContext.request.getContextPath()}/mvc/jdbc/member/${action}">
                    <fieldset>
                        <legend>Member</legend>
                        ID：<form:input path="id" placeholder="ID" readonly="true"/><p />
                        Username：<form:input path="username" placeholder="Username" /><p />
                        Password：<form:input path="password" placeholder="Password" /><p />
                        Email：<form:input path="email" placeholder="Email" /><p />
                        Pass：<form:checkbox path="pass" placeholder="Pass" /><p />
                        Pass Time：<form:input path="passts" placeholder="Pass Time" readonly="true" /><p />
                        Code：<form:input path="code" placeholder="Code" readonly="true" /><p />
                        Priority：
                        <form:input path="priority" placeholder="Priority" type="number"/>
                        <p />
                        Create Time：<form:input path="ts" placeholder="Create Time" readonly="true" /><p />
                        <button type="submit" class="pure-button pure-button-primary">${action}</button>
                    </fieldset>
                </form:form>
            </td>
            <td valign="top" style="padding: 10px">
                <table class="pure-table pure-table-bordered" width="100%">
                    <thead>
                        <tr style="cursor: pointer" >
                            <th>id</th>
                            <th>username</th>
                            <th>password</th>
                            <th>email</th>
                            <th>pass</th>
                            <th>passts</th>
                            <th>code</th>
                            <th>priority</th>
                            <th>ts</th>
                            <th>update</th>
                            <th>delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- Member 資料列表 -->
                        <c:forEach var="m" items="${members}">
                            <tr>
                                <td>${m.id}</td>
                                <td>${m.username}</td>
                                <td>${m.password}</td>
                                <td>${m.email}</td>
                                <td>${m.pass}</td>
                                <td>${m.passts}</td>
                                <td>${m.code}</td>
                                <td>${m.priority}</td>
                                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${m.ts}" /></td>
                                <td><a href="/Spring_0117/mvc/jdbc/member/get/${m.id}">update</a></td>
                                <td><a href="/Spring_0117/mvc/jdbc/member/delete/${m.id}">delete</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </td>
        </table>


    </body>
</html>
