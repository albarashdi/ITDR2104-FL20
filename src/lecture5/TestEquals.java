/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class TestEquals {
    public static void main(String[] args) {
        String s = new String("Programming");
        String m = new String("Programming");
        System.out.println(s==m);
        System.out.println(s.equals(m));
    }
    
}
