<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path"></c:set>
<script>
    $(function () {
        $("#categoryTable").jqGrid({
            url:"${path}/category/showAll",
            mtype:"post",
            datatype:"json",
            styleUI:"Bootstrap",  //使用bootstrap风格
            colNames:["编号","名字","父级","级别"],
            colModel:[
                {name:"id",editable:true,},
                {name:"name",editable:true,},
                {name:"parentId"},
                {name:"grade",editable:true,}
            ],
            height: 400,
            autowidth: true,
            pager: "#categoryDiv",
            rowNum: 4,
            viewrecords: true,
            rowList: [2, 4, 6, 8,20],
        })


    })
</script>
<table id="categoryTable"></table>
<div id="categoryDiv"></div>