
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
    String caminho = "banco.txt";
   
   // String[] palavras = new String[1000];
    

    //String[] palavras = new String[1000];
    LineNumberReader leitorLinhas = new LineNumberReader(new FileReader(caminho));
    leitorLinhas.skip(Long.MAX_VALUE);//PULA TATÉ A ULTIMA LINHA
    int qtdPalavras = leitorLinhas.getLineNumber();
    leitorLinhas.close();
    System.out.println("Numero de linha: " + qtdPalavras);
    System.out.println("");

    String[] palavras = new String[qtdPalavras];
    
    //CARREGA AS PALAVRAS DE UM ARQUIVO
    BufferedReader leitorArquivo =  new BufferedReader(new FileReader(caminho));
    String linhaLida;
    int linha = 0;
    while((linhaLida = leitorArquivo.readLine()) != null){
      //System.out.println(linhaLida);
      palavras[linha] = linhaLida;
      linha++;
    }
    leitorArquivo.close();
    int idxSorteado = random.nextInt(qtdPalavras); //POSICAO NO VETOR QUE DA A PALAVRA SORTEADA
    String sorteada = palavras[idxSorteado];//PALAVRA SORTEADA PALAVRA NA POSICAO idxSorteado
    
    int tam = sorteada.length();  //PEGA QUANTAS LETRA TEM A PALAVRA
    
    char[] acertos =new char[tam];
    for(int i = 0; i < acertos.length; i++){
      acertos[i] = 0;
    }
    System.out.println("\n----------- JOGO DA FORCA ---------");
    System.out.println("Quantidade de palavras: "+ qtdPalavras);
    System.out.println("Palavra selecionada: " + sorteada);
    System.out.println("Quantidade de letras: " + tam);  
    System.out.println("-----------------------------------");
    
    boolean ganhou = false;
    int vidas = tam;
 
  do{
    System.out.println("\nVocê tem " + vidas + " vidas");
    System.out.println("Letras utilizadas: " + letrasUltilizada);
    System.out.println("Qual letra vc deseja tentar?");
    letra = sc.next().toUpperCase().charAt(0);
    letrasUltilizada+= " " + letra;
    boolean perdeVida = true;
    for(int i = 0; i < tam; i++){
      if(letra == sorteada.charAt(i)){       
        if(acertos[i] = 1;
        perdeVida = false;
      }
    }

    if(perdeVida){
      vidas--;
    }
    ganhou = true;
    for(int i = 0; i < tam; i++){
      if(acertos[i] == 0){
        System.out.print(" - ");                 
        ganhou = false;
      }else{
        System.out.print("  " + sorteada.charAt(i) + " ");
      }
    }

  }while(!ganhou && vidas > 0);

    if( vidas != 0){
      System.out.print("\nParabéns vc ganhou!!!");
    }else{
      System.out.print("\nVocê Perdeu...Vc precisa treinar mais!!!");
      System.out.print("\nA palavras era: " + sorteada);
    }
   
  }
}