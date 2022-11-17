
import java.util.Random;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.LineNumberReader;
class Main {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String letrasUltilizada = "";
    char letra;
    
    
    String[] palavras = {"BICICLETA", "AMORA", "MACARRONADA", "FEITIÇARIA","AMIGO", "PALAVRA", "CAVALEIRO"};
    
    int qtdPalavras = palavras.length; //PEGA QTD PALAVRAS TEM NO VETOR
    System.out.println("Quantidade de palavras: "+ qtdPalavras);

    int idxSorteado = random.nextInt(qtdPalavras); //POSICAO NO VETOR QUE DA A PALAVRA SORTEADA
    String sorteada = palavras[idxSorteado];//PALAVRA SORTEADA PALAVRA NA POSICAO idxSorteado
    
    int tam = sorteada.length();  //PEGA QUANTAS LETRA TEM A PALAVRA
    
    char[] acertos =new char[tam];
    for(int i = 0; i < acertos.length; i++){
      acertos[i] = 0;
    }
    System.out.println("Palavra selecionada: " + sorteada);
    System.out.println("Quantidade de letras: " + tam);  
    System.out.println("");
    
    boolean ganhou = false;
    int vidas = tam;
    
  while(!ganhou && vidas > 0){
    System.out.println("\nVocê tem " + vidas + "vidas");
    System.out.println("Letras utilizadas: " + letrasUltilizada);
    System.out.println("Qual letra vc deseja tentar?");
    letra = sc.next().toUpperCase().charAt(0);
    letrasUltilizada+= " " + letra;

    for(int i = 0; i < tam; i++){
      if(letra == sorteada.charAt(i)){
        
        acertos[i] = 1;
      }
    }
    for(int i = 0; i < tam; i++){
      if(acertos[i] == 0){
        System.out.print(" - ");
        ganhou = false;
      }else{
        System.out.print("  " + sorteada.charAt(i) + " ");
      }
    }
  }
    System.out.print("Parabéns vc ganhou!!!");

    /*if(ganhou > 0){
      System.out.print("Parabéns vc ganhou!!!");
    }else{
      System.out.print("Vc perdeu treine mais!!!");
    }
    */
  }
}