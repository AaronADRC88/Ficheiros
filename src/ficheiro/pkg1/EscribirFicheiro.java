
package ficheiro.pkg1;

import java.io.*;

public class EscribirFicheiro {
    PrintWriter ficheiro;
    public void escribir(String nomeFich){
        try {
            ficheiro=new PrintWriter(new File(nomeFich));
            ficheiro.println("Celta");
            for (int i = 0; i < 5; i++) {
               ficheiro.println(" Ra ra ra!!!");
            }
        } catch (IOException ex) {
            System.out.println("ERRO"+ex);
        }finally{
            ficheiro.close();
        }
    }
}
