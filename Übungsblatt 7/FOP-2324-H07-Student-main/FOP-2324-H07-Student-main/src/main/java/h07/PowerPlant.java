package h07;

import java.util.Random;

/**
 * Represents a simulated power plant.
 */
public class PowerPlant {

    /**
     * The log used by the power plant.
     */
    final Log log;

    /**
     * The random generator used by the power plant.
     */
    final Random random;

    /**
     * The reactors of the power plant.
     */

    final Reactor[] reactors;

    /**
     * Create a new power plant.
     *
     * @param log           the log to use
     * @param random        random generator to use
     * @param numOfReactors the number of reactors in the power plant
     */
    public PowerPlant(Log log, Random random, int numOfReactors){
        this.log = log;
        this.random = random;

        reactors = new Reactor[numOfReactors];
        for(int i = 0; i < numOfReactors; i++){
            reactors[i] = Reactor.generate(i, random);
        }

    }

    /**
     * Create a new power plant.
     *
     * @param log           the log to use
     * @param numOfReactors the number of reactors in the power plant
     */
    public PowerPlant(Log log, int numOfReactors){
        this(log, new Random(), numOfReactors);
    }

    /**
     * Checks the state of the power plant and logs it.
     *
     * @param t the time variable
     */
    public void check(double t){
        // TODO H5
    }

}
