package models;

public class AuthModel {
	public AuthModel() {
		
	}
	
	public boolean acccess(String u, String p) {
		
		/*try{
		 * 	Strng url = AuthModel.class.getsource("/files/fhfnd.txt").getPath();
		 * 	FileReader fileReader = new FileReader(url);
		 * 
		 * int i;
		 * 
		 * while((i=fileReader.read()) != -1){
		 * 	system.out.println((char)i);
		 * 	
		 *convertir row en string  y cortar el string con split. comparar con el arreglo en la pos 1, 2 (correo y contraseña)
		 *
		 * if(u.equals("admin")) {
			if(p.equals("1234")) {
				return true;
			}
		 * }
		 * 
		 * 
		 * 
		 * fileReader.close();
		 * 
		 * } catch (Exception e){
		 * 
		 * 	e.printStackTrace();
		 * system.out.println("error");
		 * 
		 * }
		 * 
		 * terminer login
		 * 
		 * hacer un escribir (file writer)
		 * */
		
		if(u.equals("admin")) {
			if(p.equals("1234")) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
