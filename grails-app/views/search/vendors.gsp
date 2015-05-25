<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Transportr</title>
    <link  sizes="" href="${resource(dir: 'images', file: 'mainImg.jpg')}">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'common.css')}" type="text/css">

    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap-rating.css')}" type="text/css">
    <script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
    <script type="text/javascript" src="../js/bootstrap-rating.js"></script>
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

    <table class="table aboveContent vendorsList">
        <thead class="vendorsHeader">
        <tr>
            <th>Transportr Name</th>
            <th>Phone Number</th>
            <th>Proximity to your location</th>
            <th>Rating</th>
            <th></th>
        </tr>
        </thead>
        <tbody class="vendorRow">
        <g:each in="${vendors}" var="vendor">
            <tr>
                <td>${vendor.name}</td>
                <td>${vendor.phoneNo}</td>
                <td>${vendor.proximity}km</td>
               <td><input type="hidden" class="rating" value=${vendor.rating}/></td>
                <td><g:link action="" class="btn btn-danger btn-small">Book a Transportr</g:link></td>
            </tr>
        </g:each>

        </tbody>
    </table>
</body>
</html>