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
public class Machine { // subclass of Object
    int id;
    Date dateMade;
    String name;
    
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return name+id+" date made:"+dateMade;
    }
}
