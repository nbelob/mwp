<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>mwp</title>
</head>
<body>
    <form method="POST" modelAttribute="inputForm">
        <table align="center">
            <tr>
                <td>Проба форма 2</td>
            </tr>
            <tr>
                <td>Введите</td>
                <td><input type="text" name="input" path="input" style="width:200" /></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="ok" value="OK"/>
                </td>
                <td>
                    <input type="submit" name="cancel" value="Отмена"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
