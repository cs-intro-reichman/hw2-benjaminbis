public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]); 
        double sum = 0.0; 

        for (int i = 0; i < terms; i++) {
            (-1)^i / (2i + 1)
            double term = Math.pow(-1, i) / (2 * i + 1);
            sum += term; 
        }

        double piApproximation = 4 * sum;

        System.out.println("pi according to Java:" + piApproximation);
        System.out.println("pi, approximated:" + Math.PI);
    }
}
