package pl.wzieleziecki.erasmusappbackend.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;


@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private String mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDB;


    @Override
    public String getDatabaseName() {
        return mongoDB;
    }

    @Override
    public MongoClient mongoClient() {
        MongoClientURI mongoClientURI = new MongoClientURI(mongoHost + ":" + mongoPort);
        return new MongoClient(mongoClientURI);
    }
}
