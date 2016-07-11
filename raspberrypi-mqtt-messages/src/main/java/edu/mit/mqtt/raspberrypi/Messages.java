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

  private static Messages instance = null;

  static GsonBuilder builder = new GsonBuilder();
  static Gson gson = builder.create();

  protected Messages() {
    // Empty
  }

  public static Messages getInstance() {
    if (instance == null) {
      instance = new Messages();
    }
    return instance;
  }

  public static String constructPinMessage(HeaderPin myPin) {
    return gson.toJson(myPin);
  }

  public static HeaderPin deconstrctPinMessage(String pMessage) {
    return gson.fromJson(pMessage, HeaderPin.class);
  }
}
