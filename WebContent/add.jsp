<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
<script>
  $(function() {
    $( "#datepicker" ).datepicker({dateFormat: "yy-mm-dd"});
  });
 
</script>


<!-- CSS goes in the document HEAD or added to your external stylesheet -->

</head>
<body>
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
                            <form  action="" method="post" /> 
                                <h1>add</h1> 
                               <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="name" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                               
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">sex </label>
                                    <select name="sex">
                                    <option value=0>男</option>
                                    <option value=1>女</option>
                                    </select>
                                    <!--  <input type="radio" value="男" name="sex" />男
		    						<input type="radio" value="女" name="sex" checked="checked"/>女-->
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">birthday</label>
                                    <input id="datepicker" name="birthday" type="text" placeholder="1997-10-7"/>
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="add"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="index.jsp" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>

                       
						
                    </div>
                </div>  
            </section>
        </div>
</body>
</html>