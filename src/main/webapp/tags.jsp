<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<html>
<body>
	<s:form action="tagsAction" method="post">
		<s:select label="select" name="select" list="{'select1','select2','select3'}" value="%{'select2'}"/> <br>
		<s:radio label="radio" name="radio" list="{'radio1','radio2','radio3'}" value="%{'radio3'}"/> <br>
		<s:checkbox label="checkbox" name="checkbox" value="true"/>
		<s:checkboxlist name="checkboxlist" list="{'checkboxlist1','checkboxlist2','checkboxlist3'}"/>
		<s:submit value="submit" />
	</s:form>
</body>
</html>
