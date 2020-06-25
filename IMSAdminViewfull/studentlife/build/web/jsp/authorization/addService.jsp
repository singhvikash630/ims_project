

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="service.service-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="service.new-service"/></h2>

    <form:form modelAttribute="service">
        <input type="hidden" name="addMode" value="add"/>
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
                    <input type="submit" value="<fmt:message key="common.add"/>"/>
                    <input type="submit" onclick="cancel()" value="<fmt:message key="common.cancel"/>"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
