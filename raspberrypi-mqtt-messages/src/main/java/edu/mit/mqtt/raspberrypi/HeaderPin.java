package edu.mit.mqtt.raspberrypi;

import edu.mit.mqtt.raspberrypi.model.device.PinDirection;
import edu.mit.mqtt.raspberrypi.model.device.PinProperty;
import edu.mit.mqtt.raspberrypi.model.device.PinValue;
import edu.mit.mqtt.raspberrypi.model.device.RaspberrryPiModel;

/**
 * The java class that represents a Pin that gets serialized to json and back
 * during the communication with App Inventor and Raspberry Pi.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class HeaderPin {

  public int number;

  public PinProperty property;

  public PinValue value;

  public RaspberrryPiModel raspberryPiModel;

  public PinDirection direction;

  public String label = "default";

  /**
   * Validate the pin number. It cannot be less than 0 or greater than x, where
   * x is either 26 or 40 depending on the model.
   * TODO
   * @return
   */
  public boolean isInvalid() {
    return (number <= 0 || number > 40) || (property == null) || (value == null) || (raspberryPiModel == null)
        || (direction == null);
  }

  @Override
  public String toString() {
    return "HeaderPin [number:" + number + ", property:" + property.toString() + ", value:" + value.toString()
        + ", raspberryPiModel:" + raspberryPiModel.toString() + ", direction:" + direction.toString() + ", label: "
        + label + "]";
  }
}
