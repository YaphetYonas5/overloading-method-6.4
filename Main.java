public class Main
{
   public static void main(String[] args)
   {
      Overload ref = new Overload();

      // call all versions of display()
      ref.display();
      ref.display(100);
      ref.display(100, 200);
      ref.display(100.25);
   }
}