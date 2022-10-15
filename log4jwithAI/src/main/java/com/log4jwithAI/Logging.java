package com.log4jwithAI;

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
    logger.info(TRANSACTION, "App Service New transaction message!");
    logger.warn(PAYMENT, "App Service New payment message!");
    logger.info(USER_MGMT, "App Service New user message!");
    logger.debug(TRANSACTION, "App Service New Tran debug message");
    logger.error("This is error log" );
    
    logger.trace("App Service We've just greeted the user!");
    logger.debug("App Service We've just greeted the user!");
    logger.info("App Service We've just greeted the user!");
    logger.warn("App Service We've just greeted the user!");
    logger.error("App Service We've just greeted the user!");
    logger.fatal("App Service We've just greeted the user!");
  }
}
