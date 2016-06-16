<!DOCTYPE html>
<html>
<head>
	<title> ${myapp.title} </title>
	<meta charset="utf8">  
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
   <link href="static/bootstrap.min.css" rel="stylesheet" media="screen">
   <link href="static/bootstrap-responsive.css" rel="stylesheet">
   <link href="static/bootstrap.css" rel="stylesheet">

  <style type="text/css">
	body {
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
	
      }
	
	/* Custom container */
      .container-narrow {
        margin: 0 auto;
        max-width: 300px;
	border-style: solid;
	border-color: transparent;
	background-color: #D8D8D8	;
	z-index: 9;
	height : 100%;
	-moz-border-radius: 15px;
	border-radius: 15px;
	
      }
      .container-narrow > hr {
        margin: 30px 0;
      }

	.sidebar-nav {
        padding: 20px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
	
  </style>

</head>
 <body>

 <%
 double num = (int)(Math.random()*453);
 double latitudine = Math.random()*90; // numero minimo
 double longitudine = Math.random()*180 ; // numero massimo
 %>

<div>Il tuo pacco è il numero (<%= num %>)</div>
<div>Si trova a Latitudine(<%= latitudine %>)</div>
<div>E Longitudine (<%= longitudine %>)</div>


<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2797.504829105652!2d9.221718614982471!3d45.479777940425855!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786c6f1e6ad5d65%3A0xdd44e284bff06a4c!2sPiazzale+Gabrio+Piola%2C+2%2C+20131+Milano!5e0!3m2!1sit!2sit!4v1461766031522" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
</body>
  
</html>
