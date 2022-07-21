import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Window.Type;

public class FirstBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private final Action action = new SwingAction();
	private double answer=0,number = 0;
	int operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstBuilder frame = new FirstBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str)
	{
		
		txt.setText(txt.getText() + str);
	}
	

	public void calculate()
	{
		switch(operation)
		{
		case 1:
			answer = number + Double.parseDouble(txt.getText());
			txt.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(txt.getText());
			txt.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(txt.getText());
			txt.setText(Double.toString(answer));
			break;
		case 4: 
			answer = number / Double.parseDouble(txt.getText());
			txt.setText(Double.toString(answer));
			break;
			
		}
	}
	
	
	public FirstBuilder() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 366, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt = new JTextField();
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
		txt.setEditable(false);
		txt.setBounds(10, 23, 346, 42);
		panel.add(txt);
		txt.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(10, 0, 346, 26);
		panel.add(lbl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 85, 366, 368);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 1, 0));
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 36));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn9);
		
		JButton divBtn = new JButton("/");
		divBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 4;
				number = Double.parseDouble(txt.getText());
				lbl.setText(Double.toString(number)+e.getActionCommand());
				txt.setText("");
				
			}
		});
		divBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(divBtn);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn6);
		
		JButton mutliBtn = new JButton("x");
		mutliBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 3;
				number = Double.parseDouble(txt.getText());				
				lbl.setText(Double.toString(number)+e.getActionCommand());
				txt.setText("");
			}
		});
		mutliBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(mutliBtn);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn3);
		
		JButton sumBtn = new JButton("+");
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txt.getText());
				operation = 1;		
				lbl.setText(Double.toString(number)+e.getActionCommand());
				txt.setText("");		
			}
		});
		sumBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(sumBtn);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btn0);
		
		JButton pointBtn = new JButton(".");
		pointBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt.getText().contains(".")==false)
				{
					addInput(e.getActionCommand());
				}		
			}
		});
		pointBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(pointBtn);
		
		JButton difBtn = new JButton("-");
		difBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().length() == 0)
				{
					txt.setText("-");
				}else {
				operation = 2;
				number = Double.parseDouble(txt.getText());
				lbl.setText(Double.toString(number)+e.getActionCommand());
				txt.setText("");
				}
			}
		});
		difBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(difBtn);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText(Double.toString(answer));
				txt.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_1.add(btnNewButton);
		
		JButton ansBtn = new JButton("=");
		ansBtn.setBounds(10, 454, 272, 65);
		contentPane.add(ansBtn);
		ansBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		ansBtn.setFont(new Font("Tahoma", Font.BOLD, 36));
		
		JButton backSpace = new JButton("<X");
		backSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				for(int i = 0;i<txt.getText().length()-1;i++)
				{
					str += txt.getText().charAt(i);
				}
				txt.setText(str);
				
				
			}
		});
		backSpace.setBounds(282, 454, 94, 65);
		contentPane.add(backSpace);
		backSpace.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
