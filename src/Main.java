import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<Integer> al1 = new ArrayList<>();
//        al1.add(1);
//        al1.add(2);
//        al1.add(3);
//        System.out.println("Created: " + al1);
//        System.out.println("Size: " + al1.size());
//        System.out.println("Index 0: " + al1.get(0));
//        al1.set(2, 9);
//        System.out.println("Set index 2 as 9: " + al1);
//        al1.add(0);
//        System.out.println("Added 0: " + al1);
//        al1.add(3,5);
//        System.out.println("Added 5 to index 3: " + al1);
//        al1.remove(0);
//        System.out.println("Removed index 0: " + al1);
//        al1.remove((Integer) 9);
//        System.out.println("Removed first appearance of int 9: " + al1);

//        int[] g1 = new int[]{1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(g1));
//
//        int[][] g2 = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(Arrays.deepToString(g2) + "\n");
//
//        List<Integer> gg1 = new ArrayList(Arrays.asList(g1));


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to enter: ");
        int n = input.nextInt();
        Utils.query = new ArrayList<>(n);

        int n2 = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                int d = input.nextInt();
                Utils.query.add(new ArrayList<>(Arrays.asList(d)));
            }
        }
        int x = input.nextInt();
        int y = input.nextInt();
        Utils.checkQuery(x, y);
    }
}