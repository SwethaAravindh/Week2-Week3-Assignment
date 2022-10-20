package week3.day1.classroom;

public class LearnOverLoading {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	public void add(float a) {
		System.out.println(a);
	}
	public void add(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		LearnOverLoading a= new LearnOverLoading();
		a.add(2.2564F);		
		a.add(2);
		a.add(532.687F, 456.123F);
		a.add(3, 4);
		a.add(1, 2, 3);
	}

}
