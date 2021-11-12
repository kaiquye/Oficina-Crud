package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 640);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("NOVO CLIENTE");
		btnNewButton.setBounds(108, 526, 200, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNovoCarro = new JButton("NOVO CARRO");
		btnNovoCarro.setBounds(328, 526, 200, 33);
		contentPane.add(btnNovoCarro);
		
		JButton btnNewButton_1_1 = new JButton("BUSCAR PE\u00C7AS");
		btnNewButton_1_1.setBounds(555, 526, 200, 33);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("BUSCAR CARROS");
		btnNewButton_1_1_1.setBounds(781, 526, 200, 33);
		contentPane.add(btnNewButton_1_1_1);
	}
}
