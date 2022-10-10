import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static ArrayList<Integer> arrayIndex = new ArrayList<>();
    public static void main(String[] args) {
        String txt = "Immigrant workers face wage theft and unsafe conditions as they rebuild Florida";
        System.out.println("The string is: " + txt);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character want to count: ");
//      char c = (char) scanner.nextInt();
//      System.out.print("C:" + c);
        char c = scanner.next().charAt(0);
        searchCharacter(c,txt);
        System.out.println("The character '" + c + "' occurrence " + count + " time");
        System.out.print("The position: ");
        for (int a : arrayIndex) {
            System.out.print("\t" + a);
        }
    }
    public static void searchCharacter(char c, String txt) {
        for (int i = 0; i < txt.length(); i++) {
            if (c == txt.charAt(i)) {
                arrayIndex.add(i);
                count++;
            }
        }
    }
}

//gtri mặc định của các phẩn từ trong mảng khi ta khai báo 1 mảng như sau: int [] array = new int [4]; nó sẽ ra 4 số 0??? ko phải là null sao???