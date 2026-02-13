import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    static ArrayList<ArrayList<Integer>> query;
    static Integer[] matrix;
    public static void checkQuery(int x, int y) {
        if ((x <= query.size() && x >= 0) && (y <= query.get(x).size() && y >= 0))
            System.out.println(query.get(x).get(y));
           else
            System.out.println("ERROR!");
    }
}