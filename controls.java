import java.awt.*;
// import java.awt.event.*;
// import java.util.*;
import javax.swing.*;

public class controls {
    controls() {

        JFrame f = new JFrame();
        f.setTitle("Settings ");
        f.setSize(300, 200);
        f.setLayout(new GridLayout(1, 1));
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 1, 2, 2));
        JLabel l = new JLabel("Name: ");
        p.add(l);
        f.add(p);
        f.setVisible(true);
    }
}
