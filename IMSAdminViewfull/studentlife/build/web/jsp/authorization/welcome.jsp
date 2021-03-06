<%@ include file="/WEB-INF/jsp/authorization/init.jsp" %>
<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2><fmt:message key="AM.welcome"/></h2>

<ul>
    
    <li><a href="<c:url value="/authorization/findService.do"/>"><fmt:message key="service.service-management"/></a></li>
    <li><a href="<c:url value="/authorization/findRole.do"/>"><fmt:message key="role.role-management"/></a></li>
    <li><a href="<c:url value="/authorization/findGroupService.do"/>"><fmt:message key="groupservice.groupservice-management"/></a></li>
    <li><a href="<c:url value="/authorization/findGroupMaster.do"/>"><fmt:message key="groupmaster.groupmaster-management"/></a></li>
    <li><a href="<c:url value="/authorization/findRoleService.do"/>"><fmt:message key="roleservice.roleservice-management"/></a></li>
    <li><a href="<c:url value="/authorization/findPersonRole.do"/>"><fmt:message key="personrole.personrole-management"/></a></li>
</ul>

<p>&nbsp;</p>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
