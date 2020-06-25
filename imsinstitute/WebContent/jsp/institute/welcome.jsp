

<%@ include file="/WEB-INF/jsp/institute/init.jsp" %>
<%@ include file="/WEB-INF/jsp/institute/header.jsp" %>

<h2><fmt:message key="IM.welcome"/></h2>

<ul>
    <li><a href="<c:url value="/institute/findTrust.do"/>"><fmt:message key="institute.trust-management"/></a></li>
    <li><a href="<c:url value="/institute/findInstituteMaster.do"/>"><fmt:message key="institute.institute-master-management"/></a></li>
    <li><a href="<c:url value="/institute/findInstitute.do"/>"><fmt:message key="institute.institute-management"/></a></li>
</ul>

<p>&nbsp;</p>

<%@ include file="/WEB-INF/jsp/institute/footer.jsp" %>
