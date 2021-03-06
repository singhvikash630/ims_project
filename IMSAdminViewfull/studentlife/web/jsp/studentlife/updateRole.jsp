<%-- 
    Document   : updateRole
    Created on : Jan 20, 2009, 5:29:19 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="role.role-management"/></h2>
<br/>

<h3><fmt:message key="role.update-role"/></h3>

<script type="text/javascript">
    function cancel(){
        document.forms[0].mode.value="cancel";
    }
    function del(){
        document.forms[0].mode.value="delete";
    }

</script>
<form:form modelAttribute="role">
    <input type="hidden" name="mode" value="update"/>
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
                <input type="submit" value="<fmt:message key="common.update"/>"/>
                <input type="submit" onclick="del()" value="<fmt:message key="common.delete"/>"/>
                <input type="submit" onclick="cancel()" value="<fmt:message key="common.cancel"/>"/>
            </td>
        </tr>
    </table>
</form:form>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
