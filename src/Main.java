import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String txt = "Immigrant aworkeras face wage theft and unsafe conditions as they rebuild Florida";
        System.out.println("The string is: " + txt);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character want to count: ");
        char c = scanner.next().charAt(0); // ??? khai báo 1 char
        ArrayList<Integer> arrayIndex = new ArrayList<Integer>(); // sử dụng arraylist để có thể thêm gtrị khi chưa bik size array
        int count = 0;
        for (int i = 0 ; i < txt.length() ; i++) {
            if (c == txt.charAt(i)) {
                arrayIndex.add(i);
                count++;
            }
        }
        System.out.println("The character '" + c + "' occurrence " + count + " time");
        System.out.print("The position: ");
        for (int a : arrayIndex) {
            System.out.print("\t" + a);
        }
    }
}

//gtri mặc định của các phẩn từ trong mảng khi ta khai báo 1 mảng như sau: int [] array = new int [4]; nó sẽ ra 4 số 0??? ko phải là null sao???