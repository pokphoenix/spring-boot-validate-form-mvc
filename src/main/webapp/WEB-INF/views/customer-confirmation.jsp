<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    The customer is confirmed: ${customer.firstName} ${customer.lastName}

    <br><br> Free passes: ${customer.freePasses}

    <br><br> Email: ${customer.email}

    <br><br> Postal Code: ${customer.postalCode}
</body>
</html>