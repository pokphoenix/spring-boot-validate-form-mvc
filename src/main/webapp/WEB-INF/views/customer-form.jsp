<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <f:form action="processForm" modelAttribute="customer">
        First name : <f:input path="firstName" />
        <br>
        <br>
        Last name (*) :
        <f:input path="lastName" />
        <f:errors path="lastName" cssClass="error" />
        <br>
        <br> Free passes (*):
        <f:input path="freePasses" />
        <f:errors path="freePasses" cssClass="error" />

        <br><br> Email (*):
        <f:input path="email" />
        <f:errors path="email" cssClass="error" />

        <br><br> Postal Code:
        <f:input path="postalCode" />
        <f:errors path="postalCode" cssClass="error" />

        <br><br>

        <input type="submit" value="Submit" />
    </f:form>
</body>
</html>