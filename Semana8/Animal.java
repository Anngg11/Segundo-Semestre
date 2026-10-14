package Semana8;

public class Animal {
    
    private String nombre;
    private String familia;
    
    public Animal(String nombre, String familia){
        this.nombre = nombre;
        this.familia = familia;
    }
    
    public void comer(){ }

    public String getNombre(){
        return nombre;
    }

    public String getFamilia(){
        return familia;
    }
}
