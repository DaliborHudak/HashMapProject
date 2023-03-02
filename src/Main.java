import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // databaza spz
        // do databazy priradime skratku okresu a nazov okresu
        // chceme vyhladavat podla skratky okresu
        HashMap<String, String> spz = new HashMap<String, String>();
        spz.put("BB", "Banská Bystrica");
        spz.put("BA", "Bratislava");
        spz.put("ZA", "Žilina");
        System.out.println(spz.get("ZA")); // vypise Zilina

        // vypiseme vsetky hodnoty z HashMapu spz
        for (String mesto: spz.values()) {
            System.out.println(mesto);
        }

        for (String skratka: spz.keySet()) {
            System.out.println(skratka);
        }

        HashMap<Integer, String> psc = new HashMap<Integer, String>();
        psc.put(97411, "Banská Bystrica");
        psc.put(85201, "Spišská Nová Ves");
    }
}
