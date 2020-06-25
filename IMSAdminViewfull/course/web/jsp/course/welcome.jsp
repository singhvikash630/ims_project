<%@ include file="/WEB-INF/jsp/course/init.jsp" %>
<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2><fmt:message key="CM.welcome"/></h2>

<ul>
    <li><a href="<c:url value="/course/findSubject.do"/>"><fmt:message key="subject.subject-management"/></a></li>
    <li><a href="<c:url value="/course/findDiscipline.do"/>"><fmt:message key="discipline.discipline-management"/></a></li>
     <li><a href="<c:url value="/course/findSection.do"/>"><fmt:message key="section.section-management"/></a></li>
     <li><a href="<c:url value="/course/findCourseYear.do"/>"><fmt:message key="courseyear.courseyear-management"/></a></li>
 </ul>

<p>&nbsp;</p>

<%@ include file="/WEB-INF/jsp/course/footer.jsp" %>
