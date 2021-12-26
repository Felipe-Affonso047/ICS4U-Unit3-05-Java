/*
* This program test vehicle class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-22
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;

    /**
    * Constant.
    */
    public static final int ONE_HUNDRED = 100;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final String NEW_SPEED = "New speed:";

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", FOUR, 200);

        System.out.println("Created Ford focus\nStatus:\n");
        fordFocus.status();

        System.out.println("\nAccelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED + fordFocus.getSpeed());

        System.out.println("\nChanging colour to black:");
        fordFocus.setColour("black");
        System.out.println("New colour:" + fordFocus.getColour());

        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 400);

        System.out.println("Created a Ferrari\nStatus:\n");
        ferrari.status();

        System.out.println("\nAccelerating, 100 of power for 4 sec.");
        ferrari.accelerate(ONE_HUNDRED, FOUR);
        System.out.println(NEW_SPEED + ferrari.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        ferrari.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED + ferrari.getSpeed());

        System.out.println("\nChanging license plate:");
        ferrari.setLicensePlate("MY-GIRL");
        System.out.println("New colour: " + ferrari.getLicensePlate());

        System.out.println("\nDone.");
    }
}
