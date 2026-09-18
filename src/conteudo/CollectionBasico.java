package conteudo;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class CollectionBasico {

    public static void main(String[] args) {
      //testarList();
       // testarMap();
        testarSet();
    }

    private static void testarList() {
        List <String> jogos = new ArrayList<>();
        jogos.add("gta 5");
        jogos.add("minecraft");
        jogos.forEach(System.out::println);

        List <String> animes = new LinkedList<>();
        animes.add("konosuba");
        animes.add("tokyo ghoul");
        animes.forEach(System.out::println);
    }

    private static void testarMap() {
        List <String> jogospc = List.of("minecraft", "brasfoot" );
        List <String> jogosmob = List.of("brawl stars", "call of duty" );
        Map <String, List<String>> jogos = new HashMap<>();
        jogos.put("pc", jogospc);
        jogos.put("mobile", jogosmob);
        jogos.forEach((chave,valor)->
                System.out.println(chave+"-" +valor)
                );

        // ESTUDAR LINKEDHASHMAP

        // ESTUDAR TREEMAP


    }
    private static void testarSet() {
        Set<String> jogos=new HashSet<>();
        jogos.add("roblox");
        jogos.add("bloons td6");
        jogos.add("fortnite");
        jogos.add("roblox");
        System.out.println(jogos);
        // ESTUDAR LINKEDHASHSET

        //ESTUDAR TREESET
    }

}