package logic;

import java.util.HashMap;
import java.util.Map;

public class LetraANumero {

  /*  public static void main(String[] args) {
        String input = "nueve mil novecientos noventa y nueve";
        String output = convertirANumeros(input);
        System.out.println(output);
    }*/

    public static String convertirANumeros(String input) {
        Map<String, Integer> numeros = new HashMap<>();
        numeros.put("cero", 0);
        numeros.put("uno", 1);
        numeros.put("dos", 2);
        numeros.put("tres", 3);
        numeros.put("cuatro", 4);
        numeros.put("cinco", 5);
        numeros.put("seis", 6);
        numeros.put("siete", 7);
        numeros.put("ocho", 8);
        numeros.put("nueve", 9);
        numeros.put("diez", 10);
        numeros.put("once", 11);
        numeros.put("doce", 12);
        numeros.put("trece", 13);
        numeros.put("catorce", 14);
        numeros.put("quince", 15);
        numeros.put("veinte", 20);
        numeros.put("treinta", 30);
        numeros.put("cuarenta", 40);
        numeros.put("cincuenta", 50);
        numeros.put("sesenta", 60);
        numeros.put("setenta", 70);
        numeros.put("ochenta", 80);
        numeros.put("noventa", 90);
        numeros.put("cien", 100);
        numeros.put("doscientos", 200);
        numeros.put("trescientos", 300);
        numeros.put("cuatrocientos", 400);
        numeros.put("quinientos", 500);
        numeros.put("seiscientos", 600);
        numeros.put("setecientos", 700);
        numeros.put("ochocientos", 800);
        numeros.put("novecientos", 900);
        numeros.put("mil", 1000);

        String[] palabras = input.split(" ");
        int resultado = 0;
        int valorTemporal = 0;

        for (String palabra : palabras) {
            Integer valor = numeros.get(palabra);
            if (valor != null) {
                if (valor == 100 || valor == 1000) {
                    resultado += valor * valorTemporal;
                    valorTemporal = 0;
                } else {
                    valorTemporal += valor;
                }
            }
        }

        resultado += valorTemporal;
        return Integer.toString(resultado);
    }
}
