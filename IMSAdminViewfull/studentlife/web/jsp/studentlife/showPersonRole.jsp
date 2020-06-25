

<%-- 
    Document   : showPersonRole
    Created on : Jan 28, 2009, 3:18:45 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="personrole.personrole-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${personRole.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="personrole.personrole-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="personrole.role-id"/>:</th>
        <td>${personRole.roleId}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findPersonRole.do"/>"><fmt:message key="personrole.go-to-personrole-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
