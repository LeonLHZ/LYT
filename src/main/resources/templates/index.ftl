<!doctype html>
<html lang="zh">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<style>body{padding-top: 60px;}</style>
    <link href="css/bootstrap.css" rel="stylesheet" />
	<link href="css/login-register.css" rel="stylesheet" />
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">







</head>
<body>


	  <body class="index page-index">

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

	  			<!-- START SOCIAL ICON -->
	  			<nav class="social-bar">
	  				<a class="social-link" data-toggle="modal" href="javascript:void(0)" onclick="openLoginModal();">

	  				</a>


	  			</nav>
	  			<!-- END SOCIAL ICON -->
	  		</header>
	  				<!-- END HEADER -->

					<!-- START LOGO -->
					<div class="main-logo">
						<div class="main-logo-shadow">
						</div>
						<div class="logo-img">
						</div>
						<a href="#about"><span class="logo-arrow"></span></a>
					</div>
					<!-- END LOGO -->


	  				<!-- START FLUBBER -->
	  				<div class="flubber">
	  					<div id="flubber" class="flubber-guy" >
	  						<div class="flubber-eyes">
	  						</div>
	  					</div>
	  					<ul class="flubber-quote">
	  						<li>你是谁来我家干嘛？？</li>
	  						<li>想进去看看莫？</li>
	  						<li>想进去看的老铁请点击右上角的关注嘿嘿！！</li>
	  					</ul>
	  				</div>
	  				<!-- END FLUBBER -->

	  		</div>
	  		<!-- END WELCOME SECTION -->
	  	</div>
	  </div>









		 <div class="modal fade login" id="loginModal">
		      <div class="modal-dialog login animated">
    		      <div class="modal-content">
    		         <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">登录</h4>
                    </div>
                    <div class="modal-body">
                        <div class="box">
                             <div class="content">
                                <div class="social">
                                    <a class="circle github" href="/auth/github">
                                        <i class="fa fa-github fa-fw"></i>
                                    </a>
                                    <a id="google_login" class="circle google" href="/auth/google_oauth2">
                                        <i class="fa fa-google-plus fa-fw"></i>
                                    </a>
                                    <a id="facebook_login" class="circle facebook" href="/auth/facebook">
                                        <i class="fa fa-facebook fa-fw"></i>
                                    </a>
                                </div>
                                <div class="division">
                                    <div class="line l"></div>
                                      <span>or</span>
                                    <div class="line r"></div>
                                </div>
                                <div class="error"></div>
                                <div class="form loginBox">

                                    <input id="loginemail" class="form-control" type="text" placeholder="请输入用户名" name="email">
                                    <input id="loginpassword" class="form-control" type="password"  placeholder="请输入密码" name="userPassword">
                                    <input class="btn btn-default btn-login" type="button" value="Login" onclick="loginAjax()">

                                </div>
                             </div>
                        </div>
                        <div class="box">
                            <div class="content registerBox" style="display:none;">
                             <div class="form">
                                <form method="post" html="{:multipart=>true}" data-remote="true" action="/register" accept-charset="UTF-8">
                                <input id="email" class="form-control" type="text" placeholder="Email" name="userEmail">
                                <input id="password" class="form-control" type="password" placeholder="Password" name="userPassword">
                                <input id="password_confirmation" class="form-control" type="password" placeholder="Repeat Password" name="password_confirmation">
                                <input class="btn btn-default btn-register" type="submit" value="Create account" name="commit">
                                </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="forgot login-footer">
                            <span>Looking to
                                 <a href="javascript: showRegisterForm();">create an account</a>
                            ?</span>
                        </div>
                        <div class="forgot register-footer" style="display:none">
                             <span>Already have an account?</span>
                             <a href="javascript: showLoginForm();">Login</a>
                        </div>
                    </div>
    		      </div>
		      </div>
		  </div>
    </div>
</body>

<script src="jquery/jquery-1.10.2.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script src="js/login-register.js" type="text/javascript"></script>
<script type="text/javascript" src="js/mobicom.custom.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/jquery.spritely-0.6.8.js"></script>

</html>
