package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error en el main");
        } catch (Exception e) {
            System.out.println("La excepcion es: " + e.getMessage());
        }
    }
}
