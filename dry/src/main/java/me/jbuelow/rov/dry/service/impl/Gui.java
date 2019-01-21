package me.jbuelow.rov.dry.service.impl;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends JFrame {

  private JPanel panel1;
  private JLabel cpuTempValue;
  private JLabel joyAAxisXValue;
  private JLabel joyAAxisYValue;
  private JLabel joyAAxisZValue;
  private JLabel joyAAxisTValue;
  private JLabel joyAHatXValue;
  private JLabel joyAHatYValue;
  private JLabel joyBAxisXValue;
  private JLabel joyBAxisYValue;
  private JLabel joyBAxisZValue;
  private JLabel joyBAxisTValue;
  private JLabel joyBHatXValue;
  private JLabel joyBHatYValue;
  private JLabel waterTempValue;

  public Gui() {
    add(panel1);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        int i = JOptionPane.showConfirmDialog(null, "Close ROV Topside control application?");
        if (i == 0) {
          System.exit(0); //commit self deletus
        }
      }
    });
    setVisible(true);
  }

  public void setLabel(String message) {
    this.cpuTempValue.setText(message);
  }
}
