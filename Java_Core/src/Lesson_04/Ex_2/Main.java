package Lesson_04.Ex_2;

public class Main {

	public static void main(String[] args) {
		Animal an1 = new Animal("Леопард", 20, 7);
		System.out.println("Назва тварини = "+an1.getName()+", Швидкість тварини = "+an1.getWeight()+" км/год, Вік тварини = "+an1.getAge()+" років");
		an1.setName("Бик");
		an1.setWeight(2);
		an1.setAge(14);
		System.out.println("Назва тварини = "+an1.getName()+", Швидкість тварини = "+an1.getWeight()+" км/год, Вік тварини = "+an1.getAge()+" років");
	}

}
