public abstract class Cars {
    protected String name;
    protected int price;
    protected int height;
    protected int width;
    protected int length;

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }


    public Cars(String name, int price, int height, int width, int length) {
        this.name = name;
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}