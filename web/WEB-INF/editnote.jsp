<%-- 
    Document   : editnote
    Created on : 5-Jun-2021, 3:56:15 PM
    Author     : Chaudhari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <form method="post" action="note">
            <h1>Simple Note Keeper</h1>
            <h2>Edit Note</h2>
            <label for="title">Title:</label>
            <input type="text" id="title" name="title" value="${note.title}">
            <br>
            <label for="content">Contents:</label>
            <textarea id="content" name="content">${note.content}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
