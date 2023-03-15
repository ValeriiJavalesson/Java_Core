package Lesson_01;

public class Lesson_01 {

	public static void main(String[] args) {
		
		System.out.println("Exercise 1");
		
		byte a = 1;
		short b = 10;
		int c = 13600;
		long d = 165964;
		boolean e = true;
		char f = 'f';
		float g = 13.566f;
		double h = 654.566868465464;
		System.out.println("byte = "+a);
		System.out.println("short = "+b);
		System.out.println("int = "+c);
		System.out.println("long = "+d);
		System.out.println("boolean = "+e);
		System.out.println("char = "+f);
		System.out.println("float = "+g);
		System.out.println("double = "+h);
		System.out.println("");
		
		
		System.out.println("Exercise 2");
		System.out.println("");
		System.out.print("Byte = " + Byte.MAX_VALUE);
		System.out.println("..." + Byte.MIN_VALUE);
		System.out.print("Short = " + Short.MAX_VALUE);
		System.out.println("..." + Short.MIN_VALUE);
		System.out.print("Integer = " + Integer.MAX_VALUE);
		System.out.println("..." + Integer.MIN_VALUE);
		System.out.print("Long = " + Long.MAX_VALUE);
		System.out.println("..." + Long.MIN_VALUE);
		System.out.print("Boolean = " + Boolean.FALSE);
		System.out.println(" and " + Boolean.TRUE);
		System.out.print("Character = " + (int) Character.MIN_VALUE);
		System.out.println("..." + (int) Character.MAX_VALUE);
		System.out.print("Float = " + Float.MAX_VALUE);
		System.out.println("..." + Float.MIN_VALUE);
		System.out.print("Double = " + Double.MAX_VALUE);
		System.out.println("..." + Double.MIN_VALUE);
		System.out.println("");
		
		System.out.println("Exercise 3");
		System.out.println("");
		int [] ar = {-1111,2,5,95,663,784,45,-65,11,-78};
		int minValue = ar[0], maxValue=ar[0];
		
		for (int i=0; i<ar.length; i++) {
			if (minValue>ar[i]) minValue = ar[i];
			if (maxValue<ar[i]) maxValue = ar[i];
		}
		
		System.out.println("array length = "+ar.length);
		System.out.println("min value of array = "+minValue);
		System.out.println("max value of array = "+maxValue);
	}

}
