
package machine;

import java.util.Date;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Computer extends Machine{
    
    String cpu;
    int ram;
    double fanSpeed;

    public Computer(int id, Date dateMade, String name, String cpu, int ram, double fanSpeed) {
        this.id = id;
        this.dateMade = dateMade;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.fanSpeed = fanSpeed;
    }

    

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setFanSpeed(double fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public double getFanSpeed() {
        return fanSpeed;
    }
    
    public String toString(){
        return super.toString()+cpu+ram+fanSpeed;
    }
    
}
