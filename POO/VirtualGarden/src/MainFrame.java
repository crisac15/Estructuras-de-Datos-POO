import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class MainFrame extends JFrame { 

	private static final long serialVersionUID = 1L;
	private JPanel panelPlantas,panelPlantasPosibles,temporal;
	private JButton boton_de_planta;
	private ArrayList<JPanel> plantasCustom = new ArrayList<JPanel>();
	private Controller controller;

	public MainFrame(String pTitle, Controller pController) {
		this.setTitle(pTitle);
		this.controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); 
		this.setBackground(Color.white);
		this.initComponents();
		this.setVisible(true);		
	}
	public void actulizarVida(ArrayList <String> pVida) {
		for (int i = 0; i < pVida.size(); i++) {
			JPanel panel = plantasCustom.get(i);
			JLabel vida = (JLabel)panel.getComponent(3); 
			vida.setText(pVida.get(i));
		}
	}
	public void actulizarImagenes() {
		ArrayList <String> pImages = controller.actualizarImagen(); 
		for (int i = 0; i < pImages.size(); i++) {
			JPanel panel = plantasCustom.get(i);
			JLabel imagenLabel = (JLabel)panel.getComponent(0); 
		
			ImageIcon imagen = new ImageIcon ("C:\\Users\\crist\\Desktop\\TEC\\Semestre 2\\POO\\VirtualGarden\\src\\media\\"+pImages.get(i));
			Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(320, 100, Image.SCALE_DEFAULT));
			imagenLabel.setIcon(icono);
		}
	}
	public JButton addRegarButton() {
		JButton button = new JButton("Regar");
		button.setBounds(0,130,120,30);
		button.setBackground(Color.CYAN);		
		return button;
	}
	public JButton addAbonarButton() {
		JButton button = new JButton("Abonar");
		button.setBounds(120,130,150,30);
		button.setBackground(Color.orange);		
		return button;
	}
	public JButton addActionRegar(JButton pButton, int pPos) {
		
		pButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				System.out.println("Regar: "+ pPos);
				controller.regarPlanta(pPos);
			}
			
		});
		
		return pButton;
	}
	public JButton addActionAbonar(JButton pButton, int pPos) {
		
		pButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				System.out.println("Abonar: "+ pPos);
				controller.abonarPlanta(pPos);
			}
			
		});
		
		return pButton;
	}
	public JButton addAction(JButton pButton, int pINDEX) { //SE LE PASA LA PLANTA A CREAR EN EL TYPE PLANTA
		pButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				
				controller.addPlant(pINDEX);
				
				if (temporal == null) {
					temporal = new JPanel();
					temporal.setBounds(10,15,0,160);
					temporal.setLayout(null);
				}
				int x = (int)temporal.getBounds().getMaxX()+10;
				int y = temporal.getY();
				
				if (x+100 > panelPlantas.getBounds().getMaxX()) {
					y+=180;
					x=20;
				}
				JPanel panel = new JPanel();				
				panel.setBounds(x,y,250,160);
				temporal.setBounds(panel.getBounds()); //Aquí actualizamos a temporal.
				
				JLabel vida = new JLabel(); 
				vida.setBounds(0,100,100,105);
				vida.setForeground(Color.BLACK);
				JButton regar = addRegarButton();

				JButton abonar = addAbonarButton();
				
				int LasPos = controller.getLasPosInGarden();


				regar = addActionRegar(regar,LasPos);
				abonar = addActionAbonar(abonar,LasPos);
				
				JLabel imagenLabel = new JLabel(" ");
				imagenLabel.setBounds(0, 0, 320, 100);
				ImageIcon imagen = new ImageIcon (System.getProperty("user.dir")+controller.getGarden().getGarden().get(LasPos).getImagenActual());
				Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(imagenLabel.getWidth(), imagenLabel.getHeight(), Image.SCALE_DEFAULT));
				imagenLabel.setIcon(icono);

				panel.add(imagenLabel); 

				panel.add(regar);
				panel.add(abonar);
				panel.add(vida);
				panel.repaint();
				
				plantasCustom.add(panel);
				
				panelPlantas.add(panel);
				panelPlantas.repaint();	
				
			}
			
		});
		return pButton;
	}
	public JButton createButtonPlanta(String pNombre) {
		if (this.boton_de_planta == null) {
			this.boton_de_planta = new JButton();
			this.boton_de_planta.setBounds(30,20,150,30);
		}
		int y = (int)boton_de_planta.getBounds().getMaxY()+20;
		if (y > this.getBounds().getMaxY()) {
			this.panelPlantasPosibles.setPreferredSize(new Dimension(300,(int)(this.getBounds().getMaxY()+600)));
			//Actualizar el y, actulizar el bound etc
		}
		JButton button = new JButton(pNombre);
		button.setBounds(55,y,150,30);
		boton_de_planta.setBounds(button.getBounds());
		button.setBackground(Color.LIGHT_GRAY);
		return button;
	}
	
	public void cargarBotonesDePlantas() {
		ArrayList<String> plantasName = controller.getPlantasName(); //[0,1,2,3,4]

		for (int i = 0; i<plantasName.size();i++) {
			String nombre = plantasName.get(i);
			JButton button = createButtonPlanta(nombre);
			button = addAction(button,i);
			this.panelPlantasPosibles.add(button);
			this.panelPlantasPosibles.repaint();
		}	
		
	}

	public void initPanelPlantas() {
		this.panelPlantas = new JPanel();
		this.panelPlantas.setBounds(0,0,(int)this.getBounds().getMaxX()-501,(int)this.getBounds().getMaxY());
		this.panelPlantas.setBackground(Color.DARK_GRAY);
		this.panelPlantas.setLayout(null);
		this.add(panelPlantas);
	}
	
	public void initPanelPlantasPosibles() {
		this.panelPlantasPosibles = new JPanel();
		this.panelPlantasPosibles.setBounds((int)this.getBounds().getMaxX()-500, 0, 300,(int)this.getBounds().getMaxY());
		this.panelPlantasPosibles.setBackground(Color.green);
		this.panelPlantasPosibles.setLayout(null);
		this.add(panelPlantasPosibles);
	}
	
	private void initComponents() {
		initPanelPlantas();
		initPanelPlantasPosibles();
		cargarBotonesDePlantas();
		
		
	}	
	
}
