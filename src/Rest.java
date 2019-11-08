import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Rest {
    public static <T> List<T> convertALtoLL(List<T> aL)
    {

        // Create an empty LinkedList
        List<T> lL = new LinkedList<>();

        // Iterate through the aL
        for (T t : aL) {

            // Add each element into the lL
            lL.add(t);
        }

        // Return the converted LinkedList
        return lL;
    }

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
        // convert the ArrayList to LinkedList
        List<String>
                lL = convertALtoLL(aL);

        // Print the LinkedList
        System.out.println("LinkedList: " + lL);

    }
}

