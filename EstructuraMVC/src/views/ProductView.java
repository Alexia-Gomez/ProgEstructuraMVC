package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import controllers.ProductController;
import models.ProductModel;

public class ProductView {
	
	ImageIcon fondo = new ImageIcon(AuthView.class.getResource("/images/fondo.png"));
	
	public ProductView() {
		
	}


	public void products(JSONArray data) {
		JFrame ventana=new JFrame();
		ventana.setBounds(100, 100, 700, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel productos = new JPanel();
		productos.setBounds(0,0,700,600);
		productos.setBackground(Color.WHITE);
		productos.setLayout(null);
		ventana.getContentPane().add(productos, BorderLayout.CENTER);
		
		JLabel etiqueta1 = new JLabel("PRODUCTOS");
 		etiqueta1.setBounds(245, 120, 200, 40);
 		etiqueta1.setForeground(new Color(10, 73, 143));
 		etiqueta1.setBackground(Color.WHITE);
 		etiqueta1.setOpaque(true);
 		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
 		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
 		productos.add(etiqueta1);
		
		String [] columnNames = {
				"ID",
				"Nombre",
				"Precio",
				"Stock"
		};
		
		DefaultTableModel pm = new DefaultTableModel(columnNames, 0);
		
		for (Object obj : data) {
            JSONObject product = (JSONObject) obj;

            Long id = (Long) product.get("id");
            String nombre = (String) product.get("title");
            Double precio = Double.parseDouble(product.get("price").toString());
            Long stock = (Long) product.get("stock");
            

            Object[] row = {id, nombre, precio, stock};
            pm.addRow(row);
        }
		
		
		JTable table = new JTable(pm);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(120, 200, 450, 200);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(250, 420, 200, 30);
        eliminar.setBackground(new Color(4, 83, 125));
        eliminar.setForeground(Color.white);
        eliminar.setFont(new Font("Nunito", Font.BOLD, 12));
        productos.add(eliminar);

        eliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = table.getSelectedRow();
                if (fila >= 0) {
                    Long id = (Long) pm.getValueAt(fila, 0);
                    pm.removeRow(fila);

                    for (int i = 0; i < data.size(); i++) {
                        JSONObject obj = (JSONObject) data.get(i);
                        if (((Long) obj.get("id")).equals(id)) {
                            data.remove(i);
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
                }
            }
        });

        productos.add(scrollPane);
        
        
        JLabel fondo1 = new JLabel();
 		fondo1.setBounds(100, 80, 480, 400);
 		fondo1.setBackground(Color.white);
 		fondo1.setOpaque(true);
 		productos.add(fondo1);


 		//FONDO
 		JLabel fondo_img = new JLabel();
 		fondo_img.setBounds(0, 0, 700, 600);
 		fondo_img.setIcon(fondo);
 		productos.add(fondo_img);
		
	}

	
}
