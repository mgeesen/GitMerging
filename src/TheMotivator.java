public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("Perfect score!");
		else if (score > 80)
			System.out.println("Impressive.");
		else if (score > 70)
			System.out.println("At least you passed.");
		else if (score > 60)
			System.out.println("You can do better.");
		else
			System.out.println("Oops.");
	}
	public static void main(String[] args) {
		TheMotivator motivator = new TheMotivator();
		motivator.feedback(100);
	}
}