<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="courseyear.courseyear-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="courseyear.new-courseyear"/></h2>

    <form:form modelAttribute="courseYear">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                    <fmt:message key="courseyear.courseyear-year"/> <form:errors path="year" cssClass="errors"/>
                    <br/>
                    <form:input path="year" size="30" maxlength="80"/>
                </th>
            </tr>
            <tr>
                <th>
                    <fmt:message key="courseyear.courseyear-semester"/> <form:errors path="semester" cssClass="errors"/>
                    <br/>
                    <form:input path="semester" size="30" maxlength="80"/>
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

