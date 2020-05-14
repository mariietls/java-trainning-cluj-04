interface Playlist {
    void add(Song s);
    void remove(Song s);
    MyIterator iterator();
}
