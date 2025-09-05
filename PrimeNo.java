public class PrimeNo {
        public static boolean isPrime(int n) {12
        if (n < 2){
        return false;
        }
        for (int i = 2; i * i <= n; i++) {
        if (n % i == 0){
        return false;
        }
        }
        return true;
        }
        /**
         * @param args
         */
        public static void main(String[] args) {
        for (String arg : args) {
        int n = Integer.parseInt(arg);
        if (isPrime(n)) {
        System.out.print(n + " ");
        }
        }
        }   
}
