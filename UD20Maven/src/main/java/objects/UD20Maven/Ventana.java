package objects.UD20Maven;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{
	private JPanel panel;
	JLabel et;
	JButton btn;
	JTextField text;
	public Ventana() {
		setTitle("Ventana de JFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400,200,400,300);
		setVisible(true);
		et = new JLabel("Esto es una etiqueta");
		btn = new JButton("Boton");
		text = new JTextField();
		text.setBounds(20,100,100,50);
		panel = new JPanel();
		panel.setLayout(null);
		btn.setBounds(10,10, 80, 20);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeSize();
			}
		});
		et.setBounds(60,20,200,70);
		panel.add(et);
		panel.add(btn);
		panel.add(text);
		setContentPane(panel);
	}
	void changeSize() {
		et.setFont(new Font("Serif",Font.BOLD,Integer.parseInt(text.getText())));
	}
}
//et.setFont(new Font("Serif",Font.BOLD,Integer.parseInt(text.getText()));