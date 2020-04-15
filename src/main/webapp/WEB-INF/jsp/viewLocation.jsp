<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Viewing Location Info</title>
    </head>
    <body>
        <form action = "locationInfo" method="POST">
            Location: <input type = "text" name = "location" placeholder="Enter your location">
            <button type="submit" value="Submit">Submit</button>
        </form>
        <h2> Details as submitted successfully </h2>
        <h4> Location: ${location} </h4>
        <h4> AQI: ${aqi} </h4>
        <h4> NO2: ${no2} </h4>
        <h4> O3: ${o3} </h4>
        <h4> PM10: ${pm10} </h4>
    </body>
</html>