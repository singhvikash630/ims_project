<%--
    Document   : application
    Created on : Feb 16, 2009, 12:43:15 PM
    Author     : padma
--%>


<%@ include file="/WEB-INF/jsp/common/init.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML Basic 1.0//EN" "http://www.w3.org/TR/xhtml-basic/xhtml-basic10.dtd">
<title>IMS - Authorization View Snapshot</title>
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
                            <td> <a class="tabletitle" href="<c:url value="/authorization/findService.do"/>">Service</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/authorization/findRole.do"/>">Role</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/authorization/findGroupService.do"/>">GroupService  </a>
                            </td>


                            <td> <a class="tabletitle" href="<c:url value="/authorization/findGroupMaster.do"/>">GroupMaster</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/authorization/findRoleService.do"/>">RoleService</a>
                            </td>
                            <td> <a class="tabletitle" href="<c:url value="/authorization/findPersonRole.do"/>">PersonRole</a>
                            </td>
                            <td class="tabtablecap">&nbsp</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div id="contentPane">
                <big><span
                    style="font-weight: bold;">Welcome to Admin View</span><big><span
                    style="font-weight: bold;"> Page</span></big>
                <br>

                <table class="imstable">
                    <tbody>
                        <tr>
                            <td style="padding: 0px;">You can start admin tasks<br>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>

