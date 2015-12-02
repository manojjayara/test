package org.springframework.webflow.samples.booking;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class MongoDbConfigTest extends AbstractMongoConfiguration {
	@Override
	public String getDatabaseName() {
		return "uk_info_db";
	}
//MongoCredential credential = MongoCredential.createCredential(userName, database, password);
	//MongoClient mongoClient = new MongoClient(new ServerAddress(), Arrays.asList(credential));
	@Override
	@Bean
	public Mongo mongo() throws Exception {
/*		MongoCredential credential = MongoCredential.createMongoCRCredential("deepak", "uk_info_db", "deepak".toCharArray());
				//.creacreateCredential("deepak", "uk_info_db", "deepak");
		//return new MongoClient("107.22.92.85:55584");
		MongoClient mongoClient = new MongoClient(new ServerAddress("ds055584.mongolab.com"), Arrays.asList(credential));
		return mongoClient;*/
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoDbCOnfig.class);
	    //MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
		
		/*MongoClientURI connectionString = new MongoClientURI("mongodb://deepak:deepak@ds055584.mongolab.com:55584/uk_info_db");
		  MongoClient mongoClient = new MongoClient(connectionString);

		  DB db=mongoClient.getDB("uk_info_db");
		  return "";*/
		
		MongoClientURI connectionString = new MongoClientURI("mongodb://deepak:deepak@ds055584.mongolab.com:55584/uk_info_db");
		  return new MongoClient(connectionString);
	}
}
