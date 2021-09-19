package Score;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Property Myproperty = new Property();
        Listener1 obj1 = new Listener1();
        Listener2 obj2 = new Listener2();            
        Myproperty.addPropertyChangeListener(obj1); 
        Myproperty.addPropertyChangeListener(obj2);  
                               
        while(true){
            System.out.print("Enter Score: ");
            String str = input.nextLine();
            if(!str.isEmpty()){
                Myproperty.setScore(str);
            }else return;
        } 
    
    }
}