package aula_08.pkg08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class setsExample {
    
    public static void main(String[] args){
        
        HashSet<Integer> numeros = new HashSet<>();
        
        numeros.add(10);
        numeros.add(2);
        numeros.add(5);
        numeros.add(15);
        numeros.add(5);
        
        
        System.out.println(numeros);
        System.out.println("----------------");
        System.out.println(numeros.contains(1120));
        numeros.remove(15);
        System.out.println("----------------");
        System.out.println(numeros);
        
        System.out.println("----------------");
        
        for(int valor: numeros){
            System.out.println(valor);
        }
        
        System.out.println("----------------");
     
        
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Urthúr");
        nomes.add("Erthur");
        nomes.add("Irthur");
        nomes.add("Arthur");
        
        System.out.println(nomes);
        System.out.println("----------------");
        
        HashMap<Integer, String> pessoas = new HashMap<>();
        
        pessoas.put(1, "Erik");
        pessoas.put(2, "Laryssa");
        pessoas.put(3, "Kauê");
        
        System.out.println(pessoas.get(2));
        System.out.println("----------------");
        System.out.println(pessoas.size());
        System.out.println("----------------");
        System.out.println(pessoas.containsKey(1));
        System.out.println("----------------");
        System.out.println(pessoas.containsValue("Nycolas"));
        System.out.println("----------------");
        System.out.println(pessoas);
        
        System.out.println("----------------");
        
        for(Map.Entry<Integer, String> entry: pessoas.entrySet()){
            
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            
        }
        
        System.out.println("----------------");
        
        for(Integer key: pessoas.keySet()){
            
            System.out.println(key);
            
        }
        
        System.out.println("----------------");
        
        for(String valores: pessoas.values()){
            
            System.out.println(valores);
            
        }
        
        System.out.println("----------------");
        
        pessoas.forEach((codigo, nome) -> {
            
            System.out.println(codigo+" - "+nome);
            
        });
        
    }
    
}
