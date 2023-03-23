package Java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário e relacione os modelos e seus respectivos consumos");

    Map<String, Double> carrosPopulares = new HashMap<>(){{
      put("Gol", 14.3);
      put("Uno", 15.1);
      put("Mobi", 16.7);
      put("HB20", 12.3);
      put("Kwid", 15.4);
      put("Fiesta", 14.4);
    }};

    System.out.println(carrosPopulares.toString());

    System.out.println("Substitua o consumo do Gol por 15,2 Km/l");
    carrosPopulares.put("Gol", 15.2);
    System.out.println(carrosPopulares);
  }
}
