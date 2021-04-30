import java.util.Random;

public class Mopsz {
    int jollakotsag = 62;
    int egeszseg = 62;
    int kedv = 62;
    int energia = 62;
    int rendetlenseg = 62;
    public static int penz = 1500;
    String nev;
    String tulajdonosNev;
    Random random = new Random();

    public void eszik(int masodikUtasitas){
        switch(masodikUtasitas) {
            case 1:
                jollakotsag += 10;
                energia -= 3;
                penz -= 4;
                break;
            case 2:
                jollakotsag += 20;
                energia -= 3;
                penz -= 8;
                break;
            case 3:
                jollakotsag += 23;
                energia -= 3;
                penz -= 10;
                break;
            case 4:
                jollakotsag += 15;
                energia -= 3;
                penz -= 6;
                break;
            case 5:
                jollakotsag += 7;
                energia -= 3;
                penz -= 3;
                break;
            case 6:
                jollakotsag += 30;
                energia -= 3;
                penz -= 13;
                break;
            case 7:
                jollakotsag += 20;
                energia += 12;
                penz -= 20;
                break;
        }
    }

    public void egeszsegFenntart(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // kis életcsomag
                egeszseg += 25;
                penz -= 6;
                break;
            case 2: //nagy életcsomag
                egeszseg += 50;
                penz -= 10;
                break;
            case 3: //állatorvos
                egeszseg = 100;
                penz -= 25;
                break;
            case 4: //maximalizáló ital
                 jollakotsag = 100;
                 egeszseg = 100;
                 kedv = 100;
                 energia = 100;
                 rendetlenseg = 100;
                 penz -= 100;
                 break;

        }
    }

    public void jatszik(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // sétáltatás
                energia -= 10;
                egeszseg -= 4;
                break;
            case 2: //labdás játék
                energia -= 18;
                egeszseg -= random.nextInt(9 - 0) + 0;
                rendetlenseg -= 5;
                break;
            case 3: //kutyaiskola
                penz -= -10;
                energia -= 20;
                egeszseg -= 5;
                rendetlenseg -= 50;
                break;
            case 4: //játék a parkban
                energia -= 10;
                egeszseg -= 10;
                rendetlenseg -= 10;
                break;

        }
    }

    public void dolgozik(int masodikUtasitas) {
        switch (masodikUtasitas) {
            case 1: // újságkihordás
                penz += 50;
                energia -= 10;
                egeszseg -= 4;
                break;
            case 2: //rendőri segítség
                penz += 100;
                energia -= 25;
                egeszseg -= random.nextInt(15 - 0) + 0;
                break;
            case 3: //házőrzés
                penz += random.nextInt(200 - 30) + 30;
                energia -= random.nextInt(30 - 8) + 8;
                egeszseg -= random.nextInt(20 - 10) + 10;
                break;
        }
    }

    public int getJollakotsag() {
        return jollakotsag;
    }

    public void setJollakotsag(int jollakotsag) {
        this.jollakotsag = jollakotsag;
    }

    public int getEgeszseg() {
        return egeszseg;
    }

    public void setEgeszseg(int egeszseg) {
        this.egeszseg = egeszseg;
    }

    public int getKedv() {
        return kedv;
    }

    public void setKedv(int kedv) {
        this.kedv = kedv;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getRendetlenseg() {
        return rendetlenseg;
    }

    public void setRendetlenseg(int rendetlenseg) {
        this.rendetlenseg = rendetlenseg;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

}
