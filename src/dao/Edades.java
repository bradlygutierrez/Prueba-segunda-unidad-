/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author bradl
 */
public class Edades {
    private int[] listaDeEdades = new int[15];
    private int length = 0;

    public Edades() {
    }
    
    public void push(int elemento){
        listaDeEdades[length] = elemento; 
        length++;
    }
    
    public int mayor(){
        int max = listaDeEdades[0];
        for (int i = 0; i < listaDeEdades.length; i++){
            int index=listaDeEdades[i];
            if(index > max){
                max = index;
            }else{
                max = max;
            }
        }
        return max;
    }
    
     public int min(){
        int min = listaDeEdades[0];
        int i = 0;
        while(i < length){
            int index = listaDeEdades[i];
            if (index < min){
                min = index;
            }else if(min == index){
                min = index;
            }else{
                min = min;
            }
            i++;
        }
        
        return min;
    }
    
    public float promedio(){
        int contador =0;
        int suma =0;
        do {
            suma = suma + listaDeEdades[contador];
            contador++;
        }while(contador < length);
        float promedio = suma / contador;
        
        return promedio;
    }
    
    public int[] getListaDeEdades() {
        return listaDeEdades;
    }

    public void setListaDeEdades(int[] listaDeEdades) {
        this.listaDeEdades = listaDeEdades;
    }

    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    
}
