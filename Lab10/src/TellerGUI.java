import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    private JFrame frame;
    private JPanel panel, panel2;
    private TextField text1, text2;
    private JButton bn1, bn2, bn3;
    private JLabel label1, label2;
    private String balance = "6000";
    public TellerGUI(){
        frame = new JFrame("Teller GUI");
        panel = new JPanel();
        panel2 = new JPanel();
        text1.setEnabled(false);
        text2 = new TextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        frame.setLayout(new GridLayout(2, 1));
        panel.setLayout(new GridLayout(2, 2));
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        text1 = new TextField(balance);
        text1.setEnabled(false);
        text2 = new TextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        frame.add(panel);
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel2.setLayout(new FlowLayout());
        panel2.add(bn1);
        panel2.add(bn2);
        
        panel2.add(bn3);
        frame.add(panel2);
        frame.pack();
        //frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
