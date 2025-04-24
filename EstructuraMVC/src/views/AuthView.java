package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	private JFrame frame;
 	private JTextField textField;
 	private JPasswordField passwordField;
 	private AuthModel functions;
 
 	public AuthView() {
 		
 		functions = new AuthModel();
 	}
 	
 	public void login()
 	{
 		frame = new JFrame();
 		frame.setBounds(100, 100, 920, 534);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		frame.setVisible(true);
 		
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(255, 255, 255));
 		frame.getContentPane().add(panel, BorderLayout.CENTER);
 		panel.setLayout(null);
 		
 		JLabel titulo=new JLabel("INICIAR SESION");
 		titulo.setBounds(200, 50, 200, 30);
 		titulo.setFont(new Font("Nunito", Font.BOLD, 25));
 		panel.add(titulo);
 		
 		JLabel usuario =new JLabel("Usuario:");
 		usuario.setBounds(100, 150, 100, 20);
 		usuario.setFont(new Font("Nunito", Font.BOLD, 15));
 		panel.add(usuario);
 		
 		JTextField usuarioT =new  JTextField();
 		usuarioT.setBounds(100, 180, 200, 20);
 		usuarioT.setBackground(Color.gray);
 		panel.add(usuarioT);
 		
 		JLabel contraseña =new JLabel("Contraseña:");
 		contraseña.setBounds(100, 220, 100, 20);
 		contraseña.setFont(new Font("Nunito", Font.BOLD, 15));
 		panel.add(contraseña);
 		
 		JTextField contraseñaT =new  JTextField();
 		contraseñaT.setBounds(100, 250, 200, 20);
 		contraseñaT.setBackground(Color.gray);
 		panel.add(contraseñaT);
 		
 		JButton acceder =new JButton("Acceder");
 		acceder.setBackground(Color.blue);
 		acceder.setOpaque(true);
 		acceder.setForeground(Color.white);
 		acceder.setFont(new Font("Nunito", Font.BOLD, 15));
 		acceder.setBounds(150, 300, 100, 30);
 		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String passText = new String(passwordField.getPassword());
 				Boolean flag1 = false, flag2 = false;
 				
 				String username = usuarioT.getText();
 				
 				if( contraseñaT.equals("") ) {
 					
 					contraseñaT.setBorder(BorderFactory.createLineBorder(Color.red,2));
 					
 				}else {
 					
 					contraseñaT.setBorder(BorderFactory.createLineBorder(Color.green,2));
 					flag1 = true;
 				}
 				
 				
 				if(usuarioT.getText().equals("")) {
 					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
 				}else {
 					
 					usuarioT.setBorder(BorderFactory.createLineBorder(Color.green,2));
 					flag2 = true;
 				}
 				
 				if(flag1 && flag2) {
 					
 					
 					boolean user_auth = functions.acccess(username,passText); 
 					 
 					if(user_auth) {
 						
 						JOptionPane.showMessageDialog(frame, "Bienvenido.");
 						
 					}else {
 						JOptionPane.showMessageDialog(frame, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
 					}
 					 	
 				}
 				
 			}
 			
 		});
 		
 		panel.add(acceder);
 		
 	}
 	
 			
}
