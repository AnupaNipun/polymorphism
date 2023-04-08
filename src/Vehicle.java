public class Vehicle {
    void Drive () {
        System.out.println("Drive Speed Limit 100kmph");
    }
}
 class Car extends Vehicle {

     @Override
     void Drive() {
         System.out.println("Drive Speed Limit 150kmph");
     }
 }

 class RunProgramme {
     public static void main(String[] args) {
         Vehicle c = new Car ();
         Vehicle v = new Vehicle();

         c . Drive();
         v . Drive();
     }
 }
