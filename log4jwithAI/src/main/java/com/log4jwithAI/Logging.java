package com.log4jwithAI;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Logging {

  private static final Logger logger = LogManager.getLogger(Logging.class);

  public static final Marker TRANSACTION = MarkerManager.getMarker("TRANSACTION");
  public static final Marker PAYMENT = MarkerManager.getMarker("PAYMENT");
  public static final Marker USER_MGMT = MarkerManager.getMarker("USER_MGMT");

  static { 
    PAYMENT.addParents(TRANSACTION);
  }

  public static void main(String[] args) {
	  SpringApplication.run(Logging.class, args);
    
	  logger.trace(TRANSACTION, "Spring boot App Service New trace message!" + new Date());
	    logger.debug(PAYMENT, "Spring boot App Service New debug message!" + new Date());
	    logger.info(USER_MGMT, "Spring boot App Service New info message!" + new Date());
	    logger.warn(TRANSACTION, "Spring boot App Service New warn message" + new Date());
	    logger.error(PAYMENT, "Spring boot App Service New error message" + new Date());
	    logger.fatal(USER_MGMT, "Spring boot App Service New fatal message" + new Date());
   
  }
}