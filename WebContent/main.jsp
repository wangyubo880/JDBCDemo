<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page import="com.bean.User" %>
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
}
</script>


<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.altrowstable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}
table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
.oddrowcolor{
	background-color:#d4e3e5;
}
.evenrowcolor{
	background-color:#c3dde0;
}
td  
{  
    text-align:center;  
}  
</style>

</head>
<body background="image2.jpg">
<div class="container">
            <div class="codrops-top">
              <div class="clr"></div>
            </div>
            <header>
                <h1>Login and Registration Form <span>with HTML5 and CSS3</span></h1>
				<nav class="codrops-demos">
				<!--  	<span>Click <strong>"Join us"</strong> to see the form switch</span> -->
					
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                   
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
<table class="altrowstable" id="alternatecolor" align="center">
<tr>
<th>id</th>
<th>姓名</th>
<th>性别</th>
<th>出生年月</th>
<th>操作</th>
</tr>
<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.sex}</td>
<td>${student.birthday}</td>
<td><a href="DeleteServlet?id=${student.id}">删除</a> <a href="UpdateServlet?id=${student.id}">修改</a></td>
</tr>
</c:forEach>
<tr><td colspan="5">
<a href="MainServlet?page=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${page.dpage!=1 }">
<a href="MainServlet?page=${page.dpage-1 }">上一页</a>&nbsp;&nbsp;&nbsp;
</c:if>
<c:if test="${page.dpage!=page.totalpage }">
<a href="MainServlet?page=${page.dpage+1 }">下一页</a>&nbsp;&nbsp;&nbsp;
</c:if>
<a href="MainServlet?page=${page.totalpage }">尾页</a>
</td></tr>
<tr><td colspan="5"><a href="add.jsp">增加学生</a></td></tr>	
</table>
</div>

                       
						
                    </div>
                </div>  
            </section>
        </div>
</form>
</body>
</html>