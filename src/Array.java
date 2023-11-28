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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLength;
	private JTextField textFieldElement;
	private JTextField textFieldDelete;
	private JTextField textFieldInsertPosition;
	private JTextField textFieldDisplay;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 586);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 26));
		lblNewLabel.setBounds(226, 22, 370, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE LENGTH OF ARRAY");
		lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 18));
		lblNewLabel_1.setBounds(46, 123, 256, 32);
		contentPane.add(lblNewLabel_1);
		
		textFieldLength = new JTextField();
		textFieldLength.setFont(new Font("Dubai", Font.BOLD, 18));
		textFieldLength.setBounds(351, 120, 146, 38);
		contentPane.add(textFieldLength);
		textFieldLength.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE ARRAY");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Create array
				int len=Integer.valueOf(textFieldLength.getText());
				arr=new int[len];
				String message="Array of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane,message);
				
				
			}
		});
		btnCreate.setBackground(new Color(255, 0, 128));
		btnCreate.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		btnCreate.setBounds(579, 119, 165, 41);
		contentPane.add(btnCreate);
		
		JLabel lblNewLabel_1_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1_1.setFont(new Font("Dubai", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(46, 235, 256, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldElement = new JTextField();
		textFieldElement.setFont(new Font("Dubai", Font.BOLD, 18));
		textFieldElement.setColumns(10);
		textFieldElement.setBounds(351, 232, 146, 38);
		contentPane.add(textFieldElement);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insert array
				int elem=Integer.valueOf(textFieldElement.getText());
				int pos=Integer.valueOf(textFieldInsertPosition.getText());
				arr[pos]=elem;
				String message="Element "+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				textFieldElement.setText("");
				textFieldInsertPosition.setText("");
				

			}
		});
		btnInsert.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		btnInsert.setBackground(new Color(255, 0, 128));
		btnInsert.setBounds(488, 302, 165, 41);
		contentPane.add(btnInsert);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DELETE POSITION");
		lblNewLabel_1_1_1.setFont(new Font("Dubai", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(46, 406, 256, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		textFieldDelete = new JTextField();
		textFieldDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		textFieldDelete.setColumns(10);
		textFieldDelete.setBounds(351, 403, 146, 38);
		contentPane.add(textFieldDelete);
		
		textFieldInsertPosition = new JTextField();
		textFieldInsertPosition.setFont(new Font("Dubai", Font.BOLD, 18));
		textFieldInsertPosition.setColumns(10);
		textFieldInsertPosition.setBounds(643, 232, 121, 38);
		contentPane.add(textFieldInsertPosition);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("POSITION");
		lblNewLabel_1_1_1_1.setFont(new Font("Dubai", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(543, 235, 82, 32);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Delete array
				int pos=Integer.valueOf(textFieldDelete.getText());
				arr[pos]=0;
				String message="Element deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				textFieldDelete.setText("");

				
			}
		});
		btnDelete.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		btnDelete.setBackground(new Color(255, 0, 128));
		btnDelete.setBounds(599, 397, 165, 41);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display array
				String msg="";
				for(int i=0;i<arr.length;i++)
				{
					msg=msg+" "+arr[i];
				}
				textFieldDisplay.setText(msg);
			}
		});
		btnDisplay.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		btnDisplay.setBackground(new Color(255, 0, 128));
		btnDisplay.setBounds(46, 475, 165, 41);
		contentPane.add(btnDisplay);
		
		textFieldDisplay = new JTextField();
		textFieldDisplay.setFont(new Font("Dubai", Font.BOLD, 18));
		textFieldDisplay.setColumns(10);
		textFieldDisplay.setBounds(351, 475, 413, 38);
		contentPane.add(textFieldDisplay);
	}

}
