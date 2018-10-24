package connection

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase


/**
 * You can rely on local or remote servers.
 */
class MongoClusterConnection (connectionUrl: String = LOCAL_MONGO, database: String, collection: String) {

    val mongoClient: MongoClient
    val db : MongoDatabase
    var collection : MongoCollection<*>

    init {
        mongoClient = MongoClients.create(connectionUrl)
        db = mongoClient.getDatabase(database)
        this.collection = db.getCollection(collection)
    }

    companion object {
        const val LOCAL_MONGO = "mongodb://127.0.0.1:$CREDENTIALS_LOCAL_PORT"
    }

    fun setCollection(collection: String){
        this.collection = db.getCollection(collection)
    }
}
