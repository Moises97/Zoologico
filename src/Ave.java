/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Ave extends Animal implements Mascota{
    private int velocidadVuelo;

    public Ave() {
        super(null, 0, null);
    }
    
    

    public Ave(int velocidadVuelo, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.velocidadVuelo = velocidadVuelo;
    }   
    
    public void makeNoise() {
        System.out.println("SHII SHI ..");                
    }
    
    public void volar(){
    System.out.println("El ave está volando...");                
    }

    @Override
    public void amigable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fiel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void invicible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
