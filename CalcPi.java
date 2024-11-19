public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]); 
        double sum = 0.0; 

        for (int i = 0; i < terms; i++) {
            double term = Math.pow(-1, i) / (2 * i + 1);
            sum += term; 
        }

        double piApproximation = 4 * sum;
        
        System.out.println("Pi according to Java: " + Math.PI);
        System.out.println("Pi, approximated:     " + piApproximation);

    }
}
