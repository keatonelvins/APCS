import java.util.ArrayList;

public class Bullets {
	
	private ArrayList<Ammo> bullets;
	
	public Bullets(){
		bullets = new ArrayList<Ammo>();
	}
	
	public void add(Ammo a){
		bullets.add(a);
	}
	
	public void remove(Ammo a){
		bullets.remove(a);
	}
	
	public ArrayList<Ammo> getList(){
		return bullets;
	}
	
	public String toString(){
		String output = "";
		for(Ammo a : bullets){
			output += " " + a.toString();
		}
		return output;
	}
}

