package pl.sdacademy.java14poz.petle.petlawhile;

/**
 * PetlaWhile
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 14:13
 **/
public class PetlaWhile {
    public static void main(String[] args) {

        boolean czyDzieckoPlacze = true;
        int czas = 0;
        while (czyDzieckoPlacze){
            // wykonuje się od dopóki warunek w while jest spełniony
            System.out.println("Dziecko płacze...");

            if(czas==120){
                czyDzieckoPlacze = false;
            }
            czas++;
        }

        if(!czyDzieckoPlacze){
            System.out.println("Dziecko nie płacze.");
        }
    }
}
