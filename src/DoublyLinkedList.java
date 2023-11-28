import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {
class Node
{
Node prelink;
int data;
Node nextlink;
}
    private Node first;
private JPanel contentPane;
private JTextField dlltfa;
private JTextField displaybox;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
DoublyLinkedList frame = new DoublyLinkedList();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public DoublyLinkedList() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 855, 561);
contentPane = new JPanel();
contentPane.setBackground(new Color(192, 192, 192));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblDoublyLinkedList = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
lblDoublyLinkedList.setBackground(new Color(255, 128, 0));
lblDoublyLinkedList.setForeground(new Color(0, 128, 255));
lblDoublyLinkedList.setFont(new Font("Cooper Black", Font.PLAIN, 26));
lblDoublyLinkedList.setBounds(119, 40, 712, 30);
contentPane.add(lblDoublyLinkedList);

JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
lblEnterTheElement.setForeground(new Color(0, 128, 255));
lblEnterTheElement.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterTheElement.setBounds(135, 109, 233, 32);
contentPane.add(lblEnterTheElement);

dlltfa = new JTextField();
dlltfa.setForeground(new Color(0, 128, 255));
dlltfa.setFont(new Font("Dubai", Font.BOLD, 18));
dlltfa.setColumns(10);
dlltfa.setBounds(411, 106, 146, 38);
contentPane.add(dlltfa);

JButton insertrear = new JButton("INSERT REAR");
insertrear.setForeground(new Color(0, 128, 255));
insertrear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem = Integer.valueOf(dlltfa.getText());
Node temp;
Node newnode = new Node();
newnode.data = elem;
newnode.prelink = null;
newnode.nextlink = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+first.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
}
else
{
temp=first;
while(temp.nextlink!=null)
{
temp=temp.nextlink;
}
temp.nextlink = newnode;
newnode.prelink = temp;
String message = "New node with value "+newnode.data+" is successfully craeted and inserted at REAR";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
}
}
});
insertrear.setFont(new Font("Dubai", Font.BOLD, 18));
insertrear.setBounds(135, 180, 224, 41);
contentPane.add(insertrear);

JButton insertfront = new JButton("INSERT FRONT");
insertfront.setForeground(new Color(0, 128, 255));
insertfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem = Integer.valueOf(dlltfa.getText());
Node newnode = new Node();
newnode.data = elem;
newnode.prelink = null;
newnode.nextlink = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+newnode.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
}
else
{

newnode.nextlink = first;
first.prelink=newnode;
first = newnode;
String message = "New node with value "+first.data+" is successfully craeted and inserted at FRONT";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
}
}
});
insertfront.setFont(new Font("Dubai", Font.BOLD, 18));
insertfront.setBounds(530, 180, 214, 41);
contentPane.add(insertfront);

JButton deleterear = new JButton("DELETE REAR");
deleterear.setForeground(new Color(0, 128, 255));
deleterear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
displaybox.setText("List is Empty");
}
else if (first.nextlink==null)
{
String message = "Element "+first.data+" deleted from rear";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
temp=first;
while(temp.nextlink.nextlink!=null)
{
temp = temp.nextlink;
}
String message = "Element "+temp.data+" deleted from raer";
JOptionPane.showMessageDialog(contentPane, message);
temp.nextlink = null;
}
}
});
deleterear.setFont(new Font("Dubai", Font.BOLD, 18));
deleterear.setBounds(135, 270, 224, 41);
contentPane.add(deleterear);

JButton deleterfront = new JButton("DELETE FRONT");
deleterfront.setForeground(new Color(0, 128, 255));
deleterfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
displaybox.setText("List is Empty");
}
else if (first.nextlink==null)
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = first.nextlink;
first.prelink = null;
}
}
});
deleterfront.setFont(new Font("Dubai", Font.BOLD, 18));
deleterfront.setBounds(530, 270, 214, 41);
contentPane.add(deleterfront);

JButton displayforward = new JButton(" DISPLAY FORWARD");
displayforward.setForeground(new Color(0, 128, 255));
displayforward.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
String res="";
if(first==null)
{
String message = "List is Empty, Display Not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
displaybox.setText("List is Empty");
}
else if (first.nextlink==null)
{
res = res+first.data;
displaybox.setText(res);
}
else
{
String res1="";
temp=first;
while(temp!=null)
{

res1 = res1+" "+temp.data;
temp = temp.nextlink;
}
displaybox.setText(res1);
}
}
});
displayforward.setFont(new Font("Dubai", Font.BOLD, 18));
displayforward.setBounds(135, 359, 224, 41);
contentPane.add(displayforward);

JButton displayreverse = new JButton("DISPLAY REVERSE");
displayreverse.setForeground(new Color(0, 128, 255));
displayreverse.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
String res="";
if(first==null)
{
String message = "List is Empty, Display Not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
dlltfa.setText("");
displaybox.setText("List is Empty");
}
else if (first.nextlink==null)
{
res = res+first.data;
displaybox.setText(res);
}
else
{
String res1="";
temp=first;
while(temp.nextlink!=null)
{
temp = temp.nextlink;
}
while(temp!=null)
{

res1 = res1+" "+temp.data;
temp = temp.prelink;
}
displaybox.setText(res1);
}

}
});
displayreverse.setFont(new Font("Dubai", Font.BOLD, 18));
displayreverse.setBounds(530, 359, 214, 41);
contentPane.add(displayreverse);

displaybox = new JTextField();
displaybox.setForeground(new Color(0, 128, 255));
displaybox.setFont(new Font("Dubai", Font.BOLD, 18));
displaybox.setColumns(10);
displaybox.setBounds(206, 447, 476, 38);
contentPane.add(displaybox);
}

}
