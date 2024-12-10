//Richard Padilla
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOGIN");
        LOGIN loginInstance = new LOGIN();
        frame.setContentPane(loginInstance.loginsito);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}