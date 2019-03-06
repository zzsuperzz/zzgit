<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%--<script src="/static/js/core/Vue.js"></script>--%>
<script src="/static/js/dict/dictCommons.js"></script>
<div id="dictCommon" >
	<button id="add" onclick="addInfo()" >新增</button>
	<button id="save" onclick="saveInfo()" >保存</button>
	<form id="reportForm" method="post">
<table id="appTable" align='center' border='1' cellspacing='0'>

	<tr>
		<th>appid</th>
		<th>appname</th>
		<th>guid</th>
	</tr>
	<c:forEach items="${appInfos}" var="s" varStatus="st">
		<tr>
			<td>${s.appid}</td>
			<td>${s.appname}</td>
			<td>${s.dbid}</td>
		</tr>
	</c:forEach>
</table>
	</form>
</div>