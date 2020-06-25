


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

<script type="text/javascript">
    function toggle(mode) {
        if(mode=="basic") {
            document.getElementById("advance").style.display="none";
            document.getElementById("basic").style.display="block";
            document.forms[0].searchMode.value="basic";
        } else if(mode=="advance") {
            document.getElementById("advance").style.display="block";
            document.getElementById("basic").style.display="none";
            document.forms[0].searchMode.value="advance";
        }
    }
</script>

<form:form modelAttribute="instituteMaster">
    <input type="hidden" name="searchMode" value="basic"/>
    <table >
        <tr>
            <td>
                <a href="<c:url value="/institute/addInstituteMaster.do"/>"><fmt:message key="common.add"/></a>
            </td>
        </tr>

    </table>

    <div id="basic" style=display:block">
        <table>
            <tr>
                <td>
                    <input type="input" name="basicSearchValue" size="30"/>
                </td>
                <td>
                    <p class="submit"><input type="submit" value="<fmt:message key="common.search"/>"/></p>
                </td>
            </tr>
            <tr>
                <td>
                <a href="javascript:toggle('advance');"><< <fmt:message key="common.advance"/></a>
                <td>
            </tr>
        </table>
    </div>
    <div id="advance" style="display:none">
        <table>
            <tr>
                <td>
                    <fmt:message key="common.match"/>
                    <select name="operator">
                        <option selected value="all"><fmt:message key="common.all"/></option>
                        <option value="any"><fmt:message key="common.any"/></option>
                    </select>
                    <fmt:message key="common.of-the-following-fields"/>
                </td>
            </tr>
            <tr>
                <td><fmt:message key="institute.institute-name"/></td>
                <td><fmt:message key="institute.institute-type"/></td>

            </tr>
            <tr>
                <td><form:input path="name" size="30"/></td>
                <td><form:input path="type" size="30"/></td>
            </tr>
            <tr>
                <td>
                    <p class="submit"><input type="submit" value="<fmt:message key="common.search"/>"/></p>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="javascript:toggle('basic');"><< <fmt:message key="common.basic"/></a>
                </td>
            </tr>
        </table>
    </div>
    <!-- Table to show trust details -->
    <br>
    <table border="1">
        <thead>
            <tr>
                <th><fmt:message key="common.select"/></th>
                <th><fmt:message key="institute.institute-id"/></th>
                <th><fmt:message key="institute.institute-name"/></th>
                <th><fmt:message key="institute.type"/></th>
                <th><fmt:message key="institute.description"/></th>

            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${selections == null}">
                    <tr style="color:red">
                        <td>
                            <fmt:message key="common.no-results-found"/>
                        </td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach var="instituteMaster" items="${selections}" varStatus="status">
                        <tr>
                            <td><intput type="checkbox" name="cb" id="${instituteMaster.instituteMasterId}"/></td>
                            <td><a href="<c:url value="/institute/updateInstituteMaster.do?instituteMasterId=${instituteMaster.instituteMasterId}"/>">${instituteMaster.instituteMasterId}</a></td>
                            <td>${instituteMaster.name}</td>
                            <td>${instituteMaster.type}</td>
                            <td>${instituteMaster.description}</td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
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
