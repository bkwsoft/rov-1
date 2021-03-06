/**
 *
 */
package me.jbuelow.rov.dry.service;

import java.util.List;
import me.jbuelow.rov.common.command.Command;
import me.jbuelow.rov.common.response.Response;
import me.jbuelow.rov.common.response.VehicleCapabilities;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
public interface VehicleControlService {

  boolean activeConnections();

  Response sendCommand(int vehicleId, Command command);

  List<VehicleCapabilities> getAttatchedVehicles();
}
