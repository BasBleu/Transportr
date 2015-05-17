package com.basbleu.utils

import groovy.json.JsonSlurper


class LocationServices {
    private static final String URL = "http://maps.googleapis.com/maps/api/geocode/json";

    /*
     * Here the fullAddress String is in format like
     * "address,city,state,zipcode". Here address means "street number + route"
     * .
     */
     def static convertToLatLong(String fullAddress) {

        URL url = new URL(URL + "?address="
                + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
        // Open the Connection
        URLConnection conn = url.openConnection();

        InputStream inputStream = conn.getInputStream() ;
         def parsedJson = new JsonSlurper().parse(inputStream)

                 inputStream.close();
//         def parsedJson = new JsonSlurper().parseText(response.toString());
         println("lat = "+ parsedJson.results[0].geometry.location);
        return parsedJson;


    }

//    public def convertFromLatLong(String latlongString) {
//
//        /*
//         * Create an java.net.URL object by passing the request URL in
//         * constructor. Here you can see I am converting the fullAddress String
//         * in UTF-8 format. You will get Exception if you don't convert your
//         * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
//         * parameter we also need to pass "sensor" parameter. sensor (required
//         * parameter) — Indicates whether or not the geocoding request comes
//         * from a device with a location sensor. This value must be either true
//         * or false.
//         */
//        URL url = new URL(URL + "?latlng="
//                + URLEncoder.encode(latlongString, "UTF-8") + "&sensor=false");
//        // Open the Connection
//        URLConnection conn = url.openConnection();
//
//        InputStream in = conn.getInputStream() ;
//        ObjectMapper mapper = new ObjectMapper();
//        GoogleResponse response = (GoogleResponse)mapper.readValue(in,GoogleResponse.class);
//        in.close();
//        return response;
//
//
//    }



}
