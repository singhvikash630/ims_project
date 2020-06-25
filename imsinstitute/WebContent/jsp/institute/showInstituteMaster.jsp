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
        <c:when test="${instituteMaster.new}"><fmt:message key="common.record-added-successfully"/></c:when>
        <c:otherwise><fmt:message key="common.record-updated-successfully"/></c:otherwise>
    </c:choose>
</h3>
<h3><fmt:message key="institute.institute-information"/></h3>

<table>
    <tr>
        <th align="left"><fmt:message key="institute.institute-master-id"/>:</th>
        <td>${instituteMaster.instituteMasterId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="institute.institute-name"/>:</th>
        <td>${instituteMaster.name}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.type"/>:</th>
        <td>${instituteMaster.type}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.description"/>:</th>
        <td>${instituteMaster.description}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.addressId"/>:</th>
        <td>${instituteMaster.address.addressId}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.street"/>:</th>
        <td>${instituteMaster.address.street}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.city"/>:</th>
        <td>${instituteMaster.address.city}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.state"/>:</th>
        <td>${instituteMaster.address.state}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.country"/>:</th>
        <td>${instituteMaster.address.country}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.zip"/>:</th>
        <td>${instituteMaster.address.zip}</td>
    </tr>

    <tr>
        <th align="left"><fmt:message key="common.phoneNumber1"/>:</th>
        <td>${instituteMaster.address.phoneNumber1}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.phoneNumber2"/>:</th>
        <td>${instituteMaster.address.phoneNumber2}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.faxNumber"/>:</th>
        <td>${instituteMaster.address.faxNumber}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.primary"/>:</th>
        <td>${instituteMaster.address.primary1}</td>
    </tr>
    <tr>
        <th align="left"><fmt:message key="common.mailing"/>:</th>
        <td>${instituteMaster.address.mailing}</td>
    </tr>
    
</table>

<table>
    <tr>
        <td>
            <br>
            <a href="<c:url value="/institute/findInstituteMaster.do"/>"><fmt:message key="institute.go-to-trust-management"/></a>
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
