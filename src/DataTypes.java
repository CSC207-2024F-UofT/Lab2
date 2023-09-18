import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int i = 0; i < numbers.size(); i ++) {
            s += numbers.get(i);
        }
        return s;
    }
}
