package com.basBleu.repositories

import com.basBleu.model.Area
import com.mongodb.DBCollection
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

class LocationRepository {
    MongoOperations mongoOperations;

    def getAreaByName(String name) {
        def criteria = Criteria.where("name").is(name)
        Query query = new Query(criteria);
        mongoOperations.findOne(query, Area.class);
    }

    def getAreas() {
        mongoOperations.findAll(Area.class, "area")
    }

}
