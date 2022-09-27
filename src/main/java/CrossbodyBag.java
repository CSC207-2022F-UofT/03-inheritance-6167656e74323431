/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

public class CrossbodyBag extends Bag {
    private int numberOfStraps;

    /**
     * Creates a new CrossbodyBag with the given color and
     * capacity.
     *
     * @param color
     * @param capacity
     * @param numberOfStraps
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     * Get the number of straps.
     *
     * @return
     */
    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    /**
     * Increase the capacity of this bag by 2.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    /**
     * Return a string version of this CrossbodyBag.
     *
     * @return
     */
    @Override
    public String toString() {
        return getColor() + " Crossbody Bag with " + this.numberOfStraps + " straps (" +
                getNumberOfContents() + " / " + getCapacity() + ")";
    }
}