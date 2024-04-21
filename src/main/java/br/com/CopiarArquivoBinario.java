package br.com;

import java.io.*;

public class CopiarArquivoBinario {
    public static void main(String[] args) {
        String arquivoOriginal = "arquivo_grande.bin";
        String arquivoCopia = "copia_arquivo_grande.bin";

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(arquivoOriginal));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(arquivoCopia))) {

            byte[] buffer = new byte[8192]; // Tamanho do buffer (8 KB)

            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

