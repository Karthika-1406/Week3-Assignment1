package week3.assignment;

public class Automation extends MultipleLanguage implements Language,TestTool{


	public void python() {
		System.out.println("Welcome to Python...!");
		
	}

	
	public void ruby() {
		System.out.println("Welcome to Ruby...!");
		
	}

	public void Java() {
		System.out.println("Welcome to Java...!");
		
	}

	public void Selenium() {
		System.out.println("Welcome to Selenium...!");
		
	}
	
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.python();
		auto.ruby();
		auto.Java();
		auto.Selenium();
		
	}

}
