public class StraightLine {
    private Point start;
    private Point end;

    public StraightLine(Point start, Point end) {

        /*
        this.start = start;
        this.end = end;
        */

        // FIX_ME: отсутствуе обработка null
        if (start == null || end == null) {
            this.start = new Point(0, 0);
            this.end = new Point(0, 0);
        } else {
            this.start = start;
            this.end = end;
        }
    }

    public StraightLine(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        // FIX_ME: копирование ссылки вместо значения
        //this.start = start;
        this.start = new Point(start.getX(),start.getY());
    }

    public void setEnd(Point end) {
        // FIX_ME: копирование ссылки вместо значения
        //this.end = end;
        this.end = new Point(end.getX(),end.getY());
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}