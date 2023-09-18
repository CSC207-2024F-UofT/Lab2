import java.util.List;

public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static <T extends Number> long sum(List<T> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (T x : numbers) {
            s += x.longValue();
        }
        return s;
    }
}
