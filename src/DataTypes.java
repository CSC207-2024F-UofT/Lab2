import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        // Error fix was changing s datatype from int to long
        long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
