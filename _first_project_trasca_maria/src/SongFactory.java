public class SongFactory {
    public static Song getSong(String artist){
        if("Lauv".equals(artist)){
            return new LAUV_WHO();
        } else if("Astrid".equals(artist)){
            return new AstridS_FirstOne();
        } else if("BTS".equals(artist)){
            return new BTS_ON();
        }
        return null;
    }
}
