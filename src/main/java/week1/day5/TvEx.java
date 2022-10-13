package week1.day5;

class TV {
    private int size;
    public TV() {
    }
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}
class ColorTv extends TV {
    private int color;

    public ColorTv() {
    }

    public int getColor() {
        return color;
    }
    public ColorTv(int size, int color) {
        super(size);
        this.color = color;
    }
    public void printProperty() {
        System.out.println(super.getSize()+"인치 "+getColor()+"컬러");
    }
}

class IPTv extends ColorTv {

    String ip;

    public String getIp() {
        return ip;
    }

    public IPTv(String ip,int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 "+getIp()+" 주소의"+super.getSize()+" 인치 "+super.getColor()+"컬러");
    }

}
public class TvEx {
    public static void main(String[] args) {

        IPTv ipTv = new IPTv("192.1.1.2",32,2048);
        ipTv.printProperty();

    }
}
