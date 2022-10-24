package Pratice;
import java.util.*;

public class Diwali {
    public static void soundWaliDiwali(String Creacker){

            System.out.println("Happy Diwali "+ Creacker);
        }
        public static void sweetWaliDiwali(String sweets){
        System.out.println("Happy Diwali with "+sweets);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String sweets = "kaju katlli";
        String cracker = "Sutri Bomb";
        soundWaliDiwali(cracker);
        sweetWaliDiwali(sweets);

        System.out.println("Happy Diwali to all");

    }
}
