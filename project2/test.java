import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Test implements ActionListener{
    JFrame hjf;
    JLabel custName,date,phNo,email,subTotal,disCont,total,product,qty,srNo,grandTotal;
    JTextField gCName,gpNo,gemail,gdate,sSubTotal,sDisCount,sGrandTotal;
    JButton print,save,create;
    Test()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception err) {
            err.printStackTrace();
        }
        // Test JFrame
        hjf = new JFrame("Test");
        hjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hjf.setLayout(null);
        hjf.setVisible(true);
        hjf.setBounds(250,100,800,400);
        hjf.setResizable(true);

        custName = new JLabel("Custer Name");
        custName.setBounds(20,20,100,30);
        gCName = new JTextField();
        gCName.setBounds(120,20,250,30);

        date = new JLabel("Date");
        date.setBounds(400,20,100,30);
        gdate = new JTextField();
        gdate.setEditable(false);
        gdate.setBounds(500,20,250,30);
        
        phNo = new JLabel("Phone Number");
        phNo.setBounds(20,50,100,30);
        gpNo = new JTextField();
        gpNo.setBounds(120,50,250,30);
        
        email = new JLabel("Email Address");
        email.setBounds(400,50,100,30);
        gemail = new JTextField();
        gemail.setBounds(500,50,250,30);
        



        subTotal = new JLabel("Sub Total");
        subTotal.setBounds(20,250,100,30);
        sSubTotal = new JTextField();
        sSubTotal.setEditable(false);
        sSubTotal.setBounds(90,250,150,30);

        disCont = new JLabel("Discount");
        disCont.setBounds(280,250,100,30);
        sDisCount = new JTextField();
        sDisCount.setEditable(false);
        sDisCount.setBounds(350,250,150,30);

        grandTotal = new JLabel("Grand Total");
        grandTotal.setBounds(530,250,100,30);
        sGrandTotal = new JTextField();
        sGrandTotal.setEditable(false);
        sGrandTotal.setBounds(600,250,150,30);


        print = new JButton("Print");
        print.setBounds(100,300,80,30);
        print.addActionListener(this);

        save = new JButton("Save");
        save.setBounds(350,300,80,30);
        save.addActionListener(this);

        create = new JButton("New");
        create.setBounds(600,300,80,30);
        create.addActionListener(this);

        hjf.add(custName);
        hjf.add(gCName);    
        hjf.add(date);
        hjf.add(gdate);
        hjf.add(phNo);
        hjf.add(gpNo);      
        hjf.add(email);
        hjf.add(gemail);


        hjf.add(subTotal);
        hjf.add(sSubTotal);
        hjf.add(disCont);
        hjf.add(sDisCount);
        hjf.add(grandTotal);
        hjf.add(sGrandTotal);

        hjf.add(print);
        hjf.add(save);
        hjf.add(create);

       
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==print){
            //currentDate
        long millis=System.currentTimeMillis();     
        java.sql.Date date = new java.sql.Date(millis);
        String Cdate = date.toString();
        gdate.setText(Cdate);
        }
        
    }
    public static void main(String[] args) {
        new Test();
    }
}