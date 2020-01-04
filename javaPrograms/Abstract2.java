package javaPrograms;

class Abstract2 extends Abstract1 {

	void sound() {
		System.out.println("Barking");
	}

	public static void main(String[] args) {
//		Abstract2 abc = new Abstract2();
		Abstract1 abc=new Abstract2();
		abc.sound();
		abc.display();
	}

}
