<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="context" value="${pageContext.request.contextPath}" />
<c:out value="${context}"/>

<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>

<a href="${context}/hello">click me :-)</a>
</body>
</html>
