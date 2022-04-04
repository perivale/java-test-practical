package automationtest;



public class IfThenElse_Q3 {
    //create method return type with 1 argument
    public boolean isTeen(int age) {
      //by using if and else
        if (age <= 18) {
            return true;
        } else {
            return false;
        }
    }
        //create a main method and call the method
        public static void main(String[] args) {
            IfThenElse_Q3 obj=new IfThenElse_Q3();
            System.out.println(obj.isTeen(15));
            System.out.println(obj.isTeen(25));

        }
}
