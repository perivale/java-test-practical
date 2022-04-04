package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    //create main method
    public static void main(String[] args) {
        //arraylist syntax
        ArrayList<String> value = new ArrayList();
        value.add("Scrum");
        value.add("Java");
        value.add("Jira");
        value.add("Selenium");
        value.add("Cucumber");
        value.add("Postman");
        value.add("Rest Assured");
        //print valur using with foreach loop
        for(String value1:value){
            System.out.println(value1);//print all String type name

        }
    }
}