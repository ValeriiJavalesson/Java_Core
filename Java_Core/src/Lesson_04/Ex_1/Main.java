package Lesson_04.Ex_1;

public class Main  {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.work();
		CoffeRobot r2 = new CoffeRobot();
		r2.work();
		RobotDancer r3 = new RobotDancer();
		r3.work();
		RobotCoocker r4 = new RobotCoocker();
		r4.work();
		
		Robot [] robots = {r1,r2,r3,r4};
		for(int i = 0; i<robots.length;i++) {
			robots[i].work();
		}
	}
}
