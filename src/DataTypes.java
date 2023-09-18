import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(sum(a));


    }
}
