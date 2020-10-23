package Ex51;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public String toString() {
        return String.format("Begin: %s, End: %s", begin, end);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public float getBeginX() {
        return this.begin.getX();
    }

    public float getBeginY() {
        return this.begin.getY();
    }

    public float getEndX() {
        return this.end.getX();
    }

    public float getEndY() {
        return this.end.getY();
    }

    public void setBeginX(float x) {
        this.begin.setX(x);
    }

    public void setBeginY(float y) {
        this.begin.setY(y);
    }

    public void setEndX(float x) {
        this.end.setX(x);
    }

    public void setEndY(float y) {
        this.end.setY(y);
    }

    public void setBeginXY(float x, float y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public void setEndXY(float x, float y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        float xDiff = Math.abs(begin.getX() - end.getX());
        float yDiff = Math.abs(begin.getY() - end.getY());
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        float xDiff = Math.abs(begin.getX() - end.getX());
        float yDiff = Math.abs(begin.getY() - end.getY());
        return Math.atan2(yDiff, xDiff);
    }
}
