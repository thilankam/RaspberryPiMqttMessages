package edu.mit.mqtt.raspberrypi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.mqtt.raspberrypi.Messages.PinProperty;
import edu.mit.mqtt.raspberrypi.Messages.PinValue;
import junit.framework.TestCase;

public class GsonTest extends TestCase {
  
  public void testSerialization() throws Exception {
    String messageJson = Messages.constructPinMessage(0, PinProperty.PIN_STATE, PinValue.HIGH);
    
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    Pin pinFromJson = gson.fromJson(messageJson, Pin.class);
    
    System.out.println(messageJson);
    
    assertEquals(0, pinFromJson.pinNumber);
    assertEquals(PinProperty.PIN_STATE, pinFromJson.pinProperty);
    assertEquals(PinValue.HIGH, pinFromJson.pinValue);
  }

}
