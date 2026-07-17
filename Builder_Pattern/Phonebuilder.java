package Builder_Pattern;

public class Phonebuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;


    public Phonebuilder setos(String os) {
        this.os = os;
        return this;
    }

    public Phonebuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phonebuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phonebuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phonebuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,ram,processor,screenSize,battery);

    }
}
