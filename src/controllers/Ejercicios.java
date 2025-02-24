package controllers;

import java.util.Arrays;
import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        System.out.println("Input: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        
        if (str1.length() != str2.length()) {
            System.out.println("Output: false");
            System.out.println("Explicación: Las cadenas tienen diferentes longitudes.");
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                System.out.println("Output: false");
                System.out.println("Explicación: Las cadenas tienen diferentes caracteres o frecuencias.");
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }
        
        System.out.println("Output: true");
        System.out.println("Explicación: Ambas cadenas tienen los mismos caracteres con la misma frecuencia.");
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", objetivo = " + objetivo);
        
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (numMap.containsKey(complemento)) {
                int[] result = new int[]{numMap.get(complemento), i};
                System.out.println("Output: " + Arrays.toString(result));
                System.out.println("Explicación: nums[" + result[0] + "] + nums[" 
                                    + result[1] + "] == " + objetivo + ", devolvemos " 
                                    + Arrays.toString(result) + ".");
                return result;
            }
            numMap.put(nums[i], i);
        }

        System.out.println("Output: null");
        System.out.println("Explicación: No hay dos números en el array cuya suma sea igual al objetivo.");
        return null;
    }
}
