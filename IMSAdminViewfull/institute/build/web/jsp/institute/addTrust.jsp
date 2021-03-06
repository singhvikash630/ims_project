<
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
<h2 align="center"><fmt:message key="institute.trust-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="institute.new-trust"/></h2>

    <form:form modelAttribute="trust">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="institute.trust-name"/> <form:errors path="trustName" cssClass="errors"/>
                    <br/>
                    <form:input path="trustName" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.street"/> <form:errors path="address.street" cssClass="errors"/>
                    <br/>
                    <form:input path="address.street" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.city"/> <form:errors path="address.city" cssClass="errors"/>
                    <br/>
                    <form:input path="address.city" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.state"/> <form:errors path="address.state" cssClass="errors"/>
                    <br/>
                    <form:input path="address.state" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.country"/> <form:errors path="address.country" cssClass="errors"/>
                    <br/>
                    <form:input path="address.country" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.zip"/> <form:errors path="address.zip" cssClass="errors"/>
                    <br/>
                    <form:input path="address.zip" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.phoneNumber1"/> <form:errors path="address.phoneNumber1" cssClass="errors"/>
                    <br/>
                    <form:input path="address.phoneNumber1" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.phoneNumber2"/> <form:errors path="address.phoneNumber2" cssClass="errors"/>
                    <br/>
                    <form:input path="address.phoneNumber2" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.faxNumber"/> <form:errors path="address.faxNumber" cssClass="errors"/>
                    <br/>
                    <form:input path="address.faxNumber" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.primary-address"/> <form:errors path="address.primary1" cssClass="errors"/>
                    <br/>
                    <form:checkbox path="address.primary1"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="common.mailing-address"/> <form:errors path="address.mailing" cssClass="errors"/>
                    <br/>
                    <form:checkbox path="address.mailing"/>
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
