/**
 *
 */
package me.jbuelow.rov.wet.service.impl;

import org.springframework.context.ApplicationEvent;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
public class ControllerDisconnectedEvent extends ApplicationEvent {

  /**
   * 
   */
  private static final long serialVersionUID = 4337298704611297359L;

  public ControllerDisconnectedEvent(Object source) {
    super(source);
  }
}
