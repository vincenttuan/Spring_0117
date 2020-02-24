<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FileUpload</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css" >
    </head>
    <body style="padding: 20px">
        <form class="pure-form" 
              method="POST"
              action="uploadFile"
              enctype="multipart/form-data">
            <fieldset>
                <legend>File upload form</legend>
                Select a file to upload <p />
                <input type="file" name="file" /><p />
                <input type="file" name="file" /><p />
                <input type="file" name="file" /><p />
                <button type="submit" class="pure-button pure-button-primary">Submit</button>
            </fieldset>
        </form>
        <c:forEach var="base64" items="${base64List}">
            <img src="data:image/png;base64, ${base64}" /><p />
        </c:forEach>
    </body>
</html>
