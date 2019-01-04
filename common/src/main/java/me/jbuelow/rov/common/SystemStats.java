/**
 *
 */
package me.jbuelow.rov.common;

import java.util.Map;
import java.util.Properties;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
public class SystemStats extends Response {

  @Getter
  @Setter
  private Map<String, String> environment = null;

  @Getter
  @Setter
  private Properties properties = null;

}
