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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HomeView {
	
	ImageIcon fondo = new ImageIcon(AuthView.class.getResource("/images/fondo.png"));
	
	public HomeView() {
		// TODO Auto-generated method stub
	}
	
	public void home() {
		JFrame ventana=new JFrame();
		ventana.setBounds(100, 100, 700, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel home = new JPanel();
		home.setBounds(0,0,700,600);
		home.setBackground(Color.WHITE);
		home.setLayout(null);
		ventana.getContentPane().add(home, BorderLayout.CENTER);
		
		//TITULO
 		JLabel etiqueta1 = new JLabel("HOME");
 		etiqueta1.setBounds(245, 120, 200, 40);
 		etiqueta1.setForeground(new Color(10, 73, 143));
 		etiqueta1.setBackground(Color.WHITE);
 		etiqueta1.setOpaque(true);
 		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
 		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
 		home.add(etiqueta1);
 		
 		JLabel wUsers = new JLabel("150");
 		wUsers.setBounds(160, 200,100, 40);
 		wUsers.setBackground(Color.white);
 		wUsers.setOpaque(true);
 		wUsers.setFont(new Font("Nunito", Font.BOLD, 20));
 		wUsers.setForeground(new Color(4, 83, 125));
 		wUsers.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
 		ImageIcon userC = new ImageIcon(AuthView.class.getResource("/images/usuario1.png"));
 		wUsers.setIcon(new ImageIcon(userC.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
 		home.add(wUsers);
 		
 		JLabel wNoti = new JLabel("(10)");
 		wNoti.setBounds(160, 260, 100, 40);
 		wNoti.setBackground(Color.white);
 		wNoti.setOpaque(true);
 		wNoti.setFont(new Font("Nunito", Font.BOLD, 20));
 		wNoti.setForeground(new Color(4, 83, 125));
 		wNoti.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
 		ImageIcon noti = new ImageIcon(AuthView.class.getResource("/images/mensaje.png"));
 		wNoti.setIcon(new ImageIcon(noti.getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH)));
 		home.add(wNoti);
 		
 		JLabel wTime = new JLabel("  10:26");
 		wTime.setBounds(280, 200, 110, 100);
 		wTime.setBackground(Color.white);
 		wTime.setOpaque(true);
 		wTime.setFont(new Font("Nunito", Font.BOLD, 29));
 		wTime.setForeground(new Color(4, 83, 125));
 		wTime.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
 		home.add(wTime);
 		
 		JLabel wStats = new JLabel();
 		wStats.setBounds(410, 200, 110, 100);
 		wStats.setBackground(Color.white);
 		wStats.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
 		wStats.setOpaque(true);
 		ImageIcon stat = new ImageIcon(AuthView.class.getResource("/images/stats.png"));
 		wStats.setIcon(new ImageIcon(stat.getImage().getScaledInstance(110, 100, Image.SCALE_SMOOTH)));
 		home.add(wStats);
 		
 		JButton usuarios = new JButton("Usuarios");
		usuarios.setBounds(160, 350, 110, 35);
		usuarios.setBackground(new Color(4, 83, 125));
		usuarios.setForeground(Color.white);
		usuarios.setOpaque(true);
		usuarios.setFont(new Font("Nunito", Font.BOLD, 12));
		usuarios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "ventana de usuarios");
			}
		});
		home.add(usuarios);
		
		JButton registros = new JButton("Registros");
		registros.setBounds(280, 350, 110, 35);
		registros.setBackground(new Color(4, 83, 125));
		registros.setForeground(Color.white);
		registros.setOpaque(true);
		registros.setFont(new Font("Nunito", Font.BOLD, 12));
		registros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "ventana de registros");
			}
		});
		home.add(registros);
		
		JButton conf = new JButton("Configuración");
		conf.setBounds(400, 350, 120, 35);
		conf.setBackground(new Color(4, 83, 125));
		conf.setForeground(Color.white);
		conf.setOpaque(true);
		conf.setFont(new Font("Nunito", Font.BOLD, 12));
		conf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "ventana de configuración");
			}
		});
		home.add(conf);
 		

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

	}
	
		
}
