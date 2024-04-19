<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login/" method="post">
    <h1>LOGIN PAGE</h1>
    <table>
        <tr>
            <td>Username: </td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value='login'></td>
        </tr>
    </table>
</form>
</body>
</html>
