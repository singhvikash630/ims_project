



<%-- 
    Document   : deleteConfirmRoleService
    Created on : Jan 21, 2009, 5:21:46 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="roleservice.roleservice-management"/></h2>
<br/>

<h2><fmt:message key="roleservice.delete-roleservice-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="roleservice.roleservice-with-id-x-got-deleted-successfully">
              <fmt:param value="${roleServiceId}"/>
          </fmt:message>
        </th>
    </tr>
  </table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findRoleService.do"/>"><fmt:message key="roleservice.go-to-roleservice-management"/></a>
        </td>
    </tr>
</table>

<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
