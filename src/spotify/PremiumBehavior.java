package spotify;

import java.lang.management.PlatformLoggingMXBean;
import java.util.SplittableRandom;

public class PremiumBehavior implements UserBehavior{
private int month;
public PremiumBehavior(int month){
    this.month = month;
}
@Override
     public  void createPlaylist (String Title, User Owner){

}
@Override
   public void playMusic (Music music){
    music.play();
}
@Override
public void buyPremium (User owner, int month){
    this.month += month;
}

}
