/*
SUBPROGRAMAS Funciones Procedimientos 
Conversiones
 */

package uf1practica17;

import java.util.Scanner;

public class UF1PRACTICA17 {
    static Scanner keyboard = new Scanner(System.in);

    
    public static void main(String[] args) {
        //Declaraciones Globales
        int option = -1;
        char letter;
        float eur, dolars;
        int euro, dolar, lettInt, num;
        String euros, yenes, lett, lett2, number;
        double libra;
        while(option !=0){
        userMenu();
        option = keyboard.nextInt();
        switch(option){//inicio switch
            case 1: 
                System.out.print("Euros?: ");
                euro = keyboard.nextInt();
                dolars = functionIntToFloat(euro);
                System.out.println(dolars);
                break;
            case 2:
                System.out.print("Euros?: ");
                euro = keyboard.nextInt();
                libra = functionIntToDouble(euro);
                System.out.println(libra);
                break;
            case 3: 
                System.out.print("Euros?: ");
                euro = keyboard.nextInt();
                yenes = functionIntToString(euro);
                System.out.println(yenes);
                break;
            case 4:
                System.out.print("Euros?: ");
                euros = keyboard.next();
                dolar = functionStringToInt(euros);
                System.out.println(dolar);
                break;
            case 5: 
                System.out.print("Euros?: ");
                eur = keyboard.nextFloat();
                euro = functionFloatToInt(eur);
                System.out.println(euro);
                break;
            case 6:
                System.out.print("Euros?: ");
                eur = keyboard.nextFloat();
                euros = functionFloatToString(eur);
                System.out.println(euros);
                break;
            case 7:
                System.out.print("Char?: ");
                letter = keyboard.next().charAt(0);
                lettInt = (int) (letter);
                lett2 = functionChar(lettInt);
                System.out.println("The char in binary is " + lettInt);
                System.out.println("The char in int is " + lett2);
                break;
            case 8:
                System.out.print("Write a name: ");
                lett = keyboard.next();
                lett2 = functionCharToBinary(lett);
                System.out.println("The name in binary is " + lett2);
                break;
            case 9:
                System.out.print("Write a number between 0 and 255: ");
                num = keyboard.nextInt();
                number = functionIntToChar(num);
                System.out.println("The number in int is " + number);
                break;
            case 10:
                System.out.println("ASCII");
                    for (int I = 32; I < 64; I++) {
                        number = functionCharToInt(I);
                        System.out.print(I + "-" + (char) (I) + "-" + number+ "\t");
                        number = functionCharToInt(I + 32);
                        System.out.print((I + 32) + "-" + (char) (I + 32) + "-" + number + "\t");
                        number = functionCharToInt(I + 64);
                        System.out.print((I + 64) + "-" + (char) (I + 64) + "-" + number + "\t");
                        System.out.println("");
                    }
                break;
            default: System.out.println("Opción no valida");
        }//Fin de switch
        }//Fin de while  
    }//FIN DE MAIN
    
    
    
    private static void userMenu() {
        System.out.println("");
        System.out.println("Author: Daniel Reyes Santiago");
        System.out.println("Opción 1 - (int-Float): ");
        System.out.println("Opción 2 - (int-double): ");
        System.out.println("Opción 3 - (int-String): ");
        System.out.println("Opción 4 - (String-int): ");
        System.out.println("Opción 5 - (float-int): ");
        System.out.println("Opción 6 - (float-String): ");
        System.out.println("Opción 7 - (char): ");
        System.out.println("Opción 8 - (char-binary): ");
        System.out.println("Opción 9 - (int-char): ");
        System.out.println("Opción 10 - (char-int): ");
        System.out.print("\nOpción?: ");
    }
    
    private static float functionIntToFloat(int euros) {
        float result = 0;
        result = euros*1.1f;
        return result;
    }

    private static double functionIntToDouble(int euros) {
        double result = 0;
        result = Double.valueOf(euros*1.1);
        return result;
    }

    private static String functionIntToString(int euros) {
        String result = "0";
        result = String.valueOf(euros*1.1);
        return result;
    }

    private static int functionStringToInt(String euros) {
        int result = 0;
        result = Integer.parseInt(euros);
        result = (int) (result*1.1f);
        return result;    
    }

    private static int functionFloatToInt(float eur) {
        int result = 0;
        result = (int) (result*1.1f);
        return result;  
    }

    private static String functionFloatToString(float eur) {
        String result = "0";
        result = String.valueOf(eur*1.1);
        return result; 
    }

    private static String functionChar(int lettInt) {
        String result = Integer.toBinaryString(lettInt);
        return result;
    }

    private static String functionCharToBinary(String lett) {
        String result = "";
        char letter;
        for(int i=0 ; i<lett.length() ; i++){
        letter = lett.charAt(i);
        result += Integer.toBinaryString(letter) + " ";
        }
        return result;
    }

    private static String functionIntToChar(int num) {
        String result = new Character((char) num).toString();
        return result;
    }

    private static String functionCharToInt(int num) {
        String result = Integer.toHexString(num);
        return result;
    }
}//FIN DE CLASS
