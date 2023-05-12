import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Space message");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300, 200);

        panel.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    JOptionPane.showMessageDialog(panel, "Aisawan");
                }
            }
        });
        panel.setFocusable(true);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
