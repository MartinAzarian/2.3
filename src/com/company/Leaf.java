package com.company;

public class Leaf {
    private int countLeaf = 50;
    private Color leafColor = Color.GREEN;

    public void makeLeafsYellow() {
        leafColor = Color.YELLOW;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "countLeaf=" + countLeaf +
                ", leafColor=" + leafColor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        if (countLeaf != leaf.countLeaf) return false;
        return leafColor == leaf.leafColor;
    }

    @Override
    public int hashCode() {
        int result = countLeaf;
        result = 31 * result + (leafColor != null ? leafColor.hashCode() : 0);
        return result;
    }

    public Leaf() {
    }

    public Leaf(int countLeaf, Color leafColor) {

        this.countLeaf = countLeaf;
        this.leafColor = leafColor;
    }

    public int getCountLeaf() {
        return countLeaf;
    }

    public void setCountLeaf(int countLeaf) {
        this.countLeaf = countLeaf;
    }

    public Color getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(Color leafColor) {
        this.leafColor = leafColor;
    }

    public void makeLeafsFall() {
        if (countLeaf > 0) {
            --countLeaf;
            System.out.println("One leaf is falling");
        } else
            System.out.println("nobody leaf");
    }

}
