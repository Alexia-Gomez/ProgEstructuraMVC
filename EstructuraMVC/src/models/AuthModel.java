package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
	
}
