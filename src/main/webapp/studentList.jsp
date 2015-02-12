<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
	<s:debug></s:debug>
	<s:iterator value="studentList">
		<s:property value="username"/>
		<s:property value="password"/><br>
	</s:iterator>
	
	<s:iterator value="studentList">
		<s:property value="${studentList.username }"/><br>
	</s:iterator>
	
	abc:<s:property value="#request.abc"/><br>
	
	<s:select label="label" name="name" list="{'name1','name2','name3'}" value="%{'name2'}" />
	<s:select label="label" name="name" list="#{'foo':'foovalue', 'bar':'barvalue'} " />
</body>
</html>
