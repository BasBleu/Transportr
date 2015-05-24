package com.basBleu.repositories

import com.basBleu.model.VehicleType
import com.basBleu.model.Vendor
import org.springframework.data.mongodb.core.MongoOperations


class VendorRepository {
    MongoOperations mongoOperations;

    def getAllVendors() {
        mongoOperations.findAll(Vendor.class, "vendors")
    }


}
