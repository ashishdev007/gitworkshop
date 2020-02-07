import java.util.*;

public class Points {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> point1 = new ArrayList<>();
        ArrayList<Integer> point2 = new ArrayList<>();

        System.out.println("Point 1:");

        System.out.print("X co-ordinate:");
        point1.add(sc.nextInt());
        System.out.print("Y co-ordinate:");
        point1.add(sc.nextInt());

        System.out.println("Point 2:");
        System.out.print("X co-ordinate:");
        point2.add(sc.nextInt());
        System.out.print("Y co-ordinate:");
        point2.add(sc.nextInt());

        System.out.println(point1);
        System.out.println(point2);

    }
    
    public static String whichSide(ArrayList<Integer> point){
      if(point.get(1) >= 0){
         return "Above";
      }else{
         return "Below";
      }
    }
}