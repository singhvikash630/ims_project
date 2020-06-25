
<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupmaster.groupmaster-management"/></h2>
<br/>

<h2><fmt:message key="groupmaster.delete-groupmaster-confirmation"/></h2>
  <table>
    <tr>
      <th>
          <fmt:message key="groupmaster.groupmaster-with-id-x-got-deleted-successfully">
              <fmt:param value="${groupId}"/>
          </fmt:message>
        </th>
    </tr>
  </table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/authorization/findGroupMaster.do"/>"><fmt:message key="groupmaster.go-to-groupmaster-management"/></a>
        </td>
    </tr>
</table>

<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
