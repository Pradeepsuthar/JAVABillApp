# JAVABillApp

AIM : Billing Sofware
Source Code :
File : GenerateBill.java
import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
public class GenerateBill implements ActionListener{
private JFrame frame;
private Panel northPanel,centerPanel,eastPanel,southPanel;
private JLabel
shopName,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,emtyLabel1,emtyLabel2;
private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
private JButton add,print;
private JComboBox c1,c2,c3;
private JTable table = new JTable();
private BorderLayout bl = new BorderLayout();
private FlowLayout pfl = new FlowLayout(FlowLayout.CENTER,0,20);
private FlowLayout fl = new FlowLayout(FlowLayout.LEFT,0,10);
private GridLayout cgl = new GridLayout(5,4);
private GridLayout egl = new GridLayout(4,2);
private GridLayout sgl = new GridLayout(2,0);
private JLabel warnningMssge;
DefaultTableModel model = new DefaultTableModel();
int count=0;
double grand_total = 0;
public static void main(String[] args) {
new GenerateBill();
}
public GenerateBill() {
try {

UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (Exception err) {
err.printStackTrace();
}
initialize();
add.addActionListener(this);
print.addActionListener(this);

Object[] columns = {"Sr.No.","Product ID","Product

Name","Price(Rs.)","Brand","Size","Quantity","Total"};
model.setColumnIdentifiers(columns);
table.setModel(model);
}
private void initialize() {
frame = new JFrame("Billing Software");
frame.setBounds(300,60,800, 650);
frame.getContentPane().setLayout(bl);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
northPanel = new Panel();
northPanel.setLayout(pfl);
northPanel.setVisible(true);
northPanel.setBackground(Color.white);
shopName = new JLabel("Billing Software");
shopName.setForeground(Color.red);
shopName.setFont(new Font("Century Gothic", Font.BOLD, 12));
shopName.setSize(100, 50);
warnningMssge = new JLabel(" If dropdown menu is not working then

please resize the frame.");

warnningMssge.setForeground(Color.black);
warnningMssge.setFont(new Font("Century Gothic", Font.BOLD, 12));
warnningMssge.setSize(100, 50);
northPanel.add(shopName);
northPanel.add(warnningMssge);
frame.getContentPane().add(northPanel,BorderLayout.NORTH);
centerPanel = new Panel();
centerPanel.setLayout(cgl);
centerPanel.setVisible(true);
centerPanel.setBackground(Color.white);
l1 = new JLabel("Customer Name");
l1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l1.setForeground(Color.black);
l1.setBorder(new EmptyBorder(10, 10, 10, 10));
l1.setAlignmentX(Component.CENTER_ALIGNMENT);
l1.setSize(100, 20);
l2 = new JLabel("Mobile No.");
l2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l2.setBorder(new EmptyBorder(10, 10, 10, 10));
l2.setSize(100, 20);
l3 = new JLabel("Product ID");
l3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l3.setBorder(new EmptyBorder(10, 10, 10, 10));
l3.setSize(100, 20);
l4 = new JLabel("Date");
l4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l4.setBorder(new EmptyBorder(10, 10, 10, 10));
l4.setSize(100, 20);
l5 = new JLabel("Product Name");
l5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l5.setBorder(new EmptyBorder(10, 10, 10, 10));
l5.setSize(100, 20);
l6 = new JLabel("Price");
l6.setFont(new Font("Century Gothic", Font.PLAIN, 11));

l6.setBorder(new EmptyBorder(10, 10, 10, 10));
l6.setSize(100, 20);
l7 = new JLabel("Brand Name");
l7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l7.setBorder(new EmptyBorder(10, 10, 10, 10));
l7.setSize(100, 20);
l8 = new JLabel("Size");
l8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l8.setBorder(new EmptyBorder(10, 10, 10, 10));
l8.setSize(100, 20);
l9 = new JLabel("Color");
l9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l9.setBorder(new EmptyBorder(10, 10, 10, 10));
l9.setSize(100, 20);
l10 = new JLabel("Quntity");
l10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l10.setBorder(new EmptyBorder(10, 10, 10, 10));
l10.setSize(100, 20);
emtyLabel1 = new JLabel("");
emtyLabel1.setBorder(new EmptyBorder(10, 10, 10, 10));
emtyLabel1.setSize(100, 20);
emtyLabel2 = new JLabel("");
emtyLabel2.setBorder(new EmptyBorder(10, 10, 10, 10));
emtyLabel2.setSize(100, 20);
t1 = new JTextField();
t1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t1.setToolTipText("Enter Customer Name");
t2 = new JTextField();
t2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t2.setToolTipText("Enter Mobile Number");
t3 = new JTextField();
t3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t3.setToolTipText("Enter Product ID");
t4 = new JTextField();
t4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t4.setEditable(false);
t5 = new JTextField();
t5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t5.setEditable(true);
t6 = new JTextField();
t6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t6.setEditable(true);
t7 = new JTextField();
t7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t7.setEditable(true);
// array of string contains values

String s1[] = { "28", "30", "32", "34", "36", "38", "40", "42","XS" ,"S",
"M", "XL", "2XL", "3XL", "4XL" };
String s3[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
"12" };
// create checkbooks
c1 = new JComboBox(s1);
c1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
c1.setBorder(new EmptyBorder(10, 10, 10, 10));
c1.setBackground(Color.white);

c3 = new JComboBox(s3);
c3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
c3.setBorder(new EmptyBorder(10, 10, 10, 10));
c3.setBackground(Color.white);
centerPanel.add(l1);centerPanel.add(t1);centerPanel.add(l2);centerPanel.add
(t2);
centerPanel.add(l3);centerPanel.add(t3);centerPanel.add(l4);centerPanel.add
(t4);
centerPanel.add(l5);centerPanel.add(t5);centerPanel.add(l6);centerPanel.add
(t6);
centerPanel.add(l7);centerPanel.add(t7);centerPanel.add(l8);centerPanel.add
(c1);
centerPanel.add(l10);centerPanel.add(c3);centerPanel.add(emtyLabel1);center
Panel.add(emtyLabel2);

frame.getContentPane().add(centerPanel,BorderLayout.CENTER);
eastPanel = new Panel();
eastPanel.setLayout(egl);
eastPanel.setVisible(true);
eastPanel.setBackground(Color.white);
l11 = new JLabel("Discount");
l11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l11.setBorder(new EmptyBorder(0, 6, 0, 0));
l11.setSize(80, 20);
l12 = new JLabel("GST");
l12.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l12.setBorder(new EmptyBorder(0, 6, 0, 0));
l12.setSize(80, 20);
l13 = new JLabel("Payment Method");
l13.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l13.setBorder(new EmptyBorder(0, 6, 0, 0));
l13.setSize(80, 20);
l14 = new JLabel("Grand Total");
l14.setFont(new Font("Century Gothic", Font.PLAIN, 11));
l14.setBorder(new EmptyBorder(0, 6, 0, 0));
l14.setSize(80, 20);
t8 = new JTextField();
t8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t8.setEditable(false);
t9 = new JTextField();
t9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t9.setEditable(false);
t10 = new JTextField();
t10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t10.setEditable(false);
t11 = new JTextField();
t11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
t11.setEditable(false);
add = new JButton("Add in List");
add.setFont(new Font("Century Gothic", Font.PLAIN, 11));
add.setBorder(new EmptyBorder(10, 10, 10, 10));

add.setToolTipText("Add this product in your list");
add.setBackground(Color.LIGHT_GRAY);
print = new JButton("Print");
print.setFont(new Font("Century Gothic", Font.PLAIN, 11));
print.setBackground(Color.LIGHT_GRAY);

String paymet_method[] = {"Cash","Net Banking","UPI","Paytm"};
c2 = new JComboBox(paymet_method);
c2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
c2.setBorder(new EmptyBorder(10, 10, 10, 10));
c2.setBackground(Color.white);

eastPanel.add(l12);eastPanel.add(t9);
eastPanel.add(l14);eastPanel.add(t8);
eastPanel.add(l13);eastPanel.add(c2);
eastPanel.add(add);eastPanel.add(print);
southPanel = new Panel();
southPanel.setLayout(sgl);
southPanel.setVisible(true);
JScrollPane pane = new JScrollPane(table);
pane.setPreferredSize(new Dimension(1370,100));
southPanel.add(pane);
southPanel.add(eastPanel);
frame.getContentPane().add(southPanel,BorderLayout.SOUTH);
//Current Date
CurretDate();
}
public void CurretDate() {
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDateTime now = LocalDateTime.now();
t4.setText(dtf.format(now));
}
public void actionPerformed(ActionEvent e) {
String customerName;
String mobile;
String pradt_id;
String prodt_name;
String price;
String brand;
String size;
String qty;
String payment;
double totald;
double grandtotal;
if(e.getSource()==add) {
Object[] row = new Object[8];

customerName = t1.getText();
mobile = t2.getText();
pradt_id = t3.getText();
prodt_name = t5.getText();
price = t6.getText();
brand = t7.getText();
size = String.valueOf(c1.getSelectedItem());
qty = String.valueOf(c3.getSelectedItem());
Double priced = Double.parseDouble(price);
Double qtyd = Double.parseDouble(qty);
totald = priced*qtyd;
grand_total = grand_total+ totald;
count++;
double gst = (grand_total)*5/100;
String print_gst = String.valueOf(gst);
t9.setText(print_gst);
double totalWithGst = ((grand_total)*5/100)+grand_total;
String prit_grand_total = String.valueOf(totalWithGst);
t8.setText(prit_grand_total);
row[0] = count;
row[1] = pradt_id;
row[2] = prodt_name;
row[3] = price;
row[4] = brand;
row[5] = size;
row[6] = qty;
row[7] = totald;
model.addRow(row);

}
if(e.getSource()==print) {
Bill billObj = new Bill();
customerName = t1.getText();
mobile = t2.getText();
price = t6.getText();
qty = String.valueOf(c3.getSelectedItem());
int items = count;
Double priced = Double.parseDouble(price);
Double qtyd = Double.parseDouble(qty);

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-
yyyy");

LocalDateTime now = LocalDateTime.now();
String date = dtf.format(now);
totald = priced*qtyd;
grandtotal = grand_total + totald;
double totalWithGst = ((grand_total)*5/100)+grand_total;

payment = String.valueOf(c2.getSelectedItem());

billObj.enterName(customerName,mobile,payment,totalWithGst,items,date);
}
}
}
File : Bill.java
import javax.swing.*;
import java.awt.Font;
public class Bill {
JLabel
lblNewLabel_1,lblPhoneNo,lblDate,lblPaymentMethod,lblNoOfItems,lblTotal;
private JLabel lblPhoneNo_1;
private JLabel lblDate_1;
private JLabel lblPaymentMethod_1;
private JLabel label;
private JLabel label_1;
private JLabel lblGst;
Bill(){
JFrame frame = new JFrame("Bill");

frame.setVisible(true);
frame.setSize(600,400);
frame.getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Amardeep Garments");
lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
lblNewLabel.setBounds(131, 27, 271, 32);
frame.getContentPane().add(lblNewLabel);
lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
lblNewLabel_1.setBounds(141, 98, 207, 22);
frame.getContentPane().add(lblNewLabel_1);
lblPhoneNo = new JLabel("Phone No.");
lblPhoneNo.setFont(new Font("Century Gothic", Font.PLAIN, 15));
lblPhoneNo.setBounds(413, 98, 207, 22);
frame.getContentPane().add(lblPhoneNo);
lblDate = new JLabel("Date");
lblDate.setFont(new Font("Century Gothic", Font.PLAIN, 15));
lblDate.setBounds(128, 147, 207, 22);
frame.getContentPane().add(lblDate);
lblPaymentMethod = new JLabel("Payment Method");
lblPaymentMethod.setFont(new Font("Century Gothic", Font.PLAIN, 15));
lblPaymentMethod.setBounds(476, 147, 207, 22);
frame.getContentPane().add(lblPaymentMethod);
lblNoOfItems = new JLabel("Items : ");
lblNoOfItems.setFont(new Font("Century Gothic", Font.BOLD, 18));

lblNoOfItems.setBounds(389, 192, 143, 22);
frame.getContentPane().add(lblNoOfItems);
lblTotal = new JLabel("Total :");
lblTotal.setFont(new Font("Century Gothic", Font.BOLD, 18));
lblTotal.setBounds(389, 213, 143, 22);
frame.getContentPane().add(lblTotal);
JLabel lblName = new JLabel("Name:");
lblName.setFont(new Font("Century Gothic", Font.BOLD, 17));
lblName.setBounds(79, 97, 66, 22);
frame.getContentPane().add(lblName);
lblPhoneNo_1 = new JLabel("Phone No:");
lblPhoneNo_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
lblPhoneNo_1.setBounds(322, 97, 95, 22);
frame.getContentPane().add(lblPhoneNo_1);
lblDate_1 = new JLabel("Date:");
lblDate_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
lblDate_1.setBounds(79, 146, 50, 22);
frame.getContentPane().add(lblDate_1);
lblPaymentMethod_1 = new JLabel("Payment Method:");
lblPaymentMethod_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
lblPaymentMethod_1.setBounds(322, 146, 152, 22);
frame.getContentPane().add(lblPaymentMethod_1);
label = new JLabel("Items : ");
label.setFont(new Font("Century Gothic", Font.BOLD, 18));
label.setBounds(324, 192, 66, 22);
frame.getContentPane().add(label);
label_1 = new JLabel("Total :");
label_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
label_1.setBounds(324, 213, 66, 22);
frame.getContentPane().add(label_1);
lblGst = new JLabel("GST : 5% ");
lblGst.setFont(new Font("Century Gothic", Font.PLAIN, 15));
lblGst.setBounds(79, 192, 95, 22);
frame.getContentPane().add(lblGst);
}
public void enterName(String name,String mobile_no,String
payment_method,double totalAmount,int items,String currentDate)
{
lblNewLabel_1.setText(name);
lblPhoneNo.setText(mobile_no);
lblDate.setText(currentDate);
String total = String.valueOf(totalAmount);
lblPaymentMethod.setText(payment_method);
String total_items = String.valueOf(items);
lblNoOfItems.setText(total_items);
lblTotal.setText(total);
}

public static void main(String[] args) {
new Bill();
}
}
