<%-- 
    Document   : addPersonRole
    Created on : Jan 28, 2009, 2:59:56 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="personrole.personrole-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="personrole.new-personrole"/></h2>

    <form:form modelAttribute="personRole">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <th>
                                    <fmt:message key="personrole.role-id"/>
                                    <br/>
                                    <input type="text" name="roleId" size="30" maxlength="80"/>
                            </th>
                             <th>
                                    <fmt:message key="common.person-id"/>
                                    <br/>
                                    <input type="text" name="personId" size="30"maxlength="80"/>
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
