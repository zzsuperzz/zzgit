<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align='center' border='1' cellspacing='0'>

	<tr>
		<td>appid</td>
		<td>appname</td>
		<td>guid</td>
	</tr>
	<c:forEach items="${appInfos}" var="s" varStatus="st">
		<tr>
			<td>${s.appid}</td>
			<td>${s.appname}</td>
			<td>${s.dbid}</td>
		</tr>
	</c:forEach>
</table>
