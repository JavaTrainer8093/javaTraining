package com.nt.Runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class Consumerrunner implements CommandLineRunner {

	
	private Logger log = LoggerFactory.getLogger(Consumerrunner.class);
	@Override
	public void run(String... args) throws Exception {
		
		
		RestTemplate rt = new RestTemplate();
		String url ="http://localhost:8086/Employee/one";
		ResponseEntity<Object> resp =rt.getForEntity(url, Object.class);
		log.info("Status code { }"+resp.getStatusCode() );
		log.info("Status value{ }" +resp.getStatusCodeValue());
		log.info("Body{ }" +resp.getBody());
	}

}
