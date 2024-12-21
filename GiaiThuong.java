public class GiaiThuong {
    private String tenGiaiThuong;
    private String hangMuc;

    public GiaiThuong(String tenGiaiThuong, String hangMuc) {
        this.tenGiaiThuong = tenGiaiThuong;
        this.hangMuc = hangMuc;
    }

    public String getTenGiaiThuong() {
        return tenGiaiThuong;
    }

    public void setTenGiaiThuong(String tenGiaiThuong) {
        this.tenGiaiThuong = tenGiaiThuong;
    }

    public String getHangMuc() {
        return hangMuc;
    }

    public void setHangMuc(String hangMuc) {
        this.hangMuc = hangMuc;
    }

    @Override
    public String toString() {
        return "GiaiThuong{" +
                "tenGiaiThuong='" + tenGiaiThuong + '\'' +
                ", hangMuc='" + hangMuc + '\'' +
                '}';
    }
}