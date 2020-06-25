<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="discipline.discipline-management"/></h2>
<br/>

<h2><fmt:message key="discipline.delete-discipline-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="discipline.discipline-with-id-x-got-deleted-successfully">
              <fmt:param value="${disciplineId}"/>
          </fmt:message>
        </th>
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
