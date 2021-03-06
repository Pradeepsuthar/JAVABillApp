import javax.swing.*;
import java.awt.event.*;
class HomePage implements ActionListener{
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
        // HomePage JFrame
        jf= new JFrame("HomePage");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setBounds(250,100,800,400);
        jf.setResizable(true);

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

        jf.add(custName);
        jf.add(gCName);    
        jf.add(date);
        jf.add(gdate);
        jf.add(phNo);
        jf.add(gpNo);      
        jf.add(email);
        jf.add(gemail);


        jf.add(subTotal);
        jf.add(sSubTotal);
        jf.add(disCont);
        jf.add(sDisCount);
        jf.add(grandTotal);
        jf.add(sGrandTotal);

        jf.add(print);
        jf.add(save);
        jf.add(create);

       
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==print){
            //currentDate
        long millis=System.currentTimeMillis();     
        java.sql.Date date = new java.sql.Date(millis);
        String Cdate = date.toString();
        gdate.setText(Cdate);
        }
        // Save Button
        if(e.getSource()==save)
        {
            //..code
        }
        // New Button
        if(e.getSource()==create)
        {
           //..code
        }
    }
}