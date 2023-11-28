import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Queue extends JFrame {

private JPanel contentPane;
private JTextField queuesize;
private JTextField element;
private JTextField displaybox;
private int queue[];
private int size;
private int r=-1;
private int f=0;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Queue frame = new Queue();
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
public Queue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 839, 608);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 128, 192));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
heading.setForeground(new Color(255, 255, 255));
heading.setFont(new Font("Cooper Black", Font.PLAIN, 26));
heading.setBounds(208, 50, 408, 30);
contentPane.add(heading);

JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE");
lblNewLabel.setForeground(new Color(255, 255, 255));
lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 18));
lblNewLabel.setBounds(67, 160, 200, 32);
contentPane.add(lblNewLabel);

queuesize = new JTextField();
queuesize.setFont(new Font("Dubai", Font.BOLD, 18));
queuesize.setForeground(new Color(255, 255, 255));
queuesize.setBackground(new Color(0, 0, 0));
queuesize.setBounds(300, 157, 146, 38);
contentPane.add(queuesize);
queuesize.setColumns(10);

JButton btnNewButton = new JButton("CREATE QUEUE");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for creating queue
int len = Integer.valueOf(queuesize.getText());
queue = new int[len];
size = queue.length;
String message = "Queue of size "+size+" is created";
JOptionPane.showMessageDialog(contentPane, message);
element.requestFocusInWindow();
}
});
btnNewButton.setFont(new Font("Dubai", Font.BOLD, 18));
btnNewButton.setBounds(567, 156, 177, 41);
contentPane.add(btnNewButton);

JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
lblEnterAnElement.setForeground(new Color(255, 255, 255));
lblEnterAnElement.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterAnElement.setBounds(208, 296, 230, 32);
contentPane.add(lblEnterAnElement);

element = new JTextField();
element.setForeground(new Color(255, 255, 255));
element.setBackground(new Color(0, 0, 0));
element.setFont(new Font("Dubai", Font.BOLD, 18));
element.setColumns(10);
element.setBounds(448, 293, 146, 38);
contentPane.add(element);

JButton btnInsert = new JButton("INSERT");
btnInsert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for inserting  queue
int elem = Integer.valueOf(element.getText());
if(r==size-1)
{
String message = "Insertion Not Possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
++r;
queue[r]=elem;
String message = "Element "+queue[r]+" is successfully inserted";
JOptionPane.showMessageDialog(contentPane, message);
element.setText("");
if(r!=size-1)
{
element.requestFocusInWindow();
}
}
}
});
btnInsert.setFont(new Font("Dubai", Font.BOLD, 18));
btnInsert.setBounds(156, 398, 136, 41);
contentPane.add(btnInsert);

JButton btnDelete = new JButton("DELETE");
btnDelete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deleting queue
if(r==-1 || f>r)
{
String message = "Deletion not possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
String message = "Element deleted is "+queue[f];
JOptionPane.showMessageDialog(contentPane, message);
++f;
}
}
});
btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
btnDelete.setBounds(363, 398, 136, 41);
contentPane.add(btnDelete);

JButton btnDisplay = new JButton("DISPLAY");
btnDisplay.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for displaying queue
String res="";
for(int i=f;i<=r;i++)
{
res = res+" "+queue[i];
}
displaybox.setText(res);
}
});
btnDisplay.setFont(new Font("Dubai", Font.BOLD, 18));
btnDisplay.setBounds(580, 398, 136, 41);
contentPane.add(btnDisplay);

displaybox = new JTextField();
displaybox.setBackground(new Color(0, 0, 0));
displaybox.setFont(new Font("Dubai", Font.BOLD, 18));
displaybox.setForeground(new Color(255, 255, 255));
displaybox.setColumns(10);
displaybox.setBounds(208, 483, 423, 38);
contentPane.add(displaybox);
}

}
