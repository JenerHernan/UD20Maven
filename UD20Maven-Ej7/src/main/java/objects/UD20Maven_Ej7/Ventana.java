package objects.UD20Maven_Ej7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private boolean ptas = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		frame.getContentPane().add(lblNewLabel);
		
		num1 = new JTextField();
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		frame.getContentPane().add(lblNewLabel_1);
		
		num2 = new JTextField();
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JButton btnNewButton = new JButton("Euros a ptas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double n1 = Double.parseDouble(num1.getText());
				if(ptas) {
					ptas = !ptas;
					((JButton)e.getSource()).setText("Ptas a euros");
				}
				else {
					ptas = !ptas;
					((JButton)e.getSource()).setText("Euros a ptas");
				}	
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double n1 = Double.parseDouble(num1.getText());
				if(ptas) {
					num2.setText(n1*166 + "");
				}
				else {
					num2.setText(n1/166 + "");
					
				}	
			}
		});
		frame.getContentPane().add(btnNewButton_1);
	}

}
