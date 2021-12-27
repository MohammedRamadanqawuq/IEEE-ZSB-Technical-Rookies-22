

public class RandomPassword {

    public static void main(String[] args) {
        int length = 10;
        
        String randomPassword = "";
        
        for (int j = 0; j < length - 3; j++) {
          
            randomPassword += randomCharacter();
        }
        randomPassword += (char) (64);
        randomPassword += (char) ((int) (Math.random() * 10) + 48);
        randomPassword += (char) ((int) (Math.random() * 4) + 35);
        System.out.println(randomPassword);
    }

   
    public static char randomCharacter() {
        int rand1 = (int) (Math.random() * 52);    

        if (rand1 <= 25) {
           
            int uppercase = rand1 + 65;
            return (char) (uppercase);
        } else {
            
            int lowercase = rand1 + 71;
            return (char) (lowercase);
        }

      
    }

}
