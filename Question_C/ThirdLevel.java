public class ThirdLevel implements Level{
	int totalNumber;

	public SecondLevel(Game game) {
		super(game);
		this.totalNumber = game.getTotalNumber();
		System.out.println( "first level" );
	}

	public void play(){
		Random random = new Random();
		addPoints(random.nextInt(7));
		System.out.println("points="+totalNumber+" level="+level);
	}

	public void addPoints(int newPoints) {
		totalPoints = totalPoints + 3 * newPoints;
		game.setTotalNumber(totalPoints);

	}
}
