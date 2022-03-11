import java.util.Scanner;

interface pracowac {
    public void pracuj();
}

interface Dojezdzac {
    public void dojezdzaj();
}

interface SpedzanieWolnegoCzasu {
    public void spedzajwolnyczas();
}

class NaprawaSamochodow implements pracowac {
    public void pracuj() {
        System.out.println("naprawa");
    }
}

class Leczenie implements pracowac {
    public void pracuj() {
        System.out.println("leczy");
    }
}

class RoznoszenieListow implements pracowac {
    public void pracuj() {
        System.out.println(("nosi listy"));
    }
}

class Samochod implements Dojezdzac {
    public void dojezdzaj() {
        System.out.println("samochod");
    }
}

class Rower implements Dojezdzac {
    public void dojezdzaj() {
        System.out.println("rower");
    }
}

class Silownia implements SpedzanieWolnegoCzasu {
    public void spedzajwolnyczas() {
        System.out.println("silownia");
    }
}



class literatura implements SpedzanieWolnegoCzasu {
    public void spedzajwolnyczas() {
        System.out.println("literatura");
    }
}

class Pracownik {
    public pracowac pracowac = null;
    public Dojezdzac dojezdzac = null;
    public SpedzanieWolnegoCzasu spedzanieWolnegoCzasu = null;

    public Pracownik(String zawod) {
        if (zawod == "mechanik") {
            pracowac = new NaprawaSamochodow();
            dojezdzac = new Samochod();
            spedzanieWolnegoCzasu = new Silownia();
        }
        else if (zawod=="Lekarz")
        {
            pracowac = new Leczenie();
            dojezdzac = new Samochod();
            spedzanieWolnegoCzasu = new Silownia();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
