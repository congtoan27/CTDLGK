public class BaiHat {
    private String ten;
    private String nhacSi;
    private String hoaAmPhoiKhi;
    private String yeuCau;

    public BaiHat(String ten, String nhacSi, String hoaAmPhoiKhi, String yeuCau) {
        this.ten = ten;
        this.nhacSi = nhacSi;
        this.hoaAmPhoiKhi = hoaAmPhoiKhi;
        this.yeuCau = yeuCau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhacSi() {
        return nhacSi;
    }

    public void setNhacSi(String nhacSi) {
        this.nhacSi = nhacSi;
    }

    public String getHoaAmPhoiKhi() {
        return hoaAmPhoiKhi;
    }

    public void setHoaAmPhoiKhi(String hoaAmPhoiKhi) {
        this.hoaAmPhoiKhi = hoaAmPhoiKhi;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    @Override
    public String toString() {
        return "BaiHat{" +
                "ten='" + ten + '\'' +
                ", nhacSi='" + nhacSi + '\'' +
                ", hoaAmPhoiKhi='" + hoaAmPhoiKhi + '\'' +
                ", yeuCau='" + yeuCau + '\'' +
                '}';
    }
}