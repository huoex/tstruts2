<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>
<!-- 
 -->
<a href="studentAction">studentAction</a><br/><br/>
<form action="studentAction" method="post">
	userName<s:textfield name="username"/><br/>
	passWord<s:password name="password"/><br/>
		  <s:submit value="submit"/> 
</form>
</body>
</html>
