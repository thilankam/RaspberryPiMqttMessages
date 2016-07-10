package edu.mit.mqtt.raspberrypi.model.device;

/**
 * This enum holds the different RaspberryPi models used in the communication
 * between the App Inventor components and the RaspberryPiAppInventor companion
 * running on the Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum RaspberrryPiModel {
  /**
   * The Pi 1 Model B has two revisions. Revision 1 has the 26 pin P1 header.
   * Revision 2 includes an extended 8 pin P5 Pin Header.The default for
   * Raspberry Pi 1 Model B is the revision 1.
   */
  Pi1A("Pi1A"), Pi1B("Pi1B"), Pi1Bv2("Pi1Bv2"), Pi1APlus("Pi1A+"), Pi1BPlus("Pi1B+"), Pi2B("Pi2B"), Pi3B("Pi3B");

  private final String name;

  private RaspberrryPiModel(String s) {
    name = s;
  }

  public boolean equals(String other) {
    return (other == null) ? false : name.equals(other);
  }

  public static RaspberrryPiModel fromString(String pModel) {
    if (pModel != null) {
      for (RaspberrryPiModel model : RaspberrryPiModel.values()) {
	if (pModel.equalsIgnoreCase(model.name)) {
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
