import java.util.Scanner;

public class Laptop {
    String nameLaptop;
    double sizeDisplay;
    int ram;
    int rom;
    String nameCpu;
    String nameOs;
    boolean touchScreen;
    boolean opticalDrive;


    public Laptop(String nameLaptop, double sizeDisplay, int ram, int rom, String nameCpu,
                  String nameOs, boolean touchScreen, boolean opticalDrive) {
        this.nameLaptop = nameLaptop;
        this.sizeDisplay = sizeDisplay;
        this.ram = ram;
        this.rom = rom;
        this.nameCpu = nameCpu;
        this.nameOs = nameOs;
        this.touchScreen = touchScreen;
        this.opticalDrive = opticalDrive;
    }

    @Override
    public String toString() {
        return "nameLaptop='" + nameLaptop +
                ", sizeDisplay=" + sizeDisplay +
                ", ram=" + ram +
                ", rom=" + rom +
                ", nameCpu='" + nameCpu +
                ", nameOs='" + nameOs +
                ", touchScreen=" + touchScreen +
                ", opticalDrive=" + opticalDrive;

    }

//    @Override
//    public int hashCode() {
//        return nameLaptop.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println(obj);
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        Laptop laptop = (Laptop) obj;
//        return  laptop.nameLaptop.equalsIgnoreCase(nameLaptop);
////                && sizeDisplay <= laptop.sizeDisplay && ram <= laptop.ram
////                && rom <= laptop.rom && nameCpu.equalsIgnoreCase(laptop.nameCpu) && nameOs.equals(laptop.nameOs);
//    }
}
