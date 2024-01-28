package h11;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.util.List;
import java.util.function.Predicate;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A {@link Company} manages a list of {@link Department}s and a list of {@link Warehouse}s and provides
 * methods to query information about them.
 *
 * @param departments The departments of this company.
 * @param warehouses  The warehouses of this company.
 */
public record Company(@DoNotTouch List<Department> departments, @DoNotTouch List<Warehouse> warehouses) {

    /**
     * Creates a new {@link Company} with the given departments and warehouses.
     *
     * @param departments the departments
     * @param warehouses  the warehouses
     */
    @DoNotTouch
    public Company {
    }

    @StudentImplementationRequired
    public List<Employee> getListOfAllEmployee() {
        // TODO H3.1
        return crash();
    }

    @StudentImplementationRequired
    public long getQuantityOfProduct(Product product) {
        // TODO H3.2
        return crash();
    }

    @StudentImplementationRequired
    public List<String> getFilteredProductNames(List<Predicate<Product>> predicates) {
        // TODO H3.3
        return crash();
    }

    @StudentImplementationRequired
    public List<Product> priceRange(double low, double high) {
        // TODO H3.4
        return crash();
    }

    @StudentImplementationRequired
    public List<String> getEmployeesSortedByName() {
        // TODO H3.5
        return crash();
    }

    @StudentImplementationRequired
    public List<String> getAllProductsByType(ProductType type, int numberOfProducts) {
        // TODO H3.6
        return crash();
    }

    @Override
    public List<Department> departments() {
        return departments;
    }

    @Override
    public List<Warehouse> warehouses() {
        return warehouses;
    }
}
