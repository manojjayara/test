package org.springframework.webflow.samples.booking.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class MongoDbCOnfig extends AbstractMongoConfiguration{
	@Override
	public String getDatabaseName() {
		return "uk_info_db";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("mongodb://deepak:deepak@ds055584.mongolab.com:55584/uk_info_db");
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoDbCOnfig.class);
	    //MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	}
}

