/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author danie
 */
public class Bicicleta extends Vehiculo {
    
    private int kmRecorridos = 0;
    private String marca;
    
    public Bicicleta(String marca)
    {
        this.marca=marca;
        Vehiculo.setVehiculosCreados();
    }
    
    
    public void anda(int km)
    {
        System.out.println("La bicicleta " + this.marca + " esta andando " + km + " km");
        this.kmRecorridos += km;
        Vehiculo.setKmTotalBicicleta(km);
        Vehiculo.setKilometrajeTotal(km);
    }
    
    public void hazCaballito(int km)
    {
        System.out.println("La bicicleta " + this.marca + " esta haciendo el caballito (2km)");
        this.kmRecorridos += km;
        Vehiculo.setKmTotalBicicleta(km);
        Vehiculo.setKilometrajeTotal(km);
        
    }
    
    public int getKmBicicleta() {
        return this.kmRecorridos;
    }
    
    
}
