package h11;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;
import static org.tudalgo.algoutils.student.Student.crash;
import java.util.List;

/**
 * A {@link Department} manages a list of {@link Employee}s and provides methods to query information about them.
 *
 * @param employees The employees of this department.
 */
public record Department(@DoNotTouch List<Employee> employees) {

    /**
     * Returns the employees of this department.
     *
     * @return the employees
     */
    @Override
    public List<Employee> employees() {
        return this.employees;
    }

    @StudentImplementationRequired
    public List<Position> getListOfPositionsInDepartment() {
        // TODO H1.1
        return crash();
    }

    @StudentImplementationRequired
    public List<Employee> filterEmployeeByPosition(Position position) {
        // TODO H1.2
        return crash();
    }

    @StudentImplementationRequired
    public long getNumberOfEmployeesBySalary(double salary) {
        // TODO H1.3
        return crash();
    }

    @StudentImplementationRequired
    public void adjustSalary(double amount, boolean increase) {
        // TODO H1.4
        crash();
    }
}
