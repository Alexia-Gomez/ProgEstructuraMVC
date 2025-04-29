package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AuthModel {
	public AuthModel() {
		
	}
	
	public boolean acccess(String u, String p) {
		try {
            File file = new File(AuthModel.class.getResource("/files/users.txt").toURI());
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String linea;

            while ((linea = reader.readLine()) != null) {
            	
            	String[] div = linea.split(",");

            	String fileUser = div[1].trim();
            	String filePass = div[2].trim();

            	if (u.equals(fileUser) && p.equals(filePass)) {
            		reader.close();
            		return true; 
            	}
            }

            reader.close();
            return false;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return false;
    }
	
	public boolean registerTxt(String name, String surname, String company, String pos, String username, String pass1, String pass2, String email ) {
		
		if(name.isEmpty()||surname.isEmpty()||company.isEmpty()||pos.isEmpty()||username.isEmpty()||pass1.isEmpty()||pass2.isEmpty()||email.isEmpty()) {
			return false;
		}
	
		try {
			
			File file = new File("resources/files/usuarios.txt");
			
			FileWriter writer = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(writer);
            
            bw.write(name+","+surname+","+company+","+pos+","+username+","+pass1+","+email);
            
            bw.close();
            return true;
            
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error en registro");
		}
		return false;
	}
	
}
