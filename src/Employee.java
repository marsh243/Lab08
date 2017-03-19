
public class Employee {
	private String f,l,d,p,g,t;
	public Employee(String f, String l, String d, String p, String g, String t){
		this.f = f;
		this.l = l;
		this.d = d;
		this.p = p;
		this.g = g;
		this.t= t;
	}
	
	public String getF(){
		return this.f;
	}
	
	public String getL(){
		return this.l;
	}
	
	public String getD(){
		return this.d;
	}
	
	public String getP(){
		return this.p;
	}
	
	public String getG(){
		return this.g;
	}
	
	public String getT(){
		return this.t;
	}
	
	public String toString(){
		return (t+" "+f+" "+l+" "+d+" "+p+" Gender: "+g);
	}
}
