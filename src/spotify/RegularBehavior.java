package spotify;

public class RegularBehavior implements UserBehavior{
  private int  playingLimit=5;
  @Override
  public void createPlaylist (String Title, User Owner)throws InvalidOperationException{
      throw new InvalidOperationException("Sorry ,Buy a premium account first.");
  }
  @Override
 public void playMusic (Music music)throws InvalidOperationException{
      if(playingLimit <= 0){
          throw new InvalidOperationException("Sorry,you use all 5 times that you can play music");
      }
      music.play();
      playingLimit--;
  }
  @Override
  public void buyPremium (User owner, int month){

  }


}
