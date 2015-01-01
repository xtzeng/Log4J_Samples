
public class MainTest {

	public static void main(String[] args) {
		int d = (int) (Math.random()*1000000000);
		int temp = (int) Math.round(Math.random() * 1000000000) % 1000000;   
		System.out.println("random============" + Math.random() * 1000000000);
		System.out.println("round============" + Math.round(Math.random() * 1000000000));
		System.out.println("temp============="+ temp);
	}
}
