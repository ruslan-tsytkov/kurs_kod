import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){

        this.add(new Panel());
        this.setTitle("Snake");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }
}
