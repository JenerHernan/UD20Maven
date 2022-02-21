package objects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;

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
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				JTextField aux = (JTextField)e.getSource();
				aux.setText(aux.getText() + "\nLa rueda del raton ha cambiado");
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JTextField aux = (JTextField)e.getSource();
				aux.setText(aux.getText() + "\nEl raton ha entrado en la ventana");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JTextField aux = (JTextField)e.getSource();
				aux.setText(aux.getText() + "\nEl raton ha salido de la ventana");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JTextField aux = (JTextField)e.getSource();
				aux.setText(aux.getText() + "\nEl raton ha clicado la ventana");
			}
		});
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}
