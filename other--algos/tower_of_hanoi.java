public class tower_of_hanoi {
   public static void main(String[] args) {
      move(2, "A", "B", "C");
   }

   static void move(int n, String src, String temp, String dest) {
      if (n == 1) {
         System.out.println("Move disc 1 from " + src + " to " + dest);
      } else {
         move(n - 1, src, dest, temp);
         System.out.println("Move disc " + n + " from " + src + " to " + dest);
         move(n - 1, temp, src, dest);
      }
   }
}
