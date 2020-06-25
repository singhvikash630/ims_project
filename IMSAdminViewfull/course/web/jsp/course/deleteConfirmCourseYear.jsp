<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="courseyear.courseyear-management"/></h2>
<br/>

<h2><fmt:message key="courseyear.delete-courseyear-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="courseyear.courseyear-with-id-x-got-deleted-successfully">
              <fmt:param value="${courseYearId}"/>
          </fmt:message>
        </th>
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

