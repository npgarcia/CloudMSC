package gui.test;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JButton;

import net.miginfocom.swing.MigLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JTextArea;

import ws.Tests.AddressManagement;
import ws.Tests.AddressValidation;
import ws.Tests.Barcode39;
import ws.Tests.GeoIPWS;
import ws.Tests.UNSPC;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtNombre;
	private JTextField txtCalle1;
	private JTextField txtCalle2;
	private JTextField txtCiudad;
	private JTextField txtEstado;
	private JTextField txtZip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(
				new MigLayout("", "[491.00px]", "[368.00px]"));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "cell 0 0,grow");

		JPanel panel = new JPanel();
		tabbedPane.addTab("Análisis de IP", null, panel, null);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("98px:grow"), ColumnSpec.decode("61px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("134px"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		textField = new JTextField();
		panel.add(textField, "1, 2, left, top");
		textField.setColumns(10);

		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		panel.add(textArea, "1, 4, 4, 1, fill, fill");
		frame.setBounds(100, 100, 523, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ip = textField.getText();
				textArea.setText(GeoIPWS.getIPGeo(ip));
			}
		});
		panel.add(btnNewButton, "4, 2");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Codigo 39", null, panel_1, null);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		textField_1 = new JTextField();
		panel_1.add(textField_1, "2, 2, fill, default");
		textField_1.setColumns(10);

		final JLabel label = new JLabel("");
		panel_1.add(label, "2, 6");

		JButton btnGenerarCdigoDe = new JButton("Generar Código de Barras");
		btnGenerarCdigoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedImage bi = Barcode39.barcodeImage(textField_1.getText(), 80);

				ImageIcon imagen = new ImageIcon(bi);
				label.setIcon(imagen);

			}
		});
		panel_1.add(btnGenerarCdigoDe, "2, 4");

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("UNSPC", null, panel_2, null);
		panel_2.setLayout(null);

		List<String> segmentList = UNSPC.getSegmentsStrings();
		final String segments[] = segmentList.toArray(new String[segmentList
				.size()]);

		JLabel lblSegment = new JLabel("Segment");
		lblSegment.setBounds(6, 21, 61, 16);
		panel_2.add(lblSegment);

		JLabel lblFamily = new JLabel("Family");
		lblFamily.setBounds(6, 49, 61, 16);
		panel_2.add(lblFamily);

		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(6, 77, 61, 16);
		panel_2.add(lblClass);

		JLabel lblComodity = new JLabel("Comodity");
		lblComodity.setBounds(6, 105, 61, 16);
		panel_2.add(lblComodity);

		final JComboBox<String> segmentCB = new JComboBox<String>(segments);
		final JComboBox<String> familyCB = new JComboBox<String>();
		final JComboBox<String> classCB = new JComboBox<String>();
		final JComboBox<String> comodityCB = new JComboBox<String>();

		classCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selected = (String) classCB.getSelectedItem();
					String uClass = selected.split("\t")[0];

					List<String> comodityList = UNSPC
							.getComodityByClassString(uClass);
					String comodities[] = comodityList
							.toArray(new String[comodityList.size()]);

					DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(
							comodities);
					comodityCB.setModel(model);
					comodityCB.setSelectedIndex(-1);
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					comodityCB.removeAllItems();
				}

			}
		});

		familyCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selected = (String) familyCB.getSelectedItem();
					String family = selected.split("\t")[0];

					List<String> classList = UNSPC
							.getClassByFamilyString(family);
					String classes[] = classList.toArray(new String[classList
							.size()]);

					DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(
							classes);
					classCB.setModel(model);
					classCB.setSelectedIndex(-1);
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					classCB.removeAllItems();
				}
			}
		});

		segmentCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selected = (String) segmentCB.getSelectedItem();
					String segment = selected.split("\t")[0];

					List<String> familyList = UNSPC
							.getFamilyBySegmentString(segment);
					String families[] = familyList
							.toArray(new String[familyList.size()]);

					DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(
							families);
					familyCB.setModel(model);
					familyCB.setSelectedIndex(-1);
				}
			}
		});

		segmentCB.setSelectedIndex(-1);
		segmentCB.setBounds(79, 17, 373, 27);
		panel_2.add(segmentCB);

		familyCB.setBounds(79, 45, 373, 27);
		panel_2.add(familyCB);

		classCB.setBounds(79, 73, 373, 27);
		panel_2.add(classCB);

		comodityCB.setBounds(79, 101, 373, 27);
		panel_2.add(comodityCB);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Verificador de Dirección", null, panel_3, null);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		JLabel lblNewLabel = new JLabel("Nombre");
		panel_3.add(lblNewLabel, "2, 2");

		txtNombre = new JTextField();
		panel_3.add(txtNombre, "6, 2, fill, default");
		txtNombre.setColumns(10);

		JLabel lblCalle = new JLabel("Calle");
		panel_3.add(lblCalle, "2, 4");

		txtCalle1 = new JTextField();
		panel_3.add(txtCalle1, "6, 4, fill, default");
		txtCalle1.setColumns(10);

		txtCalle2 = new JTextField();
		panel_3.add(txtCalle2, "6, 6, fill, default");
		txtCalle2.setColumns(10);

		JLabel lblCiudad = new JLabel("Ciudad");
		panel_3.add(lblCiudad, "2, 8");

		txtCiudad = new JTextField();
		panel_3.add(txtCiudad, "6, 8, fill, default");
		txtCiudad.setColumns(10);

		JLabel lblEstado = new JLabel("Estado");
		panel_3.add(lblEstado, "2, 10");

		txtEstado = new JTextField();
		panel_3.add(txtEstado, "6, 10, fill, default");
		txtEstado.setColumns(10);

		JLabel lblCdigoPostal = new JLabel("Código Postal");
		panel_3.add(lblCdigoPostal, "2, 12");

		txtZip = new JTextField();
		panel_3.add(txtZip, "6, 12, fill, default");
		txtZip.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, "2, 16, 5, 1, fill, fill");
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		final JLabel label_1 = new JLabel("");
		panel_4.add(label_1, "2, 2");

		final JTextArea textArea_1 = new JTextArea();
		panel_4.add(textArea_1, "10, 2, fill, fill");

		JButton btnAnalizar = new JButton("Analizar");
		btnAnalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AddressValidation av =	AddressManagement.getMatchAddress(txtNombre.getText(),
						txtCalle1.getText(), txtCalle2.getText(),
						txtCiudad.getText(), txtEstado.getText(),
						txtZip.getText());
			
			textArea_1.setText(av.getAddress());
			ImageIcon imagen = new ImageIcon(av.getBarcode());
			label_1.setIcon(imagen);

			}
		});
		panel_3.add(btnAnalizar, "6, 14");

	}
}
