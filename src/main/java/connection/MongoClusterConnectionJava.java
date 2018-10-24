package connection;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoClusterConnectionJava {

    public final static String LOCAL_MONGO = "mongodb://127.0.0.1:27018";

    private MongoClient mongoClient;
    private MongoDatabase db;
    private MongoCollection collection;

    public MongoClusterConnectionJava(String connectionUrl, String database, String collectionName) {
        mongoClient = MongoClients.create(connectionUrl);
        db = mongoClient.getDatabase(database);
        collection = db.getCollection(collectionName);
    }

    public MongoDatabase getDb() {
        return db;
    }

    public MongoCollection getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }
}
