package quan_Ly_Nvien;

public class nhanVien {
    private int id;
    private String name;
    private int number;
    private String address;

    private static int idNumber = 1;

    public nhanVien(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.id = idNumber++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}

