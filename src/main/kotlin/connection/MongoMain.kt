package connection

import connection.MongoClusterConnection.Companion.LOCAL_MONGO
import com.mongodb.client.model.Filters.eq
import org.bson.Document


lateinit var mongoCluster: MongoClusterConnection

fun main(args: Array<String>) {

    //0. Create Connection.
    //koghi.getMongoCluster = connection.MongoClusterConnection(CLUSTER_MONGO, "mflix", "movies_initial")
    mongoCluster = MongoClusterConnection(LOCAL_MONGO, "concessionaire", "cars")

    //1. TestingConnection
    printDbCollections()

    //2. Check documents
    inspectCollection()

    //3. My first Query
    //connection.myFirstQueryCollection()

}

/**
 * Print selected database collections.
 */
fun printDbCollections() {
    printSeparator()
    mongoCluster.db.listCollectionNames().forEach(::println)
}


fun inspectCollection() {
    printSeparator()
    val cursor = mongoCluster.collection.find().limit(10)
    cursor.forEach(::println)
}

fun myFirstQueryCollection() {
    printSeparator()
    mongoCluster.collection.find(eq("title", "Titanic")).projection(Document("_id", 0).append("title", 1).append("language", 1)).forEach(::println)
}

fun printSeparator() {
    println("--------------------------------")
}