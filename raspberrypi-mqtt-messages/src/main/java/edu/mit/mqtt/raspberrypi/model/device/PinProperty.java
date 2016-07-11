package edu.mit.mqtt.raspberrypi.model.device;

/**
 * This enum models the different properties of the RaspberryPi pins used in the
 * communication between the App Inventor components and the
 * RaspberryPiAppInventor companion running on the Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinProperty {
  PIN_STATE("pinState"), REGISTER("registerPin");

  private final String name;

  private PinProperty(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public String toString() {
    return name;
  }
}
