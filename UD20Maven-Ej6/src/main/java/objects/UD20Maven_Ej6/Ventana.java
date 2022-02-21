package objects.UD20Maven_Ej6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana {

	private JFrame frame;
	private JTextField altura;
	private JTextField peso;
	private JTextField imc;

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
		frame.setBounds(100, 100, 443, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Altura(metros)");
		frame.getContentPane().add(lblNewLabel);
		
		altura = new JTextField();
		frame.getContentPane().add(altura);
		altura.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		frame.getContentPane().add(lblNewLabel_1);
		
		peso = new JTextField();
		frame.getContentPane().add(peso);
		peso.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double alt = Double.parseDouble(altura.getText());
				double kg = Double.parseDouble(peso.getText());
				imc.setText(kg/(alt * alt) + "");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		frame.getContentPane().add(lblNewLabel_2);
		
		imc = new JTextField();
		frame.getContentPane().add(imc);
		imc.setColumns(10);
	}

}
