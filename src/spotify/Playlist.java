package spotify;
import java.util.Collections;
import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playlist = new ArrayList<>();
    private User owner;
    public Playlist (String title ,User owner){
        this.title = title;
        this.owner = owner;
    }
    public  void editTitle(String password, String newTitle ) throws InvalidOperationException{
        if(!owner.getPassword().equals(password)){
            throw new InvalidOperationException("The password is wrong");
        }
        this.title = newTitle;
    }
    public void  addMusic (String password, Music music) throws InvalidOperationException{
        if (!owner.getPassword().equals(password)) {
            throw new InvalidOperationException("The password is wrong");
        }
        if (playlist.contains(music)) {
            throw new InvalidOperationException("This music exists");
        }
        playlist.add(music);
    }
    public void removeMusic(String password, Music music)  throws InvalidOperationException {
        if (!owner.getPassword().equals(password)) {
            throw new InvalidOperationException("The password is wrong");
        }
        if (!playlist.contains(music)) {
            throw new InvalidOperationException("This music does not exist !");
        }
        playlist.remove(music);
    }
    public ArrayList<Music>  searchInPlaylist(String title){
        ArrayList<Music> resultList = new ArrayList<>();
        for (Music music : playlist){
            if(music.getTitle().equals(title)){
                resultList.add(music);
            }
        }
        return  resultList;
    }
    public  Music searchInPlaylist(String title, User singer){
        for (Music music : playlist){
            if(music.getTitle().equals(title) && music.getSinger().equals(singer)){
                return music;
            }
        }
        return null;
    }
    public void playPlaylist(){
        if(playlist.isEmpty()){
            System.out.println("The playlist is empty.");
            return;
        }
        for(Music music :playlist ){
            music.play();
        }
    }

    public void shuffle() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        Collections.shuffle(playlist);
        for (Music music :playlist) {
            music.play();
        }
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public ArrayList<Music> getPlaylist(){
        return playlist;
    }

    public void setPlaylist(ArrayList<Music> playlist){
        this.playlist = playlist;
    }
    public User getOwner(){
        return owner;
    }

    public void setOwner(User Owner){
        this.owner =Owner;
    }
}
