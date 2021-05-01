import java.util.Random;
import java.util.Scanner;

public class Mopsz {
    private static int penz = 6;
    private static Random random = new Random();
    private int jollakotsag = 62;
    private int egeszseg = 62;
    private int kedv = 62;
    private int energia = 62;
    private int rendetlenseg = 62;
    private String nev;
    private String tulajdonos;
    private int jutalom = 0;
    private int szaraz = 0;
    private int csont = 0;
    private int hazi = 0;
    private int viz = 0;
    private int konzerv = 0;
    private int energiaItal = 0;
    Scanner sc = new Scanner(System.in);
//ételvétel
    public void jutalomVetel() {
        if (getPenz() >= 4) {
            setJutalom(getJutalom() + 1);
            setPenz(getPenz() - 4);
        } else {
            System.out.println("Ehhez az akcióhoz 4 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
        }
    }
    public void szarazVetel(){
        if (getPenz() >= 8) {
            setSzaraz(getSzaraz() + 1);
            setPenz(getPenz() - 8);
        } else {
            System.out.println("Ehhez az akcióhoz 8 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    public void csontVetel(){
        if (getPenz() >= 10) {
    setCsont(getCsont() + 1);
    setPenz(getPenz() - 10);
    } else {
        System.out.println("Ehhez az akcióhoz 10 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    public void haziVetel(){
        if (getPenz() >= 6) {
    setHazi(getHazi() + 1);
    setPenz(getPenz() - 6);
        } else {
        System.out.println("Ehhez az akcióhoz 6 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    public void vizVetel(){
        if (getPenz() >= 3) {
    setViz(getViz() + 1);
    setPenz(getPenz() - 3);
        } else {
        System.out.println("Ehhez az akcióhoz 3 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    public void konzervVetel(){
        if (getPenz() >= 13) {
    setKonzerv(getKonzerv() + 1);
    setPenz(getPenz() - 13);
        } else {
        System.out.println("Ehhez az akcióhoz 13 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    public void energiaItalVetel(){
        if (getPenz() >= 20) {
    setEnergiaItal(getEnergiaItal() + 1);
        setPenz(getPenz() - 20);
    } else {
        System.out.println("Ehhez az akcióhoz 20 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
    }
}
    //ételelfogyasztás
    public void jutalomEves(){
        if (getJutalom() > 0) {
            setJollakotsag(getJollakotsag() + 10);
            setEnergia(getEnergia() - 3);
            setJutalom(getJutalom() - 1);
        } else {
            System.out.println("A semmit nehéz elfogyasztani.");
        }
    }
    public void szarazEves() {
        if (getSzaraz() > 0) {
            setJollakotsag(getJollakotsag() + 20);
            setEnergia(getEnergia() - 3);
            setSzaraz(getSzaraz() - 1);
        } else {
            System.out.println("A semmit nehéz elfogyasztani.");
        }
    }
    public void csontEves(){
        if (getCsont() > 0) {
        setJollakotsag(getJollakotsag() + 23);
        setEnergia(getEnergia() - 3);
        setCsont(getCsont() - 1);
    } else {
        System.out.println("A semmit nehéz elfogyasztani.");
    }
}
    public void haziEves(){
        if (getHazi() > 0) {
        setJollakotsag(getJollakotsag() + 15);
        setEnergia(getEnergia() - 3);
        setHazi(getHazi() - 1);
    } else {
        System.out.println("A semmit nehéz elfogyasztani.");
    }
}
    public void vizIvas(){
        if (getViz() > 0) {
        setJollakotsag(getJollakotsag() + 7);
        setEnergia(getEnergia() - 3);
        setViz(getViz() - 1);
    } else {
        System.out.println("A semmit nehéz elfogyasztani.");
    }
}
    public void konzervEves(){
        if (getKonzerv() > 0) {
        setJollakotsag(getJollakotsag() + 30);
        setEnergia(getEnergia() - 3);
        setKonzerv(getKonzerv() - 1);
    } else {
        System.out.println("A semmit nehéz elfogyasztani.");
    }
}
    public void energiaItalIvas(){
        if (getEnergiaItal() > 0) {
        setJollakotsag(getJollakotsag() + 20);
        setEnergia(getEnergia() + 12);
        setEnergiaItal(getEnergiaItal() - 1);
    } else {
        System.out.println("A semmit nehéz elfogyasztani.");
    }
}

    //Getter-setters
    public int getJutalom() {
        return jutalom;
    }

    public void setJutalom(int jutalom) {
        this.jutalom = jutalom;
    }

    public int getSzaraz() {
        return szaraz;
    }

    public void setSzaraz(int szaraz) {
        this.szaraz = szaraz;
    }

    public int getCsont() {
        return csont;
    }

    public void setCsont(int csont) {
        this.csont = csont;
    }

    public int getHazi() {
        return hazi;
    }

    public void setHazi(int hazi) {
        this.hazi = hazi;
    }

    public int getViz() {
        return viz;
    }

    public void setViz(int viz) {
        this.viz = viz;
    }

    public int getKonzerv() {
        return konzerv;
    }

    public void setKonzerv(int konzerv) {
        this.konzerv = konzerv;
    }

    public int getEnergiaItal() {
        return energiaItal;
    }

    public void setEnergiaItal(int energiaItal) {
        this.energiaItal = energiaItal;
    }

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


    public void egeszsegFenntart(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // kis életcsomag
                if (getPenz() >= 6 ) {
                    setEgeszseg(getEgeszseg() + 25);
                    setPenz(getPenz() - 6);
                } else {
                    System.out.println("Ehhez az akcióhoz 6 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
                }
                break;
            case 2: //nagy életcsomag
                if (getPenz() >= 10 ) {
                setEgeszseg(getEgeszseg() + 50);
                setPenz(getPenz() - 10);
                } else {
                    System.out.println("Ehhez az akcióhoz 10 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
                }
                break;
            case 3: //állatorvos
                if (getPenz() >= 25 ) {
                setEgeszseg(getEgeszseg() + 100);
                setPenz(getPenz() - 25);
                } else {
                    System.out.println("Ehhez az akcióhoz 25 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
                }
                break;
            case 4: //maximalizáló ital
                if (getPenz() >= 100 ) {
                setJollakotsag(100);
                setEgeszseg(100);
                setKedv(100);
                setEnergia(100);
                setRendetlenseg(100);
                setPenz(getPenz() - 100);
        } else {
            System.out.println("Ehhez az akcióhoz 100 pénzre lenne szükséged, viszont neked " + getPenz() + " van.");
        }
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

