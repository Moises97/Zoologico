/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Perro extends Animal implements Mascota{    
    private int nivelOlfato;

    public Perro() {
        super(null, 0, null);
    }

    public Perro(int nivelOlfato, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.nivelOlfato = nivelOlfato;
        
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Guau Guau ..");                
    }
    
    public void correr(){
        System.out.println(nombre+" está corriendo ..");
    }

    @Override
    public void amigable() {
       System.out.println("El perro esta jugando");
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fiel() {
        System.out.println("El perro quiere a su amo");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void invicible() {
        System.out.println("El perro nadie lo ve"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volar() {
       System.out.println("El perro esta volando"); //To change body of generated methods, choose Tools | Templates.
    }
}
