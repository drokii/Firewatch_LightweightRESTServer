package org.firewatch.apiserver.LoRa_REST_PoC;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class LoRaRestPoCApplication {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoRaRestPoCApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoRaRestPoCApplication.class, args);
	}
}
