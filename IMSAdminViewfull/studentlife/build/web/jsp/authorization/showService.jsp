<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="service.service-management"/></h2>
<br/>
<h3>    
    <c:choose>
        <c:when test="${service.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="service.service-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="service.service-name"/>:</th>
        <td>${service.serviceName}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="service.description"/>:</th>
        <td>${service.description}</td>
    </tr>   

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findService.do"/>"><fmt:message key="service.go-to-service-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
