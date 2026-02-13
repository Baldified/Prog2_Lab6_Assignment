import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines you want to enter: ");
        int n = input.nextInt();
        Utils.query = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            Utils.matrix = new Integer[d];
            for (int j = 0; j < d; j++) {
                int d1 = input.nextInt();
                Utils.matrix[j] = d1;
            }
            ArrayList<Integer> row = new ArrayList(Arrays.asList(Utils.matrix));
            Utils.query.add(row);
        }
        System.out.println(Utils.query);
        int check = input.nextInt();
        for (int i = 0; i < check; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            Utils.checkQuery(x, y);
        }
    }
}