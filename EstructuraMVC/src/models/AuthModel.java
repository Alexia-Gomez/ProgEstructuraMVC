package models;

public class AuthModel {
	public AuthModel() {
		
	}
	
	public boolean acccess(String u, String p) {
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
