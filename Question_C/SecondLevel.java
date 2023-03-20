public class SeondLevel implements Level{
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
		totalPoints = totalPoints + 2 * newPoints;
		if (totalPoints > 20) { // move to level 3
			ThirdLevel third = new ThirdLevel(game);
			game.setTotalNumber(totalPoints + 2);
		}
	}
}