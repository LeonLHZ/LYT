<!DOCTYPE html>
<html lang="en">
<head>
<!-- META DATA -->
<meta charset="utf-8">
<title>Home</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- Font Awesome -->
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" />
<!-- Main Style -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- Responsive -->
<link rel="stylesheet" type="text/css" href="css/responsive.css">
<!-- PrettyPhoto -->
<!-- Fancybox -->
<link href="css/jquery.fancybox.css" rel="stylesheet" type="text/css" media="screen">

</head>
</head>
<body class="index page-index">
<!-- START MOBILE NAVIGATION -->

<!-- END MOBILE NAVIGATION -->
<div id="site-holder">
	<div id="flip" class="container" data-attr-page="0">
		<!-- START WELCOME SECTION -->
		<div class="f-page yellow-bkg active" id="screen-welcome">
			<div id="debugger">
			</div>
			<!-- PRELOADER -->
			<div id="content-loader-holder">
				<div id="content-loader">
					<div class="ss-preloader-spin">
					</div>
				</div>
			</div>
			<!-- END PRELOADER -->
			<div class="g-screen fixed-screen">
				<!-- START HEADER -->
				<header class="site-header yellow">
					<span class="nav-trigger">
						<span class="nav-trigger-inside">
						<span class="nav-trigger-line"></span>
					</span>
				</span>


		</header>

		<section class="site-content full-height"><div class="content-frame">
			<div id="form-contact">
				<h1 id="hello">SAY 'HELLO'</h1>

				<form id="contactform" action="mail_handler.php" method="post" onsubmit="return ValidatorForm(this)">
					<div class="formfield clearfix">
						<div class="col1">
							<div class="input-holder">
								<input type="text" name="name" class="text" id="name" placeholder="YOUR NAME" />
							</div>
						</div>
						<div class="col1 second">
							<div class="input-holder">
								<input type="text" name="email" class="text" id="email" placeholder="YOUR E-MAIL" />
							</div>
						</div>
						<div class="col1 last">
							<div class="input-holder">
								<input type="text" name="phone" class="text" id="phone" placeholder="YOUR PHONE NUMBER" />
							</div>
						</div>
					</div>

					<div class="formfield clearfix">
											<div class="col1">
												<div class="input-holder">
													<input type="text" name="name" class="text" id="name" placeholder="YOUR NAME" />
												</div>
											</div>
											<div class="col1 second">
												<div class="input-holder">
													<input type="text" name="email" class="text" id="email" placeholder="YOUR E-MAIL" />
												</div>
											</div>
											<div class="col1 last">
												<div class="input-holder">
													<input type="text" name="phone" class="text" id="phone" placeholder="YOUR PHONE NUMBER" />
												</div>
											</div>
										</div>

					<input id="send-message" name="submit" type="submit" value="SEND MESSAGE" />
					<p class="call">OR IF YOU PREFER TALKING ON PHONE JUST CALL US - +11 1  23456789 </p>
					<span id="result"></span>
				</form>
			</div></div>
		</section>

				<!-- START FLUBBER -->
				<div class="flubber">
					<div id="flubber" class="flubber-guy">
						<div class="flubber-eyes">
						</div>
					</div>
					<ul class="flubber-quote">
						<li>Hi there, welcome</li>
						<li>请填写一些基本信息！</li>
						<li>辛苦啦！</li>
					</ul>
				</div>
				<!-- END FLUBBER -->

		</div>

	</div>
</div>
</body>
<!-- JS Plugin -->

<script src="jquery/jquery-1.10.2.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/mobicom.custom.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/jquery.spritely-0.6.8.js"></script>
<script src="js/jquery.fancybox.pack.js" type="text/javascript"></script>
<script type="text/javascript"><!--
	function checkemail(mailid) {
		var numericExpression = /^[A-Z0-9\._%-]+@[A-Z0-9\.-]+\.[A-Z]{2,4}$/i;
		if (mailid.match(numericExpression)) return true;
		else return false;
	}
	function ValidatorForm(theForm) {
		if (theForm.name.value == "") {
			alert("Please enter a value for the \"Name\" field.");
			theForm.name.focus();
			return (false);
		}
		if (theForm.email.value == "") {
			alert("Please enter a value for the \"Email\" field.");
			theForm.email.focus();
			return (false);
		}
		if (checkemail(theForm.email.value) == false) {
			alert("Please Enter the Valid Email ID.");
			theForm.email.focus();
			return false;
		}
		if (theForm.phone.value == "") {
			alert("Please enter a value for the \"phone\" field.");
			theForm.phone.focus();
			return (false);
		}
		if (checkemail(theForm.email.value) == false) {
			alert("Please Enter the Valid Email ID.");
			theForm.email.focus();
			return false;
		}
		return (true);
	}
//--></script>

</html>