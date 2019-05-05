package tech.bts.herokusample.api;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ApiTestPetStore {

    private final MongoCollection<Document> words;

    public ApiTestPetStore() {

        final MongoClient mongoClient = MongoClients.create("mongodb+srv://vanessahigasi01:Winterpark648!@cluster0-qn6hi.mongodb.net/test?retryWrites=true");

        final MongoDatabase database = mongoClient.getDatabase("Cluster0");

        this.words = database.getCollection("words");


    }


}
