package edu.mit.mqtt.raspberrypi.model.messaging;

/**
 * This enum holds the topics used in the communication between the App Inventor
 * components and the RaspberryPiAppInventor companion running on the Raspberry
 * Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum Topic {
  INTERNAL("mit-appinventor/raspberrypi/internal/");

  private final String name;

  private Topic(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public String toString() {
    return name;
  }

}
