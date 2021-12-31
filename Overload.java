public class Overload
{
   void display()
   {
      System.out.println("No parameters");
   }

   // Overload display for one integer parameter.
   void display(int a)
   {
      System.out.println("a: " + a);
   }

   // Overload display for two integer parameters.
   void display(int a, int b)
   {
      System.out.println("a and b: " + a + " " + b);
   }

   // overload display for a double parameter
   void display(double a)
   {
      System.out.println("double a: " + a);
   }
}