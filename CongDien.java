import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class CongDien {
    private int idCongDien;
    private String chuDeCongDien;
    private ArrayList<Nhom> danhSachNhom;
    private String cachTinhDiem;
    private LinkedList<AnhTai> danhSachAnhTaiBiLoai;
    private TreeMap<AnhTai, Double> bangDiemBinhChonCaNhan;
    private TreeMap<AnhTai, Double> bangDiemHoaLucCaNhan;

    public CongDien(int idCongDien, String chuDeCongDien, ArrayList<Nhom> danhSachNhom, String cachTinhDiem, LinkedList<AnhTai> danhSachAnhTaiBiLoai, TreeMap<AnhTai, Double> bangDiemBinhChonCaNhan, TreeMap<AnhTai, Double> bangDiemHoaLucCaNhan) {
        this.idCongDien = idCongDien;
        this.chuDeCongDien = chuDeCongDien;
        this.danhSachNhom = danhSachNhom;
        this.cachTinhDiem = cachTinhDiem;
        this.danhSachAnhTaiBiLoai = danhSachAnhTaiBiLoai;
        this.bangDiemBinhChonCaNhan = bangDiemBinhChonCaNhan;
        this.bangDiemHoaLucCaNhan = bangDiemHoaLucCaNhan;
    }

    @Override
    public String toString() {
        return "CongDien{" +
                "idCongDien=" + idCongDien +
                ", chuDeCongDien='" + chuDeCongDien + '\'' +
                ", danhSachNhom=" + danhSachNhom +
                ", cachTinhDiem='" + cachTinhDiem + '\'' +
                ", danhSachAnhTaiBiLoai=" + danhSachAnhTaiBiLoai +
                ", bangDiemBinhChonCaNhan=" + bangDiemBinhChonCaNhan +
                ", bangDiemHoaLucCaNhan=" + bangDiemHoaLucCaNhan +
                '}';
    }

    public int getIdCongDien() {
        return idCongDien;
    }

    public void setIdCongDien(int idCongDien) {
        this.idCongDien = idCongDien;
    }

    public String getChuDeCongDien() {
        return chuDeCongDien;
    }

    public void setChuDeCongDien(String chuDeCongDien) {
        this.chuDeCongDien = chuDeCongDien;
    }

    public ArrayList<Nhom> getDanhSachNhom() {
        return danhSachNhom;
    }

    public void setDanhSachNhom(ArrayList<Nhom> danhSachNhom) {
        this.danhSachNhom = danhSachNhom;
    }

    public String getCachTinhDiem() {
        return cachTinhDiem;
    }

    public void setCachTinhDiem(String cachTinhDiem) {
        this.cachTinhDiem = cachTinhDiem;
    }

    public LinkedList<AnhTai> getDanhSachAnhTaiBiLoai() {
        return danhSachAnhTaiBiLoai;
    }

    public void setDanhSachAnhTaiBiLoai(LinkedList<AnhTai> danhSachAnhTaiBiLoai) {
        this.danhSachAnhTaiBiLoai = danhSachAnhTaiBiLoai;
    }

    public TreeMap<AnhTai, Double> getBangDiemBinhChonCaNhan() {
        return bangDiemBinhChonCaNhan;
    }

    public void setBangDiemBinhChonCaNhan(TreeMap<AnhTai, Double> bangDiemBinhChonCaNhan) {
        this.bangDiemBinhChonCaNhan = bangDiemBinhChonCaNhan;
    }

    public TreeMap<AnhTai, Double> getBangDiemHoaLucCaNhan() {
        return bangDiemHoaLucCaNhan;
    }

    public void setBangDiemHoaLucCaNhan(TreeMap<AnhTai, Double> bangDiemHoaLucCaNhan) {
        this.bangDiemHoaLucCaNhan = bangDiemHoaLucCaNhan;
    }
}