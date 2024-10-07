import java.util.ArrayList;
import java.util.Scanner;

public class cau6_tuan5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("Danh sách vị trí ban đầu: " + list);

        char choice;
        do {
            System.out.println("Nhập giá trị cần thêm: ");
            int value = sc.nextInt();
            System.out.println("Nhập vị trí cần thêm: ");
            int index = sc.nextInt();
            
            if(index >= 0 && index <= list.size()) {
                list.add(index, value);
                System.out.println("Danh sách sau khi thêm giá trị: " + list);
            } else {
                System.out.println("Vị trí không hợp lệ. Vui lòng chọn vị trí khác.");
            }

            System.out.println("Bạn muốn tiếp tục thêm phần tử? (Y/N)");
            choice = sc.next().charAt(0);
        } while(choice == 'Y' || choice == 'y');

        System.out.println("Nhập vị trí cần xóa: ");
        int deleteIndex = sc.nextInt();

        if(deleteIndex >= 0 && deleteIndex < list.size()) {
            list.remove(deleteIndex);
            System.out.println("Danh sách sau khi xóa: " + list);
        } else {
            System.out.println("Vị trí không hợp lệ. Không thể xóa phần tử.");
        }

        sc.close();
    }
}