import javax.swing.*;
import java.awt.event.*;
class HomePage implements ActionListener {
    JFrame jf;
    JLabel custName,date,phNo,email,subTotal,disCont,total,product,qty,srNo,grandTotal;
    JTextField gCName,gpNo,gemail,gdate,sSubTotal,sDisCount,sGrandTotal;
    JButton print,save,create;
    HomePage()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception err) {
            err.printStackTrace();
        }

        jf = new JFrame("HomePage");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setBounds(250,100,800,400);
        jf.setResizable(true);

    }

    public void actionPerformed(ActionEvent e){

    }
}