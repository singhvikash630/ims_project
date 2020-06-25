<%-- 
    Document   : addGroupService
    Created on : Jan 22, 2009, 4:09:33 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupservice.groupservice-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="groupservice.new-groupservice"/></h2>

    <form:form modelAttribute="groupService">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="groupservice.service-id"/>
                    <br/>
                      <input type=text name="serviceId" size="30" maxlength="80"/>
                </th>
            </tr>
            <th>
                    <fmt:message key="groupservice.groupId"/> <form:errors path="groupId" cssClass="errors"/>
                    <br/>
                    <form:input path="groupId" size="30" maxlength="80"/>
                </th>



            <tr>
                <td>
                    <input type="submit" value="<fmt:message key="common.add"/>"/>
                    <input type="submit" onclick="cancel()" value="<fmt:message key="common.cancel"/>"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
