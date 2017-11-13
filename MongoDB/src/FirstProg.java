import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.w3c.dom.Document;


import java.util.Arrays;
import java.util.List;

public class FirstProg {

    public static void main(String[] args){

       //Create a MongoDB client
       MongoClient client = new MongoClient();

       //Create a database
        MongoDatabase database = client.getDatabase("db1");

       //Access a collection
        MongoCollection<Document> collection = database.getCollection("test");

       //Create a Document
       Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));

    }
}
