**AIM**
  /*Write a Java program to simulate a Music Playlist using LinkedList<String>. Perform the 
following operations:  
1. Add songs to the playlist.  
2. Display the full playlist. 
3. Play the first song (remove from front).  
4. Skip the last song (remove from end).  
5. Display the updated playlist after each operation. */

  import java.util.*;

public class Playlist {
    public static void main(String[] args) {

        LinkedList<String> songs = new LinkedList<>();

       
        songs.add("Song1");
        songs.add("Song2");
        songs.add("Song3");
        songs.add("Song4");

        System.out.println("Playlist: " + songs);

       
        System.out.println("Playing: " + songs.removeFirst());
        System.out.println("After playing first: " + songs);

       
        System.out.println("Skipped: " + songs.removeLast());
        System.out.println("After skipping last: " + songs);
    }
}
