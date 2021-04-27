import java.util.Scanner;

public class PugaGotchi {
    public static void main(String[] args) {
        int kor = 0;
        int penz = 1500;
        int elsoUtasitas = 0;
        int masodikUtasitas = 0;

        Mopsz mopszi = new Mopsz();
        mopszi.getJollakotsag();
        mopszi.getEgeszseg();
        mopszi.getKedv();
        mopszi.getEnergia();
        mopszi.getRendetlenseg();


       while(kor < 100 && penz < 100000){
           kor++;
        System.out.println(" Aktuális kör: " + kor + " Pénzmennyiség: " + penz + ". Jóllakotság: " + mopszi.jollakotsag + " Egészség: " + mopszi.egeszseg + " Kedv: " + mopszi.kedv + " Energia: " + mopszi.energia + " Rendetlenség: " + mopszi.rendetlenseg + "." );

           System.out.println("Mit szeretnél csinálni? Írd be a megfelelő számot!");
           System.out.println("1: Étel vásárlása");
           System.out.println("2: Életcsomag vásárlása");
           System.out.println("3: Állatorvos meglátogatása");
           System.out.println("4: Maximalizáló ital vásárlása");
           System.out.println("5: Irány játszani!");
           System.out.println("6: Irány dolgozni!");

           Scanner sc = new Scanner(System.in);
           String utasitas=sc.next();
           elsoUtasitas = Integer.parseInt(utasitas);

           switch(elsoUtasitas){
              case 1:
                  System.out.println("Mit szeretnél enni?");
                  System.out.println("1: Jutalomfalatka (jóllakotság: +10, pénz: -4, energia: -3");
                  System.out.println("2: Száraz kutyatáp (jóllakotság: +20, pénz: -8, energia: -3");
                  System.out.println("3: Csont (jóllakotság: +23, pénz: -10, energia: -3");
                  System.out.println("4: Házikoszt (jóllakotság: +15, pénz: -6, energia: -3");
                  System.out.println("5: Víz (jóllakotság: +7, pénz: -3, energia: -3");
                  System.out.println("6: Konzerv kutyaeledel (jóllakotság: +30, pénz: -13, energia: -3");
                  System.out.println("7: Kutya energiaital (jóllakotság: +20, pénz: -20, energia: +12");
                  sc = new Scanner(System.in);
                  utasitas = sc.next();
                  masodikUtasitas = Integer.parseInt(utasitas);
                  mopszi.eszik(masodikUtasitas, penz);
                  }

           }



        System.out.println("Az általad választott utasítás: " + elsoUtasitas + " és " + masodikUtasitas);

       }

    }


