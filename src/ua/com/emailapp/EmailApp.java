package ua.com.emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em = new Email("John", "Smith");
		
		em.setAlternateEmail("ivan.novak@gmail.com");
		System.out.println(em.getAlternateEmail());
		
	}

}
