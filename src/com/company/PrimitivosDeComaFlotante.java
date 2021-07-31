package com.company;

public class PrimitivosDeComaFlotante {

    static int valorPorDefecto;

    public static void main(String[] args) {

        float implicitFloat = 1;
        System.out.println("implicitFloat = " + implicitFloat);
        float realFloat = 1.3F;
        System.out.println("realFloat = " + realFloat);
        float exponentialFloat = 2.123e3F;
        System.out.println("exponentialFloat = " + exponentialFloat);
        // 1.5e-10F -> 0.00000000015f
        float negativeExponentialFloat = 0.00000000015f;
        System.out.println("negativeExponentialFloat = " + negativeExponentialFloat);

        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float: " + Float.MIN_VALUE);

        // Double precisión
        double realDouble = 3.4028235e38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("Máximo valor para double: " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double: " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

        // Valor por defecto de los primitivos ≥ mira arriba del método main
        System.out.println("El valor por defecto es: " + valorPorDefecto);
        
    }
}
