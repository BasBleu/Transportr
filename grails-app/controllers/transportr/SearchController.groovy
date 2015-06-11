package transportr

import com.basBleu.repositories.LocationRepository
import com.basBleu.repositories.VendorRepository
import com.basbleu.utils.LocationServices
import grails.converters.JSON
import org.bson.types.ObjectId
import org.springframework.stereotype.Controller

@Controller
class SearchController {

    LocationRepository locationRepository
    VendorRepository vendorRepository
    LocationServices locationServices

    def renderSearch() {
        List vehicleTypes = vendorRepository.getVehicleTypes()
        List areas = locationRepository.getAreas()
        render(view: "search", model: [areas: areas, vehicleTypes: vehicleTypes])
    }

    def searchVendors() {
        def from = locationRepository.getAreaByID(new ObjectId(params.from)).name
        def to = locationRepository.getAreaByID(new ObjectId(params.to)).name
        def vehicleType = vendorRepository.getVehicleTypeByID(params.vehicleType).name
        List vehicles = vendorRepository.getAllVehicles()
        List vehicleTypes = vendorRepository.getVehicleTypes()
        def latLongJson = locationServices.convertToLatLong(from+",Pune")
        def fromLat= latLongJson.lat
        def fromLong = latLongJson.lng
        List selectedVehicles = []
        vehicles.each { vehicle ->
         vehicle.proximity=(locationServices.getDistance(from+",Pune", vehicle.area+",Pune"))/1000

            if(vehicle.vehicleType ==  vehicleType){
                print "selected" + vehicle.area
                selectedVehicles.add(vehicle)
            }
            def vendorLatLng = locationServices.convertToLatLong(vehicle.area+",Pune")
            //these values will come from gps i think
            vehicle.currentLat= vendorLatLng.lat
            vehicle.currentLng = vendorLatLng.lng

        }

        render(view: "vendors", model: [vehicles:selectedVehicles as JSON , from : from, to : to, fromLat:fromLat, fromLng: fromLong, vehicleTypes: vehicleTypes, selectedType: params.vehicleType ])

    }
}
