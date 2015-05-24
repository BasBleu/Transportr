package transportr

import com.basBleu.repositories.LocationRepository
import org.springframework.stereotype.Controller

@Controller
class SearchController {

    LocationRepository locationRepository

    def renderSearch() {
        println("here");
        List areas = locationRepository.getAreas()
        println("areas = "+areas)
        render(view: "search", model: [areas: areas])
    }
}
