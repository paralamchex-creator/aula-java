package conteudo;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class CollectionBasico {

    public static void main(String[] args) {
      //testarList();
       //testarMap();
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
        List <String> doces = List.of("pudim", "doce de abobora", "bolo");
        List <String> salgados = List.of("coxinha", "empada", "batata com bacon");
        Map <String, List<String>> comidas = new LinkedHashMap<>();

        comidas.put("doces", doces);
        comidas.put("salgados", salgados);
        comidas.forEach((chave,valor)->
                System.out.println(chave+"-" +valor)
        );



        // ESTUDAR TREEMAP
        Map <String, String> pessoas = new TreeMap<>();
        pessoas.put("garro", "12345");
        pessoas.put("memphis", "12345");
        pessoas.put("neneca", "12345");
        pessoas.put("yuri", "12345");
        pessoas.put("alberto", "12345");
        pessoas.forEach((chave,valor)->
                System.out.println(chave+"-" +valor)
        );


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
        Set<String> paises = new LinkedHashSet<>();
        paises.add("russia");
        paises.add("albania");
        paises.add("venezuela");
        paises.add("iraque");
        paises.add("brasil");
        paises.add("iraque");
        System.out.println(paises);


        Set<String> paises2 = new TreeSet<>();
        paises2.add("russia");
        paises2.add("albania");
        paises2.add("venezuela");
        paises2.add("iraque");
        paises2.add("brasil");
        System.out.println(paises2);
    }

}