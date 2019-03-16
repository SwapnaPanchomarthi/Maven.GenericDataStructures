package MapFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {
    public static ArrayList map(ArrayList a, Function<Integer, Object> function)
    {
        return (ArrayList)a.stream().map(function).collect(Collectors.toList());
    }

}
