package h09.function;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A collection of function usable for rooms.
 */
@SuppressWarnings("Convert2MethodRef")
public class RoomFunctions {

    /**
     * A predicate that returns {@code true} iff the given object is {@code null}.
     */
    public static Predicate IS_NULL_PREDICATE = object -> object == null;

    /**
     * Returns a predicate that returns {@code true} iff the name of the given room starts with the given location prefix.
     *
     * @param locationPrefix the location prefix
     * @return the predicate
     */
    public static Predicate isInArea(char locationPrefix) {
        return crash();
//        return room -> room.name().charAt(0) == locationPrefix;
    }

    /**
     * Returns a predicate that returns {@code true} iff the name of the given room starts with the given location prefix and
     * the number of seats of the room is equal to or higher than the given number of seats.
     *
     * @param locationPrefix the location prefix
     * @param numberOfSeats  the number of seats
     * @return the predicate
     */
    public static Predicate isInAreaAndHasMinimumNumberOfSeats(char locationPrefix, int numberOfSeats) {
        return crash();
//        Predicate isInArea = isInArea(locationPrefix);
//        Predicate hasMinimumNumberOfSeats = room -> room.numberOfSeats() >= numberOfSeats;
//        return isInArea.and(hasMinimumNumberOfSeats);
    }

    /**
     * Returns a function that casts the given object to an object of the given type or
     * {@code null} if the given object is not of the given type.
     *
     * @param type the type
     * @return the function
     */
    @SuppressWarnings("unchecked")
    public static Function toRoomTypeOrNull(Class type) {
        return room -> type.isInstance(room) ? room : null;
    }

    private RoomFunctions() {
    }
}
