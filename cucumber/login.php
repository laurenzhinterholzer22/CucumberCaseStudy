
<?php
    if(!isset($_SESSION)) 
    { 
        session_start(); 
    } 





        if (isset($_POST['user']) and isset($_POST['pass']) and $_POST['pass'] == '12345' and $_POST['user'] != '') {
                $_SESSION['login_ok'] = true;
                $_SESSION['login_message'] = 'Login erfolgreich';

        }
        else {
                $_SESSION['login_ok'] = false;
                $_SESSION['login_message'] = 'Passwort falsch';
        }    
        


    header('Location: http://localhost/cucumber/index.php');
?>
