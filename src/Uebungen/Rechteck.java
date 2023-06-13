package Uebungen;

public class Rechteck {
    double laenge;
    double breite;

    Rechteck() {
        laenge = 0;
        breite = 0;
    }

    Rechteck(double l, double b) {
        laenge = l;
        breite = b;
    }

    void setLaenge(double l) {
        laenge = l;
    }

    void setBreite(double b) {
        breite = b;
    }

    void setSeiten(double l, double b) {
        laenge = l;
        breite = b;
    }

    double getLaenge() {
        return laenge;
    }

    double getBreite() {
        return breite;
    }

    double getLangeSeite() {
        if (laenge > breite) {
            return laenge;
        } else {
            return breite;
        }
    }

    double getKurzeSeite() {
        if (laenge < breite) {
            return laenge;
        } else {
            return breite;
        }
    }

    double getDiagonale() {
        return Math.sqrt(laenge * laenge + breite * breite);
    }

    double getFlaeche() {
        return laenge * breite;
    }

    double getUmfang() {
        return laenge * 2 + breite * 2;
    }

    void laengeAusgeben() {
        double laenge = 5.4;

        System.out.println("Laenge: " + laenge);
    }
}