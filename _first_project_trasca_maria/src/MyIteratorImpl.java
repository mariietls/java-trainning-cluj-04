import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private List<Song> songList;
    private int position=0;
    public MyIteratorImpl(List<Song> songList){
        this.songList=songList;
    }
    @Override
    public boolean hasNext() {
        return (position<songList.size());
    }

    @Override
    public Song next() {
        return songList.get(position++);
    }
}
