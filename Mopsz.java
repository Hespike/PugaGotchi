import java.util.Random;
import java.util.Scanner;

public class Mopsz {
    //Class variables
    private static int penz = 1500;
    private static Random random = new Random();

    //Instance variables
    private int jollakotsag = 62;
    private int egeszseg = 62;
    private int kedv = 62;
    private int energia = 62;
    private int rendetlenseg = 62;
    private String nev;
    private String tulajdonos;
    Scanner sc = new Scanner(System.in);

    //Getter-setters
    public static int getPenz() {
        return penz;
    }

    public static void setPenz(int penz) {
        Mopsz.penz = clampMoney(penz);
    }

    public int getJollakotsag() {
        return jollakotsag;
    }

    public void setJollakotsag(int jollakotsag) {
        this.jollakotsag = clamp(jollakotsag);
    }

    public void jollakotsagNovel(int value) {
        setJollakotsag(getJollakotsag() + value);
    }

    public int getEgeszseg() {
        return egeszseg;
    }

    public void setEgeszseg(int egeszseg) {
        this.egeszseg = clamp(egeszseg);
    }

    public int getKedv() {
        return kedv;
    }

    public void setKedv(int kedv) {
        this.kedv = clamp(kedv);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = clamp(energia);
    }

    public int getRendetlenseg() {
        return rendetlenseg;
    }

    public void setRendetlenseg(int rendetlenseg) {
        this.rendetlenseg = clamp(rendetlenseg);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(String tulajdonos) {
        this.tulajdonos = tulajdonos;
    }


    private static int clamp(int value) {
        if (value > 100) {
            return 100;
        } else if (value < 0) {
            return 0;
        }
        return value;
    }

    private static int clampMoney(int value) {
        if (value < 0) {
            return 0;
        }
        return value;
    }


    public void bemutatkozas() {
        System.out.println("Üdv! Hogy hívnak téged?");
        this.tulajdonos = sc.next();
        System.out.println("Jó szórakozást " + getTulajdonos() + "!");
    }

    public void kutyaBemutatkozas() {
        System.out.println("Hogy hívják a kutyusod?");
        this.nev = sc.next();
        if (nev.equals("progegykaro")) {
            System.out.println("Áhh, " + getNev() + ". Ez egy rémisztő név.");
        } else {
            System.out.println("Áhh, " + getNev() + ". Ez egy kiváló név.");
        }
    }

    //Instance methods
    public void eszik(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1:
                setJollakotsag(getJollakotsag() + 10);
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 4);
                break;
            case 2:
                setJollakotsag(getJollakotsag() + 20); //<3
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 8);
                break;
            case 3:
                setJollakotsag(getJollakotsag() + 23);
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 10);
                break;
            case 4:
                setJollakotsag(getJollakotsag() + 15);
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 6);
                break;
            case 5:
                setJollakotsag(getJollakotsag() + 7);
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 3);
                break;
            case 6:
                setJollakotsag(getJollakotsag() + 30);
                setEnergia(getEnergia() - 3);
                setPenz(getPenz() - 13);
                break;
            case 7:
                setJollakotsag(getJollakotsag() + 20);
                setEnergia(getEnergia() + 3);
                setPenz(getPenz() - 20);
                break;
            default:
                System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                break;
        }
    }

    public void egeszsegFenntart(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // kis életcsomag
                setEgeszseg(getEgeszseg() + 25);
                setPenz(getPenz() - 6);
                break;
            case 2: //nagy életcsomag
                setEgeszseg(getEgeszseg() + 50);
                setPenz(getPenz() - 10);
                break;
            case 3: //állatorvos
                setEgeszseg(getEgeszseg() + 100);
                setPenz(getPenz() - 25);
                break;
            case 4: //maximalizáló ital
                setJollakotsag(100);
                setEgeszseg(100);
                setKedv(100);
                setEnergia(100);
                setRendetlenseg(100);
                setPenz(getPenz() - 100);
                break;
            default:
                System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                break;

        }
    }

    public void jatszik(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // sétáltatás
                setEnergia(getEnergia() - 10);
                setEgeszseg(getEgeszseg() - 4);
                break;
            case 2: //labdás játék
                setEnergia(getEnergia() - 18);
                setEgeszseg(getEgeszseg() - random.nextInt(9 - 0) + 0);
                setRendetlenseg(getRendetlenseg() - 5);
                break;
            case 3: //kutyaiskola
                setPenz(getPenz() - 10);
                setEnergia(getEnergia() - 20);
                setEgeszseg(getEgeszseg() - 5);
                setRendetlenseg(getRendetlenseg() - 50);
                break;
            case 4: //játék a parkban
                setEnergia(getEnergia() - 10);
                setEgeszseg(getEgeszseg() - 10);
                setRendetlenseg(getRendetlenseg() - 10);
                break;
            default:
                System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                break;

        }
    }

    public void dolgozik(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // újságkihordás
                setPenz(getPenz() + 50);
                setEnergia(getEnergia() - 10);
                setEgeszseg(getEgeszseg() - 4);
                break;
            case 2: //rendőri segítség
                setPenz(getPenz() + 100);
                setEnergia(getEnergia() - 25);
                setEgeszseg(getEgeszseg() - random.nextInt(15 - 0) + 0);
                break;
            case 3: //házőrzés
                setPenz(getPenz() + random.nextInt(200 - 30) + 30);
                setEnergia(getEnergia() - random.nextInt(30 - 8) + 8);
                setEgeszseg(getEgeszseg() - random.nextInt(15 - 0) + 0);
                break;
            default:
                System.out.println("Ez sajnos nem sikerült! A terminál által kiírt számok közül egyet írj be.");
                break;
        }
        penzCheck();
    }

    public void alszik() {
        setEnergia(getEnergia() + random.nextInt(50 - 30) + 30);
        setJollakotsag(getJollakotsag() - 8);
        setEgeszseg(getEgeszseg() - 5);
    }

    public void veszitett() {
        System.out.println("Veszítettél! Nincs több köröd! " + getNev() + " örökké szegény marad, és ez csakis neked köszönhető, " + getTulajdonos() + "!");
        System.exit(0);
    }

    public void penzCheck() {
        if (penz >= 10000) {
            System.out.println("Gratulálunk, nyertél! Elértél 10000 pénzt! " + getNev() + " mostmár gazdag, és ez csakis neked köszönhető, " + getTulajdonos() + "!");
            System.exit(0);
        }
    }

}

