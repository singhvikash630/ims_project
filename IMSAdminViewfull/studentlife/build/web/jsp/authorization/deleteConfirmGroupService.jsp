



<%-- 
    Document   : deleteConfirmGroupService
    Created on : Jan 22, 2009, 4:12:46 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupservice.groupservice-management"/></h2>
<br/>

<h2><fmt:message key="groupservice.delete-groupservice-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="groupservice.groupservice-with-id-x-got-deleted-successfully">
              <fmt:param value="${groupServiceId}"/>
          </fmt:message>
        </th>
    </tr>
  </table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findGroupService.do"/>"><fmt:message key="groupservice.go-to-groupservice-management"/></a>
        </td>
    </tr>
</table>

<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
