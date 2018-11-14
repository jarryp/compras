<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proveedor</title>
</head>
<body>
	<div id="contenedor" align="center">
		<form action="cProveedor" method="post" id="form_prov">
		<table>
			<thead>
			 <tr>
			 	<td colspan="2"><strong>Formulario de Proveedor</strong></td>
			 </tr>
			</thead>
			<tbody>
			 <tr>
			  <td align="right">RIF:</td>
			  <td> <input type="text" maxlength="10" required="required" name="rif" id="rif" /> </td>
			 </tr>
			 <tr>
			  <td align="right">Razon Social:</td>
			  <td> <input type="text" maxlength="80" name="nombre" id="nombre" required="required"  />  </td>
			 </tr>
			 <tr>
			 	<td align="right">Telefono:</td>
			 	<td> <input type="text" maxlength="15" name="telefono" id="telefono" /> </td>
			 </tr>
			 <tr>
			 	<td align="right">Dirección:</td>
			 	<td> <textarea rows="4" cols="20" name="direccion" id="direccion"></textarea> </td>
			 </tr>
			 <tr>
			 	<td align="right">Estado:</td>
			 	<td>
			 		<select id="cmbestado" name="cmbestado">
			 			<option value="0">-- Seleccione --</option>
			 			<option value="1">-- Activo --</option>
			 			<option value="2">-- Inactivo --</option>
			 		</select>
			 	</td>
			 </tr>
			 <tr>
			 	<td align="right" colspan="2">
			 	 <input type="submit" value="Enviar" style="text-decoration: underline; font-style: italic"/>
			 	</td>
			 </tr>
			</tbody>
		</table>
		</form>
	</div>
</body>
</html>