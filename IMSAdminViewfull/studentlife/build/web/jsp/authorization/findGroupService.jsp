

<%-- 
    Document   : findGroupService
    Created on : Jan 22, 2009, 4:16:17 AM
    Author     : Vikas
--%>

<%@ include file="/WEB-INF/jsp/authorization/header.jsp" %>

<h2 align="center"><fmt:message key="groupservice.groupservice-management"/></h2>
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

<form:form modelAttribute="groupService">
    <input type="hidden" name="searchMode" value="basic"/>
    <table >
        <tr>
            <td>
                <a href="<c:url value="/authorization/addGroupService.do"/>"><fmt:message key="common.add"/></a>
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
                <td><fmt:message key="groupservice.service-id"/></td>
                <td><fmt:message key="groupservice.group-id"/></td>
            </tr>
            <tr>
                
                <td><input type="text" name="serviceId" size="30"/></td>
                 <td><input type="text" name="groupId" size="30"/></td>
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
    <!-- Table to show service details -->
    <br>   

<table border="1">
        <thead>
            <tr>
                <th><fmt:message key="common.select"/></th>
                <th><fmt:message key="groupservice.groupservice-id"/></th>
                <th><fmt:message key="group.group-id"/></th>
                <th><fmt:message key="service.service-id"/></th>
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
                    <c:forEach var="groupService" items="${selections}"
varStatus="status">
                        <tr>
                            <td><intput type="checkbox" name="cb"id="${groupService.id}"/></td>
                            <td><a href="<c:url
value="/authorization/updateGroupService.do?id=${groupService.id}"/>">${groupService.id}</a></td>
                            <td>${groupService.groupmaster.groupId}</td>
                            <td>${groupService.service.serviceId}</td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>

</form:form>

<%@ include file="/WEB-INF/jsp/authorization/footer.jsp" %>
