import java.util.ArrayList;
import java.util.LinkedList;

public class AnhTai {
    private String ngheDanh;
    private String hoTen;
    private int namSinh;
    private  int soNamHoatDong;
    private ArrayList<String> danhSachNgheNghiep;
    private LinkedList<Integer> diemBinhChon;
    private LinkedList<Integer> diemHoaLuc;
    private int vongBiLoai;
    private ArrayList<GiaiThuong> danhSachGiaiThuong;

    public String getNgheDanh() {
        return ngheDanh;
    }

    @Override
    public String toString() {
        return "AnhTai{" +
                "ngheDanh='" + ngheDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", soNamHoatDong=" + soNamHoatDong +
                ", danhSachNgheNghiep=" + danhSachNgheNghiep +
                ", diemBinhChon=" + diemBinhChon +
                ", diemHoaLuc=" + diemHoaLuc +
                ", vongBiLoai=" + vongBiLoai +
                ", danhSachGiaiThuong=" + danhSachGiaiThuong +
                '}';
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoNamHoatDong() {
        return soNamHoatDong;
    }

    public void setSoNamHoatDong(int soNamHoatDong) {
        this.soNamHoatDong = soNamHoatDong;
    }

    public ArrayList<String> getDanhSachNgheNghiep() {
        return danhSachNgheNghiep;
    }

    public void setDanhSachNgheNghiep(ArrayList<String> danhSachNgheNghiep) {
        this.danhSachNgheNghiep = danhSachNgheNghiep;
    }

    public LinkedList<Integer> getDiemBinhChon() {
        return diemBinhChon;
    }

    public void setDiemBinhChon(LinkedList<Integer> diemBinhChon) {
        this.diemBinhChon = diemBinhChon;
    }

    public LinkedList<Integer> getDiemHoaLuc() {
        return diemHoaLuc;
    }

    public void setDiemHoaLuc(LinkedList<Integer> diemHoaLuc) {
        this.diemHoaLuc = diemHoaLuc;
    }

    public int getVongBiLoai() {
        return vongBiLoai;
    }

    public void setVongBiLoai(int vongBiLoai) {
        this.vongBiLoai = vongBiLoai;
    }

    public ArrayList<GiaiThuong> getDanhSachGiaiThuong() {
        return danhSachGiaiThuong;
    }

    public void setDanhSachGiaiThuong(ArrayList<GiaiThuong> danhSachGiaiThuong) {
        this.danhSachGiaiThuong = danhSachGiaiThuong;
    }

    public AnhTai(String ngheDanh, String hoTen, int namSinh, int soNamHoatDong, ArrayList<String> danhSachNgheNghiep, LinkedList<Integer> diemBinhChon, LinkedList<Integer> diemHoaLuc, int vongBiLoai, ArrayList<GiaiThuong> danhSachGiaiThuong) {
        this.ngheDanh = ngheDanh;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.soNamHoatDong = soNamHoatDong;
        this.danhSachNgheNghiep = danhSachNgheNghiep;
        this.diemBinhChon = diemBinhChon;
        this.diemHoaLuc = diemHoaLuc;
        this.vongBiLoai = vongBiLoai;
        this.danhSachGiaiThuong = danhSachGiaiThuong;
    }
}