package h1;

public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner) {
	    this.zaehler = zaehler;
	    this.nenner = nenner;
	}

	
	private int ggT(int x, int y) {
		if(x==0) {
			return y;
		}
		if(y==0) {
			return x;
		}
		int a=Math.max(x, y);
		int b=Math.min(x, y);
		int r=a%b;
		while(r>0) {
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
	
	public void shorten() {
		int teiler = ggT(zaehler,nenner);
		zaehler /= teiler;
		nenner/= teiler;
	}
	
	public boolean hasSameValueAs(Bruch b) {
		return this.zaehler*b.nenner==this.nenner*b.zaehler;
	}
}