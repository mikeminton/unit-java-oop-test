public class Main {
    public static void main(String[] args) {
      // This is a comment
      System.out.println("Hey Motha Fuckers!");
      System.out.print("I am learning Java.");
      System.out.print(" It might be awesome!");
      System.out.println(); 
      System.out.println(3);
      /* The code below will print the words and numbers
      to the screen, and it is amazing */
      System.out.println(358);
      System.out.println(50000);
      System.out.println(3 + 3);
      System.out.println(2 * 5);  // This is also a comment

      String name = "John";
      System.out.println(name);

      int myNum = 15;
      System.out.println(myNum);

      int myNum0;
      myNum0= 17;
      System.out.println(myNum0);

      int myNum1 = 15;
      myNum1 = 20;  // myNum is now 20
      System.out.println(myNum1);
      int     myNum2     = 5;
      float   myFloatNum = 5.99f;
      char    myLetter   = 'D';
      boolean myBool     = true;
      String  myText     = "Hello";
      // compiler error above as the variables are not used
      
      String firstName = "John ";
      String lastName  = "Doe";
      String fullName  = firstName + lastName;
      System.out.println(fullName);

      int x = 5;
      int y = 6;
      int z = 50;
      System.out.println(x + y + z);

      int xa = 5, ya = 6, za = 50;
      System.out.println(xa + ya + za);

      int xb, yb, zb;
      xb = yb = zb = 50;
      System.out.println(xb + yb + zb);

      // Good
      int minutesPerHour = 60;

      // OK, but not so easy to understand what m actually is
      int m = 60;

      // Student data
      String studentName = "John Doe";
      int studentID = 15;
      int studentAge = 23;
      float studentFee = 75.25f;
      char studentGrade = 'B';

      // Print variables
      System.out.println("Student name: " + studentName);
      System.out.println("Student id: " + studentID);
      System.out.println("Student age: " + studentAge);
      System.out.println("Student fee: " + studentFee);
      System.out.println("Student grade: " + studentGrade);

        // Create integer variables
      int length = 4;
      int width  = 6;
      int area;

      // Calculate the area of a rectangle
      area = length * width;

      // Print variables
      System.out.println("Length is: " + length);
      System.out.println("Width is: " + width);
      System.out.println("Area of the rectangle is: " + area);

      



    }
  }