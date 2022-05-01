
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

<h1> Welcome, please enter the values of the package ! </h1>

<form action="homepage_success.php" method="post">
<table border="0" cellspacing="2" cellpadding="2">
  <tbody>
    <tr>
      <td align="right">Length:</td>
      <td>
        <input maxlength="50" name="length" id = "length" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td align="right">Broad:</td>
      <td>
        <input maxlength="50" name="broad" id = "broad" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td align="right">Height:</td>
      <td>
        <input maxlength="50" name="height" id = "height" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td align="right">Weight:</td>
      <td>
        <input maxlength="50" name="weight" id = "weight" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td align="right">Senders Location:</td>
      <td>
        <input maxlength="50" name="senders_location" id = "senders_location" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td align="right">Receivers Location:</td>
      <td>
        <input maxlength="50" name="receivers_location"  id = "receivers_location" size="45" type="text" />
      </td>
    </tr>
    <tr>
      <td></td>
      <td>
        <input type="submit" name="register_package" id="register_package" value="register package" />
      </td>
    </tr>
  </tbody>
</table>
</form>

</body>

</html>
