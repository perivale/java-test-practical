package automationtest;

public class ForLoop_Q4 {
    //create a methode no return type and with 2 argument
    public void printMyName(String name, int howManyTime) {
        //using for loop and print name
        for (int i = howManyTime; i <=howManyTime ; i++) {
            System.out.println(howManyTime);
            System.out.println(name);
        }
    }
    //create main method
    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("shilpa",10);


    }
}
