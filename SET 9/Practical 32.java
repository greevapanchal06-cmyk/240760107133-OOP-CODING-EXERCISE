**AIM**
  /*Write a generic method searchElement that accepts a LinkedList<T> and an element T to search. 
Return true if the element exists, otherwise false.  
● Test with LinkedList<Integer> for roll numbers.  
● Test with LinkedList<String> for names. */

  import java.util.*;

public class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        
        LinkedList<Integer> rollNos = new LinkedList<>();
        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);

        System.out.println("Roll No Found: " + searchElement(rollNos, 102));

       
        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Neha");
        names.add("Amit");

        System.out.println("Name Found: " + searchElement(names, "Neha"));
    }
}
