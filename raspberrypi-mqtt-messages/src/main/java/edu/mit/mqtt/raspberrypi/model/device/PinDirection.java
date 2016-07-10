package edu.mit.mqtt.raspberrypi.model.device;

/**
 * This enum models the direction of the RaspberryPi pin relative to App
 * Inventor as used in the communication between the App Inventor components and
 * the RaspberryPiAppInventor companion running on the Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinDirection {
  IN("in"), OUT("out");

  private final String name;

  private PinDirection(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public static PinDirection fromString(String pDirection) {
    if (pDirection != null) {
      for (PinDirection model : PinDirection.values()) {
	if (pDirection.equalsIgnoreCase(model.name)) {
	  return model;
	}
      }
    }
    return null;
  }

  public String toString() {
    return name;
  }
}