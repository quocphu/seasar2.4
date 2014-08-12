<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}
th,td {
	border: 1px solid black;
	padding: 0.25rem;
}

th {
	border-bottom: 1px solid black;
	background: rgb(167, 201, 66);
}

tr:nth-child(odd) {
	background: rgb(234, 242, 211);
}

tr:first-child td:last-child {
	border-width: 0px 0px 1px 1px;
}
</style>
</head>
<body>
	<a href="book.jsp">Back</a>
	<table>
		<tr>
			<th>ID</th>
			<th>Category</th>
			<th>Title</th>
		</tr>

		<c:choose>
			<c:when test="${empty result}">
				<tr>
					<td colspan="3">No result</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${result}" var="book">
					<tr>
						<td><c:out value="${book.id}" /></td>
						<td><c:out value="${book.category}" /></td>
						<td><c:out value="${book.title}" /></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

</body>
</html>