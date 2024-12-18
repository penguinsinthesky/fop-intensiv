package intensiv.i10;

import java.util.concurrent.ThreadLocalRandom;

public class GenericOperations {

    /**
     * Generates a pseudo-random number between 0 (inclusive) and exclusiveBound (exclusive).
     *
     * @param exclusiveBound the exclusive upper bound of the number to be generated
     * @return a pseudo-random number in [0, exclusiveBound)
     */
    private static int getRandom(int exclusiveBound) {
        return ThreadLocalRandom.current().nextInt(exclusiveBound);
    }

}
