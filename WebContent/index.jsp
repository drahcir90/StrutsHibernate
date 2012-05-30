<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<style>
		body, input{
			font-family: Calibri, Arial;
		}
		table#contact {
			border-collapse: collapse;
			width:550px;
		}
		th {
			height: 40px;
			background-color: #ffee55;
		}
	</style>
	<title>Raum Manager - Struts2 Hibernate Example</title>
</head>
<body>

<h1>Raum Manager</h1>
<s:actionerror/>

<s:form action="add" method="post">
	<s:textfield name="raum.groesse" label="groesse"/>
	<s:textfield name="raum.mietpreis" label="mietpreis"/>
	<s:textfield name="raum.etagenId" label="etagenId"/>
	<s:textfield name="raum.nutzungsArtId" label="nutzungsArtId"/>
	<s:submit value="Add Raum" align="center"/>
</s:form>


<h2>Raeume</h2>
<table border="1">
<tr>
	<th>ID</th>
	<th>Groesse</th>
	<th>Mietpreis</th>
	<th>EtagenId</th>
	<th>NutzungsArtId</th>
</tr>
<s:iterator value="raumList" >
	<tr>
		<td><s:property value="id"/></td>
		<td><s:property value="groesse"/></td>
		<td><s:property value="mietpreis"/></td>
		<td><s:property value="etagenId"/></td>
		<td><s:property value="nutzungsArtId"/></td>
	</tr>	
</s:iterator>
</table>

</body>
</html>