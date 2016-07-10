package edu.mit.mqtt.raspberrypi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.mqtt.raspberrypi.model.device.PinDirection;
import edu.mit.mqtt.raspberrypi.model.device.PinProperty;
import edu.mit.mqtt.raspberrypi.model.device.PinValue;
import edu.mit.mqtt.raspberrypi.model.device.RaspberrryPiModel;
import junit.framework.TestCase;

public class GsonTest extends TestCase {
  
  public void testSerialization() throws Exception {
    int pinNumber = 13;
    HeaderPin myPin = new HeaderPin();
    myPin.number = pinNumber;
    myPin.label = "LED";
    myPin.direction = PinDirection.OUT;
    myPin.property = PinProperty.PIN_STATE;
    myPin.value = PinValue.HIGH;
    myPin.raspberryPiModel = RaspberrryPiModel.Pi2B;
    String messageJson = Messages.constructPinMessage(myPin);
    
    System.out.println(messageJson);
    
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    HeaderPin pinFromJson = gson.fromJson(messageJson, HeaderPin.class);
    
    System.out.println(pinFromJson.number);
    
    assertEquals(pinNumber, pinFromJson.number);
    assertEquals(PinProperty.PIN_STATE, pinFromJson.property);
    assertEquals(PinValue.HIGH, pinFromJson.value);
    assertEquals(RaspberrryPiModel.Pi2B, pinFromJson.raspberryPiModel);
    
  }

}
