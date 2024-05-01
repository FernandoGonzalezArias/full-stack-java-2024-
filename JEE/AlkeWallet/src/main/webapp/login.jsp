<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link rel="stylesheet"  href="css/login.css">
</head>
</head>
<body>

<div class="login-box">
 
  <form action="login" method="post">
    <div class="user-box">
      <input type="text" name="usuario_form" required="">
      <label>Username</label>
    </div>
    <div class="user-box">
      <input type="password" name="password_form" required="">
      <label>Password</label>
    </div><center>
    
    <div class="btn-sub">
       <button type="submit" name="login" value="login">Login</button>
       <span></span>
    </div>
  </form>
  
</div>

</body>
</html>