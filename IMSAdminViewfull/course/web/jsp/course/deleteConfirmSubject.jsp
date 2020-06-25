<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="subject.subject-management"/></h2>
<br/>

<h2><fmt:message key="subject.delete-subject-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="subject.subject-with-id-x-got-deleted-successfully">
              <fmt:param value="${subjectId}"/>
          </fmt:message>
        </th>
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
