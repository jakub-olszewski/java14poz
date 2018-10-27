package pl.sdacademy.java14poz.instrukcjawarunkowa;

/**
 * InstrWarunkowa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 07:29
 **/
public class InstrWarunkowa {

    public static void main(String[] args) {

        int temperatura = -10;
        boolean jestZimno = temperatura < 0;
        boolean jestStrasznieZimno = temperatura < -10;



        if(jestZimno){
            // jestZimno to prawda
            System.out.println("Jest zimno");
        }
        else if (temperatura >= 10){
            // wylaczenie ogrzewania
            System.out.println("Ogrzewanie wylaczone");
        }
        else{
            // w przeciwnym wypadku kiedy nie jest zimno
            System.out.println("Nie jest zimno");
        }

        // nie jest zimno wylacz ogrzewanie
        if(!jestZimno){
            // wylaczenie ogrzewania
            System.out.println("Ogrzewanie wylaczone");
        }


        // 1 - podaj temperature na dzis
        // 2 - podaj temperature na jutro
        // 3 - podaj temperature na pojutrze

        int podanaLiczba = 2;

        if(podanaLiczba==1){
            System.out.println("Temperatura na dzis:"+temperatura);
        }else if(podanaLiczba==2){
            System.out.println("Temperatura na jutro:"+temperatura);
        }else if(podanaLiczba==3){
            System.out.println("Temperatura na pojutrze:"+temperatura);
        }else if(podanaLiczba==4){
            System.out.println("Temperatura na 2 dni:"+temperatura);
        }else if(podanaLiczba==5){
            System.out.println("Temperatura na 3 dni:"+temperatura);
        }
    }

}
