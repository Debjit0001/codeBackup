public class Paro extends Thread
{
	@Override
	public void run() {
		System.out.println("Child thread initiated");
	}

	public static void main(String[] args) {
		Paro t = new Paro();
		t.start();
	}
}
