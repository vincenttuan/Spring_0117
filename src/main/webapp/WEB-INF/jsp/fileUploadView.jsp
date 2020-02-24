<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <input type="file" name="file" />
                <button type="submit" class="pure-button pure-button-primary">Submit</button>
            </fieldset>
        </form>
        <img src="data:image/png;base64, ${base64}" /><p />
        
    </body>
</html>
