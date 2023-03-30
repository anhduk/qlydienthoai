package dienthoai.com.model;

public class SmartPhone extends Phone {
    private String hang;
    private long price;

    public SmartPhone(){

    }

    public SmartPhone(String hang, long price) {
        this.hang = hang;
        this.price = price;
    }

    public SmartPhone(String name, int id, String type, String hang, long price) {
        super(name, id, type);
        this.hang = hang;
        this.price = price;
    }

    public String getHang() {
        return hang;
    }

    public long getPrice() {
        return price;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "SmartPhone{" +
                "id='" + getId() + '\'' +

                "Ten='" + getName() + '\'' +

                "Loai='" + getType() + '\'' +

                ", price=" + price +
                '}';
    }
}
