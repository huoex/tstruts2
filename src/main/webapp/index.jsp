<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>
<!-- 
 -->
<a href="studentAction">studentAction</a><br/><br/>

<!-- field -->
<form action="studentAction" method="post">
	userName<s:textfield name="username"/><br/>
	passWord<s:textfield name="password"/><br/>
		  <s:submit value="submit"/> 
</form>

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
</body>
</html>
