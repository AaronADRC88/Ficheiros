package ficheiro.pkg1;

import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LerFich {

    Scanner sc;

    public void lerLinha(String nomeFicheiro) {
        String resposta;
        try {
            sc = new Scanner(new File(nomeFicheiro));
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                System.out.println(resposta);
            }

        } catch (IOException ex) {
            System.err.println("ERRO" + ex.toString());
        } finally {
            sc.close();
        }

    }

    public void LerFicheiro(String nomeFicheiro) {
        String resposta;

        try {
            sc = new Scanner(new File(nomeFicheiro));
            while (sc.hasNext()) {
                resposta = sc.next();
                System.out.println(resposta);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERRO" + ex.toString());
        } finally {
            sc.close();
        }

    }

    public void lerNumeros(String nomeFicheiro) {
        int resposta;

        try {
            sc = new Scanner(new File(nomeFicheiro));
            while (sc.hasNextInt()) {
                resposta = sc.nextInt();
                System.out.println(resposta);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERRO" + ex.toString());
        } finally {
            sc.close();
        }
    }
    public void lerNumerosConLimitadores(String nomeFicheiro){
        int resposta;

        try {
            sc = new Scanner(new File(nomeFicheiro)).useDelimiter(",");
            while (sc.hasNextInt()) {
                resposta = sc.nextInt();
                System.out.println(resposta);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERRO" + ex.toString());
        } finally {
            sc.close();
        }
    }
    public void lerObxeto(String nomeFicheiro){
        String resposta;

        try {
            sc = new Scanner(new File(nomeFicheiro));
            while (sc.hasNextLine()) {
                resposta = sc.next();
                String []alum=resposta.split(",");
                System.out.println(alum[0]+"-->"+alum[1]);
                
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERRO" + ex.toString());
        } finally {
            sc.close();
        }

}
}
