package tag2;

public class C01_Kreis {
   double radius;

   // Konstruktoren erzeugen
    C01_Kreis(){
        radius = 0;
    }

    public C01_Kreis(double r){
        radius = r;
    }

    // Getter und Setter Methoden einrichten
    double getRadius(){
        return radius;
    }

    void setRadius(double r){
        radius = r;
    }

    double getUmfang(){
        return 2 * Math.PI * radius;
    }

    double getFläche(){
        return Math.PI * radius * radius;
    }

    void setUmfang(double u){
        radius = u/ (2*Math.PI);
    }

    void  setFaläche(double f){
        radius = Math.sqrt(f/ Math.PI);
    }

}
