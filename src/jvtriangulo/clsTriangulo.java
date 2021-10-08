/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvtriangulo;

/**
 *
 * @author efras
 */
public class clsTriangulo {
    // Atributos de clase
    double ladoA;
    double ladoB;
    double ladoC;
    String tipoTriangulo;
    boolean estadoValidacion;
    // Constructor de la clase
    public clsTriangulo(){
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
        tipoTriangulo = "";
        estadoValidacion = false;
    }
    // Propiedades de la clase (lectura y escritura
    public double getLadoA(){
        return ladoA;
    }
    public void setLadoA(double lado1){
        ladoA = lado1;
    }
    public double getLadoB(){
        return ladoB;
    }
    public void setLadoB(double lado2){
        ladoB = lado2;
    }
    public double getLadoC(){
        return ladoC;
    }
    public void setLadoC(double lado3){
        ladoC = lado3;
    }
    public String getTipoTriangulo(){
        return tipoTriangulo;
    }
    public void setTipoTriangulo(String traingulo){
        tipoTriangulo = traingulo;
    }
    public boolean getEstadoValido(){
        return estadoValidacion;
    }
    public void setEstadoValido(boolean validacion){
        estadoValidacion = validacion;
    }
    // Métodos de la clase
    public void limpiarObjetos(){
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
        tipoTriangulo = "";
        estadoValidacion = false;
    }
    public void validarTriangulo(){
        // Validar negativos
        if((ladoA<0)&(ladoB<0)&(ladoC<0)){
            ladoA *= -1;
            ladoB *= -1;
            ladoC *= -1;
        }
        if ((ladoA>0)&(ladoB>0)&(ladoC>0)) { // No hay triangulos con valor de lado = 0
            // Método por desigualdad triangular
            if (((ladoA + ladoB) >= ladoC) & ((ladoB + ladoC) >= ladoA) & ((ladoA + ladoC) >= ladoB)) {
                estadoValidacion = true;
            } else {
                estadoValidacion = false;
            }
        }else{
            estadoValidacion = false;
        }
        
    }
    public void tipoTriangulo(){
        if ((ladoA==ladoB)&(ladoB==ladoC)) {
            tipoTriangulo = "Equilatero";
        }else if ((ladoA==ladoB)||(ladoA==ladoC)||(ladoB==ladoC)){
            tipoTriangulo = "Isóceles";
        }else{
            tipoTriangulo = "Escaleno";
        }
    }
}
