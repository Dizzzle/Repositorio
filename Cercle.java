package git_faus;

public class Cercle {

	
	
	private float x;
	 private float y;
	 
	 public Cercle () {
	     this.x = 4.3f;
	     this.y = 4.3f;
	 }
	 
	 public Cercle (Cercle cercle) {
	     this.x = cercle.x;
	     this.y = cercle.y;
	 }

	 Cercle(float xx, float yy)

	  {

	     x=xx;

	     y=yy;     

	  }

	

//getters and setters
	 public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}


	 public String toString() {
	    String tronk = "X: " + this.x + " Y: " + this.y;
	    return tronk;
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		Cercle circulo1 = new Cercle(12,44);	
		Cercle circulo2 = new Cercle(22,55);
		Cercle circulo3 = new Cercle(33,44);
		Cercle circulo4 = new Cercle(22,55);
		
		System.out.println(circulo1);
		System.out.println(circulo2);
		System.out.println(circulo3);
		System.out.println(circulo4);

	}

}