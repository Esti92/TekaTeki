package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class VMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VMenu frame = new VMenu();
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
	public VMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 195, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[51.00][162.00]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 1,alignx center,growy");
		panel.setLayout(new MigLayout("", "[]", "[][][][]"));
		
		JButton btnNivelBajo = new JButton("Jugar");
		panel.add(btnNivelBajo, "cell 0 0,alignx center");
		
		JButton btnNivelMedio = new JButton("Retar");
		panel.add(btnNivelMedio, "cell 0 1,alignx center");
		
		JButton btnNivelDificil = new JButton("Puntuacion");
		panel.add(btnNivelDificil, "cell 0 2,alignx center");
		
		JButton btnAtras = new JButton("Atras");
		panel.add(btnAtras, "cell 0 3,alignx center");
	}

}
