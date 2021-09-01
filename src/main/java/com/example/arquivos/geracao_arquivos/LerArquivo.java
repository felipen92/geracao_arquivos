package com.example.arquivos.geracao_arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

    public static void main(String[] args) throws IOException {

        FileReader ler = new FileReader("C:\\Users\\Felipe\\Documents\\teste\\tt.txt");

        BufferedReader lerArq = new BufferedReader(ler);

        String linha = lerArq.readLine();

        while (linha != null){
            System.out.println("linha: " + linha);

            linha = lerArq.readLine();
        }

        ler.close();
        System.out.println("Fim da leitura!!");
    }
}
