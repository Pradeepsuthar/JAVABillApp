import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class Login implements ActionListener{
    JFrame jf;
    JPanel lpanel;
    JLabel titel,logo,error;
    JTextField userName;
    JPasswordField pass;
    JCheckBox cb;
    JButton submit;
    Login()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception err) {
            err.printStackTrace();
        }
        jf = new JFrame("Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setBounds(250,100,800,400);
        jf.setResizable(true);

        lpanel = new JPanel();
        lpanel.setSize(400,400);
        lpanel.setLayout(null);
        lpanel.setBackground(Color.white);

        titel = new JLabel("Login");
        titel.setBounds(580,50,100,40);
        titel.setFont(new Font("Tahoma", Font.PLAIN, 18));

        logo = new JLabel("GITS Application");
        logo.setBounds(130,150,200,30);
        logo.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        userName = new JTextField("Username");
        userName.setBounds(450,100,300,30);
        
        pass = new JPasswordField("Password");
        pass.setBounds(450,150,300,30);

        cb = new JCheckBox("Remember Me");
        cb.setBounds(450,200,200,30);
        
        submit = new JButton("Submit");
        submit.setBounds(550,250,80,30);
        
        error = new JLabel();
        error.setBounds(550,280,80,30);

        

        jf.add(logo);
        jf.add(lpanel);
        jf.add(titel);
        jf.add(userName);
        jf.add(pass);
        jf.add(cb);
        jf.add(submit);

        jf.add(error);

        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit)
        {
            String Name = userName.getText();
            String password = pass.getText();
            if (Name.trim().equals("admin") && password.trim().equals("admin")) {
               new HomePage();
                jf.dispose();
            } else {
                error.setText("Loged In Failed");
            }
        }

    }
}