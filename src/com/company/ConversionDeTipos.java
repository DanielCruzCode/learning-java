package com.company;

public class ConversionDeTipos {
    public static void main(String[] args) {
        
        String numeroStr = "50";

        int numeroInt = Integer.parseInt( numeroStr );
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1928.37e-3";
        double realDouble = Double.parseDouble( realStr );
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "FalSE";
        boolean logicoBoolean = Boolean.parseBoolean( logicoStr );
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        // Parse to String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString( otroNumeroInt );
        System.out.println("otroNumeroStr Integer.toString = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf( otroNumeroInt + 10 );
        System.out.println("otroNumeroStr String.valueOf = " + otroNumeroStr);

        double otroRealDouble = 1.2555e3;
        String otroRealStr = Double.toString( otroRealDouble );
        System.out.println("otroRealStr Double.toString = " + otroRealStr);

        otroRealStr = String.valueOf( 1.12312f );
        System.out.println("otroRealStr String.valueOf = " + otroRealStr);


        // Casting
        int i = 32768;
        short s = (short) i;
        System.out.println("s = " + s);
    }
}
