package edu.mit.mqtt.raspberrypi.model.messaging;

/**
 * This enum holds the different actions communication between the App Inventor
 * components and the RaspberryPiAppInventor companion running on the Raspberry
 * Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum Action {
  SHUTDOWN("shutdown");

  private final String name;

  private Action(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public String toString() {
    return name;
  }

}
