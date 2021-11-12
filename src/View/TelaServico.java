package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaServico extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblValor;
	private JLabel lblDataDeEntrada;
	private JLabel lblResponsavelPserviro;
	private JLabel lblValor_1;
	private JButton btnNewButton;
	private JButton btnServios;
	private JButton btnExcluir;
	private JButton btnBuscarPeas;
	private JLabel lblResumoDoServio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaServico frame = new TelaServico();
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
	public TelaServico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1068, 633);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(467, 379, 264, 65);
		contentPane.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(574, 129, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(574, 188, 157, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(574, 250, 157, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(621, 311, 110, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Chassi do Veiculo : ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(467, 132, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TI\u00E3o Prepara\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 59));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(292, 11, 750, 65);
		contentPane.add(lblNewLabel_1);
		
		lblValor = new JLabel("Valor :");
		lblValor.setForeground(Color.WHITE);
		lblValor.setBounds(467, 191, 97, 14);
		contentPane.add(lblValor);
		
		lblDataDeEntrada = new JLabel("Data de Entrada");
		lblDataDeEntrada.setForeground(Color.WHITE);
		lblDataDeEntrada.setBounds(467, 253, 97, 14);
		contentPane.add(lblDataDeEntrada);
		
		lblResponsavelPserviro = new JLabel("Responsavel p/Servir\u00E7o");
		lblResponsavelPserviro.setForeground(Color.WHITE);
		lblResponsavelPserviro.setBounds(467, 314, 138, 14);
		contentPane.add(lblResponsavelPserviro);
		
		lblValor_1 = new JLabel("");
		lblValor_1.setIcon(new ImageIcon("C:\\Users\\kaique\\Desktop\\R.png"));
		lblValor_1.setForeground(Color.WHITE);
		lblValor_1.setBounds(251, 99, 206, 282);
		contentPane.add(lblValor_1);
		
		btnNewButton = new JButton("CADASTRA");
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(761, 266, 264, 41);
		contentPane.add(btnNewButton);
		
		btnServios = new JButton("SERVI\u00C7OS");
		btnServios.setForeground(Color.ORANGE);
		btnServios.setBackground(Color.BLACK);
		btnServios.setBounds(53, 517, 264, 41);
		contentPane.add(btnServios);
		
		btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setForeground(Color.ORANGE);
		btnExcluir.setBackground(Color.BLACK);
		btnExcluir.setBounds(398, 517, 264, 41);
		contentPane.add(btnExcluir);
		
		btnBuscarPeas = new JButton("BUSCAR PE\u00C7AS");
		btnBuscarPeas.setForeground(Color.ORANGE);
		btnBuscarPeas.setBackground(Color.BLACK);
		btnBuscarPeas.setBounds(735, 517, 264, 41);
		contentPane.add(btnBuscarPeas);
		
		lblResumoDoServio = new JLabel("Resumo do servi\u00E7o a ser feito");
		lblResumoDoServio.setForeground(Color.WHITE);
		lblResumoDoServio.setBounds(270, 402, 178, 14);
		contentPane.add(lblResumoDoServio);
	}
}
