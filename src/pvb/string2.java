/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvb;

/**
 *
 * @author user
 */
public class string2 {
    public static void main(String[] args) {
        char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
        String s1 = "Строки";
        System.out.println("Строка s1 до copyValueOf:    " + s1);
        
  s1 = s1.copyValueOf(chars);
  System.out.println("Строка s1 до copyValueOf:    " + s1);
  
   char[] chars1 = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
   String str1= "Строки";
   String str2 = str1.copyValueOf(chars1);
   String str3 = str1.copyValueOf(chars1, 7, 7);
        System.out.println("Cтрока без смещения:  " + str2);
        System.out.println("Строка со смещением в 2 и длинной 7: " + str3);
    }
}