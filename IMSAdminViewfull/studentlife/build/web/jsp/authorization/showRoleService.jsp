<%-- 
    Document   : showRoleService
    Created on : Jan 21, 2009, 5:30:56 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="roleservice.roleservice-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${roleService.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="roleservice.roleservice-information"/></h3>

<table>      
    <tr>
        <th align="left"><fmt:message key="roleservice.service-id"/>:</th>
        <td>${service.serviceId}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findRoleService.do"/>"><fmt:message key="roleservice.go-to-roleservice-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
