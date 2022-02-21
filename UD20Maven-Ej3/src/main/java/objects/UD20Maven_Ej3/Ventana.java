package objects.UD20Maven_Ej3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private int cont1;
	private int cont2;

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
		cont1 = 0;
		cont2 = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel et1 = new JLabel("Boton 1:");
		panel_1.add(et1);
		
		final JLabel et2 = new JLabel("");
		panel_1.add(et2);
		
		JLabel et3 = new JLabel("Boton 2:");
		panel_1.add(et3);
		
		final JLabel et4 = new JLabel("");
		panel_1.add(et4);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont1 ++;
				et2.setText(cont1 + " veces");
			}
		});
		panel_2.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont2 ++;
				et4.setText(cont2 + " veces");
			}
		});
		panel_2.add(btn2);
	}

}
