<%@ include file="/WEB-INF/jsp/authorization/init.jsp" %>
<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2><fmt:message key="SL.welcome"/></h2>

<ul>
    
    <li><a href="<c:url value="/studentlife/findMate.do"/>"><fmt:message key="findamate"/></a></li>
    <li><a href="<c:url value="/studentlife/findEvents.do"/>"><fmt:message key="events/announcements"/></a></li>
    <li><a href="<c:url value="/studentlife/findHolidays.do"/>"><fmt:message key="holidays"/></a></li>
    </ul>

<p>&nbsp;</p>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
