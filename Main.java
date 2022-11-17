
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
    String[] palavras = {"BICICLETA", "AMORA", "MACARRONADA", "FEITIÇARIA","AMIGO", "PALAVRA", "CAVALEIRO"};

    
    int idx = palavras.length; //PEGA QTS PALAVRAS TEM NO VETOR
    System.out.println("idx:"+ idx);

   
    int tam = palavras[1].length();  //PEGA QUANTAS LETRA TEM A PALAVRA
    System.out.println("tamanho da palavra: "+ tam);

    for(int i = 0; i < tam; i++){
      System.out.print(" - ");
    }

    for(int i = 0; i < tam; i++){

    }
  }
}