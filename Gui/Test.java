import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setSize(400,500);
    f.setTitle("Hello");
    f.setLocationRelativeTo(null);
    f.setLayout(new FlowLayout());

    JLabel r = new JLabel();

    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);


    JButton btn = new JButton("Ok");

    f.add(t1);
    f.add(t2);
    f.add(btn);

    btn.addActionListener(new ActionListener() {
      public void actionPerformed (ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int ans = num1 + num2;
        r.setText(ans + "");
      }
    });

    f.add(r);

    f.setVisible(true);


  }

}
