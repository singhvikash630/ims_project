<%-- 
    Document   : updateGroupService
    Created on : Jan 22, 2009, 4:26:40 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupservice.groupservice-management"/></h2>
<br/>

<h3><fmt:message key="groupservice.update-groupservice"/></h3>

<script type="text/javascript">
    function cancel(){
        document.forms[0].mode.value="cancel";
    }
    function del(){
        document.forms[0].mode.value="delete";
    }

</script>
<form:form modelAttribute="groupService">
    <input type="hidden" name="mode" value="update"/>
    <table>
        <tr>
            <th>
                <fmt:message key="groupService.service-id"/> <form:errors path="service.serviceId" cssClass="errors"/>
                <br/>              
                <input type="text" name="serviceId" size="30" maxlength="80"/>
            </th>
        </tr>


        <tr>
            <th>
                <fmt:message key="groupService.group-id"/> <form:errors path="groupId" cssClass="errors"/>
                <br/>
                <input type="text" name="groupId" size="30" maxlength="80"/>
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
