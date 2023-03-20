package ceilingfan.with.state;

public class Game {
	private Level level;
	private int totalNumber;

	public Level getLevel() {
		return level;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public void setLevel(Level state) {
		this.level = level;
	}

	public void play() {
	      level.play();
	}



}
