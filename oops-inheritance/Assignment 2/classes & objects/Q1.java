Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
=============================================================================================
:               import java.io.*;
import java.util.*;

class Box{
	private double height;
	private double width;
	private double depth;
	
	Box(double hei, double wid, double dep){
		height = hei;
		width = wid;
		depth = dep;
	}
	public double volume() {
		return height*width*depth;
	}
}

public class E1 {
	public static void main(String args[]) {
		Box box1 = new Box(100,20,50);
		Box box2 = new Box(200,10,50);
		System.out.println("Volume: "+box1.volume());
		System.out.println("Volume: "+box2.volume());
	}
}
