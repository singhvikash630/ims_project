



<%--
    Document   : addRole
    Created on : Jan 20, 2009, 5:15:22 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="roleservice.roleservice-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="roleservice.new-roleservice"/></h2>

    <form:form modelAttribute="roleService">
        <input type="hidden" name="addMode" value="add"/>
        <table>

             <th>
                    <fmt:message key="roleservice.service-id"/>
                    <br/>
                    <input type="text" name="serviceId" size="30"maxlength="80"/>
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
