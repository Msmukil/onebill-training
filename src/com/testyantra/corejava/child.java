package com.testyantra.corejava;

public class child extends test {
int a;
int b;
int c;
int d;
int z;
public child(int x,int y,int z) {
	super(x,y);
	this.z=z;
	System.out.println("from child 3 parameter");
	
}
public child(int x,int y,int z,int a,int b) {
	this(x,y,z);
	this.a=a;
	this.b=b;
	System.out.println("from child 5 parameter");
}
public child(int x,int y,int z,int a,int b,int c,int d) {
	this(x,y,z,a,b);
	this.c = c;
	this.d = d;
	System.out.println("from child 7 parameter");
}

}
