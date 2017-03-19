import java.util.ArrayList;
public class Directory {
	private ArrayList<Employee> dir;
	
	public Directory(){
		this.dir = new ArrayList<Employee>();
	}
	
	public void add(Employee e){
		dir.add(e);
	}
	
	public void print(){
		System.out.println(dir);
	}
	
	public void clear(){
		this.dir = new ArrayList<Employee>();
	}
}
