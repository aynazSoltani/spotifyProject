package spotify;

import java.util.ArrayList;

public class Music {
    private String title;
    private User singer;
    private int numberOfStream;
    private static ArrayList<Music> allMusics = new ArrayList<>();

    public Music(String title, User singer) {
        this.title = title;
        this.singer = singer;
        this.numberOfStream = 0;
        allMusics.add(this);
    }

    public void play() {
        numberOfStream++;
        System.out.println("Now playing: " + title + " by " + singer.getUsername());
    }

    public static ArrayList<Music> search(String title) {
        ArrayList<Music> resultList = new ArrayList<>();
        for (Music music : allMusics) {
            if (music.getTitle().equals(title)) {
                resultList.add(music);
            }
        }
        return resultList;
    }
public  static Music search(String title,User singer){
        for(Music music : Music.allMusics){
            if(music.getTitle().equals(title) && music.getSinger().equals(singer)){
                return music;
            }
        }
    return null;
}
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public User getSinger(){
    return singer;
}

    public void setSinger(User singer){
        this.singer = singer;
    }

    public int getNumberOfStream(){
    return numberOfStream;
}

    public void setNumberOfStream(int numberOfStream){
        this.numberOfStream = numberOfStream;
    }

    public static ArrayList<Music> getAllMusics(){
        return allMusics;
    }
}
