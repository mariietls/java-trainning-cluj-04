public class Radio {
    public static void main(String[] args)
    {
        //Song Lauv = new LAUV_WHO();
        Song Lauv = SongFactory.getSong("Lauv");
        Song Astrid = SongFactory.getSong("Astrid");
        Song BTS = SongFactory.getSong("BTS");
        RadioPlaylist radioPlaylist= new RadioPlaylist();
        radioPlaylist.add(Lauv);
        radioPlaylist.add(BTS);
        radioPlaylist.add(Astrid);

        MyIterator iterator=radioPlaylist.iterator();
        while(iterator.hasNext()){
            System.out.println("The radio will be playing "+iterator.next().getName());
        }
    }
}
