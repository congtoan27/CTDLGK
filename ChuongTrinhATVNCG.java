import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ChuongTrinhATVNCG {
    private LinkedList<Integer> lanToChuc;
    private ArrayList<AnhTai> danhSachAnhTaiThamGia;
    private ArrayList<AnhTai> danhSach17AnhTai;
    private LinkedList<AnhTai> top23AnhTai;
    private HashMap<AnhTai, Integer> anhTaiBiLoaiVaDemBiLoai;
    private HashMap<String, AnhTai> tenGiaiThuongVaTenAnhTai;
    private LinkedList<CongDien> danhSachDemCongDien;

    public ChuongTrinhATVNCG(LinkedList<Integer> lanToChuc, ArrayList<AnhTai> danhSachAnhTaiThamGia, ArrayList<AnhTai> danhSach17AnhTai, LinkedList<AnhTai> top23AnhTai, HashMap<AnhTai, Integer> anhTaiBiLoaiVaDemBiLoai, HashMap<String, AnhTai> tenGiaiThuongVaTenAnhTai, LinkedList<CongDien> danhSachDemCongDien) {
        this.lanToChuc = lanToChuc;
        this.danhSachAnhTaiThamGia = danhSachAnhTaiThamGia;
        this.danhSach17AnhTai = danhSach17AnhTai;
        this.top23AnhTai = top23AnhTai;
        this.anhTaiBiLoaiVaDemBiLoai = anhTaiBiLoaiVaDemBiLoai;
        this.tenGiaiThuongVaTenAnhTai = tenGiaiThuongVaTenAnhTai;
        this.danhSachDemCongDien = danhSachDemCongDien;
    }

    @Override
    public String toString() {
        return "ChuongTrinhATVNCG{" +
                "lanToChuc=" + lanToChuc +
                ", danhSachAnhTaiThamGia=" + danhSachAnhTaiThamGia +
                ", danhSach17AnhTai=" + danhSach17AnhTai +
                ", top23AnhTai=" + top23AnhTai +
                ", anhTaiBiLoaiVaDemBiLoai=" + anhTaiBiLoaiVaDemBiLoai +
                ", tenGiaiThuongVaTenAnhTai=" + tenGiaiThuongVaTenAnhTai +
                ", danhSachDemCongDien=" + danhSachDemCongDien +
                '}';
    }

    public LinkedList<Integer> getLanToChuc() {
        return lanToChuc;
    }

    public void setLanToChuc(LinkedList<Integer> lanToChuc) {
        this.lanToChuc = lanToChuc;
    }

    public ArrayList<AnhTai> getDanhSachAnhTaiThamGia() {
        return danhSachAnhTaiThamGia;
    }

    public void setDanhSachAnhTaiThamGia(ArrayList<AnhTai> danhSachAnhTaiThamGia) {
        this.danhSachAnhTaiThamGia = danhSachAnhTaiThamGia;
    }

    public ArrayList<AnhTai> getDanhSach17AnhTai() {
        return danhSach17AnhTai;
    }

    public void setDanhSach17AnhTai(ArrayList<AnhTai> danhSach17AnhTai) {
        this.danhSach17AnhTai = danhSach17AnhTai;
    }

    public LinkedList<AnhTai> getTop23AnhTai() {
        return top23AnhTai;
    }

    public void setTop23AnhTai(LinkedList<AnhTai> top23AnhTai) {
        this.top23AnhTai = top23AnhTai;
    }

    public HashMap<AnhTai, Integer> getAnhTaiBiLoaiVaDemBiLoai() {
        return anhTaiBiLoaiVaDemBiLoai;
    }

    public void setAnhTaiBiLoaiVaDemBiLoai(HashMap<AnhTai, Integer> anhTaiBiLoaiVaDemBiLoai) {
        this.anhTaiBiLoaiVaDemBiLoai = anhTaiBiLoaiVaDemBiLoai;
    }

    public HashMap<String,AnhTai> getTenGiaiThuongVaTenAnhTai() {
        return tenGiaiThuongVaTenAnhTai;
    }

    public void setTenGiaiThuongVaTenAnhTai(HashMap<String,AnhTai> tenGiaiThuongVaTenAnhTai) {
        this.tenGiaiThuongVaTenAnhTai = tenGiaiThuongVaTenAnhTai;
    }

    public LinkedList<CongDien> getDanhSachDemCongDien() {
        return danhSachDemCongDien;
    }

    public void setDanhSachDemCongDien(LinkedList<CongDien> danhSachDemCongDien) {
        this.danhSachDemCongDien = danhSachDemCongDien;
    }
}