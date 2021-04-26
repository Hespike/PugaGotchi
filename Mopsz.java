public class Mopsz {
    int jollakotsag = 62;
    int egeszseg = 62;
    int kedv = 62;
    int energia = 62;
    int rendetlenseg = 62;

    public void eszik(){
        switch("jutalom") {
            case "jutalom":
                jollakotsag += 10;
            case "szaraz":
                jollakotsag += 20;
            case "csont":
                jollakotsag += 23;
            case "hazikoszt":
                jollakotsag += 15;
            case "viz":
                jollakotsag += 7;
            case "konzerv":
                jollakotsag += 30;
            case "energiaital":
                jollakotsag += 20;
                energia += 15;
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
