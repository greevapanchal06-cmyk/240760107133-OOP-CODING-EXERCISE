**AIM**
  /*Given an interface Classify with a method String getDivision(double average). Implement this 
getDivision method in a class Result such that it returns "First Division" if the average is 60 or 
more. */

  interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

public class Test16 {
    public static void main(String[] args) {

        Result r = new Result();

        System.out.println("Division = " + r.getDivision(65));
    }
}
