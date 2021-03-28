package core;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame("CTIP");
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    JLabel label = new JLabel("Hello world!", SwingConstants.CENTER);
    frame.getContentPane().add(label);
  }

}
