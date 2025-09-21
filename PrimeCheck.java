public class PrimeCheck {
    public static void main(String[] args) {
        int num = 8;
        if (isPrime(num)) {
            System.out.print(num + " is a prime number.");
        } else {
            System.out.print(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
