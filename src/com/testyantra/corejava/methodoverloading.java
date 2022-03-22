package  com.testyantra.corejava;


public class methodoverloading {
	static void add(int x,int y) {
		int sum =x+y;
	}
	static void add(int x,int y,int z) {
	System.out.println(x+y+z);
}
static void add(double x ,double y) {
	System.out.println(x*y);
}
static void add(double x, int y) {
	System.out.println(x*y);
}
static void add(int x, double y) {
	System.out.println(x*y);
	}
public static void main(String[] args) {
	methodoverloading.add(3, 5, 7);
}
	


	}

