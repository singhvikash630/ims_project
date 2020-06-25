<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="discipline.discipline-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${discipline.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="discipline.discipline-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="discipline.discipline-name"/>:</th>
        <td>${discipline.disciplineName}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/course/findDiscipline.do"/>"><fmt:message key="discipline.go-to-discipline-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
