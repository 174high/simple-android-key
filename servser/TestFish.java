interface Runner
{
  int ID = 1;
  void run ();
}

interface Animal extends Runner
{
  void breathe ();
}


class Fish implements Animal
{

public void run ()
{
   System.out.println("fish is swimming");
}

public void breathe ()
{
   System.out.println("fish is bubbing");   
}
}

abstract class LandAnimal implements Animal
{
  public void breather ()
{
   System.out.println("LandAnimal is breathing");
}
}


abstract class Student implements  Runner
{
   public void run ()
    {
         System.out.println("the student is running");
    }
}

interface Flyer
{
  void fly ();
}

class Bird implements Runner , Flyer
{
  public void run ()
   {
       System.out.println("the bird is running");
   }
  public void fly ()
   {
       System.out.println("the bird is flying");
   }
}

class TestFish
{
  public static void main (String args[])
   {
      Fish f = new Fish();
      f.run();    

   }
}