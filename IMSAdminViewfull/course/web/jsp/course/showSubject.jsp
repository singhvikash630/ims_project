<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="subject.subject-management"/></h2>
<br/>
<h3>    
    <c:choose>
        <c:when test="${subject.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="subject.subject-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="subject.subject-name"/>:</th>
        <td>${subject.subjectName}</td>
    </tr>
    
</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/course/findSubject.do"/>"><fmt:message key="subject.go-to-subject-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
