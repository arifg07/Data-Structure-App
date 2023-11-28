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

public class CircularQueue extends JFrame {

private JPanel contentPane;
private JTextField size;
private JTextField element;
private JTextField displaybox;
private int cqueue[];
private int size1;
private int r=-1;
private int f=0;;
private int count=0;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CircularQueue frame = new CircularQueue();
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
public CircularQueue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 843, 550);
contentPane = new JPanel();
contentPane.setBackground(new Color(128, 128, 0));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
heading.setForeground(new Color(255, 255, 128));
heading.setFont(new Font("Cooper Black", Font.PLAIN, 26));
heading.setBounds(184, 40, 530, 30);
contentPane.add(heading);

JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE");
lblEnterQueueSize.setForeground(new Color(255, 255, 0));
lblEnterQueueSize.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterQueueSize.setBounds(129, 132, 197, 32);
contentPane.add(lblEnterQueueSize);

size = new JTextField();
size.setFont(new Font("Dubai", Font.BOLD, 18));
size.setBounds(344, 129, 146, 38);
contentPane.add(size);
size.setColumns(10);

JButton create = new JButton("CREATE CQUEUE");
create.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for creating cqueue
int len = Integer.valueOf(size.getText());
cqueue = new int[len];
size1 = cqueue.length;
String message = "Queue of size "+len+" is created";
JOptionPane.showMessageDialog(contentPane, message);
element.requestFocusInWindow();
}
});
create.setFont(new Font("Dubai", Font.BOLD, 18));
create.setBounds(567, 128, 197, 41);
contentPane.add(create);

JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
lblEnterAnElement.setForeground(Color.YELLOW);
lblEnterAnElement.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterAnElement.setBounds(245, 236, 197, 32);
contentPane.add(lblEnterAnElement);

element = new JTextField();
element.setFont(new Font("Dubai", Font.BOLD, 18));
element.setColumns(10);
element.setBounds(484, 233, 146, 38);
contentPane.add(element);

JButton insert = new JButton("INSERT");
insert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for inserting cqueue
int elem = Integer.valueOf(element.getText());
if(count==size1)
{
String message = "Insertion Not Possible";
JOptionPane.showMessageDialog(contentPane, message);
element.setText("");
}
else
{
r = (r+1)%size1;
cqueue[r]=elem;
count++;
String message = "Element "+elem+" is successfully inserted";
JOptionPane.showMessageDialog(contentPane, message);
element.setText("");
if(r!=size1-1)
{
element.requestFocusInWindow();
}
}
}
});
insert.setFont(new Font("Dubai", Font.BOLD, 18));
insert.setBounds(148, 348, 141, 41);
contentPane.add(insert);

JButton delete = new JButton("DELETE");
delete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deleting cqueue
if(count==0)
{
String message = "Deletion not possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
String message = "Element deleted is "+cqueue[f];
JOptionPane.showMessageDialog(contentPane, message);
f = (f+1)%size1;
count--;
}
}
});
delete.setFont(new Font("Dubai", Font.BOLD, 18));
delete.setBounds(359, 348, 152, 41);
contentPane.add(delete);

JButton display = new JButton("DISPLAY");
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for displaying cqueue
int temp = f;
if(count==0)
{
displaybox.setText("Queue is Empty");
}
else
{
String res ="";
for(int i=1;i<=count;i++)
{
res = res+" "+cqueue[temp];
temp = (temp+1)%size1;
}
displaybox.setText(res);
}
}
});
display.setFont(new Font("Dubai", Font.BOLD, 18));
display.setBounds(578, 348, 160, 41);
contentPane.add(display);

displaybox = new JTextField();
displaybox.setFont(new Font("Dubai", Font.BOLD, 18));
displaybox.setColumns(10);
displaybox.setBounds(204, 430, 455, 38);
contentPane.add(displaybox);
}

}
