// FIX_ME: название класса не соответствует кодстайлу
// public class KaordinatePoint {
public class Point {
    private int x;
    private int y;

    /*
    public KaordinatePoint() {
        this.x = 0;
        this.y = 0;
    }
    */

    // FIX_ME: удален пустой конструктор (по заданию 4.1)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        // FIX_ME: добавлена валидация координат
        /*
        this.x = x;
        */
        if (Validation.isValidCoordinate(x)) {
            this.x = x;
        }
    }

    public void setY(int y) {
        // FIX_ME: добавлена валидация координат
        /*
        this.y = y;
        */
        if (Validation.isValidCoordinate(y)) {
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}