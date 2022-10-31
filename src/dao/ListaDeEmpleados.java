/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;

/**
 *
 * @author bradl
 */
public class ListaDeEmpleados {
    private ArrayList<Employee> lsEmpleados = new ArrayList<>();
    private int length = 0;

    public ListaDeEmpleados() {
    }
    
    public void pushEmployee(Employee empleado ){
        lsEmpleados.add(empleado);
    }
    
    public void increaseSalary(){
        for(Employee i: lsEmpleados){
            i.aumentarsalrio();
        }
    }

    public ArrayList<Employee> getLsEmpleados() {
        return lsEmpleados;
    }

    public void setLsEmpleados(ArrayList<Employee> lsEmpleados) {
        this.lsEmpleados = lsEmpleados;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
}
