<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="section.section-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${section.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="section.section-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="section.section-name"/>:</th>
        <td>${section.sectionName}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/course/findSection.do"/>"><fmt:message key="section.go-to-section-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
