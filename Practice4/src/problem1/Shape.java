package problem1;

public abstract class Shape { 
	  
	 int pos; 
	 Color color; 
	 public Shape() { 
	   
	 } 
	 public Shape(int pos, Color color) { 
	  this.pos = pos; 
	  this.color = color; 
	 } 
	  
	 public  void draw() { 
	  System.out.println(" ".repeat(pos)); 
	 }; 
	 public String toString() { 
	  return pos + " " + color; 
	 } 
	 
	}