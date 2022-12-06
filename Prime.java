import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
        System.out.print("Nhập số 20: ");
        int numb = inputNumber();

        System.out.println("20 so nguyen to dau tien: ");
        print20PrimeNumber(numb);

        System.out.println("\nSo nguyen to nhỏ hơn 100: ");
        print100SNT(100);

    }

    public static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    //In 20 số nguyên tố
    public static void print20PrimeNumber(int n) {
        
        int count = 0;
        for(int i = 0; count < n; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    //In ra số nguyên tố nhỏ hơn 100
    public static void print100SNT(int n) {
        for(int i = 0; i < n; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}