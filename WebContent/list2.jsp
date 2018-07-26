<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
<tr>
<td>调动编号</td>
<td>调动时间</td>
<td>调动原因</td>
<td>部门</td>
<td>职务</td>
<td>所属员工</td>
</tr>
<c:forEach items="${allWork }" var="w">
<tr>
<td>${w.hId }</td>
<td>${w.changeDate }</td>
<td>${w.result }</td>
<td>${w.deptName }</td>
<td>${w.jobType }</td>
<td>${w.eno }</td>
</tr>
</c:forEach>
</table>
</body>
</html>