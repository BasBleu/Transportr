import com.basBleu.repositories.LocationRepository
import com.basBleu.repositories.VendorRepository
import com.basbleu.utils.LocationServices
import com.mongodb.Mongo
import org.springframework.data.mongodb.core.MongoTemplate

// Place your Spring DSL code here
beans = {
    myMongo(Mongo, grailsApplication.config.mongo.host, grailsApplication.config.mongo.port) {}
    mongoTemplate(MongoTemplate, ref(myMongo), grailsApplication.config.mongo.databaseName){}
    //locationServices(LocationServices, )

    locationRepository(LocationRepository) {
        mongoOperations = ref(mongoTemplate)
    }

    vendorRepository(VendorRepository) {
        mongoOperations = ref(mongoTemplate)
    }

    locationServices(LocationServices) {

   }

}
