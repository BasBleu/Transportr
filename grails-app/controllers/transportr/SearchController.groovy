package transportr

import com.basBleu.repositories.LocationRepository
import org.springframework.stereotype.Controller

@Controller
class SearchController {

    LocationRepository locationRepository

    def renderSearch() {
        List areas = locationRepository.getAreas()
        List vehicleTypes = locationRepository.getVehicleTypes()
        render(view: "search", model: [areas: areas, vehicleTypes: vehicleTypes])
    }

    def searchVendors() {
        println("I am here "+params.from + "   "+params.to);
        render(view: "vendors")
    }
}
