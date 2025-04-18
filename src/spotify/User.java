package spotify;
import java.util.ArrayList;
public class User {
private String username;
private String password;
private ArrayList<User> followerList = new ArrayList<>();
private ArrayList<User> followingList = new ArrayList<>();
private UserBehavior behavior;
private   ArrayList<Playlist> playlists = new ArrayList<>();
private static ArrayList<User> allUsers = new ArrayList<>();

public User(String username ,String password)throws InvalidOperationException{
    for(User user : allUsers) {
        if (user.getUsername().equals(username)) {
            throw new InvalidOperationException("This username is duplicate.");
        }
    }
    if(password.length()<8){
        throw new InvalidOperationException("Password must be at least 8 characters long.");
    }
    this.username = username;
    this.password = password;
    this.followerList = new ArrayList<>();
    this.followingList = new ArrayList<>();
    this.playlists = new ArrayList<>();
    this.behavior = new RegularBehavior();
    allUsers.add(this);
}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername(){
     return username;
    }

    public void setUsername(String username){
    this.username = username;
    }


    public ArrayList<User> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(ArrayList<User> followerList) {
        this.followerList = followerList;
    }

    public ArrayList<User> getFollowingList() {
        return followingList;
    }

    public void setFollowingList(ArrayList<User> followingList) {
        this.followingList = followingList;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public UserBehavior getBehavior(){
        return behavior;
    }
    public void setBehavior(UserBehavior behavior){
        this.behavior = behavior;
    }

    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void follow(User user) {
            this.followingList.add(user);
            user.followingList.add(this);
    }

    public void createPlaylist(String title, User owner) {
        this.behavior.createPlaylist(title, this);
    }

    public void playMusic(Music music) {
        this.behavior.playMusic(music);
    }

    void buyPremium(User owner, int month) {
        this.behavior.buyPremium(this, month);
    }
}