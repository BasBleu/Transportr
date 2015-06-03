package com.basBleu.repositories

import com.basBleu.model.Vehicle
import com.basBleu.model.VehicleType
import com.basBleu.model.Vendor
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.MongoOperations


class VendorRepository {
    MongoOperations mongoOperations;

    def getAllVendors() {
        mongoOperations.findAll(Vendor.class, "vendors")
    }

    def getAllVehicles() {
        mongoOperations.findAll(Vehicle.class, "vehicles")
    }

    def getVehicleTypes() {
        mongoOperations.findAll(VehicleType.class, "vehicleTypes")
    }

    def getVehicleTypeByID(String id) {
        mongoOperations.findById(new ObjectId(id), VehicleType.class, "vehicleTypes")
    }


}
