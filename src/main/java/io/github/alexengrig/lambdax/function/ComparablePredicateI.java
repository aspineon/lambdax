package io.github.alexengrig.lambdax.function;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * <p>This interface describes the useful predicate with the comparable result of the mapper.</p>
 *
 * @param <T> the type of the input to the predicate
 * @param <R> the type of the mapper comparable result
 * @author Grig Alex
 * @version 0.2.0
 * @see java.lang.Comparable
 * @see java.util.Comparator
 * @see java.util.function.Predicate
 * @see io.github.alexengrig.lambdax.function.PredicateI
 * @since 0.2.0
 */
/* package */interface ComparablePredicateI<T, R extends Comparable<R>> extends PredicateI<T, R> {
    /**
     * <p>
     * Returns the {@link java.util.function.Predicate} that checks if the input object is less than the other object.
     * </p>
     *
     * @param other an object for compare
     * @return The {@link java.util.function.Predicate} with compare
     * @since 0.2.0
     */
    default Predicate<T> less(R other) {
        return less(other, Comparator.comparing(other::compareTo));
    }

    /**
     * <p>
     * Returns the {@link java.util.function.Predicate} that checks if the input object is greater than the other object.
     * </p>
     *
     * @param other an object for compare
     * @return The {@link java.util.function.Predicate} with compare
     * @since 0.2.0
     */
    default Predicate<T> greater(R other) {
        return greater(other, Comparator.comparing(other::compareTo));
    }

    /**
     * <p>
     * Returns the {@link java.util.function.Predicate} that checks if the input object is less than or
     * equal to the other object.
     * </p>
     *
     * @param other an object for compare
     * @return The {@link java.util.function.Predicate} with compare
     * @since 0.2.0
     */
    default Predicate<T> lessOrEqual(R other) {
        return lessOrEqual(other, Comparator.comparing(other::compareTo));
    }

    /**
     * <p>
     * Returns the {@link java.util.function.Predicate} that checks if the input object is greater than or
     * equal to the other object.
     * </p>
     *
     * @param other an object for compare
     * @return The {@link java.util.function.Predicate} with compare
     * @since 0.2.0
     */
    default Predicate<T> greaterOrEqual(R other) {
        return greaterOrEqual(other, Comparator.comparing(other::compareTo));
    }
}
