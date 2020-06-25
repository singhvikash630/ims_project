

<%@ include file="/WEB-INF/jsp/common/init.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML Basic 1.0//EN" "http://www.w3.org/TR/xhtml-basic/xhtml-basic10.dtd">
<title>IMS - institute View Snapshot</title>
<body>
    <form method="post" name="proxyForm" action="here/absolute_url"><input
            name="imsScreenName" value="value template/id" type="hidden">
    </form>
    <div id="dialog" class="dialog"
         style="visibility: hidden; position: absolute;">
        <div style="text-align: center;">
            <h2>Loading...</h2>
        </div>
    </div>

    <div id="frame">
        <%@ include file="/WEB-INF/jsp/common/topPane.jspf" %>
        <div id="infoBar">
            <div id="messageSlot" style=""
                 onclick="fade('messageSlot', {'duration':0.3} )">
                <div class="dbox_ml">
                    <div class="dbox_mr">
                        <div class="dbox_mc" style="position: relative;"><span id="messageSpan"></span></div>
                    </div>
                </div>
                <div class="dbox_bl">
                </div>
            </div>
        </div>
        <%@ include file="/WEB-INF/jsp/common/adminview/adminLeftPanel.jspf" %>
        <div id="rightPane">
            <div id="tabsPane">
                   <table class="tabtable" cellpadding="0" cellspacing="0">
                    <tbody>
                        <tr>
                            <td> <a class="tabletitle" href="<c:url value="/institute/findTrust.do"/>">Trust</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/institute/findInstituteMaster.do"/>">InstituteMaster</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/institute/findInstitute.do"/>">Institute</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/institute/findDepartment.do"/>">Department</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/institute/findDesignation.do"/>">Designation</a>
                            </td>
                            <td class="tabtablecap">&nbsp;</td>
                        </tr>
                    </tbody>
                </table>
            </div>
           <div id="contentPane">
<h2 align="center"><fmt:message key="institute.institute-management"/></h2>
<br/>
<h3>
    <c:choose>
        <c:when test="${institute.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="institute.institute-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="institute.institute-instituteId"/>:</th>
        <td>${institute.instituteId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="institute.trust-id"/>:</th>
        <td>${institute.trust.trustId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="institute.trust-name"/>:</th>
        <td>${institute.trust.trustName}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="institute.institute-master-id"/>:</th>
        <td>${institute.instituteMaster.instituteMasterId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="institute.institute-master-id"/>:</th>
        <td>${institute.instituteMaster.name}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.address"/>:</th>
        <td>${institute.status}</td>
    </tr>
</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/institute/findInstitute.do"/>"><fmt:message key="institute.go-to-institute-management"/></a>
        </td>
    </tr>
</table>
 <table class="imstable">
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

</body>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
