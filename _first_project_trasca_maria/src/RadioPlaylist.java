import java.util.ArrayList;
import java.util.List;

public class RadioPlaylist implements Playlist {
    private List<Song> songList;
    public RadioPlaylist(){ songList=new ArrayList<>();}
    public void add(Song s){this.songList.add(s);}
    public void remove(Song s){this.songList.remove(s);}
    @Override public MyIterator iterator(){
    return new MyIteratorImpl(this.songList);}
}
