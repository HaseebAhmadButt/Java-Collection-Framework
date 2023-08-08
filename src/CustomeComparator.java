import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/*
The CustomComparator class implements the Comparator<Integer> interface, which allows comparing objects of the Integer class or its subclasses. It provides various methods to define the comparison logic between integers.

compare(Integer o1, Integer o2) method:

This method compares two integers and returns an integer value indicating their order.
In this example, it simply subtracts o1 from o2 to produce the reverse ordering.
reversed() method:

This method returns a comparator that imposes the reverse ordering of this comparator.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparing(Comparator<? super Integer> other) method:

This method returns a composite comparator that performs a secondary comparison when two objects are considered equal by the previous comparator.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparing(Function<? super Integer, extends U> keyExtractor, Comparator<? super U> keyComparator) method:

This method returns a composite comparator that performs a subsequent comparison based on the extracted key using the provided key extractor and key comparator.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparing(Function<? super Integer, extends U> keyExtractor) method:

This method returns a composite comparator that performs a subsequent comparison based on the extracted key using the provided key extractor.
The extracted key must implement the Comparable interface.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparingInt(ToIntFunction<? super Integer> keyExtractor) method:

This method returns a composite comparator that performs a subsequent comparison based on the extracted int key using the provided key extractor.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparingLong(ToLongFunction<? super Integer> keyExtractor) method:

This method returns a composite comparator that performs a subsequent comparison based on the extracted long key using the provided key extractor.
In this example, it uses the default implementation provided by the Comparator interface.
thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) method:

This method returns a composite comparator that performs a subsequent comparison based on the extracted double key using the provided key extractor.
In this example, it uses the default implementation provided by the Comparator interface.
By implementing the Comparator interface and providing the necessary methods, the CustomComparator class allows customizing the comparison behavior for integers and provides additional capabilities for chaining comparisons and extracting keys for comparison.
 */

public class CustomeComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

    /**
     * Returns a comparator that imposes the reverse ordering of this comparator.
     * It reverses the order of sorting.
     *
     * @return the reversed comparator
     */
    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }

    /**
     * Returns a composite comparator that performs a secondary comparison
     * when this comparator compares two objects as equal.
     *
     * @param other the other comparator to be used in addition to this comparator
     * @return a composite comparator that performs a subsequent comparison
     */
    @Override
    public Comparator<Integer> thenComparing(Comparator<? super Integer> other) {
        return Comparator.super.thenComparing(other);
    }

    /**
     * Returns a composite comparator that performs a subsequent comparison
     * based on the extracted key using the provided key extractor and key comparator.
     *
     * @param keyExtractor  the function used to extract the key for comparison
     * @param keyComparator the comparator used to compare the extracted keys
     * @param <U>           the type of the extracted key
     * @return a composite comparator that performs a subsequent comparison
     * based on the extracted key
     */
    @Override
    public <U> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    /**
     * Returns a composite comparator that performs a subsequent comparison
     * based on the extracted key using the provided key extractor.
     * The extracted key must implement the Comparable interface.
     *
     * @param keyExtractor the function used to extract the key for comparison
     * @param <U>          the type of the extracted key
     * @return a composite comparator that performs a subsequent comparison
     * based on the extracted key
     */
    @Override
    public <U extends Comparable<? super U>> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    /**
     * Returns a composite comparator that performs a subsequent comparison
     * based on the extracted int key using the provided key extractor.
     *
     * @param keyExtractor the function used to extract the int key for comparison
     * @return a composite comparator that performs a subsequent comparison
     * based on the extracted int key
     */
    @Override
    public Comparator<Integer> thenComparingInt(ToIntFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    /**
     * Returns a composite comparator that performs a subsequent comparison
     * based on the extracted long key using the provided key extractor.
     *
     * @param keyExtractor the function used to extract the long key for comparison
     * @return a composite comparator that performs a subsequent comparison
     * based on the extracted long key
     */
    @Override
    public Comparator<Integer> thenComparingLong(ToLongFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    /**
     * Returns a composite comparator that performs a subsequent comparison
     * based on the extracted double key using the provided key extractor.
     *
     * @param keyExtractor the function used to extract the double key for comparison
     * @return a composite comparator that performs a subsequent comparison
     * based on the extracted double key
     */
    @Override
    public Comparator<Integer> thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
