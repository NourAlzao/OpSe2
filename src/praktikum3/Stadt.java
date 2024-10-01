package praktikum3;

import java.util.LinkedList;
public class Stadt {

	    private String name;
	    private LinkedList<String> postzahl;
	    
	    public Stadt(String name) {
	        this.name = name;
	        this.postzahl = new LinkedList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public LinkedList<String> getPostleitzahlen() {
	        return postzahl;
	    }

	    public void setPostleitzahlen(LinkedList<String> postzahl) {
	        this.postzahl = postzahl;
	    }

	    public void addPostleitzahl(String plz) {
	        this.postzahl.add(plz);
	    }

		public String[] getpostzahl() {
			// TODO Auto-generated method stub
			return null;
		}
	}
