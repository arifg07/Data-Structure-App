import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

private JPanel displaybox;
private JTextField size;
private JTextField element;
private JTextField result;
private int stk[];
private int top=-1;
private int size1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Stack frame = new Stack();
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
public Stack() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 820, 546);
displaybox = new JPanel();
displaybox.setBackground(new Color(255, 255, 0));
displaybox.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(displaybox);
displaybox.setLayout(null);

JLabel heading = new JLabel("STACK DATA STRUCTURE");
heading.setForeground(new Color(255, 0, 128));
heading.setFont(new Font("Cooper Black", Font.PLAIN, 26));
heading.setBounds(196, 21, 414, 47);
displaybox.add(heading);

JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
lblEnterTheStack.setForeground(new Color(255, 0, 128));
lblEnterTheStack.setFont(new Font("Dubai", Font.BOLD, 18));
lblEnterTheStack.setBounds(61, 128, 225, 32);
displaybox.add(lblEnterTheStack);

size = new JTextField();
size.setFont(new Font("Constantia", Font.BOLD, 18));
size.setBounds(309, 127, 133, 32);
displaybox.add(size);
size.setColumns(10);

JButton create = new JButton("CREATE STACK");
create.setForeground(new Color(255, 0, 0));
create.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//Code for creating stack
int stacksize = Integer.valueOf(size.getText());
stk = new int[stacksize];
       size1 = stk.length;
String message = "Stack of size "+ size1 +" is Created";
JOptionPane.showMessageDialog(displaybox, message);
element.requestFocusInWindow();
}
});
create.setFont(new Font("Dubai", Font.BOLD, 18));
create.setBounds(554, 124, 160, 36);
displaybox.add(create);

JLabel lblNewLabel = new JLabel("ENTER AN ELEMENT");
lblNewLabel.setForeground(new Color(255, 0, 128));
lblNewLabel.setFont(new Font("Dubai Medium", Font.BOLD, 18));
lblNewLabel.setBounds(143, 215, 225, 32);
displaybox.add(lblNewLabel);

element = new JTextField();
element.setFont(new Font("Constantia", Font.BOLD, 18));
element.setColumns(10);
element.setBounds(424, 219, 186, 29);
displaybox.add(element);

JButton push = new JButton("PUSH");
push.setForeground(new Color(255, 0, 0));
push.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for push
int elem = Integer.valueOf(element.getText());
if(top!=size1-1)
{

++top;
stk[top]=elem;
String message = " Element "+elem+" pushed to Stack";
JOptionPane.showMessageDialog(displaybox, message);
element.setText("");
if(top!=size1-1)
{
element.requestFocusInWindow();
}
}
else
{
String message = "Push not Possible";
JOptionPane.showMessageDialog(displaybox, message);
element.setText("");
}

}});
push.setFont(new Font("Dubai", Font.BOLD, 18));
push.setBounds(125, 336, 133, 41);
displaybox.add(push);

JButton pop = new JButton("POP");
pop.setForeground(new Color(255, 0, 0));
pop.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for pop
String message = "Element "+stk[top]+" is popped out";
JOptionPane.showMessageDialog(displaybox, message);
stk[top]=0;
--top;
}
});
pop.setFont(new Font("Dubai", Font.BOLD, 18));
pop.setBounds(342, 336, 120, 41);
displaybox.add(pop);

JButton display = new JButton("DISPLAY");
display.setForeground(new Color(255, 0, 0));
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for display
String res="";
for(int i=top;i>=0;i--)
{
res = res+" "+stk[i];
}
result.setText(res);
}
});
display.setFont(new Font("Dubai", Font.BOLD, 18));
display.setBounds(554, 336, 126, 41);
displaybox.add(display);

result = new JTextField();
result.setFont(new Font("Dubai", Font.BOLD, 18));
result.setBounds(216, 421, 394, 38);
displaybox.add(result);
result.setColumns(10);
}

}
