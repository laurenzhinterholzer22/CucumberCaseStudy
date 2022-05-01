<?php
    if(!isset($_SESSION)) 
    { 
        session_start(); 
    } 
    
?><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="login.css">
    <title>Login Form</title>
   
</head>
<body>
    

<?php 
    if (isset($_SESSION['login_message'])) {
        echo $_SESSION['login_message'].'<br>';
    }
 ?>
<?php 
    if (isset($_SESSION['login_ok']) and $_SESSION['login_ok']){
        header('Location: homepage.php');
?>
    <?php        
    }
    else {
?>


<div class="container">
        <form action="login.php" method = "post">
            <input type="text" name="user" id="user" placeholder="username">
            <input type="password" name="pass" id="pass" placeholder="12345">
           <div class="btns">
           <input type="submit" name="login" id="login" value="login"/>
           </div>
            
        </form>
    </div>



<?php
    }
?>

</body>

</html>
