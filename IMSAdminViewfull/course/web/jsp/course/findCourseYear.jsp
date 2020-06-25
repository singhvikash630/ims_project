<%@ include file="/WEB-INF/jsp/course/header.jsp" %>

<h2 align="center"><fmt:message key="courseyear.courseyear-management"/></h2>
<br/>

<script type="text/javascript">
    function toggle(mode) {
        if(mode=="basic") {
            document.getElementById("advance").style.display="none";
            document.getElementById("basic").style.display="block";
            document.forms[0].searchMode.value="basic";
        } else if(mode=="advance") {
            document.getElementById("advance").style.display="block";
            document.getElementById("basic").style.display="none";
            document.forms[0].searchMode.value="advance";
        }
    }
</script>

<form:form modelAttribute="courseYear">
    <input type="hidden" name="searchMode" value="basic"/>
    <table >
        <tr>
            <td>
                <a href="<c:url value="/course/addCourseYear.do"/>"><fmt:message key="common.add"/></a>
            </td>
        </tr>

    </table>

    <div id="basic" style=display:block">
        <table>
            <tr>
                <td>
                    <input type="input" name="basicSearchValue" size="30"/>
                </td>
                <td>
                    <p class="submit"><input type="submit" value="<fmt:message key="common.search"/>"/></p>
                </td>
            </tr>
            <tr>
                <td>
                <a href="javascript:toggle('advance');"><< <fmt:message key="common.advance"/></a>
                <td>
            </tr>
        </table>
    </div>
    <div id="advance" style="display:none">
        <table>
            <tr>
                <td>
                    <fmt:message key="common.match"/>
                    <select name="operator">
                        <option selected value="all"><fmt:message key="common.all"/></option>
                        <option value="any"><fmt:message key="common.any"/></option>
                    </select>
                    <fmt:message key="common.of-the-following-fields"/>
                </td>
            </tr>
            <tr>
                <td><fmt:message key="courseyear.courseyear-year"/></td>

            </tr>
            <tr>
                <td><form:input path="year" size="30"/></td>

            </tr>
            <tr>
                <td>
                    <p class="submit"><input type="submit" value="<fmt:message key="common.search"/>"/></p>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="javascript:toggle('basic');"><< <fmt:message key="common.basic"/></a>
                </td>
            </tr>
        </table>
    </div>
    <!-- Table to show trust details -->
    <br>
    <table border="1">
        <thead>
            <tr>
                <th><fmt:message key="common.select"/></th>
                <th><fmt:message key="courseyear.courseyear-id"/></th>
                <th><fmt:message key="courseyear.courseyear-year"/></th>
                            <th><fmt:message key="courseyear.courseyear-semester"/></th>

            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${selections == null}">
                    <tr style="color:red">
                        <td>
                            <fmt:message key="common.no-results-found"/>
                        </td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach var="courseYear" items="${selections}" varStatus="status">
                        <tr>
                            <td><intput type="checkbox" name="cb" id="${courseYear.courseYearId}"/></td>
                            <td><a href="<c:url value="/course/updateCourseYear.do?courseYearId=${courseYear.courseYearId}"/>">${courseYear.courseYearId}</a></td>
                            <td>${courseYear.year}</td>
                           <td>${courseYear.semester}</td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>

</form:form>

<%@ include file="/WEB-INF/jsp/course/footer.jsp" %>
