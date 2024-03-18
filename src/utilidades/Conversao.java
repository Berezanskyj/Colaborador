/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author 832000223
 * @since 06/03/2024
 * @version 1.0
 */
public class Conversao {
    
    /*
    Esse método é responsável por substituir a  vírgula 
    por ponto, caso o usuário digite errado.
    */
    
    public static String converterVirgulaPonto(String c){
        return c.replaceAll(",", ".");
        
    } 
    
    //Coloca todas Strings em caixa alta
    public static String converterMaiusculo(String c){
        return c.toUpperCase();
    }
    
    //Coloca todas Strings em caixa baixa
    public static String converterMinusculo(String c){
        return c.toLowerCase();
    }
    
    
    /*
    Método que verifica se o usuário digitou apenas
    letras maiusculos ou minusculoas.
    No mínimo 6 e no máximo 50 caracteres
    */
    public static boolean verficiarTexto(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ ]{6,50}$");
    }
    
    /*
    Método que verifica se o usuário digiou apenas
    número de 0 a 9 com no mínimo 6 e no máximo 8
    dígitos
    */
    public static boolean verficiarNumeros(String c){
        return c.matches("^[0-9]{6,8}$");
    }
} // fecha Conversao
