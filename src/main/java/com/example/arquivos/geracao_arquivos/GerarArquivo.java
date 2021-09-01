package com.example.arquivos.geracao_arquivos;

import org.thymeleaf.expression.Lists;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GerarArquivo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(new File("C:\\Users\\Felipe\\Documents\\teste\\tt.txt"));

        fw.write("arquivo criado");

        fw.flush();
        fw.close();
    }

}
