/**
 *
 */
package me.jbuelow.rov.common.capabilities;

import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Servo extends AbstractCapability {

  private static final long serialVersionUID = 7930072440063621979L;

  public Servo() {
    super();
  }

  public Servo(UUID id) {
    super(id);
  }
}
