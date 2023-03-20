package ceilingfan.with.state;

public abstract class Level {

   protected final Game game;

   public void play();

   public Level(Game game) {
      this.game = game;
   }

}
