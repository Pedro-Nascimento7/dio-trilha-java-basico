package Map;

import java.security.KeyStore;
import java.util.*;

import static java.util.Calendar.AM;

public class ExemploMap {
    public static void main(String[] args) {
 //       Dado os modelos dos carros e seus respectivos consumoss na estrada, faça:
 //        modelo = gol - consuumo = 14,4km/L
 //        modelo = uno - consuumo = 15,6km/L
 //        modelo = mobi - consuumo = 16,1km/L
 //        modelo = hb20 - consuumo = 14,5km/L
 //        modelo = kwid - consuumo = 15,6km/L

//    Map carroPopulares2020 = new HashMap(); //antes do java 5
//    Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5)
//      HashMap<String, Double> carrosPopulares = new HashMap<>();
// Map<String, Double> carrosPopulares2025 = Map.of("gol", 14.4, "uno" 15.6, "mobi" 16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos");
            Map<String, Double> carrosPopulares = new HashMap<>(){{
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }};
        System.out.println(carrosPopulares.toString());

       System.out.println("Substitua a consumo do gol por 15,2 Km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos : ");
        Set<String> modelos = carrosPopulares.keySet();


        System.out.println("Exiba os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais econômico e o seu consumo: ");

       Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
       Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
             if (entry.getValue().equals(consumoMaisEficiente)){
                 modeloMaisEficiente = entry.getKey();
                 System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
             }
        }

        System.out.println("Exiba o modelo menos econômico e seu consulmo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry :carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo monos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }


       System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma);

       System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));


       System.out.println("Remova os modelos com o consumo igual a 15,6 Km/l: ");
       Iterator<Double> interator1 = carrosPopulares.values().iterator();
       while (interator1.hasNext()){
           if (interator1.next().equals(15.6)) interator1.remove();
       }
        System.out.println(carrosPopulares);

       System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());


        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());



        System.out.println("Apague o dicionário de carros; ");
        carrosPopulares.clear();


        System.out.println("Confira se a lista está vazia: " + carrosPopulares.isEmpty());



    }
}
