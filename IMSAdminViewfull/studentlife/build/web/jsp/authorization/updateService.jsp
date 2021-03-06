

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="service.service-management"/></h2>
<br/>

<h3><fmt:message key="service.update-service"/></h3>

<script type="text/javascript">
    function cancel(){
        document.forms[0].mode.value="cancel";
    }
    function del(){
        document.forms[0].mode.value="delete";
    }

</script>
<form:form modelAttribute="service">
    <input type="hidden" name="mode" value="update"/>
    <table>
        <tr>
            <th>
                <fmt:message key="service.service-name"/> <form:errors path="serviceName" cssClass="errors"/>
                <br/>
                <form:input path="serviceName" size="30" maxlength="80"/>
            </th>
        </tr>
        <tr>
            <th>
                <fmt:message key="service.description"/> <form:errors path="description" cssClass="errors"/>
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
