

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="service.service-management"/></h2>
<br/>

<h2><fmt:message key="service.delete-service-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="service.service-with-id-x-got-deleted-successfully">
              <fmt:param value="${serviceId}"/>
          </fmt:message>
        </th>
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
