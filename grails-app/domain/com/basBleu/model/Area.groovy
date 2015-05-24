package com.basBleu.model

import groovy.transform.EqualsAndHashCode
import org.bson.types.ObjectId

@EqualsAndHashCode
class Area {
    ObjectId id;
    String name;
    Long latitude;
    Long longitude;
}