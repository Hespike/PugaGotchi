import java.util.Scanner;
import java.util.Random;

public class PugaGotchi {
    public static void main(String[] args) {
        int kor = 1;
        int elsoUtasitas, masodikUtasitas;
        int koszosKutya;
        boolean ujKor = true;
        Random random = new Random();
        Mopsz mopszi = new Mopsz();
        Scanner sc = new Scanner(System.in);

        mopszi.bemutatkozas();
        mopszi.kutyaBemutatkozas();

        while (kor <= 100 ) {

                if (ujKor) {
                    ujKor = false;
                    System.out.println("Új kör kezdődik!");


                        koszosKutya = random.nextInt(100 - 0) + 0;
                        if (koszosKutya <= 40) {
                            System.out.println(mopszi.getNev() + " koszos. Irány fürdeni! Nyugi, ez nem kerül pénzbe! *sad " + mopszi.getNev() + " noises*");
                        } else {
                            System.out.println(mopszi.getNev() + " tiszta. Hiphip. Ma nem kell fürödni. *happy " + mopszi.getNev() + " noises*");
                        }
                    }

                    System.out.println("Tulajdonos neve: " + mopszi.getTulajdonos() + ". Kutyus neve: " + mopszi.getNev() + ". Aktuális kör: " + kor + ". Pénzmennyiség: " + mopszi.getPenz() + ". Jóllakotság: " + mopszi.getJollakotsag() + ". Egészség: " + mopszi.getEgeszseg() + ". Kedv: " + mopszi.getKedv() + ". Energia: " + mopszi.getEnergia() + ". Rendetlenség: " + mopszi.getRendetlenseg() + ".");
                    System.out.println("Mit szeretnél csinálni? Írd be a megfelelő számot!\r\n1: Vegyünk ételt!\r\n2: Legyen egészségesebb  " + mopszi.getNev() + "! \r\n3: Irány játszani!");
                    System.out.print(mopszi.getRendetlenseg() < 40 ? "4: Irány dolgozni!\r\n" : "");
                    System.out.println("5: Irány aludni!\r\n");
                    sc = new Scanner(System.in);
                    String utasitas = sc.next();
                    elsoUtasitas = Integer.parseInt(utasitas);

                    switch (elsoUtasitas) {
                        case 1: //eszik
                            System.out.println("Mit szeretnél enni adni " + mopszi.getNev() + "-nak?\r\n1: Jutalomfalatka  (jóllakotság: +10, pénz: -4, energia: -3)\r\n2: Száraz kutyatáp (jóllakotság: +20, pénz: -8, energia: -3)\r\n3: Csont (jóllakotság: +23, pénz: -10, energia: -3)\r\n4: Házikoszt (jóllakotság: +15, pénz: -6, energia: -3)\r\n5: Víz (jóllakotság: +7, pénz: -3, energia: -3)\r\n6: Konzerv kutyaeledel (jóllakotság: +30, pénz: -13, energia: -3)\r\n7: Kutya energiaital (jóllakotság: +20, pénz: -20, energia: +12)");
                            sc = new Scanner(System.in);
                            utasitas = sc.next();
                            masodikUtasitas = Integer.parseInt(utasitas);
                            mopszi.eszik(masodikUtasitas);
                            break;

                        case 2: //egészség fenntartás
                            System.out.println("Mit szeretnél tenni " + mopszi.getNev() +  " egészségért?\r\n1: Kis életcsomag vásárlása (egészség: +25, pénz: -6)\r\n2: Nagy életcsomag vásárlása (egészség: +50, pénz: -25)\r\n3: Irány a doktor! (egészség: az értéke 100%-ra vált, pénz: -25)\r\n4: Maximalizáló ital vásárlása (Minden tulajdonság 100%-ra áll, pénz: -100)");
                            sc = new Scanner(System.in);
                            utasitas = sc.next();
                            masodikUtasitas = Integer.parseInt(utasitas);
                            mopszi.egeszsegFenntart(masodikUtasitas);
                            break;
                        case 3: //játék, csak akkor ha az energia 10 felett van
                            if (mopszi.getEnergia() < 10) {
                                System.out.println("A kutyus túl fáradt!!! Az energiája " + mopszi.getEnergia() + "! Így csak enni vagy aludni van ereje.");
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
                            if (mopszi.getRendetlenseg() < 40) {
                                if (mopszi.getEnergia() < 10) {
                                    System.out.println(mopszi.getNev() + " túl fáradt!!! Így csak enni vagy aludni van ereje.");
                                    break;
                                } else {
                                    System.out.println("Mit szeretnétek dolgozni?\r\n1: Újságkihordás (pénz: +50, energia: -10, egészség: -4)\r\n2: Rendőri segítség (pénz: +100, energia: -25, egészség: -(0-15) közötti érték)\r\n3: Házőrzés (pénz: +(30-200) közötti érték, energia: -(8-30) közötti érték) egészség: -(10-20) közötti érték)");
                                    sc = new Scanner(System.in);
                                    utasitas = sc.next();
                                    masodikUtasitas = Integer.parseInt(utasitas);
                                    mopszi.dolgozik(masodikUtasitas);
                                    break;
                                }
                            } else if (mopszi.getRendetlenseg() >= 40) {
                                System.out.println("Szép próbálkozás, de " + mopszi.getNev() + " rendetlensége túl magas (" + mopszi.getRendetlenseg() + "), nem tud dolgozni így! A rendetlenségnek 40 alatt kell lennie, hogy dolgozhasson.");
                                break;
                            }
                        case 5: //alvás, új kör kezdés
                            System.out.println("Szép álmokat " + mopszi.getNev() + " és " + mopszi.getTulajdonos() + "!");
                            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                            mopszi.alszik();
                            ujKor = true;
                            kor++;
                            break;

                        default:
                            System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                            break;

                    }

                }
        if (kor > 100) {
            mopszi.veszitett();
        }
    }
}
