import com.basBleu.repositories.LocationRepository
import com.mongodb.Mongo
import org.springframework.data.mongodb.core.MongoTemplate

// Place your Spring DSL code here
beans = {
    ltpMongo(Mongo, grailsApplication.config.mongo.host, grailsApplication.config.mongo.port) {}
    mongoTemplate(MongoTemplate, ref(ltpMongo), grailsApplication.config.mongo.databaseName){}

    locationRepository(LocationRepository) {
        mongoOperations = ref(mongoTemplate)
    }
}
