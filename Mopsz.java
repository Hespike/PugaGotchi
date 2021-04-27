public class Mopsz {
    int jollakotsag = 62;
    int egeszseg = 62;
    int kedv = 62;
    int energia = 62;
    int rendetlenseg = 62;
    String nev;
    String tulajdonosNev;
/*
    public Mopsz(String nev){
        this.nev = "Mopszi";
        this.tulajdonosNev = "jatekos";
        this.jollakotsag = 62;
        this.egeszseg = 62;
        this.kedv = 62;
        this.energia = 62;
        this.rendetlenseg = 62;
    }
*/
    public void eszik(int masodikUtasitas, int penz){
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

}
