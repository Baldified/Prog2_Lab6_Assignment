import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    static ArrayList<ArrayList<Integer>> query;
    public static Integer checkQuery(int x, int y) {
        return query.get(x).get(y);
    }
}