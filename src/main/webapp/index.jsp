<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>

<!-- field -->
<s:form action="studentAction" method="post">
	<s:textfield name="username" label="u"/>
	<s:textfield name="password" label="p"/>
	<s:submit value="submit"/>
</s:form>

<% /*
<!-- javabean -->
<form action="studentActionClass" method="post">
	userName<s:textfield name="student.username"/><br/>
	passWord<s:textfield name="student.password"/><br/>
		  <s:submit value="submit"/> 
</form>

<!-- ModelDriven -->
<form action="studentActionModelDriven" method="post">
	userName<s:textfield name="username"/><br/>
	passWord<s:textfield name="password"/><br/>
		  <s:submit value="submit"/> 
</form>

<!-- ModelDriven -->
<s:form action="studentActionModelDriven.action?profiling=true" method="post">
	userName<s:textfield name="username"/><br/>
	passWord<s:textfield name="password"/><br/>
		  <s:submit value="submit"/> 
</s:form>
*/ %>

<a href="studentListAction">studentListAction</a>
</body>
</html>
