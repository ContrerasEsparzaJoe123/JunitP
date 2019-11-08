import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Rest {


    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://joec:that1guy2@cluster0-tlgse.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("parcial2");
        MongoCollection<Document> collection = database
                .getCollection("posts");
        List<Document> documents = (List<Document>) collection.find().into(
                new ArrayList<Document>());
        for(Document document : documents){
            System.out.println(document);
        }


    }
}
