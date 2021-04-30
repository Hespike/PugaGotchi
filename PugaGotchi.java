import java.util.Scanner;

public class PugaGotchi {
    public static void main(String[] args) {
        int kor = 0, elsoUtasitas = 0, masodikUtasitas = 0;

        Mopsz mopszi = new Mopsz();
        mopszi.getJollakotsag();
        mopszi.getEgeszseg();
        mopszi.getKedv();
        mopszi.getEnergia();
        mopszi.getRendetlenseg();
        mopszi.getPenz();


        while (kor < 100 && mopszi.penz < 100000) {
            kor++;
            System.out.println("Aktuális kör: " + kor + ". Pénzmennyiség: " + mopszi.penz + ". Jóllakotság: " + mopszi.jollakotsag + ". Egészség: " + mopszi.egeszseg + ". Kedv: " + mopszi.kedv + ". Energia: " + mopszi.energia + ". Rendetlenség: " + mopszi.rendetlenseg + ".");

            System.out.println("Mit szeretnél csinálni? Írd be a megfelelő számot!\r\n1: Étel vásárlása\r\n2: Életcsomag vásárlása\r\n3: Állatorvos meglátogatása\r\n4: Maximalizáló ital vásárlása\r\n5: Irány játszani!\r\n6: Irány dolgozni!");


            Scanner sc = new Scanner(System.in);
            String utasitas = sc.next();
            elsoUtasitas = Integer.parseInt(utasitas);

            switch (elsoUtasitas) {
                case 1: //eszik
                    System.out.println("Mit szeretnél enni?\r\n1: Jutalomfalatka  (jóllakotság: +10, pénz: -4, energia: -3)\r\n2: Száraz kutyatáp (jóllakotság: +20, pénz: -8, energia: -3)\r\n3: Csont (jóllakotság: +23, pénz: -10, energia: -3)\r\n4: Házikoszt (jóllakotság: +15, pénz: -6, energia: -3)\r\n5: Víz (jóllakotság: +7, pénz: -3, energia: -3)\r\n6: Konzerv kutyaeledel (jóllakotság: +30, pénz: -13, energia: -3)\r\n7: Kutya energiaital (jóllakotság: +20, pénz: -20, energia: +12)");
                    sc = new Scanner(System.in);
                    utasitas = sc.next();
                    masodikUtasitas = Integer.parseInt(utasitas);
                    mopszi.eszik(masodikUtasitas);
                    break;

                case 2: //egészség fenntartás
                    System.out.println("Mit szeretnél enni?\r\n1: Kis életcsomag vásárlása (egészség: +25, pénz: -6)\r\n2: Nagy életcsomag vásárlása (egészség: +50, pénz: -25)\r\n3: Irány a doktor! (egészség: az értéke 100%-ra vált, pénz: -25)\r\n4: Maximalizáló ital vásárlása (Minden tulajdonság 100%-ra áll, pénz: -100)");
                    sc = new Scanner(System.in);
                    utasitas = sc.next();
                    masodikUtasitas = Integer.parseInt(utasitas);
                    mopszi.egeszsegFenntart(masodikUtasitas);
                    break;
                case 3:
                    break;
                case 4:
                    break;
        }


            System.out.println("Az általad választott utasítás: " + elsoUtasitas + " és " + masodikUtasitas);

        }

    }
}
