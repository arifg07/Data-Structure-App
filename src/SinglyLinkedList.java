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

public class SinglyLinkedList extends JFrame {
class Node
{
int data;
Node link;
}
    private Node first;
private JPanel contentPane;
private JTextField elementrear;
private JTextField displaybox;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SinglyLinkedList frame = new SinglyLinkedList();
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
public SinglyLinkedList() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 822, 586);
contentPane = new JPanel();
contentPane.setForeground(new Color(0, 0, 0));
contentPane.setBackground(new Color(128, 128, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
heading.setForeground(new Color(0, 0, 0));
heading.setFont(new Font("Cooper Black", Font.PLAIN, 26));
heading.setBounds(118, 49, 680, 30);
contentPane.add(heading);

JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
lblEnterTheElement.setForeground(new Color(0, 0, 0));
lblEnterTheElement.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterTheElement.setBounds(97, 129, 223, 32);
contentPane.add(lblEnterTheElement);

elementrear = new JTextField();
elementrear.setFont(new Font("Dubai", Font.BOLD, 18));
elementrear.setBounds(375, 126, 146, 38);
contentPane.add(elementrear);
elementrear.setColumns(10);

JButton insertrear = new JButton("INSERT REAR");
insertrear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for insertrear
int elem = Integer.valueOf(elementrear.getText());
Node temp;
Node newnode = new Node();
newnode.data = elem;
newnode.link = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+newnode.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
elementrear.requestFocusInWindow();
}
else
{
temp=first;
while(temp.link!=null)
{
temp=temp.link;
}
temp.link=newnode;
String message = "New node with value "+newnode.data+" is successfully craeted and inserted at REAR";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
elementrear.requestFocusInWindow();
}
}
});
insertrear.setFont(new Font("Dubai", Font.BOLD, 18));
insertrear.setBounds(118, 209, 213, 41);
contentPane.add(insertrear);

JButton insertfront = new JButton("INSERT FRONT");
insertfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for insertfront
int elem = Integer.valueOf(elementrear.getText());
Node newnode = new Node();
newnode.data = elem;
newnode.link = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+newnode.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
elementrear.requestFocusInWindow();
}
else
{
newnode.link = first;
first = newnode;
String message = "New node with value "+newnode.data+" is successfully craeted and inserted at FRONT";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
elementrear.requestFocusInWindow();
}
}
});
insertfront.setFont(new Font("Dubai", Font.BOLD, 18));
insertfront.setBounds(500, 209, 213, 41);
contentPane.add(insertfront);

JButton deleterear = new JButton("DELETE REAR");
deleterear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deletetrear
Node temp;
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
displaybox.setText("Queue is Empty");
}
else if (first.link==null)
{
String message = "Element "+first.data+" deleted from rear";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
temp=first;
while(temp.link.link!=null)
{
temp = temp.link;
}
String message = "Element "+temp.link.data+" deleted from rear";
JOptionPane.showMessageDialog(contentPane, message);
temp.link = null;
}
}
});
deleterear.setFont(new Font("Dubai", Font.BOLD, 18));
deleterear.setBounds(118, 332, 213, 41);
contentPane.add(deleterear);

JButton deleterfront = new JButton("DELETE FRONT");
deleterfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deletefront
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
displaybox.setText("List is Empty");
}
else if (first.link==null)
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = first.link;

}
}
});
deleterfront.setFont(new Font("Dubai", Font.BOLD, 18));
deleterfront.setBounds(508, 332, 205, 41);
contentPane.add(deleterfront);

JButton display = new JButton("DISPLAY");
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for display
Node temp;
String res="";
if(first==null)
{
String message = "List is Empty!!!";
JOptionPane.showMessageDialog(contentPane, message);
elementrear.setText("");
displaybox.setText("List is Empty");
}
else if (first.link==null)
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
temp = temp.link;
}
       displaybox.setText(res1);
}
}
});
display.setFont(new Font("Dubai", Font.BOLD, 18));
display.setBounds(344, 406, 160, 41);
contentPane.add(display);

displaybox = new JTextField();
displaybox.setFont(new Font("Dubai", Font.BOLD, 18));
displaybox.setColumns(10);
displaybox.setBounds(198, 478, 438, 38);
contentPane.add(displaybox);
}

}
