package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	private JFrame frame;
 	private AuthModel functions;
 	
 	JPasswordField pass = new JPasswordField();
 	JTextField user = new JTextField();
 	
 	JPanel home = new JPanel();
 	JPanel login = new JPanel();
 	JPanel register = new JPanel();
 	
 	ImageIcon fondo = new ImageIcon(AuthView.class.getResource("/images/fondo.png"));
 	
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
		ImageIcon usuario = new ImageIcon(AuthView.class.getResource("/images/usuario1.png"));
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
		ImageIcon contraseña = new ImageIcon(AuthView.class.getResource("/images/contraseña.png"));
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
		JButton crear = new JButton("Crear cuenta");
		crear.setBounds(190, 390, 150, 35);
		crear.setBackground(Color.white);
		crear.setForeground(new Color(4, 83, 125));
		crear.setOpaque(true);
		crear.setFont(new Font("Nunito", Font.BOLD, 15));
		crear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.getContentPane().removeAll();
				register();
			}
			
		});
		login.add(crear);
		
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
 	
 	public void register() {
 		
 		register = new JPanel();
 		register.setPreferredSize(new Dimension(700, 1200));
 		register.setLayout(null);
 		
 		JScrollPane scroll = new JScrollPane(register);
 		scroll.setBounds(0,0,700,600);
 		frame.getContentPane().add(scroll);
 		

 		//TITULO
 		JLabel etiqueta1 = new JLabel("Crear cuenta");
 		etiqueta1.setBounds(245, 120, 200, 40);
 		etiqueta1.setForeground(new Color(10, 73, 143));
 		etiqueta1.setBackground(Color.WHITE);
 		etiqueta1.setOpaque(true);
 		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
 		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
 		register.add(etiqueta1);

 		
 		//NOMBRES
 		JLabel etiqueta2 = new JLabel("Nombres:");
 		etiqueta2.setBounds(100, 350, 160, 30);
 		etiqueta2.setBackground(Color.WHITE);
 		etiqueta2.setForeground(new Color(4, 83, 125));
 		etiqueta2.setOpaque(true);
 		etiqueta2.setFont(etiquetas2);
 		register.add(etiqueta2);

 		JTextField nombre = new JTextField();	
 		nombre.setBounds(100, 390, 480, 30);
 		nombre.setBackground(new Color(237, 237, 237 ));
 		nombre.setOpaque(true);
 		nombre.setFont(etiquetas3);
 		nombre.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		        if (!Character.isLetter(e.getKeyChar()) && !Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(nombre);
 		
 		
 		
 		
 		//APELLIDOS
 		JLabel etiqueta3 = new JLabel("Apellidos:");
 		etiqueta3.setBounds(100, 430, 160, 30);
 		etiqueta3.setBackground(Color.WHITE);
 		etiqueta3.setForeground(new Color(4, 83, 125));
 		etiqueta3.setOpaque(true);
 		etiqueta3.setFont(etiquetas2);
 		register.add(etiqueta3);

 		JTextField apellidos = new JTextField();	
 		apellidos.setBounds(100, 470, 480, 30);
 		apellidos.setBackground(new Color(237, 237, 237 ));
 		apellidos.setOpaque(true);
 		apellidos.setFont(etiquetas3);
 		apellidos.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		        if (!Character.isLetter(e.getKeyChar()) && !Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(apellidos);
 		
 		
 		//EMPRESA
 		JLabel etiqueta4 = new JLabel("Empresa:");
 		etiqueta4.setBounds(100, 510, 160, 30);
 		etiqueta4.setBackground(Color.WHITE);
 		etiqueta4.setForeground(new Color(4, 83, 125));
 		etiqueta4.setOpaque(true);
 		etiqueta4.setFont(etiquetas2);
 		register.add(etiqueta4);

 		JTextField empresa = new JTextField();	
 		empresa.setBounds(100, 550, 480, 30);
 		empresa.setBackground(new Color(237, 237, 237 ));
 		empresa.setOpaque(true);
 		empresa.setFont(etiquetas3);
 		empresa.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		    	
 		        if (!Character.isDigit(e.getKeyChar()) && !Character.isLetter(e.getKeyChar()) && !Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(empresa);
 		
 		
 		//AMBITO EMPRESA
 		JLabel etiqueta5 = new JLabel("Ambito de la empresa:");
 		etiqueta5.setBounds(100, 590, 200, 30);
 		etiqueta5.setBackground(Color.WHITE);
 		etiqueta5.setForeground(new Color(4, 83, 125));
 		etiqueta5.setOpaque(true);
 		etiqueta5.setFont(etiquetas2);
 		register.add(etiqueta5);
 		
 		String [] ambitos_list = {"Tecnología", "Salud","Educación","Comercio","Otro"};
		JComboBox ambitos = new JComboBox(ambitos_list);
		
		ambitos.setBounds(100, 630,480, 30);
		ambitos.setFont(new Font("Nunito",Font.PLAIN, 14));
		register.add(ambitos);
		
		
		//CARGO
		JLabel etiqueta6 = new JLabel("Cargo:");
 		etiqueta6.setBounds(100, 670, 160, 30);
 		etiqueta6.setBackground(Color.WHITE);
 		etiqueta6.setForeground(new Color(4, 83, 125));
 		etiqueta6.setOpaque(true);
 		etiqueta6.setFont(etiquetas2);
 		register.add(etiqueta6);

 		JTextField cargo = new JTextField();	
 		cargo.setBounds(100, 710, 480, 30);
 		cargo.setBackground(new Color(237, 237, 237 ));
 		cargo.setOpaque(true);
 		cargo.setFont(etiquetas3);
 		cargo.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		        if (!Character.isLetter(e.getKeyChar()) && !Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(cargo);
		
		//USERNAME
		JLabel etiqueta7 = new JLabel("Nombre de usuario:");
 		etiqueta7.setBounds(100, 750, 160, 30);
 		etiqueta7.setBackground(Color.WHITE);
 		etiqueta7.setForeground(new Color(4, 83, 125));
 		etiqueta7.setOpaque(true);
 		etiqueta7.setFont(etiquetas2);
 		register.add(etiqueta7);

 		JTextField usuario = new JTextField();	
 		usuario.setBounds(100, 790, 480, 30);
 		usuario.setBackground(new Color(237, 237, 237 ));
 		usuario.setOpaque(true);
 		usuario.setFont(etiquetas3);
 		usuario.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		    	
 		        if (!Character.isDigit(e.getKeyChar()) && !Character.isLetter(e.getKeyChar()) && !Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(usuario);
		
 		//PASSWORD
 		JLabel etiqueta8 = new JLabel("Contraseña:");
 		etiqueta8.setBounds(100, 830, 160, 30);
 		etiqueta8.setBackground(Color.WHITE);
 		etiqueta8.setForeground(new Color(4, 83, 125));
 		etiqueta8.setOpaque(true);
 		etiqueta8.setFont(etiquetas2);
 		register.add(etiqueta8);

 		JPasswordField password = new JPasswordField();	
 		password.setBounds(100, 870, 480, 30);
 		password.setBackground(new Color(237, 237, 237 ));
 		password.setOpaque(true);
 		password.setFont(etiquetas3);
 		password.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		    	
 		        if (Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(password);
 		
 		JLabel etiqueta9 = new JLabel("Repetir contraseña:");
 		etiqueta9.setBounds(100, 910, 160, 30);
 		etiqueta9.setBackground(Color.WHITE);
 		etiqueta9.setForeground(new Color(4, 83, 125));
 		etiqueta9.setOpaque(true);
 		etiqueta9.setFont(etiquetas2);
 		register.add(etiqueta9);

 		JPasswordField confirmPass = new JPasswordField();	
 		confirmPass.setBounds(100, 950, 480, 30);
 		confirmPass.setBackground(new Color(237, 237, 237 ));
 		confirmPass.setOpaque(true);
 		confirmPass.setFont(etiquetas3);
 		confirmPass.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		    	
 		        if (Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(confirmPass);
 		
 		
 		//EMAIL
 		JLabel etiqueta10 = new JLabel("Correo electrónico:");
 		etiqueta10.setBounds(100, 990, 160, 30);
 		etiqueta10.setBackground(Color.WHITE);
 		etiqueta10.setForeground(new Color(4, 83, 125));
 		etiqueta10.setOpaque(true);
 		etiqueta10.setFont(etiquetas2);
 		register.add(etiqueta10);
 		
 		JTextField correo = new JTextField();	
 		correo.setBounds(100, 1030, 480, 30);
 		correo.setBackground(new Color(237, 237, 237 ));
 		correo.setOpaque(true);
 		correo.setFont(etiquetas3);
 		correo.addKeyListener(new KeyAdapter() {
 		    public void keyTyped(KeyEvent e) {
 		        if (Character.isWhitespace(e.getKeyChar())) {
 		            e.consume(); 
 		        }
 		    }
 		});
 		register.add(correo);
 		
		
 		
 		//REGRESAR
 		JButton registrar = new JButton("Registrar");
 		registrar.setBounds(270, 1100, 150, 35);
 		registrar.setBackground(new Color(10, 73, 143));
 		registrar.setForeground(Color.white);
 		registrar.setOpaque(true);
 		registrar.setFont(new Font("Nunito", Font.BOLD, 15));
 		registrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = nombre.getText().trim();
				String surname = apellidos.getText().trim();
				String company = empresa.getText().trim();
				String pos = cargo.getText().trim();
				String username = usuario.getText().trim();
				String pass1 = new String(password.getPassword()).trim();
				String pass2 = new String(confirmPass.getPassword()).trim();
				String email = correo.getText();
				
				if(!pass1.isEmpty()&&!pass1.matches(".*[^a-zA-Z0-9].*") ) {
					JOptionPane.showMessageDialog(frame, "Debe contener al menos un carácter especial", "Error", JOptionPane.WARNING_MESSAGE);
				}
				
				if(!pass2.isEmpty()&&!pass1.equals(pass2)) {
				JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden", "Error", JOptionPane.WARNING_MESSAGE);
				}
				
				boolean register_txt = functions.registerTxt(name, surname, company, pos, username, pass1, pass2, email);
				if(register_txt) {
					JOptionPane.showMessageDialog(frame,"Registro exitoso");
					
				}else {
					JOptionPane.showMessageDialog(frame, "Se deben llenar todos los campos" );
				}
				
			}
 			
 		});
 		register.add(registrar);

 		JLabel fondo1 = new JLabel();
 		fondo1.setBounds(100, 80, 480, 115);
 		fondo1.setBackground(Color.white);
 		fondo1.setOpaque(true);
 		register.add(fondo1);


 		//FONDO
 		JLabel fondo_img = new JLabel();
 		fondo_img.setBounds(0, 0, 700,300);
 		fondo_img.setIcon(fondo);
 		register.add(fondo_img);
 		
 		//FONDO 2
 		JLabel fondo2 = new JLabel();
 		fondo2.setBounds(0, 300, 700, 900);
 		fondo2.setBackground(Color.white);
 		fondo2.setOpaque(true);
 		register.add(fondo2);
 		
 		
 		frame.revalidate();
 		frame.repaint();
 	}
 	
 	public void registro(String usuario, String contraseña ) {
 		String userT = user.getText();
 		String passT = new String(pass.getPassword()) ;
 		
 		System.out.println("Usuario: "+userT+"\nContraseña:"+passT);
 	}
 	
 			
}
