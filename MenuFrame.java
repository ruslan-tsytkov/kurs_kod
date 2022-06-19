import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame implements ActionListener{

    JButton startButton, closeButton;
    MenuFrame(){

        startButton = new JButton();
        startButton.setBounds(75, 100, 200, 100);
        startButton.addActionListener(this);
        startButton.setText("Start");

        closeButton = new JButton();
        closeButton.setBounds(75, 300, 200, 100);
        closeButton.addActionListener(this);
        closeButton.setText("Exit");

        startButton.setFocusable(false);
        startButton.setHorizontalTextPosition(JButton.CENTER);
        startButton.setVerticalTextPosition(JButton.BOTTOM);
        startButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        startButton.setForeground(Color.black);
        startButton.setBackground(Color.lightGray);
        startButton.setBorder(BorderFactory.createEtchedBorder());

        closeButton.setFocusable(false);
        closeButton.setHorizontalTextPosition(JButton.CENTER);
        closeButton.setVerticalTextPosition(JButton.BOTTOM);
        closeButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        closeButton.setForeground(Color.black);
        closeButton.setBackground(Color.lightGray);
        closeButton.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(350,550);
        this.setVisible(true);
        this.add(startButton);
        this.add(closeButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==startButton) {
            new GameFrame();
            this.dispose();
        }
        if(e.getSource()==closeButton) {
            this.dispose();
        }
    }
}
