public class cau1 {
        public static void main(String[] args) {
            // Khai báo mảng số nguyên
            int[] numbers = {5, 10, 15, 20, 25};
    
            // Gọi hàm tính tổng và in kết quả
            int sum = calculateSum(numbers);
            System.out.println("Tổng các phần tử trong mảng là: " + sum);
        }
    
        // Hàm tính tổng các phần tử trong mảng
        public static int calculateSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    }
