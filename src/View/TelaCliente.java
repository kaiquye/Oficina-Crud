package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ModificadorDb;
import DAO.MysqlCarro;
import Model.Carro;
import Model.Cliente;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome_Cliente;
	private JTextField txtCpf_cliente;
	private JTextField txtTelefone_Cliente;
	private JTextField txtModelo_Veiculo;
	private JTextField txtChassi_Veiculo;
	private JTextField txtPlaca_Veiculo;
	private JTextField txtAno_Veiculo;
	private JButton btnNewButton_1;
	private JLabel lblVeiculo;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtTelefone_Veiculo;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JButton btnServio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 630);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome_Cliente = new JTextField();
		txtNome_Cliente.setBounds(182, 231, 269, 20);
		contentPane.add(txtNome_Cliente);
		txtNome_Cliente.setColumns(10);

		txtCpf_cliente = new JTextField();
		txtCpf_cliente.setColumns(10);
		txtCpf_cliente.setBounds(182, 275, 269, 20);
		contentPane.add(txtCpf_cliente);

		txtTelefone_Cliente = new JTextField();
		txtTelefone_Cliente.setColumns(10);
		txtTelefone_Cliente.setBounds(182, 318, 269, 20);
		contentPane.add(txtTelefone_Cliente);

		JLabel lblNewLabel = new JLabel("Cliente :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(26, 167, 157, 35);
		contentPane.add(lblNewLabel);

		JLabel lblTioPreparaes = new JLabel("Ti\u00E3o Prepara\u00E7\u00F5es");
		lblTioPreparaes.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTioPreparaes.setForeground(Color.ORANGE);
		lblTioPreparaes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 57));
		lblTioPreparaes.setBounds(311, 11, 744, 61);
		contentPane.add(lblTioPreparaes);

		JLabel lblNewLabel_1 = new JLabel("Nome :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(51, 234, 84, 17);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("CPF :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(51, 278, 84, 17);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Telefone :");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(51, 321, 84, 17);
		contentPane.add(lblNewLabel_1_2);

		txtModelo_Veiculo = new JTextField();
		txtModelo_Veiculo.setColumns(10);
		txtModelo_Veiculo.setBounds(731, 231, 269, 20);
		contentPane.add(txtModelo_Veiculo);

		txtChassi_Veiculo = new JTextField();
		txtChassi_Veiculo.setColumns(10);
		txtChassi_Veiculo.setBounds(731, 275, 269, 20);
		contentPane.add(txtChassi_Veiculo);

		txtPlaca_Veiculo = new JTextField();
		txtPlaca_Veiculo.setColumns(10);
		txtPlaca_Veiculo.setBounds(731, 318, 269, 20);
		contentPane.add(txtPlaca_Veiculo);

		txtAno_Veiculo = new JTextField();
		txtAno_Veiculo.setColumns(10);
		txtAno_Veiculo.setBounds(731, 359, 269, 20);
		contentPane.add(txtAno_Veiculo);

		btnNewButton_1 = new JButton("CADATRAR CLIENTE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome, telefone, cpf, modelo, placa, ano, cor, chassi;
				nome = txtNome_Cliente.getText();
				telefone = txtTelefone_Cliente.getText();
				cpf = txtCpf_cliente.getText();
				modelo = txtModelo_Veiculo.getText();
				placa = txtPlaca_Veiculo.getText();
				ano = txtAno_Veiculo.getText();
				chassi = txtChassi_Veiculo.getText();

				if ((nome.length() > 0) && (telefone.length() > 0) && (cpf.length() > 0)) {
					Cliente cliente = new Cliente.Builder(nome, telefone).cliente();
					ModificadorDb.CadastarCliente(cliente);
				}

			}
		});
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(26, 401, 425, 54);
		contentPane.add(btnNewButton_1);

		lblVeiculo = new JLabel("Veiculo");
		lblVeiculo.setForeground(Color.WHITE);
		lblVeiculo.setFont(new Font("Arial", Font.BOLD, 22));
		lblVeiculo.setBounds(601, 167, 157, 35);
		contentPane.add(lblVeiculo);

		lblNewLabel_2 = new JLabel("Modelo : ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(592, 234, 84, 17);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Chassi : ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(592, 278, 84, 17);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Placa : ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(592, 321, 84, 17);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Ano : ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(592, 362, 84, 17);
		contentPane.add(lblNewLabel_5);

		txtTelefone_Veiculo = new JTextField();
		txtTelefone_Veiculo.setColumns(10);
		txtTelefone_Veiculo.setBounds(773, 401, 227, 20);
		contentPane.add(txtTelefone_Veiculo);

		lblNewLabel_6 = new JLabel("CPF do Proprietario : ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(592, 404, 166, 17);
		contentPane.add(lblNewLabel_6);

		btnNewButton = new JButton("CADASTRAR VEICULO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome, telefone, cpf, modelo, placa, ano, cor, chassi;
				telefone = txtTelefone_Veiculo.getText();
				modelo = txtModelo_Veiculo.getText();
				placa = txtPlaca_Veiculo.getText();
				ano = txtAno_Veiculo.getText();
				chassi = txtChassi_Veiculo.getText();

				if ((modelo.length() > 0) && (placa.length() > 0) && (chassi.length() > 0)) {
					Carro carro = new Carro.BuilderCar(placa).chassi(chassi).modelo(modelo).carro();
					MysqlCarro.Cadastra(carro, telefone);
				}
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(592, 464, 408, 54);
		contentPane.add(btnNewButton);
		
		btnServio = new JButton("NOVO SERVI\u00C7O");
		btnServio.setForeground(Color.YELLOW);
		btnServio.setBackground(Color.BLACK);
		btnServio.setBounds(787, 83, 242, 54);
		contentPane.add(btnServio);
	}
}
