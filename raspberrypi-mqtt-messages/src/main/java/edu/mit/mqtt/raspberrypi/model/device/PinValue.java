package edu.mit.mqtt.raspberrypi.model.device;

/**
 * This enum holds the different states a RaspberryPi pin can be in that are
 * used in the communication between the App Inventor components and the
 * RaspberryPiAppInventor companion running on the Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinValue {
  HIGH("high"), LOW("low");

  private final String name;

  private PinValue(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public String toString() {
    return name;
  }

}
