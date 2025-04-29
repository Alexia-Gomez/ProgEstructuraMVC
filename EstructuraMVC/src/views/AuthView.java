package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	private JFrame frame;
 	private AuthModel functions;
 	
 	JPasswordField pass = new JPasswordField();
 	JTextField user = new JTextField();
 	JPanel home = new JPanel();
 	JPanel login = new JPanel();
 	
 	ImageIcon fondo = new ImageIcon(AuthView.class.getResource("/views/fondo.png"));
 	
 	Font etiquetas2 = new Font("Nunito", Font.BOLD, 15); 
	Font etiquetas3 = new Font("Nunito", Font.PLAIN, 16);
	Font etiquetas4 = new Font("Nunito", Font.BOLD, 25);
	Font botones = new Font("Nunito", Font.BOLD, 16);
 
 	public AuthView() {
 		
 		frame = new JFrame();
 		frame.setBounds(100, 100, 700, 600);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		functions = new AuthModel();
 	}
 	
 	
 	
 	public void login()
 	{
 		
 		login = new JPanel();
		login.setBounds(0,0,700,600);
		login.setOpaque(true);
		login.setBackground(Color.WHITE);
		login.setVisible(true);
		login.setLayout(null);
		frame.getContentPane().add(login, BorderLayout.CENTER);
		frame.setVisible(true);
		
		//TITULO
		JLabel etiqueta1 = new JLabel("Iniciar Sesión");
		etiqueta1.setBounds(245, 120, 200, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
		login.add(etiqueta1);
		
		
		//ICONO USUARIO
		ImageIcon usuario = new ImageIcon(AuthView.class.getResource("/views/usuario1.png"));
		JLabel usuario_icon = new JLabel();
		usuario_icon.setBounds(150, 210, 40, 40);
		usuario_icon.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		login.add(usuario_icon);
		
		//USUARIO
		JLabel etiqueta2 = new JLabel("Usuario:");
		etiqueta2.setBounds(190, 180, 160, 30);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setForeground(new Color(4, 83, 125));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas2);
		login.add(etiqueta2);
		
		user = new JTextField();	
		user.setBounds(190, 215, 330, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas3);
		login.add(user);
		
		
		
		//ICONO CONTRASEÑA
		ImageIcon contraseña = new ImageIcon(AuthView.class.getResource("/views/contraseña.png"));
		JLabel contraseña_icon = new JLabel();
		contraseña_icon.setBounds(150, 290, 40, 40);
		contraseña_icon.setIcon(new ImageIcon(contraseña.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		login.add(contraseña_icon);
		
		
		//CONTRASEÑA
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setBounds(190, 260, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setForeground(new Color(4, 83, 125));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas2);
		login.add(etiqueta3);
		
		pass = new JPasswordField();
		pass.setBounds(190, 295, 330, 30);
		pass.setBackground(new Color(237, 237, 237 ));
		pass.setOpaque(true);
		pass.setFont(etiquetas3);
		login.add(pass);
		
		
		//RECORDAR CONTRASEÑA
		JCheckBox box = new JCheckBox();
		box.setBounds(190, 330, 25, 30);
		box.setBackground(Color.WHITE);
		box.setOpaque(true);
		login.add(box);
				
		JLabel etiqueta4 = new JLabel("Recuérdame");
		etiqueta4.setBounds(215, 330, 120, 30);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setForeground(new Color(4, 83, 125));
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(new Font("Nunito", Font.PLAIN, 12));
		login.add(etiqueta4);
				
	
				
		//RECUPERAR CONTRASEÑA
		JLabel etiqueta5 = new JLabel("¿Has perdido tu contraseña?");
		etiqueta5.setBounds(360, 330, 160, 30);
		etiqueta5.setBackground(Color.WHITE);
		etiqueta5.setForeground(new Color(4, 83, 125));
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(new Font("Nunito", Font.ITALIC, 12));
		login.add(etiqueta5);
		
		
				
		//BOTON ACCEDER
		JButton acceder = new JButton("Acceder");
		acceder.setBounds(370, 390, 150, 35);
		acceder.setBackground(new Color(10, 73, 143) );
		acceder.setForeground(Color.white);
		acceder.setOpaque(true);
		acceder.setFont(new Font("Nunito", Font.BOLD, 15));
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Boolean flag1 = false, flag2 = false;
				String passText = new String(pass.getPassword());
 				String username = user.getText();
 				registro(username, passText);
 				
 				if(passText.equals("") ) {
 					
 					pass.setBorder(BorderFactory.createLineBorder(Color.red,2));
 					
 				}else {
 					
 					pass.setBorder(BorderFactory.createLineBorder(Color.green,2));
 					flag1 = true;
 				}
 				
 				
 				if(username.equals("")) {
 					user.setBorder(BorderFactory.createLineBorder(Color.red,2));
 				}else {
 					
 					user.setBorder(BorderFactory.createLineBorder(Color.green,2));
 					flag2 = true;
 				}
 				
 				if(flag1 && flag2) {
 					
 					
 					boolean user_auth = functions.acccess(username,passText); 
 					 
 					if(user_auth) {
 						
 						JOptionPane.showMessageDialog(frame, "Bienvenido.");
 						frame.getContentPane().removeAll();
 						home();
 						
 					}else {
 						JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos","Verifique su información",JOptionPane.WARNING_MESSAGE);
 					}
 					 	
 				}
 				
 			}
 			
 		});
		login.add(acceder);
		
		//CREAR CUENTA
		JButton btn_b = new JButton("Crear cuenta");
		btn_b.setBounds(190, 390, 150, 35);
		btn_b.setBackground(Color.white);
		btn_b.setForeground(new Color(4, 83, 125));
		btn_b.setOpaque(true);
		btn_b.setFont(new Font("Nunito", Font.BOLD, 15));
		login.add(btn_b);
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		login.add(fondo1);
				
				
		//FONDO
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		login.add(fondo_img);
		
		frame.revalidate();
		frame.repaint();
	
 	}
 	
 	public void home() {
 		//FONDO1
 		home = new JPanel();
 		home.setBounds(0,0,700,600);
 		home.setOpaque(true);
 		home.setBackground(Color.WHITE);
 		home.setVisible(true);
 		home.setLayout(null);
 		

 		//TITULO
 		JLabel etiqueta1 = new JLabel("HOME");
 		etiqueta1.setBounds(245, 120, 200, 40);
 		etiqueta1.setForeground(new Color(10, 73, 143));
 		etiqueta1.setBackground(Color.WHITE);
 		etiqueta1.setOpaque(true);
 		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
 		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
 		home.add(etiqueta1);
 		
 		
 		//CREAR CUENTA
 		JButton regresar = new JButton("Regresar");
 		regresar.setBounds(190, 390, 150, 35);
 		regresar.setBackground(Color.white);
 		regresar.setForeground(new Color(4, 83, 125));
 		regresar.setOpaque(true);
 		regresar.setFont(new Font("Nunito", Font.BOLD, 15));
 		regresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				login();
			}
 			
 		});
 		home.add(regresar);

 		JLabel fondo1 = new JLabel();
 		fondo1.setBounds(100, 80, 480, 400);
 		fondo1.setBackground(Color.white);
 		fondo1.setOpaque(true);
 		home.add(fondo1);


 		//FONDO
 		JLabel fondo_img = new JLabel();
 		fondo_img.setBounds(0, 0, 700, 600);
 		fondo_img.setIcon(fondo);
 		home.add(fondo_img);
 		
 		frame.add(home);
 		frame.revalidate();
 		frame.repaint();

 	}
 	
 	public void registro(String usuario, String contraseña ) {
 		String userT = user.getText();
 		String passT = new String(pass.getPassword()) ;
 		
 		System.out.println("Usuario: "+userT+"\nContraseña:"+passT);
 	}
 	
 			
}
