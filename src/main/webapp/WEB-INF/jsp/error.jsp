<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Viewing Location Info</title>
    </head>
    <body>
        <h4> Location: ${location} does not exist, try another one!</h4>
        <form action = "locationInfo" method="POST">
                 Location: <input type = "text" name = "location" placeholder="Enter your location">
                 <button type="submit" value="Submit">Submit</button>
        </form>
    </body>
</html>