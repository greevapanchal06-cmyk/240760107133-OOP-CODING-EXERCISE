**AIM**
  /*Write a Java program that uses an ArrayList<Integer> to store marks of students. Perform the 
following operations:  
● Add at least 5 marks.  
● Display all marks.  
● Find and display the highest and lowest marks using Collections.max() and Collections.min(). */

  import java.util.*;

public class MarksList {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(90);
        marks.add(66);
        marks.add(88);

        
        System.out.println("Marks: " + marks);

       
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
