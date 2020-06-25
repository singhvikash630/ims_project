<%@ include file="/WEB-INF/jsp/common/init.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML Basic 1.0//EN" "http://www.w3.org/TR/xhtml-basic/xhtml-basic10.dtd">
<title>IMS - institute View Snapshot</title>
<body>
    <form method="post" name="proxyForm" action="here/absolute_url">
    <input type="hidden" name="imsScreenName" value="value template/id" >
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
                            <td> <a class="tabletitle" href="<c:url value="/institute/addTrust.do"/>">Trust</a>
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

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="institute.new-institute"/></h2>

    <form:form modelAttribute="institute">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="institute.trust-id"/> <form:errors path="trust.trustId" cssClass="errors"/>
                    <br/>
                    <input type="text" name="trust.trustId" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="institute.institute-master-id"/> <form:errors path="instituteMaster.instituteMasterId" cssClass="errors"/>
                    <br/>
                    <form:input path="instituteMaster.instituteMasterId" size="30" maxlength="80"/>
                </th>
            </tr> 
            <tr>
                <th>
                    <fmt:message key="common.status"/> <form:errors path="status" cssClass="errors"/>
                    <br/>
                    <form:input path="status" size="30" maxlength="80"/>
                </th>
            </tr>  
            <tr>
                <td>
                    <input type="submit" value="<fmt:message key="common.add"/>"/>
                    <input type="submit" onclick="cancel()" value="<fmt:message key="common.cancel"/>"/>
                </td>
            </tr>
        </table>
    </form:form>

                <table class="imstable">
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    
</body>

<%@ include file="/WEB-INF/jsp/institute/footer.jsp" %>
