// Print an HourGlass with loops
import java.util.*;
public class HourGlass{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println(getLine(size - i, size));
        }
        for(int i = 2; i < size + 1; i++){
            System.out.println(getLine(i, size));
        }
    }

    public static String getLine (int lineNumber, int size){
        String data = "+";
        for(int i = 0; i < size - lineNumber; i++){
            data = " " + data;
        }
        for (int i = 0; i < lineNumber; i++){
            data += "--";
        }
        data += "+";
        return data;
    }
}