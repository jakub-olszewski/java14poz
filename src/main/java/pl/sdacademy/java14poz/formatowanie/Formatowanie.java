package pl.sdacademy.java14poz.formatowanie;

/**
 * Formatowanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 11:17
 **/
public class Formatowanie {

    public static void main(String[] args) {
        String swinka1 = "Pepe";
        String swinka2 = "Moli";
        String swinka3 = "Toli";

        /**
         * Przy formatowaniu ilość elementów po %
         * musi być równa ilosci elementow po napisie "" czyli
         * argumentow
         */
        System.out.printf("Dwie świnki %s i %s poszły do lasu\n",swinka1,swinka2);
        System.out.printf("Swinka %s poszła do lasu\n",swinka1,swinka2);
        System.out.printf("Trzy świnki %s i %s oraz %s poszły do lasu\n",swinka1,swinka2,swinka3);

    }
}
