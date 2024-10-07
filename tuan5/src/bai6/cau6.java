package bai6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cau6 {
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần thêm: ");
        int numberToAdd = scanner.nextInt();
        System.out.print("Nhập vị trí (0 để thêm vào đầu): ");
        int positionToAdd = scanner.nextInt();
        addNumberAtPosition(numbers, numberToAdd, positionToAdd);
        System.out.println("Danh sách sau khi thêm:");
        printNumberList(numbers);
        System.out.print("Nhập vị trí để xóa (0 đến " + (numbers.size() - 1) + "): ");
        int positionToRemove = scanner.nextInt();
        removeNumberAtPosition(numbers, positionToRemove);
        System.out.println("Danh sách sau khi xóa:");
        printNumberList(numbers);
        scanner.close();
    }
    public static void addNumberAtPosition(List<Integer> numbers, int number, int position) 
    {
        if (position < 0 || position > numbers.size()) 
        {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        numbers.add(position, number);
    }
    public static void removeNumberAtPosition(List<Integer> numbers, int position) 
    {
        if (position < 0 || position >= numbers.size()) 
        {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        numbers.remove(position);
    }
    public static void printNumberList(List<Integer> numbers) 
    {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

