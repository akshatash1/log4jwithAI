package com.log4jwithAI;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Logging {

  private static final Logger logger = LogManager.getLogger(Logging.class);

  public static final Marker TRANSACTION = MarkerManager.getMarker("TRANSACTION");
  public static final Marker PAYMENT = MarkerManager.getMarker("PAYMENT");
  public static final Marker USER_MGMT = MarkerManager.getMarker("USER_MGMT");

  static { 
    PAYMENT.addParents(TRANSACTION);
  }

  public static void main(String[] args) {
    logger.trace(TRANSACTION, "App Service New trace message!" + new Date());
    logger.debug(PAYMENT, "App Service New debug message!" + new Date());
    logger.info(USER_MGMT, "App Service New info message!" + new Date());
    logger.warn(TRANSACTION, "App Service New warn message" + new Date());
    logger.error(PAYMENT, "App Service New error message" + new Date());
    logger.fatal(USER_MGMT, "App Service New fatal message" + new Date());

   
  }
}
