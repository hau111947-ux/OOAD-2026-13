import java.util.Random;

class ConVat {
    protected String ten;
    protected String mauLong;

    public ConVat(String ten, String mauLong) {
        this.ten = ten;
        this.mauLong = mauLong;
    }

    public void hienThi() {
        System.out.println("Con Vật " + ten + " màu " + mauLong);
    }
}

class ConMeo extends ConVat {

    public ConMeo(String ten, String mauLong) {
        super(ten, mauLong);
    }

    @Override
    public void hienThi() {
        System.out.println("Con Mèo " + ten + " màu " + mauLong);
    }
}


class ConCho extends ConVat {

    public ConCho(String ten, String mauLong) {
        super(ten, mauLong);
    }

    @Override
    public void hienThi() {
        System.out.println("Con Chó " + ten + " màu " + mauLong);
    }
}

public class Lab1 {
    public static void main(String[] args) {

        Random random = new Random();

        String[] ten = {"Tom", "A", "B", "C", "D", "E", "F", "G", "H", "Z"};
        String[] mauLong = {"trắng", "đen", "xám", "vàng", "nâu"};

        ConVat[] danhSach = new ConVat[10];

        // Tạo 10 con vật ngẫu nhiên
        for (int i = 0; i < 10; i++) {

            String tenConVat = ten[random.nextInt(ten.length)];
            String mau = mauLong[random.nextInt(mauLong.length)];

            if (random.nextBoolean()) {
                danhSach[i] = new ConMeo(tenConVat, mau);
            } else {
                danhSach[i] = new ConCho(tenConVat, mau);
            }
        }

        // In thông tin
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". ");
            danhSach[i].hienThi();
        }
    }
}