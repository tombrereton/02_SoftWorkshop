import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by TomBrereton on 6/12/16.
 */
public class BalanceListener implements ActionListener{

    private SavingsGui sg;

    public BalanceListener(SavingsGui sg){
        this.sg = sg;
    }
}


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf3.setText(Long.toString(sa.getBalance()));
        }
}
