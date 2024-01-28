package h11;

import org.jetbrains.annotations.Nullable;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A {@link Warehouse} manages a list of {@link Product}s and provides methods to query information about them.
 * It also contains a maximum capacity, which it can hold and a current capacity, which specifies how many {@link Product}s
 * are in the {@link Warehouse} currently
 */
public class Warehouse {

    @DoNotTouch
    public List<Product> products = new ArrayList<>();
    @DoNotTouch
    private int maxCapacity = 100;
    @DoNotTouch
    private int currentCapacity = 0;

    @DoNotTouch
    public Warehouse(List<Product> products) {
        this.products = products;
    }


    @StudentImplementationRequired
    public double getPrice(@Nullable Product prod) {
        // TODO H2.1
        return crash();
    }

    @DoNotTouch
    public List<Product> getProducts() {
        return this.products;
    }

    @StudentImplementationRequired
    public List<Product> getProducts(Predicate<? super Product> predicate) {
        // TODO H2.2
        return crash();
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    @DoNotTouch
    public int getCurrentCapacity() {
        return currentCapacity;
    }

    @DoNotTouch
    public int getMaxCapacity() {
        return maxCapacity;
    }

    @DoNotTouch
    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @StudentImplementationRequired
    public long getTotalQuantityOfProduct(Product product) {
        // TODO H2.2
        return crash();
    }

    @StudentImplementationRequired
    public double getTotalPrice() {
        // TODO H2.3
        return crash();
    }

    @StudentImplementationRequired
    public void addProducts(Product product, int numberOfProducts) {
        // TODO H2.5
        crash();
    }

    @StudentImplementationRequired
    public Stream<Product> generateProducts(ProductType typ, double price, String name) {
        // TODO H2.4
        return crash();
    }
}
