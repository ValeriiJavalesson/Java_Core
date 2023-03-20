package Lesson_04.Ex_1;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.work();
		CoffeRobot r2 = new CoffeRobot();
		r2.work();
		RobotDancer r3 = new RobotDancer();
		r3.work();
		RobotCoocker r4 = new RobotCoocker();
		r4.work();

		System.out.println("Спосіб 1");
		
		Robot[] robots = { r1, r2, r3, r4 };
		for (int i = 0; i < robots.length; i++) {
			robots[i].work();
		}
		
		System.out.println("Спосіб 2");
		
		Robot[] rr1 = new Robot[5];
		rr1[0] = new RobotDancer();
		rr1[1] = new CoffeRobot();
		rr1[2] = new Robot();
		rr1[3] = new RobotDancer();
		rr1[4] = new RobotCoocker();

		for (int i = 0; i < rr1.length; i++) {
			rr1[i].work();
		}
	}
}
