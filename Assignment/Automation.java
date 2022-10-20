package week3.day2.Assignment;

public class Automation  {
	public static void main(String[] args) {
		MultiLanguage ML= new MultiLanguage();
		ML.python();
		ML.Ruby();
		ML.Selenium();
		ML.Java();
		ML.JavaScript();
		
		System.out.println("******Calling Interface of Language******");
		Language L = new MultiLanguage();
		L.Java();
		L.JavaScript();
		L.Ruby();
		
		System.out.println("******Calling Interface of TestTool******");
		TestTool TT= new MultiLanguage();
		TT.Selenium();
		
		}
		
	}

	


