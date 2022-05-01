<!DOCTYPE html>
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
    

        
          $success = TRUE;

          if ($_POST['length'] > 0 and $_POST['broad'] > 0 and $_POST['height'] > 0 ) {
            $girth = ($_POST['height'] + $_POST['broad']) * 2 + $_POST['length'];
            if ($girth > 390) {
              echo('Girth of the Package must be under 390 cm  ');
              echo('<br>');
            }
            
          }

          
          if ($_POST['length'] < 10 or $_POST['length'] > 190) {
            echo('Length of the Package must be between 10 and 190 cm ');
            echo('<br>');
            $success = FALSE;
          }
          if ($_POST['broad'] < 10 or $_POST['broad'] > 130) {
            $success = FALSE;
            
            echo('Broad of the Package must be between 10 and 130 cm ');
            echo('<br>');
          }
          if ($_POST['height'] < 5 or $_POST['height'] > 90) {
            $success = FALSE;
            echo('Height of the Package must be between 5 and 90 cm  ');
            echo('<br>');
          }

          if ($_POST['weight'] < 1 or $_POST['weight'] > 50) {
            $success = FALSE;
            echo('Weight of the Package must be between 1 and 50 kg');
            echo('<br>');
          }


       
          if ($_POST['senders_location'] != 'Austria' and $_POST['senders_location'] != 'Germany' and $_POST['senders_location'] != 'Switzerland') {
            $success = FALSE;
            echo('Packages can only be sent from Austria, Germany or Switzerland  ');
            echo('<br>');
          }
          if ($_POST['receivers_location'] != 'Austria' and $_POST['receivers_location'] != 'Germany' and $_POST['receivers_location'] != 'Switzerland') {
            $success = FALSE;
            echo('Packages can only be sent to Austria, Germany or Switzerland  ');
            echo('<br>');
          }

          if ($success) {
            echo ('<h1>Package successfully registered</h1>');
            $price = 0;
            if (($_POST['senders_location'] == 'Austria' or $_POST['senders_location'] == 'Germany') and ($_POST['receivers_location'] == 'Austria' or $_POST['receivers_location'] == 'Germany')) {
              if ($_POST['weight'] < 10) {
                $price = 9;
              }
              elseif($_POST['weight'] < 25) {
                $price = 19;
              }
              else {
                $price = 29;
              }
            } 
            else {
              if ($_POST['weight'] < 10) {
                $price = 18;
              }
              else {
                $price = 36;
              }
            }
            echo('The Price of the Package is: ');
            echo($price);

          }
        else {
            echo ('<h1>Package not successfully registered</h1>');
        }    
        

?>

    </body>
    <form action="logout.php" method="post">
<table border="0" cellspacing="2" cellpadding="2">

    <tr>
      <td></td>
      <td>
        <input type="submit" value="register new package" id = "register_new_package" />
      </td>
    </tr>
  </tbody>
</table>
</form>
    </html>
