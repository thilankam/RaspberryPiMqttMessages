package edu.mit.mqtt.raspberrypi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This static class holds the internal messages used in the communication
 * between the App Inventor components and the RaspberryPiAppInventor companion
 * running on the Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class Messages {

  public static enum PinProperty {
    PIN_STATE
  }

  public static enum PinValue {
    HIGH, LOW
  }

  public static enum Action {
    SHUTDOWN
  }

  private static Messages instance = null;

  protected Messages() {
    // Empty
  }

  public static Messages getInstance() {
    if (instance == null) {
      instance = new Messages();
    }
    return instance;
  }

  public static String constructPinMessage(int pPinNumber, PinProperty pPinProperty, PinValue pPinValue) {
    
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    
    Pin myPin = new Pin();
    myPin.pinNumber = pPinNumber;
    myPin.pinProperty = pPinProperty;
    myPin.pinValue = pPinValue;
//    myPin.pinProperty = getProperty(pPinProperty);
//    myPin.pinValue = getValue(pPinValue);
    
    return gson.toJson(myPin);
   }

  public static String getProperty(PinProperty pPinProperty) {
    switch (pPinProperty) {
    case PIN_STATE:
      return "pinState";
    }
    return null;
  }

  public static String getValue(PinValue pPinValue) {
    switch (pPinValue) {
    case HIGH:
      return "high";
    case LOW:
      return "low";
    }
    return null;
  }

  public static String constructInternalMessage(Action pAction) {
    switch (pAction) {
    case SHUTDOWN:
      return "shutdown";
    }
    return null;
  }

}
