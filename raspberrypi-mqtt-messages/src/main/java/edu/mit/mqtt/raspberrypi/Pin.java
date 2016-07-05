package edu.mit.mqtt.raspberrypi;

import edu.mit.mqtt.raspberrypi.Messages.PinProperty;
import edu.mit.mqtt.raspberrypi.Messages.PinValue;

/**
 * The java class that gets serialized to json and back.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class Pin {

  public int pinNumber;

  public PinProperty pinProperty;

  public PinValue pinValue;
}
