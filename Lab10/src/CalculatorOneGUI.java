
import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {

    private JFrame jf;
    private JPanel jp;
    private JButton bn1, bn2, bn3, bn4;
     private TextField text1, text2, text3;

    public CalculatorOneGUI() {
        jf = new JFrame("Calculator");
        jp = new JPanel();
        jf.setLayout(new GridLayout(4, 0));
        jp.setLayout(new FlowLayout());
        bn1 = new JButton("Pluse");
        bn2 = new JButton("minus");
        bn3 = new JButton("multi");
        bn4 = new JButton("divide");
        text1 = new TextField();
        text2 = new TextField();
        text3 = new TextField();
        jf.setSize(350, 200);
        jp.add(bn1);
        jp.add(bn2);
        jp.add(bn3);
        jp.add(bn4);
        jf.add(text1);
        jf.add(text2);
        jf.add(jp);
        jf.add(text3);
        //jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
}
