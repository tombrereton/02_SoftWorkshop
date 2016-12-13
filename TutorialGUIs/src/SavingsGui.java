import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by TomBrereton on 6/12/16.
 */
public class SavingsGui extends JPanel implements ActionListener{
    public JTextField getTf1() {
        return tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public JTextField getTf3() {
        return tf3;
    }

    public JTextField getTf4() {
        return tf4;
    }

    public SavingsAccount getSa() {
        return sa;
    }

    private JTextField tf1, tf2, tf3, tf4;
    private JButton b1,b2;
    private SavingsAccount sa;

    public SavingsGui(SavingsAccount sa){
        this.sa = sa;
        setUp();
    }

    private void setUp(){
        GridLayout g1 = new GridLayout(0,2);

        tf1 = new JTextField(sa.getNumber());
        add(tf1);

        tf2 = new JTextField(sa.getCustomer().getCustomerName());
        add(tf2);

        b1 = new JButton("Balance");
        BalanceListener bl = new BalanceListener();
        b1.addActionListener();
//        b1.setActionCommand("click");
        add(b1);

        tf3 = new JTextField();
        add(tf3);

        b2 = new JButton("Interest");
//        InterestListener il = new InterestListener();
        b2.addActionListener(il);
        add(b2);

        tf4 = new JTextField();
        add(tf4);

        setLayout(g1);
    }


//
//        if (e.getSource() == b2) {
//            tf4.setText(Long.toString(sa.annualInterest()));
//        }
//
////        if (e.equals("click")){
////            tf3.setText(Long.toString(sa.getBalance()));
////        }
//    }


//    public class BalanceListener implements ActionListener{
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) {
//            tf3.setText(Long.toString(sa.getBalance()));
//        }
//    }
//
//    public class InterestListener implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == b2) {
//                tf4.setText(Long.toString(sa.getBalance()));
//            }
//    }

    public static void main(String[] args) {

        Customer john = new Customer("john", "CS BHAM", "055");
        SavingsAccount sa = new SavingsAccount(john, "0564", "password", .05);

        sa.deposit(1000);
        sa.deposit(1000);
        sa.deposit(34948439,25);

        SavingsGui gui = new SavingsGui(sa);

        JFrame frame = new JFrame("SAVINGS ACCOUNT");

        frame.add(gui);

        frame.setSize(400,400);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null)


















        ;

    }
}
