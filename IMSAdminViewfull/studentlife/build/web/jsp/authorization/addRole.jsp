<%-- 
    Document   : addRole
    Created on : Jan 20, 2009, 5:15:22 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="role.role-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="role.new-role"/></h2>

    <form:form modelAttribute="role">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="role.role-name"/> <form:errors path="roleName" cssClass="errors"/>
                    <br/>
                    <form:input path="roleName" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="role.description"/> <form:errors path="description" cssClass="errors"/>
                    <br/>
                    <form:input path="description" size="30" maxlength="80"/>
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
</body>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
