public class Song{
     private String name;
     private String artist;
     private String genre;

     public Song(String name, String artist, String genre) {
          this.name = name;
          this.artist = artist;
          this.genre = genre;
     }
     String getName() {
          return this.name;}

     String getArtist() {
          return this.artist;
     }
     String getGenre(){
          return this.genre;
     }

}