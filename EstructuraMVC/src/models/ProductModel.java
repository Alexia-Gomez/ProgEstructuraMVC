package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ProductModel {
	
	public ProductModel() {
		
	}
	
	public JSONArray get() {
		
		JSONParser jsonParser= new JSONParser();
		
		try(FileReader reader= new FileReader("resources/files/products.json")){
			
			Object obj= jsonParser.parse(reader);
			JSONArray productList=(JSONArray) obj;
			
			return productList;
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();	
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void remove() {
		
		JSONArray productList= get();
		
		productList.remove(0);

		try (FileWriter file = new FileWriter("resources/files/products.json")) {

			file.write(productList.toString());
			file.flush();
			file.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean addProduct(String n) {
		
		JSONArray productList = get();
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", n);
		jsonObject.put("title", n);
		
		productList.add(jsonObject);
		
		try (FileWriter file = new FileWriter("resources/files/products.json")) {
            file.write(productList.toString()); // Use toString(2) for pretty printing
            file.flush();
            file.close();
            System.out.println("JSON array written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return false;
	}
	
	
	
	private static void parseTestData(JSONObject product) {
		
		String title = (String) product.get("title");   
	    System.out.println("Title: " + title);
	      
	    String description = (String) product.get("description");   
	    System.out.println("Description: " + description);
	      
	    String category = (String) product.get("category"); 
	    System.out.println("Category: " + category); 
	}
}
