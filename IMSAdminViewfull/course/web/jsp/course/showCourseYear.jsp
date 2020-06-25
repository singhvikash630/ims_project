<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="courseyear.courseyear-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${courseYear.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="courseyear.courseyear-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="courseyear.courseyear-year"/>:</th>
        <td>${courseYear.year}</td>
    </tr>

</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/course/findCourseYear.do"/>"><fmt:message key="courseyear.go-to-courseyear-management"/></a>
        </td>
    </tr>
</table>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
