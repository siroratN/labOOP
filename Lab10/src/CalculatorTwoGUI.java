import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    private TextField text1;
    public CalculatorTwoGUI(){
        frame = new JFrame("My Calculator");
        panel = new JPanel();
        text1 = new TextField();
        panel.setLayout(new GridLayout(4, 4));
        frame.setLayout(new BorderLayout());
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bn4);
        panel.add(bn5);
        panel.add(bn6);
        panel.add(bn7);
        panel.add(bn8);
        panel.add(bn9);
        panel.add(bn10);
        panel.add(bn11);
        panel.add(bn12);
        panel.add(bn13);
        panel.add(bn14);
        panel.add(bn15);
        panel.add(bn16);
        frame.add(text1, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}