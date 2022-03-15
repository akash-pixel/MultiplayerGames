import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {

        JFrame setting = new JFrame();
        setting.setBounds(50, 50, 220, 200);
        setting.setTitle("Settings");
        setting.setVisible(true);
        setting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setting.setLayout(new FlowLayout());

        JPanel settP = new JPanel();
        settP.setLayout(new GridLayout(2, 2, 10, 10));
        settP.setBounds(5, 5, 40, 20);
        // settP.setBackground(new Color(0, 255, 0));

        JLabel choose = new JLabel("Choose the game: ");
        choose.setBounds(0, 0, 20, 15);
        choose.setFont(new Font("Times-New-Roman", Font.BOLD, 15));

        // Ping Pong Game
        JLabel pingLabel = new JLabel("Ping Pong ");
        pingLabel.setBounds(0, 0, 20, 10);
        pingLabel.setFont(new Font("Serif", Font.BOLD, 15));
        JButton pingButton = new JButton("Play");
        pingButton.setBounds(0, 0, 15, 10);
        pingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GameFrame();
            }
        });

        // Tic Tac
        JLabel ticLabel = new JLabel("Tic Tac Toe ");
        ticLabel.setBounds(0, 0, 20, 10);
        ticLabel.setFont(new Font("Serif", Font.BOLD, 15));
        JButton ticButton = new JButton("Play");
        ticButton.setBounds(0, 0, 15, 10);
        ticButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TicTacToe();
            }
        });

        settP.add(pingLabel);
        settP.add(pingButton);

        settP.add(ticLabel);
        settP.add(ticButton);

        setting.add(choose);
        setting.add(settP);

        // GameFrame gf = new GameFrame();

    }

}

/*
 * JButton b = new JButton("Click to print on console.");
 * b.setBounds(50, 100, 100, 30);
 * b.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e) {
 * System.out.println("Button b");
 * }
 * });
 * 
 * setting.add( b);
 */