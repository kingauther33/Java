package Ex51;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString() {
        return String.format("Begin: %s, End: %s", super.toString(), end);
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(Point end) {
        super.setX(end.getX());
        super.setY(end.getY());
    }

    public float getBeginX() {
        return super.getX();
    }

    public float getBeginY() {
        return super.getY();
    }

    public float getEndX() {
        return this.end.getX();
    }

    public float getEndY() {
        return this.end.getY();
    }

    public void setBeginX(float x) {
        super.setX(x);
    }

    public void setBeginY(float y) {
        super.setY(y);
    }

    public void setEndX(float x) {
        this.end.setX(x);
    }

    public void setEndY(float y) {
        this.end.setY(y);
    }

    public void setBeginXY(float x, float y) {
        super.setX(x);
        super.setY(y);
    }

    public void setEndXY(float x, float y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        float xDiff = Math.abs(super.getX() - end.getX());
        float yDiff = Math.abs(super.getY() - end.getY());
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        float xDiff = Math.abs(super.getX() - end.getX());
        float yDiff = Math.abs(super.getY() - end.getY());
        return Math.atan2(yDiff, xDiff);
    }
}
