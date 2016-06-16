<!DOCTYPE html>
<html>
<head>
	<title>${myapp.title} </title>
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
        max-width: 900px;
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

  <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          
        <a class="brand pull-left" href="/home"><em>${myapp.title} </em></a>
	  
          <div class="nav-collapse collapse">
           
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>  <!-- end of div for nav bar-->
  
  <div class="container">
  <!-- <table class="table table-hover">
  <tr> -->
  <div class="hero-unit">
  <div>
  <h2><em>Order Medicine</em></h2> </div>
  <br/>
  
		<p align="center"><img src="static/images/cerca_basso.png" class="sale-photo"></p>
	
		
		<h3>
			Order the medicine you need
		</h3>
	
		<div id="description">
			Insert the name of the medicine and the quantity you want to buy.
		</div>
		<form action="PoliMed/cerca_farmaco/search/" method="POST">
  <fieldset>
    <legend>Reservation:</legend>
    Medicine:<br>
    <input type="text" name="drug">
    <br>
    Quantity:<br>
    <input type="text" name="quantity">
    <br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>

  

 
  </div> <!-- end of the hero-unit-->
  </div> <!-- end of the container-->
  
</body>
</html>
