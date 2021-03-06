<%-- 
    Document   : showGroupService
    Created on : Jan 22, 2009, 4:24:43 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupservice.groupservice-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${groupService.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="groupservice.groupservice-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="groupservice.service-id"/>:</th>
        <td>${service.serviceId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="groupservice.group-id"/>:</th>
        <td>${groupservice.groupId}</td>
    </tr>
 

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findGroupService.do"/>"><fmt:message key="groupservice.go-to-groupservice-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
