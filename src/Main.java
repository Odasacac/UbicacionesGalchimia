import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

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
		frame.setBounds(100, 100, 739, 709);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Etiqueta1 = new JLabel("SELECTOR DE UBICACIONES");
		Etiqueta1.setFont(new Font("Tahoma", Font.BOLD, 16));
		Etiqueta1.setBounds(230, 32, 241, 54);
		frame.getContentPane().add(Etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("1 - Temperatura de almacenaje:");
		etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta2.setBounds(77, 140, 241, 21);
		frame.getContentPane().add(etiqueta2);
		
		JRadioButton radio1 = new JRadioButton("Ambiente");
		radio1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio1.setBounds(324, 139, 99, 23);
		frame.getContentPane().add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Nevera");
		radio2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio2.setBounds(443, 139, 89, 23);
		frame.getContentPane().add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Congelador");
		radio3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio3.setBounds(551, 139, 116, 23);
		frame.getContentPane().add(radio3);
		
		JLabel etiqueta3 = new JLabel("2 - ¿Ácido o base?");
		etiqueta3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta3.setBounds(77, 194, 144, 21);
		frame.getContentPane().add(etiqueta3);
		
		JRadioButton radio4 = new JRadioButton("Ácido");
		radio4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio4.setBounds(301, 193, 74, 23);
		frame.getContentPane().add(radio4);
		
		JRadioButton radio5 = new JRadioButton("Base");
		radio5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio5.setBounds(377, 193, 67, 23);
		frame.getContentPane().add(radio5);
		
		JLabel etiqueta4 = new JLabel("3 - Frases H:");
		etiqueta4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta4.setBounds(77, 246, 144, 21);
		frame.getContentPane().add(etiqueta4);
		
		JCheckBox check220 = new JCheckBox("H220");
		check220.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check220.setBounds(122, 302, 74, 23);
		frame.getContentPane().add(check220);
		
		JCheckBox check224 = new JCheckBox("H224");
		check224.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check224.setBounds(122, 328, 74, 23);
		frame.getContentPane().add(check224);
		
		JCheckBox check228 = new JCheckBox("H228");
		check228.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check228.setBounds(122, 354, 74, 23);
		frame.getContentPane().add(check228);
		
		JCheckBox check270 = new JCheckBox("H270");
		check270.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check270.setBounds(122, 382, 74, 23);
		frame.getContentPane().add(check270);
		
		JCheckBox check290 = new JCheckBox("H290");
		check290.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check290.setBounds(122, 408, 74, 23);
		frame.getContentPane().add(check290);
		
		JCheckBox check314 = new JCheckBox("H314");
		check314.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check314.setBounds(122, 437, 74, 23);
		frame.getContentPane().add(check314);
		
		JCheckBox check341 = new JCheckBox("H341");
		check341.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check341.setBounds(122, 467, 74, 23);
		frame.getContentPane().add(check341);
		
		JCheckBox check260 = new JCheckBox("H260");
		check260.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check260.setBounds(242, 354, 74, 23);
		frame.getContentPane().add(check260);
		
		JCheckBox check271 = new JCheckBox("H271");
		check271.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check271.setBounds(242, 384, 74, 23);
		frame.getContentPane().add(check271);
		
		JCheckBox check300 = new JCheckBox("H300");
		check300.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check300.setBounds(242, 410, 74, 23);
		frame.getContentPane().add(check300);
		
		JCheckBox check330 = new JCheckBox("H330");
		check330.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check330.setBounds(242, 439, 74, 23);
		frame.getContentPane().add(check330);
		
		JCheckBox check350 = new JCheckBox("H350");
		check350.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check350.setBounds(242, 467, 74, 23);
		frame.getContentPane().add(check350);
		
		JCheckBox check223 = new JCheckBox("H223");
		check223.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check223.setBounds(360, 304, 74, 23);
		frame.getContentPane().add(check223);
		
		JCheckBox check226 = new JCheckBox("H226");
		check226.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check226.setBounds(360, 330, 74, 23);
		frame.getContentPane().add(check226);
		
		JCheckBox check261 = new JCheckBox("H261");
		check261.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check261.setBounds(360, 356, 74, 23);
		frame.getContentPane().add(check261);
		
		JCheckBox check272 = new JCheckBox("H272");
		check272.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check272.setBounds(360, 384, 74, 23);
		frame.getContentPane().add(check272);
		
		JCheckBox check310 = new JCheckBox("H310");
		check310.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check310.setBounds(360, 410, 74, 23);
		frame.getContentPane().add(check310);
		
		JCheckBox check340 = new JCheckBox("H340");
		check340.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check340.setBounds(360, 439, 74, 23);
		frame.getContentPane().add(check340);
		
		JCheckBox check351 = new JCheckBox("H351");
		check351.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check351.setBounds(360, 469, 74, 23);
		frame.getContentPane().add(check351);
		
		JCheckBox check222 = new JCheckBox("H222");
		check222.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check222.setBounds(242, 302, 74, 23);
		frame.getContentPane().add(check222);
		
		JCheckBox check225 = new JCheckBox("H225");
		check225.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check225.setBounds(242, 328, 74, 23);
		frame.getContentPane().add(check225);
		
		JLabel etiqueta5 = new JLabel("4 - ");
		etiqueta5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta5.setBounds(77, 518, 32, 21);
		frame.getContentPane().add(etiqueta5);
		
		JLabel etiqueta6 = new JLabel("5 - ");
		etiqueta6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta6.setBounds(77, 571, 32, 21);
		frame.getContentPane().add(etiqueta6);
		
		JLabel etiqueta7 = new JLabel("Ubicación:");
		etiqueta7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta7.setBounds(230, 517, 82, 23);
		frame.getContentPane().add(etiqueta7);
		
		JLabel etiquetaUbi2 = new JLabel("");
		etiquetaUbi2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaUbi2.setBounds(315, 551, 371, 23);
		frame.getContentPane().add(etiquetaUbi2);
		
		JLabel etiquetaUbi3 = new JLabel("");
		etiquetaUbi3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaUbi3.setBounds(315, 581, 371, 23);
		frame.getContentPane().add(etiquetaUbi3);
		
		JLabel etiquetaUbi4 = new JLabel("");
		etiquetaUbi4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaUbi4.setBounds(315, 615, 371, 23);
		frame.getContentPane().add(etiquetaUbi4);
		

		JRadioButton radio6 = new JRadioButton("No");
		radio6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radio6.setBounds(230, 193, 67, 23);
		frame.getContentPane().add(radio6);
		
		
		
		
		JRadioButton invisible1 = new JRadioButton();
		JRadioButton invisible2 = new JRadioButton();
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radio1);
		group1.add(radio2);
		group1.add(radio3);
		group1.add(invisible1);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radio4);
		group2.add(radio5);
		group2.add(radio6);
		group2.add(invisible2);
		
		
		JLabel etiquetaUbi = new JLabel("");
		etiquetaUbi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaUbi.setBounds(315, 517, 371, 23);
		frame.getContentPane().add(etiquetaUbi);
		
		
		JButton btnNewButton = new JButton("Clean");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				invisible1.setSelected(true);
				invisible2.setSelected(true);
				etiquetaUbi.setText("");
				etiquetaUbi2.setText("");
				etiquetaUbi3.setText("");
				etiquetaUbi4.setText("");
				check220.setSelected(false);
				check222.setSelected(false);
				check223.setSelected(false);
				check224.setSelected(false);
				check225.setSelected(false);
				check226.setSelected(false);
				check228.setSelected(false);				
				check260.setSelected(false);
				check261.setSelected(false);
				check270.setSelected(false);
				check271.setSelected(false);
				check272.setSelected(false);				
				check290.setSelected(false);
				check300.setSelected(false);
				check310.setSelected(false);
				check314.setSelected(false);
				check330.setSelected(false);
				check340.setSelected(false);
				check341.setSelected(false);
				check350.setSelected(false);
				check351.setSelected(false);							
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(104, 570, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton Boton1 = new JButton("Get Ubi");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String ubicacion = "Error 1. Gracias por informar.";
				String ubicacion2 = "Puede enviar una captura de pantalla a:";
				String ubicacion3= "cca0solutions@gmail.com";
				String ubicacion4 = "";

				if (radio3.isSelected())
				{
					ubicacion ="CX0102.";
					ubicacion2="";
					ubicacion3="";
					ubicacion4="";
				}
				else if ((check340.isSelected() ||check341.isSelected() || check350.isSelected() || check351.isSelected())&&radio2.isSelected())
				{
					ubicacion="NV0101/2, NV0105, NV0108, NV0305.";
					ubicacion2="Reactivo cancerígeno. Etiqueta verde.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check340.isSelected() ||check341.isSelected() || check350.isSelected() || check351.isSelected())
				{
					ubicacion="NV0101/2, NV0105, NV0108, NV0305, RT0407.";
					ubicacion2="Reactivo cancerígeno. Etiqueta verde.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check300.isSelected() || check310.isSelected() || check330.isSelected())
				{
					ubicacion ="NV0103/4, NV0107, NV0302.";
					ubicacion2="Reactivo tóxico especial.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (radio2.isSelected())
				{
					ubicacion ="NV020X, NV030X. Excepto NV0305 y NV0302.";
					ubicacion2="";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check220.isSelected() || check222.isSelected() || check224.isSelected())
				{
					ubicacion = "VI0202.";
					ubicacion2="Reactivo extremadamente inflamable.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check260.isSelected() || check261.isSelected())
				{
					ubicacion = "RT0406, RT0408.";
					ubicacion2="Reactivo en contato con el agua.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check270.isSelected() || check271.isSelected()|| check272.isSelected())
				{
					ubicacion = "RT0405.";
					ubicacion2="Reactivo comburente.";
					ubicacion3="";
					ubicacion4="";
				}
				else if ((check223.isSelected() || check225.isSelected()|| check226.isSelected()|| check228.isSelected())&&radio4.isSelected())
				{
					ubicacion = "VI0402.";
					ubicacion2="Reactivo inflamable.";
					ubicacion3="";
					ubicacion4="";
				}
				else if ((check223.isSelected() || check225.isSelected()|| check226.isSelected()|| check228.isSelected())&&radio5.isSelected())
				{
					ubicacion = "VI0602.";
					ubicacion2="Reactivo inflamable.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check223.isSelected() || check225.isSelected()|| check226.isSelected()|| check228.isSelected())
				{
					ubicacion = "VI0201.";
					ubicacion2="Reactivo inflamable.";
					ubicacion3="";
					ubicacion4="";
				}
				else if (check290.isSelected() || check314.isSelected())
				{
					if (radio4.isSelected())
					{
						ubicacion = "VI0101, VI0103.";
						ubicacion2="Reactivo corrosivo.";
						ubicacion3="";
						ubicacion4="";
					}
					else if (radio5.isSelected())
					{
						ubicacion = "VI0102, VI0104.";
						ubicacion2="Reactivo corrosivo.";
						ubicacion3="";
						ubicacion4="";
					}
					else
					{
						ubicacion = "VI0301/.../4.";
						ubicacion2="Reactivo corrosivo.";
						ubicacion3="";
						ubicacion4="";
					}
				}
				else if (radio1.isSelected()||radio6.isSelected()||radio5.isSelected()||radio4.isSelected())
				{
					ubicacion = "RT0301/.../4/6/.../10.";
					ubicacion2 = "RT0401/.../4/9/10.";
					ubicacion3 ="RT0503/.../10.";
					ubicacion4="RT0608/.../11.";
				}
				else if (!radio1.isSelected()&&!radio6.isSelected()&&!radio5.isSelected()&&!radio4.isSelected())
				{
					 ubicacion = "Por favor, seleccione algún parámetro.";
					 ubicacion2="";
					 ubicacion3="";
					 ubicacion4="";
				}
				else
				{
					 ubicacion = "Error 2. Gracias por informar.";
					 ubicacion2 = "Puede enviar una captura de pantalla a:";
					 ubicacion3= "cca0solutions@gmail.com";
					 ubicacion4="";
				}
			

				
				etiquetaUbi.setText(ubicacion);
				etiquetaUbi2.setText(ubicacion2);
				etiquetaUbi3.setText(ubicacion3);
				etiquetaUbi4.setText(ubicacion4);
				
				
				
			}
		});
		Boton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Boton1.setBounds(104, 517, 104, 23);
		frame.getContentPane().add(Boton1);
		
		
		
		
		
	}
}
