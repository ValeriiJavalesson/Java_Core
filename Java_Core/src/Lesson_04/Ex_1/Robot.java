package Lesson_04.Ex_1;

public class Robot {
	
	private String voice = " – я просто працюю";	 

	public void work() {
		System.out.println("Я Robot" + voice);
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
}
