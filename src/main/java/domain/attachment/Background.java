package domain.attachment;

public class Background {
    private int id;
    private String type;
    private int angle;
    private String color;
    private int width;
    private int height;
    private Object[] images;
    private Object[] points;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object[] getImages() {
        return images;
    }

    public void setImages(Object[] images) {
        this.images = images;
    }

    public Object[] getPoints() {
        return points;
    }

    public void setPoints(Object[] points) {
        this.points = points;
    }
}
