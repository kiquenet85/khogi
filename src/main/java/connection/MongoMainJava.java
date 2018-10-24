package connection;

public class MongoMainJava {

    public static void main(String[] args) {
        final MongoClusterConnectionJava mongoClusterConnection = new MongoClusterConnectionJava(MongoClusterConnectionJava.LOCAL_MONGO, "concessionaire", "cars");
        printDbCollections(mongoClusterConnection);
    }

    /**
     * Print collections in database selected.
     * @param mongoClusterConnection
     */
    public static void printDbCollections(MongoClusterConnectionJava mongoClusterConnection) {
        Iterable<String> it = mongoClusterConnection.getDb().listCollectionNames();
        for (String value : it) {
            System.out.println(value);
        }
    }
}
