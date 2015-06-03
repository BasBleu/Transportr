package com.basBleu.model

import org.bson.types.ObjectId


class Vehicle {

    ObjectId id
    String vehicleNo
    float proximity
    float rating
    String area
    float currentLat
    float currentLng
    int vehicleTypeId
    String vehicleType
    int driverId

}