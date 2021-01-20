package HRA;
        
import java.util.Random;


public class Cards {
        
        int drawCard(){ 
            
        int value;
        
        Random random = new Random();
        
        value = random.nextInt(21);
System.out.println("value: " + value );

        return value;
        
    
    }
}

   
