<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Departamentos</title>
</head>
<body>
	<div id="contenedor" align="center">
		<form action="#" method="post">
			<table>
				<tr>
					<td colspan="2"><strong>Formulario Departamentos</strong></td>
				</tr>
				<tr>
					<th>Descripción</th>
					<th>Valor</th>
				</tr>
				<tr>
					<td>Código: </td>
					<td> <input type="text" maxlength="10" required="required" name="id" id="id" /> </td>
				</tr>
				<tr>
					<td>Nombre: </td>
					<td> <input type="text" maxlength="80" required="required" name="nombre" id="nombre" /> </td>
				</tr>
				<tr>
					<td colspan="2" align="center"> <input type="submit" value="Enviar" /> </td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>