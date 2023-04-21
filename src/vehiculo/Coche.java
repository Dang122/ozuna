/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author danie
 */
public class Coche extends Vehiculo {
    
    
    
    private int kmRecorridos = 0;
    private String marca;
    
    
    public Coche(String marca)
    {
        this.marca= marca;
        Vehiculo.getvehiculosCreados();
    }
    
    
    void andaCoche(int km)
    {
        System.out.println("El coche marca " + this.marca + " anda " + km + " km");
        this.kmRecorridos += km;
        Vehiculo.setKmTotalCoche(km);
        Vehiculo.setKilometrajeTotal(km);
    }
    
    void quemaRueda(int km)
    {
        System.out.println("El coche marca " + this.marca + " esta quemando rueda y su kilometraje aumenta " + km + " km");
        this.kmRecorridos += km;
        Vehiculo.setKmTotalCoche(km);
        Vehiculo.setKilometrajeTotal(km);
    }
    
    
    public int getKmCoche() {
        return this.kmRecorridos;
    }
    
    
}
