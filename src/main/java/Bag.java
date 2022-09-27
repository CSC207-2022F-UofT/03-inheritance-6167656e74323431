/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    /**
     * Constructs a new bag with color and capacity.
     *
     * @param color    the color of the bag.
     * @param capacity the capacity of the bag.
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.numberOfContents = 0;
        this.capacity = capacity;
        this.contents = new String[capacity];
    }

    /**
     * Gets the color of the bag.
     *
     * @return the color of the bag.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets the number of contents in the bag.
     *
     * @return the number of contents in the bag.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * Gets the capacity of the bag.
     *
     * @return the capacity of the bag.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Sets the color of the bag.
     *
     * @param color the new color of the bag.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Attempts to add item to the bag.
     *
     * @param item the item to add
     *
     * @return true if the item has been successfully added.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[this.numberOfContents] = item;
            this.numberOfContents += 1;

            return true;
        }

        return false;
    }

    /**
     * Removes the last item in the bag.
     *
     * @return the last item in the bag, or null if empty.
     */
    public String popItem() {
        if (this.numberOfContents > 0) {
            this.numberOfContents -= 1;
            return this.contents[this.numberOfContents];
        }

        return null;
    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;

        String[] newContents = new String[this.capacity];
        for (int i = 0; i < this.contents.length; i++) {
            newContents[i] = this.contents[i];
        }

        this.contents = newContents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}