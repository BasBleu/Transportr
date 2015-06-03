<%@ page import="com.mongodb.util.JSON" contentType="text/html;charset=UTF-8" %>
<%@page expressionCodec="none" %>
<html>
<head>
    <title>Transportr</title>
    <link  sizes="" href="${resource(dir: 'images', file: 'mainImg.jpg')}">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'common.css')}" type="text/css">

    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap-rating.css')}" type="text/css">
    <script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
    <script type="text/javascript" src="../js/bootstrap-rating.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js"></script>
    <script type="text/javascript">
    //<![CDATA[

    $(document).ready(function () {

        var mapCanvas = document.getElementById('map-canvas');
        var mapOptions = {
            center: new google.maps.LatLng(${fromLat}, ${fromLng}),
            zoom: 12

        }
        map = new google.maps.Map(mapCanvas, mapOptions);
        var allVehicles=${vehicles};
        for(var i = 0; i < allVehicles.length; i++) {
            var vehicle = allVehicles[i];
            var truckIconBase='../images/icon_'+vehicle.vehicleType+'.png';
           //    var truckIconBase= '../images/icon_Pickup.png'
            var vehicleLatlng = new google.maps.LatLng(vehicle.currentLat, vehicle.currentLng);
            var marker=  new google.maps.Marker({
                position: vehicleLatlng,
                map: map,
                icon: truckIconBase
            });
            google.maps.event.addListener(marker, 'click', function() {
                alert("vehicle no. " + vehicle.vehicleNo + " " + " is " +vehicle.proximity + " kms away from you.");
            });

        }
        var userIconBase='../images/User.png';

        var userLatlng = new google.maps.LatLng(${fromLat}, ${fromLng});
        new google.maps.Marker({
            position: userLatlng,
            map: map,
            icon: userIconBase
        });
     });


        function changeVehicleType() {
            alert("fetch data again");
        }
    </script>
</head>

<body>


    <img alt="" src="${resource(dir: 'images', file:'mainImg.jpg')}" width="100%" height="100%"  style="position: absolute" >
    <nav class="navbar navbar-default headerBar aboveContent" >
        <div class="container-fluid">
            <h3 class="mainHeading">Transportr</h3>
        </div>
    </nav>
    <nav class="aboveContent searchHeading">
    <div class="container-fluid ">
          <h4 >From ${from} -  To ${to} </h4>

    </div>
    </nav>
<div class="form-group vehicleType">
    <label class="col-lg-4 control-label ">Vehicle Type</label></br>
    <div class="col-lg-12">
        <g:select id="vehicleType" name="vehicleType" from="${vehicleTypes}" optionKey="id"
                  optionValue="name" required="" noSelection="${['':'']}" value="${selectedType}" onchange="changeVehicleType() ">
        </g:select>
    </div>
</div>
 <div class= "aboveContent map" id="map-canvas"></div>

</body>
</html>