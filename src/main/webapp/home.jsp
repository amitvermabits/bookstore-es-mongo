<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAuthenticated()">
 Username: <sec:authentication property="principal.username" />
 Role: <sec:authentication property="principal.authorities"/>
 </sec:authorize>
 
 <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
 