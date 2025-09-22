

class FindFactorial {
    public static void main(String args[]) {
        int testNum = 5;

        int testNumsFactorial = factorialize(testNum);

        System.out.print(testNumsFactorial + " is the factorial of " + testNum);
    }

    public static int factorialize(int testNum) {
        if (testNum <= 1) {
            return 1; 
        }

        return testNum * factorialize(testNum - 1);
    }
}