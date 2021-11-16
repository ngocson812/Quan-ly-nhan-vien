package quan_Ly_Nvien;

import java.util.Scanner;

public class conTroller {
    static Scanner scanner = new Scanner(System.in);

    public static void showNhanVien(nhanVien[] nhanVien) {
        for (nhanVien NV : nhanVien) {
            System.out.println(NV.toString());
        }
    }

    public static nhanVien[] creatNhanVien(nhanVien[] nhanVien) {
        nhanVien nhanvien = create();
        nhanVien[] newNV = new nhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNV[i] = nhanVien[i];
        }
        newNV[newNV.length -1] = nhanvien;
        return newNV;
    }

    public static nhanVien[] delete(nhanVien[] nhanVien) {
        int index = findIndexById(nhanVien);
        if (index >= 0) {
            nhanVien[] nvNew = new nhanVien[nhanVien.length - 1];
            for (int i = 0; i < nhanVien.length - 1; i++) {
                if (i < index) {
                    nvNew[i] = nhanVien[i];
                } else {
                    nvNew[i] = nhanVien[i + 1];
                }

            }
            return nvNew;
        }
        return nhanVien;
    }


    public static nhanVien[] editNhanVien(nhanVien[] nhanVien) {
        int index = findIndexById(nhanVien);
        if (index >= 0) {
            nhanVien newNV = create();
            nhanVien[index].setName(newNV.getName());
            nhanVien[index].setNumber(newNV.getNumber());
            nhanVien[index].setAddress(newNV.getAddress());
        }
        return nhanVien;
    }


    public static nhanVien create() {
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập number");
        int number = scanner.nextInt();

        nhanVien NVien = new nhanVien(name, number, address);
        return NVien;
    }

    public static int findIndexById(nhanVien[] nhanVien) {
        System.out.println("nhập id muốn tìm");
        int id;
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanVien.length; i++) {
            if (id == nhanVien[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}
