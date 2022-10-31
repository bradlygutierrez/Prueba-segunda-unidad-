 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author bradl
 */
public class Employee {
    private String nombre; 
    private String puesto;
    private float salario;

    public Employee(String nombre, String puesto, float salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Employee() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentarsalrio(){
        switch(this.puesto){
            case "Gerente" ->  setSalario((float) (this.salario * 1.05));
            case "Asistente" -> setSalario((float) (this.salario * 1.10));
            case "Secretario" -> setSalario((float) (this.salario * 1.15));
                
           
            }

                
          
        }
                
                    
    
}
