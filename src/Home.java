import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 26));
		lblNewLabel.setBounds(225, 30, 410, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnArray = new JButton("ARRAY");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Array open
				new Array().setVisible(true);  //Anonymous object
			}
		});
		btnArray.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnArray.setBounds(125, 154, 155, 31);
		contentPane.add(btnArray);
		
		JButton btnQueue = new JButton("QUEUE");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue open
				new Queue().setVisible(true);
			
			}
		});
		btnQueue.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnQueue.setBounds(78, 303, 246, 31);
		contentPane.add(btnQueue);
		
		JButton btnCircularQueue = new JButton("CIRCULAR QUEUE");
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CQ open
				new CircularQueue().setVisible(true);
			}
		});
		btnCircularQueue.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnCircularQueue.setBounds(461, 303, 272, 31);
		contentPane.add(btnCircularQueue);
		
		JButton btnSinglyLinkedList = new JButton("SINGLY LINKED LIST");
		btnSinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SLL open
				new SinglyLinkedList().setVisible(true);
			}
		});
		btnSinglyLinkedList.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnSinglyLinkedList.setBounds(66, 458, 284, 31);
		contentPane.add(btnSinglyLinkedList);
		
		JButton btnDoubleLinkedList = new JButton("DOUBLY LINKED LIST");
		btnDoubleLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DLL open
				new DoublyLinkedList().setVisible(true);
			}
		});
		btnDoubleLinkedList.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnDoubleLinkedList.setBounds(449, 458, 301, 31);
		contentPane.add(btnDoubleLinkedList);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stack open
				new Stack().setVisible(true);
			}
		});
		btnStack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		btnStack.setBounds(508, 154, 142, 31);
		contentPane.add(btnStack);
	}

}
