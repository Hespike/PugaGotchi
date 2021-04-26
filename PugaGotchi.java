import java.util.Scanner;

public class PugaGotchi {
    public static void main(String[] args) {
        int kor = 0;
        int penz = 1500;

        Mopsz mopszi = new Mopsz();
        mopszi.getJollakotsag();
        mopszi.getEgeszseg();
        mopszi.getKedv();
        mopszi.getEnergia();
        mopszi.getRendetlenseg();
        

       while(kor < 100 && penz < 100000){
           kor++;
        System.out.println("Az aktuális kör:" + kor + ". Jelenleg a jóllakotság ennyi:" + mopszi.jollakotsag );
        Scanner utasitas = new Scanner(System.in);
        System.out.println("Lehetséges utasítások:");
        System.out.println("1: Étel vásárlása");
        System.out.println("2: Életcsomag vásárlása");
        System.out.println("3: Állatorvos meglátogatása");
        System.out.println("4: Maximalizáló ital vásárlása");
        System.out.println("5: Irány játszani!");
        System.out.println("6: Irány dolgozni!");

        System.out.println("Írj be egy utasítást!");

          int aktUtasitas = utasitas.nextInt();  // Read user input
        System.out.println("Az általad választott utasítás: " + aktUtasitas);  // Output user input

    Mopsz jatekosKarakter = new Mopsz();

       }

    }

}
