package automationtest;

public class Variable_Q2 {
    //instance variable/global variable
    int id;
    String name;
    //constructor with 2 argument and a sing the value
    Variable_Q2(int id,String name){
        this.id=id;
        this.name=name;
    }//no return type method with 0 argument
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
    //create main method
    public static void main(String[] args) {
        Variable_Q2 obj1=new Variable_Q2(101, "shilpa");
        obj1.display();
        Variable_Q2 obj2=new Variable_Q2(102,"prime");
        obj2.display();
    }
}


