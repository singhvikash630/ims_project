

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupmaster.groupmaster-management"/></h2>
<br/>
<h3>    
    <c:choose>
        <c:when test="${groupMaster.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="groupmaster.groupmaster-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="groupmaster.group-name"/>:</th>
        <td>${groupMaster.groupName}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="groupmaster.description"/>:</th>
        <td>${groupMaster.description}</td>
    </tr>

    <tr>
        <th align="left"><fmt:message key="groupmaster.groupId"/>:</th>
        <td>${groupMaster.groupId}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findGroupMaster.do"/>"><fmt:message key="groupmaster.go-to-groupmaster-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
