<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Form</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css">
    </head>
    <body style="padding: 10px">
        <table>
            <tr>
                <td valign="top" style="padding: 5px">
                    <form:form modelAttribute="vo" class="pure-form" method="post">
                        <fieldset>
                            <legend>Form</legend>
                            日期: <form:input path="date" placeholder="請輸入商品上架日期" /><p />

                        </fieldset>
                    </form:form>
                </td>

                </td>
            </tr>
        </table>

    </body>
</html>
