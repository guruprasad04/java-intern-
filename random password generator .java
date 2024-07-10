package reven;
import java.util.*;
public class optimusprime {
    public static void main(String[] args){
        String upper="ABCDEFGIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialChars="<>,.?/}]{]+_)(*&^%$#@!=";
        String combination=upper+lower+specialChars+num;
        int len=8;
        char[] password=new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated password is:" + new String(password));
    }
}
