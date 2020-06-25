<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="discipline.discipline-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="discipline.new-discipline"/></h2>

    <form:form modelAttribute="discipline">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="discipline.discipline-name"/> <form:errors path="disciplineName" cssClass="errors"/>
                    <br/>
                    <form:input path="disciplineName" size="30" maxlength="80"/>
                </th>
            </tr>
             <tr>
                <th>
                    <fmt:message key="discipline.no-of-years"/> 
                    <br/>
                    <form:input path="numberOfYears" size="30" maxlength="80"/>
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

<%@ include file="/WEB-INF/jsp/course/footer.jsp" %>

