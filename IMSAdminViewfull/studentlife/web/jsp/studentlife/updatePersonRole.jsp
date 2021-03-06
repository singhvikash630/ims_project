

<%-- 
    Document   : updatePersonRole
    Created on : Jan 28, 2009, 3:21:04 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="personrole.personrole-management"/></h2>
<br/>

<h3><fmt:message key="personrole.update-personrole"/></h3>

<script type="text/javascript">
    function cancel(){
        document.forms[0].mode.value="cancel";
    }
    function del(){
        document.forms[0].mode.value="delete";
    }

</script>
<form:form modelAttribute="personRole">
    <input type="hidden" name="mode" value="update"/>
    <table>
         <tr>
            <th>
                <fmt:message key="personrole.role-id"/> <form:errors path="roleId" cssClass="errors"/>
                <br/>
                <form:input path="roleId" size="30" maxlength="80"/>
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
