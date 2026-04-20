**AIM**
  /*Write a Java program that demonstrates method overloading to calculate the volume of different 
3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side 
length), a RectangularCube (takes length, width, height), and a Sphere (takes radius). */

  class VolumeCalculator {

   
    double calculateVolume(double side) {
        return side * side * side;
    }

    
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

 
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class TestVolume {
    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Volume of Cube = " + v.calculateVolume(3));
        System.out.println("Volume of Rectangular Cube = " + v.calculateVolume(4, 5, 6));
        System.out.println("Volume of Sphere = " + v.calculateVolume(3.0f));
    }
}
