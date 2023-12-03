package h06.problems;

import h06.world.DirectionVector;
import h06.world.World;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.awt.Point;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * An iterative implementation of a maze solver. The solver uses the left-hand rule to find a path from the start to
 * the end of the maze.
 *
 * @author Nhan Huynh
 */
@DoNotTouch
public class MazeSolverIterative implements MazeSolver {

    /**
     * Constructs an iterative maze solver.
     */
    @DoNotTouch
    public MazeSolverIterative() {
    }

    @StudentImplementationRequired
    @Override
    public DirectionVector nextStep(World world, Point p, DirectionVector d) {
        return crash(); // TODO: H4.1 - remove if implemented
    }

    @StudentImplementationRequired
    @Override
    public int numberOfSteps(World world, Point s, Point e, DirectionVector d) {
        return crash(); // TODO: H4.2 - remove if implemented
    }

    @StudentImplementationRequired
    @Override
    public Point[] solve(World world, Point s, Point e, DirectionVector d) {
        return crash(); // TODO: H4.3 - remove if implemented
    }
}
