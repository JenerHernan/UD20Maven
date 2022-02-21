package objects.UD20Maven_Ej2;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App 
{
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ventana window = new Ventana();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}
