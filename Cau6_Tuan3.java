import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = sc.nextInt();
        
        if(isPalindrome(number)) {
            System.out.println(number + " là số đối xứng.");
        } else {
            System.out.println(number + " không phải là số đối xứng.");
        }
        
        sc.close();
    }
    
    // Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        
        while(number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        
        return originalNumber == reverseNumber;
    }
}