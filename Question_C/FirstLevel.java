package ceilingfan.with.state;;

public class FirstLevel implements Level{
	int totalNumber;

	public FirstLevel(Game game) {
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
			totalPoints = totalPoints + newPoints;
			if (totalPoints > 10) { // move to level 2
				SecondLevel second = new SecondLevel(game);
				game.setTotalNumber(totalPoints + 1);
			}
		}
	}
