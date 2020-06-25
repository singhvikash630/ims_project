<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="section.section-management"/></h2>
<br/>

<h2><fmt:message key="section.delete-section-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="section.section-with-id-x-got-deleted-successfully">
              <fmt:param value="${sectionId}"/>
          </fmt:message>
        </th>
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
