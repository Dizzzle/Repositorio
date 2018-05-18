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

	public Boolean equals (Cercle objecte) {
	 return this.equals(objecte);
	 }
	 

	 public String toString() {
	    String tronk = "X: " + this.x + " Y: " + this.y;
	    return tronk;
	 }
	 
	public static void main () {
	Cercle circulo = new Cercle();
	}
}
