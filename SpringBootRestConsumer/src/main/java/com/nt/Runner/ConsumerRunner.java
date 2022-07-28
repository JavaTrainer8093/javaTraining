package com.nt.Runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerRunner implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(ConsumerRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//create the RestTemplate object
		RestTemplate rs = new RestTemplate();
		
		//define url
		String url ="http://localhost:9990/employee/show";
		
		//make http calls and get response
	ResponseEntity<String> resp	=rs.getForEntity(url, String.class);
		
		//print the details
		log.info("Status code { }"+resp.getStatusCode() );
		log.info("Status value{ }" +resp.getStatusCodeValue());
		log.info("Body{ }" +resp.getBody());
	
	}

}
