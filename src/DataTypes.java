import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        int s = 1;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
