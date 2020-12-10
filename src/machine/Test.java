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
public class Test {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.setDateMade(new Date());
        m.setId(11254);
        m.setName("Machine");
        
        Computer c = new Computer(125, new Date(), "Dell", "i7 10700", 16, 1200);
        System.out.println(m);
        System.out.println(c);
    }
    
}
