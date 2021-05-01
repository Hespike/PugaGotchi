import java.util.Scanner;
import java.util.Random;

public class PugaGotchi {
    public static void main(String[] args) {
        int kor = 0, elsoUtasitas = 0, masodikUtasitas = 0;
        boolean rendetlensegKicsi = false;
        int koszosKutya = 0;
        boolean ujKor = true;
        Random random = new Random();
        Mopsz mopszi = new Mopsz();
        mopszi.getJollakotsag();
        mopszi.getEgeszseg();
        mopszi.getKedv();
        mopszi.getEnergia();
        mopszi.getRendetlenseg();
        mopszi.getPenz();


        while (kor < 100 && mopszi.penz < 100000) {
            if(ujKor == true){
                ujKor = false;
                System.out.println("Új kör kezdődik!");
                kor++;
                koszosKutya = random.nextInt(100 - 0) + 0;
                if (koszosKutya <= 40) {
                    System.out.println("A kutyus koszos. Irány fürdeni! Nyugi, ez nem kerül pénzbe! *sad doge noises*");
                } else {
                    System.out.println("A kutyus tiszta. Hiphip. Ma nem kell fürödni. *happy doge noises*");
                }
            } else {

            }

            System.out.println("Aktuális kör: " + kor + ". Pénzmennyiség: " + mopszi.penz + ". Jóllakotság: " + mopszi.jollakotsag + ". Egészség: " + mopszi.egeszseg + ". Kedv: " + mopszi.kedv + ". Energia: " + mopszi.energia + ". Rendetlenség: " + mopszi.rendetlenseg + ".");
            System.out.println("Mit szeretnél csinálni? Írd be a megfelelő számot!\r\n1: Étel vásárlása\r\n2: Egészségesebbé tenni a kutyust\r\n3: Irány játszani!");
            System.out.print(mopszi.rendetlenseg < 40 ?"4: Irány dolgozni!\r\n" : "");
            System.out.println("5: Irány aludni!\r\n");
            if (mopszi.rendetlenseg < 40) {
                rendetlensegKicsi = true;
            } else{
                rendetlensegKicsi = false;
            }
            Scanner sc = new Scanner(System.in);
            String utasitas = sc.next();
            elsoUtasitas = Integer.parseInt(utasitas);

            switch (elsoUtasitas) {
                case 1: //eszik
                    System.out.println("Mit szeretnél enni adni a kutyusnak?\r\n1: Jutalomfalatka  (jóllakotság: +10, pénz: -4, energia: -3)\r\n2: Száraz kutyatáp (jóllakotság: +20, pénz: -8, energia: -3)\r\n3: Csont (jóllakotság: +23, pénz: -10, energia: -3)\r\n4: Házikoszt (jóllakotság: +15, pénz: -6, energia: -3)\r\n5: Víz (jóllakotság: +7, pénz: -3, energia: -3)\r\n6: Konzerv kutyaeledel (jóllakotság: +30, pénz: -13, energia: -3)\r\n7: Kutya energiaital (jóllakotság: +20, pénz: -20, energia: +12)");
                    sc = new Scanner(System.in);
                    utasitas = sc.next();
                    masodikUtasitas = Integer.parseInt(utasitas);
                    mopszi.eszik(masodikUtasitas);
                    break;

                case 2: //egészség fenntartás
                    System.out.println("Mit szeretnél tenni a kutyus egészségért?\r\n1: Kis életcsomag vásárlása (egészség: +25, pénz: -6)\r\n2: Nagy életcsomag vásárlása (egészség: +50, pénz: -25)\r\n3: Irány a doktor! (egészség: az értéke 100%-ra vált, pénz: -25)\r\n4: Maximalizáló ital vásárlása (Minden tulajdonság 100%-ra áll, pénz: -100)");
                    sc = new Scanner(System.in);
                    utasitas = sc.next();
                    masodikUtasitas = Integer.parseInt(utasitas);
                    mopszi.egeszsegFenntart(masodikUtasitas);
                    break;
                case 3: //játék, csak akkor ha az energia 10 felett van
                    if (mopszi.energia < 10) {
                        System.out.println("A kutyus túl fáradt!!! Így csak enni vagy aludni van ereje.");
                        break;
                    } else {
                        System.out.println("Mit szeretnétek játszani?\r\n1: Sétáljunk (energia: -10, egészség: -4)\r\n2: Labdázzunk (energia: -18,egészség: -(0-9) közötti érték, rendetlenség: -5)\r\n3: Irány a kutyaiskola (pénz: -10, energia: -20, egészség: -5, rendetlenség: -50)\r\n4: Játszunk a parkban (energia: -10, egészség: -10, rendetlenség - 10)");
                        sc = new Scanner(System.in);
                        utasitas = sc.next();
                        masodikUtasitas = Integer.parseInt(utasitas);
                        mopszi.jatszik(masodikUtasitas);
                    }
                    break;
                case 4:// munka, csak akkor, ha a rendetlenség 40 alatt van, és az energia 10 felett
                    if (mopszi.rendetlenseg < 40) {
                        if (mopszi.energia < 10) {
                            System.out.println("A kutyus túl fáradt!!! Így csak enni vagy aludni van ereje.");
                            break;
                        } else {
                            System.out.println("Mit szeretnétek dolgozni?\r\n1: Újságkihordás (pénz: +50, energia: -10, egészség: -4)\r\n2:Rendőri segítség (pénz: +100, energia: -25, egészség: -(0-15) közötti érték)\r\n3: Házőrzés (pénz: +(30-200) közötti érték, energia: -(8-30) közötti érték) egészség: -(10-20) közötti érték)");
                            sc = new Scanner(System.in);
                            utasitas = sc.next();
                            masodikUtasitas = Integer.parseInt(utasitas);
                            mopszi.dolgozik(masodikUtasitas);
                            break;
                        }
                    } else if (mopszi.rendetlenseg >= 40) {
                        System.out.println("Szép próbálkozás, de a kutyus rendetlensége túl magas, nem tud dolgozni így!");
                        break;
                    }
                case 5: //
                    System.out.println("Szép álmokat kutyus!");
                    mopszi.alszik();
                    ujKor = true;
                    break;

                default:
                    System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                    break;

            }

        }

    }
}



