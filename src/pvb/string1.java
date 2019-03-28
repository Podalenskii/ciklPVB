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
public class string1 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char[] result = str.toCharArray();
        System.out.println("Массив символов:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Элемент [" + i + "]: " + result[i]);   
        }
    }
}
