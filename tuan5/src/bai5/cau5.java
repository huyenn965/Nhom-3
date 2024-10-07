package bai5;
import java.util.ArrayList;
import java.util.List;
public class cau5
{   
    public static List<Integer> dayso(int n) {
        List<Integer> so = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
            so.add(i);
        }
        return so;
    }
    public static void in(List<Integer> so) 
    {
        System.out.println("Danh sách các số nguyên:");
        for (int number : so)       
            System.out.println(number);       
    }
    public static void main(String[] args) {
        List<Integer> so = dayso(20);
        in(so);
    }
}
