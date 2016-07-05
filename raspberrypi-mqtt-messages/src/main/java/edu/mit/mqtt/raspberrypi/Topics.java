package edu.mit.mqtt.raspberrypi;

/**
 * This static class holds the internal topics used in the communication between
 * the App Inventor components and the RaspberryPiAppInventor companion running
 * on the Raspberry Pi. 
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class Topics {

  public static final String INTERNAL_TOPIC = "_internalTopic:_";

  private static Topics instance = null;

  protected Topics() {
    // Empty
  }

  public static Topics getInstance() {
    if (instance == null) {
      instance = new Topics();
    }
    return instance;
  }


}
