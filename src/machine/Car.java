/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

import java.util.Date;


/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Car extends Machine{
    
    double engineSize;
    String chasisNumber;
    String model;

    
    public Car(double engineSize, String chasisNumber, String model) {
        this.engineSize = engineSize;
        this.chasisNumber = chasisNumber;
        this.model = model;
    }
    public double getEngineSize() {
        return engineSize;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public String getModel() {
        return model;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }
    

    
    
}
