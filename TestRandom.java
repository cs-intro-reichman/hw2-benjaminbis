public class TestRandom {

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int greater = 0;
        int less = 0;
        int i = 0;
        while (i<count) {
            double randomValue = Math.random();
            if (randomValue <= 0.5) {
                less++; 
            }
            else {
                greater++;
            }
            i++;
            
        } 
        double ratio = (double) greater/less;

        System.out.println("> 0.5: " + greater + " times");
        System.out.println("<= 0.5: " + less + " times");   
        System.out.println("ratio: " + ratio);       
        }
    }
