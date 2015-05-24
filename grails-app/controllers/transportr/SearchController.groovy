package transportr

import com.basBleu.repositories.LocationRepository
import com.basBleu.repositories.VendorRepository
import org.springframework.stereotype.Controller

@Controller
class SearchController {

    LocationRepository locationRepository
    VendorRepository vendorRepository

    def renderSearch() {
        List areas = locationRepository.getAreas()
        List vehicleTypes = locationRepository.getVehicleTypes()
        render(view: "search", model: [areas: areas, vehicleTypes: vehicleTypes])
    }

    def searchVendors() {
        println("I am here "+params.from + "   "+params.to);
        List vendors = vendorRepository.getAllVendors()
        render(view: "vendors", model: [vendors: vendors])

    }
}
