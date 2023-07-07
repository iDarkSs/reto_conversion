package logic;

/**
 *
 * @author gemin_7bxj2ds
 */
public class NumeroaLetra {

    private static final String[] UNIDADES = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private static final String[] ESPECIALES = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    private static final String[] DECENAS = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static final String[] CENTENAS = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public static String convertirALetras(int numero) {
        if (numero == 0) {
            return "cero";
        }

        if (numero < 0) {
            return "menos " + convertirALetras(Math.abs(numero));
        }

        String letras = "";

        if (numero < 10) {
            letras = UNIDADES[numero];
        } else if (numero < 20) {
            letras = ESPECIALES[numero - 10];
        } else if (numero < 100) {
            int decena = numero / 10;
            int unidad = numero % 10;
            if (unidad == 0) {
                letras = DECENAS[decena];
            } else {
                letras = DECENAS[decena] + " y " + UNIDADES[unidad];
            }
        } else if (numero < 1000) {
            int centena = numero / 100;
            int resto = numero % 100;
            if (resto == 0) {
                letras = CENTENAS[centena];
            } else {
                letras = CENTENAS[centena] + " " + convertirALetras(resto);
            }
        } else if (numero < 1000000) {
            int millar = numero / 1000;
            int resto = numero % 1000;
            if (millar == 1) {
                letras = "mil " + convertirALetras(resto);
            } else {
                letras = convertirALetras(millar) + " mil " + convertirALetras(resto);
            }
        } else {
            letras = "Número demasiado grande";
        }

        return letras;
    }

    /*
    public static void main(String[] args) {
        int numero = 9999;
        String resultado = convertirALetras(numero);
        System.out.println(resultado); // imprimirá "trescientos cuarenta y cinco"
    }
     */
}
