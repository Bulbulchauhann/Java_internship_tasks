<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crud in servlet</title>
</head>
<body>
<div align="center">
<h1>Registration Form</h1>
<form action="register">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="user"/></td>
        </tr>
        <tr>
            <td>Mail</td>
            <td><input type="text" name="mail"/></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><input type="text" name="phone"/></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Register"/></td>
        </tr>
    </table>
</form>

<form action="display">
    <table>
        <tr>
            <td colspan="2" align="center"><button type="submit">Show Data</button></td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
