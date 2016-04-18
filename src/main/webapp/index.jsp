<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sample Login Form</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	
	<body>
		<div id="wrapper">
			<div class="join">Join Today</div>
			<div class="lock"></div>
			<div class="clr"></div>
			
			<!-- [Start] Below part to offer user to register by existing account with google, twitter or facebook -->
			<div class="login-options">Choose one of the following sign up methods.</div>
			<a class="google" href="#">Google+</a>
			<a class="twitter" href="#">Twitter</a>
			<a class="facebook" href="#">Facebook</a>
			<div class="clr">
				<hr />
			
			<div class="mail-text">Or sign up using your email address.</div>
			
			<!-- [End] Below part to offer user to register by existing account with google, twitter or facebook -->


			<div class="forms">
				<form action="" method="get" name="register">
					<input name="fullname" type="text" placeholder="Enter your full name..." size="70" onClick="border: 1px solid #30a8da;" id="username" /> 
					<input name="email" type="text" placeholder="Enter your email address..." size="70" onClick="border: 1px solid #30a8da;" id="mail" /> 
					<input name="password" type="password" placeholder="Enter a password..." size="70" onClick="border: 1px solid #30a8da;" id="password" />
				</form>
			</div>
			<a class="create-acc" href="#">Create My Account</a>
		</div>
	</body>
</html>
