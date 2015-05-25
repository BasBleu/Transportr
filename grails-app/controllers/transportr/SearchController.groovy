package transportr

import com.basBleu.repositories.LocationRepository
import com.basBleu.repositories.VendorRepository
import com.basbleu.utils.LocationServices
import org.bson.types.ObjectId
import org.springframework.stereotype.Controller

@Controller
class SearchController {

    LocationRepository locationRepository
    VendorRepository vendorRepository
    LocationServices locationServices

    def renderSearch() {
        List areas = locationRepository.getAreas()
        List vehicleTypes = locationRepository.getVehicleTypes()
        render(view: "search", model: [areas: areas, vehicleTypes: vehicleTypes])
    }

    def searchVendors() {
        def from = locationRepository.getAreaByID(new ObjectId(params.from)).name
        def to = locationRepository.getAreaByID(new ObjectId(params.to)).name
        List vendors = vendorRepository.getAllVendors()
        List selectedVendors = []
        vendors.each { vendor ->
            vendor.proximity=(locationServices.getDistance(from+",Pune", vendor.area+",Pune"))/1000
            if(vendor.proximity <= vendor.radius){
               // print "selected" + vendor.name
                selectedVendors.add(vendor)
            }
        }
        render(view: "vendors", model: [vendors: vendors, from : from, to : to])
        //render(view: "vendors", model: [vendors: selectedVendors])
    }
}
