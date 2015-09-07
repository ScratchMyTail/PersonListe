<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<ul>
		<c:forEach items="${personer}" var="item">
			<li>${item.fornavn}</li>
		</c:forEach>
	</ul>
</body>
</html>