package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import LogicaGrafos.Grafo;

import java.awt.Color;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FramePrincipal {

	private JFrame frame;
	private JTextField nombreInput;
	private JTextField musicalInput;
	private JTextField deportivoInput;
	private JTextField espectaculoInput;
	private JTextField cienciaInput;

	Grafo g = new Grafo();

	String nombre;
	int idPersona = 0;
	int dI;
	int eI;
	int mI;
	int cI;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal window = new FramePrincipal();
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
	public FramePrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panelListaPersonas = new JPanel();
		// ------------ Frame Principal -----------------
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(168, 187, 255));
		frame.setBounds(100, 100, 1340, 801);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Clustering humano");
		lblNewLabel.setBounds(412, 11, 315, 68);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 42));

		JLabel lblNewLabel_1 = new JLabel("Lista de Personas");
		lblNewLabel_1.setBounds(520, 85, 207, 43);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Agregar Nueva Persona");
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(51, 85, 283, 43);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Lista de Similitudes");
		lblNewLabel_1_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_2.setBounds(991, 85, 223, 43);
		frame.getContentPane().add(lblNewLabel_1_2);

		// ------------FIN Frame Principal -----------------

		// ------------ Panel Agregar Personas -----------------

		JPanel panelAgregarPersonas = new JPanel();
		panelAgregarPersonas.setBackground(new Color(0, 128, 255));
		panelAgregarPersonas.setBounds(50, 139, 284, 568);
		frame.getContentPane().add(panelAgregarPersonas);
		panelAgregarPersonas.setLayout(null);

		nombreInput = new JTextField();
		nombreInput.setBounds(38, 40, 218, 31);
		panelAgregarPersonas.add(nombreInput);
		nombreInput.setColumns(10);

		musicalInput = new JTextField();
		musicalInput.setColumns(10);
		musicalInput.setBounds(38, 129, 218, 31);
		panelAgregarPersonas.add(musicalInput);

		deportivoInput = new JTextField();
		deportivoInput.setColumns(10);
		deportivoInput.setBounds(38, 216, 218, 31);
		panelAgregarPersonas.add(deportivoInput);

		espectaculoInput = new JTextField();
		espectaculoInput.setColumns(10);
		espectaculoInput.setBounds(38, 309, 218, 31);
		panelAgregarPersonas.add(espectaculoInput);

		cienciaInput = new JTextField();
		cienciaInput.setColumns(10);
		cienciaInput.setBounds(38, 394, 218, 31);
		panelAgregarPersonas.add(cienciaInput);

		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(117, 15, 94, 14);
		panelAgregarPersonas.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Interes Musical");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(88, 104, 143, 14);
		panelAgregarPersonas.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Interes deportivo");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(88, 191, 143, 14);
		panelAgregarPersonas.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Interes en Espectaculos");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(56, 273, 175, 14);
		panelAgregarPersonas.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Interes en Ciencia");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_1.setBounds(74, 369, 137, 14);
		panelAgregarPersonas.add(lblNewLabel_2_1_1_1_1);

		JButton agregarPersonaButton = new JButton("Agregar Persona");
		agregarPersonaButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		agregarPersonaButton.setBackground(new Color(0, 255, 0));
		agregarPersonaButton.setBounds(51, 496, 193, 51);
		agregarPersonaButton.addActionListener(e -> {

			nombre = nombreInput.getText();
			dI = Integer.parseInt(deportivoInput.getText());
			eI = Integer.parseInt(espectaculoInput.getText());
			mI = Integer.parseInt(musicalInput.getText());
			cI = Integer.parseInt(cienciaInput.getText());

			g.crearPersona(nombre, idPersona, dI, eI, mI, cI); // crea la persona
			idPersona++;
			g.construirAristas(); // construye las aristas
			g.obtenerAristas(); // imprime las aristas

			limpiarCampos(); // limpia los campos de texto

			// creamos label

			// cambiamos el texto del boton
			agregarPersonaButton.setBackground(new Color(0, 255, 0));
			agregarPersonaButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
			agregarPersonaButton.setText("Agregado Correctamente !!");

			System.out.println(g.getPersonasInArray());
			// borrar el texto del boton despues de 2 segundos
			new java.util.Timer().schedule(
					new java.util.TimerTask() {
						@Override
						public void run() {
							agregarPersonaButton.setText("Agregar Persona");
							agregarPersonaButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
							agregarPersonaButton.setBackground(new Color(0, 255, 0));
						}
					},
					2000);

		});
		panelAgregarPersonas.add(agregarPersonaButton);

		JButton limpiarCamposButton = new JButton("Limpiar Campos");
		limpiarCamposButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		limpiarCamposButton.setForeground(new Color(0, 0, 0));
		limpiarCamposButton.setBackground(new Color(255, 128, 64));
		limpiarCamposButton.setBounds(82, 462, 129, 23);
		panelAgregarPersonas.add(limpiarCamposButton);

		// ------------FIN Panel Agregar Personas -----------------

		// ------------ Panel Lista de Personas -----------------

		panelListaPersonas.setBorder(null);
		panelListaPersonas.setBackground(new Color(255, 255, 128));
		panelListaPersonas.setBounds(385, 139, 470, 568);
		frame.getContentPane().add(panelListaPersonas);
		panelListaPersonas.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panelListaPersonas.add(scrollPane, "name_30036416860000");

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				g.getPersonasInArray().toArray()
			},
			new String[] {
				"Nombre", "I. Deportivo", "I. Musical", "I. Espectaculos", "I. Ciencia"
			}
		));
		scrollPane.setViewportView(table);

		// ------------FIN Panel Lista de Personas -----------------

		// ------------ Panel Lista de Similitudes -----------------

		JPanel panelListaSimilitud = new JPanel();
		panelListaSimilitud.setBounds(895, 139, 404, 568);
		frame.getContentPane().add(panelListaSimilitud);

		// ------------FIN Panel Lista de Similitudes -----------------

		/* Funciones Auxiliares */

	}

	public void limpiarCampos() {
		nombreInput.setText("");
		musicalInput.setText("");
		deportivoInput.setText("");
		espectaculoInput.setText("");
		cienciaInput.setText("");
	}
}
