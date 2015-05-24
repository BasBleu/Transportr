package com.basBleu.model

import org.bson.types.ObjectId


class Vendor {

    ObjectId id
    String name
    String vehicleNo
    String phoneNo
    String area
    int radius
    float proximity;
    float rating;
}
