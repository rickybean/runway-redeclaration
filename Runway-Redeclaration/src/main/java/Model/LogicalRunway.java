package Model;

public class LogicalRunway
{
    private int lda;
    private int tora;
    private int toda;
    private int asda;
    private int displacedThreshold;
    private int degree;
    private Direction direction;

    public LogicalRunway(String designator, int tora, int toda, int asda, int lda, int displacedThreshold){
        this.asda = asda;
        this.toda = toda;
        this.tora = tora;
        this.lda = lda;
        this.displacedThreshold = displacedThreshold;

        if (designator.length() < 3)
            designator = "0" + designator;

        degree = Integer.parseInt(designator.substring(0, 2));
        String designation = designator.substring(2, 3);
        direction = (designation.equals("L")) ? Direction.LEFT : designation.equals("R") ? Direction.RIGHT : Direction.CENTRE;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() { return ((degree < 10) ? "0" + degree : degree) +
            ((direction == Direction.LEFT) ? "L" : direction == Direction.RIGHT ? "R" : "C"); }

    public int getDegree() { return degree * 10; }

    public Direction getDirection() { return direction; }

    public int getLda() {
        return lda;
    }

    public int getTora() {
        return tora;
    }

    public int getToda() {
        return toda;
    }

    public int getAsda() {
        return asda;
    }

    public int getDisplacedThreshold() { return displacedThreshold; }
}
