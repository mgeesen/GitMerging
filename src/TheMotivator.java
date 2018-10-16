public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("Perfect score!");
		else if (score > 90)
			System.out.println("Impressive.");
		else if (score > 60)
			System.out.println("At least you passed.");
		else
			System.out.println("Oops.");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}