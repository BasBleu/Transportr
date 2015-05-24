<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <title>Transportr</title>
    <link  sizes="" href="${resource(dir: 'images', file: 'mainImg.jpg')}">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'common.css')}" type="text/css">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
</head>
<body >
    <img alt="" src="${resource(dir: 'images', file:'mainImg.jpg')}" width="100%" height="100%"  style="position: absolute" >
    <nav class="navbar navbar-default headerBar aboveContent" >
        <div class="container-fluid">
            <h3 class="mainHeading">Transportr</h3>
        </div>
    </nav>

    <div class="searchFormContainer formAbove">
        <g:form controller="search" action="searchVendors" class="form-horizontal searchForm">
            <fieldset>
                <div class="form-group">
                    <label class="col-lg-4 control-label">From</label></br>
                    <div class="col-lg-12">
                        <g:select class="form-control" id="from" name="from" from="${areas}" optionKey="id"
                                  optionValue="name" required="" noSelection="${['':'']}">
                        </g:select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-4 control-label">To</label></br>
                    <div class="col-lg-12">
                        <g:select class="form-control" id="to" name="to" from="${areas}" optionKey="id"
                                  optionValue="name" required="" noSelection="${['':'']}">
                        </g:select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-lg-4 control-label">Vehicle Type</label></br>
                    <div class="col-lg-12">
                        <g:select class="form-control" id="vehicleType" name="vehicleType" from="${vehicleTypes}" optionKey="id"
                                  optionValue="name" required="" noSelection="${['':'']}">
                        </g:select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button type="submit" class="btn btn-warning searchButton">SEARCH</button>
                    </div>
                </div>
            </fieldset>
        </g:form>
    </div>
    <div class="aboveContent mainPageText">
        Your Plan </br>
        Your Luggage ,</br>
        Our Vehicle</br>
        Our Delivery
    </div>
</body>
</html>
