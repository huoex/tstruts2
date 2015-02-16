<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<html>
<body>
	<s:debug></s:debug>
	
	studentList:<s:property value="studentList"/><br>
	
	<s:iterator value="studentList">
		username:<s:property value="username"/>
		password:<s:property value="password"/><br>
	</s:iterator>
	
	<!-- OGNL -->
	OGNL #session.stu.username:<s:property value="#session.stu.username"/><br>
	OGNL #request.abc:<s:property value="#request.abc"/><br>
	<!-- http://localhost:8080/tstruts2/studentListAction?id=1 -->
	OGNL #parameters.id:<s:property value="#parameters.id"/><br>
	
	<% /* 
	abc:<s:property value="#request.abc"/><br>
	
	<s:select label="label" name="name" list="{'name1','name2','name3'}" value="%{'name2'}" />
	*/ %>
	<s:select label="label" name="name" list="#{'foo':'foovalue', 'bar':'barvalue'} " /> <br>
	
	<s:radio label="radio" list="#{'foo':'foovalue', 'bar':'barvalue'}" /> <br>
	
	<!-- jsp el -->
	jsp:<%=request.getParameter("id") %><br>
	EL param:${param.id}<br>
	EL session:${sessionScope.stu.username }
</body>
</html>
