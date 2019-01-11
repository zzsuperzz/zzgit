<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align='center' border='1' cellspacing='0'>

    <tr>
        <td>code</td>
        <td>name</td>
        <td>guid</td>
    </tr>
    <c:forEach items="${agencys}" var="s" varStatus="st">
        <tr>
            <td>${s.code}</td>
            <td>${s.name}</td>
            <td>${s.guid}</td>
        </tr>
    </c:forEach>
</table>