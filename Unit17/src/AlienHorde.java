import java.util.ArrayList;

public class AlienHorde {
	
	private ArrayList<Alien> aliens;
	
	public AlienHorde(){
		aliens = new ArrayList<Alien>();
	}
	
	public void add(Alien a){
		aliens.add(a);
	}
	
	public void remove(Alien a){
		aliens.remove(a);
	}
	
	public ArrayList<Alien> getList(){
		return aliens;
	}
	
	public Alien getAlien(int index){
		return aliens.get(index);
	}
	
	public String toString(){
		String output = "";
		for(Alien a : aliens){
			output += " " + a.toString();
		}
		return output;
	}
}
