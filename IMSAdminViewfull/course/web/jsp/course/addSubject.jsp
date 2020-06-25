<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="subject.subject-management"/></h2>
<br/>

<body>
    <script type="text/javascript">
        function cancel(){
            document.forms[0].addMode.value="cancel";
        }
    </script>
    <h2><fmt:message key="subject.new-subject"/></h2>

    <form:form modelAttribute="subject">
        <input type="hidden" name="addMode" value="add"/>
        <table>
            <tr>
                <th>
                     
                    <br/>
                    <fmt:message key="subject.subject-code"/>
                    <br/>
                    <form:input path="subjectCode" size="30" maxlength="80"/>
                    <br/>
                    <fmt:message key="subject.subject-name"/><form:errors path="subjectName" cssClass="errors"/>
                    <br/>
                    <form:input path="subjectName" size="30" maxlength="80"/>
                    <br/>
                    <fmt:message key="subject.subject-type"/>
                    <br/>
                    <form:input path="type" size="30" maxlength="80"/>
                    <br/>
                    <fmt:message key="subject.subject-vacancy"/>
                    <br/>
                    <form:input path="vacancy" size="30" maxlength="80"/>
                    <br/>
                    <fmt:message key="subject.subject-minpercentage"/>
                    <br/>
                    <form:input path="minPercentage" size="30" maxlength="80"/>
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
