package Lesson_05.Ex2;

public class Test {
	int one;
	int two;
	int three;

	Test(int one, int two) {
		this.one = one;
		this.two = two;
	}

	Test(int one, int two, int three) {
		this(one, two);
		this.three = three;
	}
}
