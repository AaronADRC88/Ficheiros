
package ficheiro.pkg1;


public class Ficheiro1 {

    public static void main(String[] args) {
     LerFich obx=new LerFich();
     EscribirFicheiro obx1=new EscribirFicheiro();
     obx.lerLinha("Z:\\Programacion\\2ª avaliacion\\Ficheiro 1\\textos\\ficheiros\\Ficheiro.txt");
     obx.LerFicheiro("Z:\\Programacion\\2ª avaliacion\\Ficheiro 1\\textos\\ficheiros\\Ficheiro.txt");
     obx.lerNumerosConLimitadores("Z:\\Programacion\\2ª avaliacion\\Ficheiro 1\\textos\\ficheiros\\numeros.txt");
    obx.lerObxeto("Z:\\Programacion\\2ª avaliacion\\Ficheiro 1\\textos\\ficheiros\\alumnos.txt");
    obx1.escribir("Z:\\Programacion\\2ª avaliacion\\Ficheiro 1\\textos\\ficheiros\\escrito.txt");
    }
    
}
