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


}
