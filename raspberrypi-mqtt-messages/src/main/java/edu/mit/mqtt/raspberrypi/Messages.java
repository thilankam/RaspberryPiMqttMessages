package edu.mit.mqtt.raspberrypi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.mqtt.raspberrypi.model.device.PinProperty;
import edu.mit.mqtt.raspberrypi.model.device.PinValue;
import edu.mit.mqtt.raspberrypi.model.device.RaspberrryPiModel;

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
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    return gson.toJson(myPin);
  }

}
