public class Album {
    private int id;
    private String songTitle;
    private String songArtist;

    public Album(int id, String songTitle, String songArtist) {
        this.id = id;
        this.songTitle = songTitle;
        this.songArtist = songArtist;
    }

    public int getId(){
        return id;
    }

    public String getSongTitle(){
        return songTitle;
    }

    public String getSongArtist(){
        return songArtist;
    }
}

