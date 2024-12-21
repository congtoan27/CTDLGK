import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Nhom {
    private String tenNhom;
    private ArrayList<AnhTai> danhSachThanhVien;
    private ArrayList<BaiHat> baiHat;
    private HashMap<AnhTai, Double> bangDiemBinhChonTV;
    private LinkedList<String> danhSachTVBiLoai;
    private LinkedList<Integer> diemBinhChon;
    String loaiThanhVien;

    public Nhom(String tenNhom, ArrayList<AnhTai> danhSachThanhVien, ArrayList<BaiHat> baiHat, HashMap<AnhTai, Double> bangDiemBinhChonTV, LinkedList<String> danhSachTVBiLoai, LinkedList<Integer> diemBinhChon, String loaiThanhVien) {
        this.tenNhom = tenNhom;
        this.danhSachThanhVien = danhSachThanhVien;
        this.baiHat = baiHat;
        this.bangDiemBinhChonTV = bangDiemBinhChonTV;
        this.danhSachTVBiLoai = danhSachTVBiLoai;
        this.diemBinhChon = diemBinhChon;
        this.loaiThanhVien = loaiThanhVien;
    }

    @Override
    public String toString() {
        return "Nhom{" +
                "tenNhom='" + tenNhom + '\'' +
                ", danhSachThanhVien=" + danhSachThanhVien +
                ", baiHat=" + baiHat +
                ", bangDiemBinhChonTV=" + bangDiemBinhChonTV +
                ", danhSachTVBiLoai=" + danhSachTVBiLoai +
                ", diemBinhChon=" + diemBinhChon +
                ", loaiThanhVien='" + loaiThanhVien + '\'' +
                '}';
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public ArrayList<AnhTai> getDanhSachThanhVien() {
        return danhSachThanhVien;
    }

    public void setDanhSachThanhVien(ArrayList<AnhTai> danhSachThanhVien) {
        this.danhSachThanhVien = danhSachThanhVien;
    }

    public ArrayList<BaiHat> getBaiHat() {
        return baiHat;
    }

    public void setBaiHat(ArrayList<BaiHat> baiHat) {
        this.baiHat = baiHat;
    }

    public HashMap<AnhTai, Double> getBangDiemBinhChonTV() {
        return bangDiemBinhChonTV;
    }

    public void setBangDiemBinhChonTV(HashMap<AnhTai, Double> bangDiemBinhChonTV) {
        this.bangDiemBinhChonTV = bangDiemBinhChonTV;
    }

    public LinkedList<String> getDanhSachTVBiLoai() {
        return danhSachTVBiLoai;
    }

    public void setDanhSachTVBiLoai(LinkedList<String> danhSachTVBiLoai) {
        this.danhSachTVBiLoai = danhSachTVBiLoai;
    }

    public LinkedList<Integer> getDiemBinhChon() {
        return diemBinhChon;
    }

    public void setDiemBinhChon(LinkedList<Integer> diemBinhChon) {
        this.diemBinhChon = diemBinhChon;
    }

    public String getLoaiThanhVien() {
        return loaiThanhVien;
    }

    public void setLoaiThanhVien(String loaiThanhVien) {
        this.loaiThanhVien = loaiThanhVien;
    }
}
