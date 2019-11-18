
package enhanced_for_loop;

import java.util.ArrayList;


public class Enhanced_for_loop {

    public static void main(String[] args) {
       ArrayList things=new ArrayList();
       things.add("Aminul");
       things.add (83);
       things.add (39.89);
       things.add (83.57);
       things.add ("aminulit@gmail.com");
       
       for(Object s :things){
           System.out.println(s);
           
       }
       ArrayList<String> s=new ArrayList<String>();
       s.add("Dhaka");
       s.add(" Borishal");
       s.add(" Comilla");
       s.add(1,"Chittagong");
       s.add(" Rajshai");
       s.contains("dha");
       for(String s1:s){
           System.out.println(s1);
       }
       
       
      
       
       
       
       
    }
    
}
