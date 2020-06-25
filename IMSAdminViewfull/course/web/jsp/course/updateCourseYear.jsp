<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="courseyear.courseyear-management"/></h2>
<br/>

<h3><fmt:message key="courseyear.update-courseyear"/></h3>

<script type="text/javascript">
    function cancel(){
        document.forms[0].mode.value="cancel";
    }
    function del(){
        document.forms[0].mode.value="delete";
    }

</script>
<form:form modelAttribute="courseYear">
    <input type="hidden" name="mode" value="update"/>
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
                <input type="submit" value="<fmt:message key="common.update"/>"/>
                <input type="submit" onclick="del()" value="<fmt:message key="common.delete"/>"/>
                <input type="submit" onclick="cancel()" value="<fmt:message key="common.cancel"/>"/>
            </td>
        </tr>
    </table>
</form:form>

<%@ include file="/WEB-INF/jsp/course/footer.jsp" %>
