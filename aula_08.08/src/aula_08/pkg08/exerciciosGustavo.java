//Faça m pograma que leia 20 números inteiros e amazene-os num vetor. Armazene os números pares no vetor PAR e os números 
//impares no vetor IMPAR.

package aula_08.pkg08;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class exerciciosGustavo {

    public static void main(String[] args) {
       
        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        
        int nivelDeSuspeito = 0;
        
        for (String pergunta: perguntas) {
            
            int resposta = JOptionPane.showConfirmDialog(null, pergunta, "Interrogatório", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION){
                
                nivelDeSuspeito++;
                
            }
            
        }
        
        switch(nivelDeSuspeito){
            
            case 2:
                JOptionPane.showMessageDialog(null, "Suspeito");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Cumplíce");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Assassino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inocente");
                break;
                
        }

    }
    public static void exercicio01(){
        
        //Faça m pograma que leia 20 números inteiros e amazene-os num vetor. Armazene os números pares no vetor PAR e os números impares no vetor IMPAR.
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> listaPares = new ArrayList<>();
        ArrayList<Integer> listaImpares = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            
            String valor = JOptionPane.showInputDialog("Informe um número");
            int valorConvertido = Integer.parseInt(valor);
            listaNumeros.add(valorConvertido);
            
            //Mesma coisa que em cima porém em 1 linha
            //listaNumeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe um número")));
            
            if(listaNumeros.get(i) % 2 == 0){
                
                listaPares.add(listaNumeros.get(i));
                
            }else{
                
                listaImpares.add(listaNumeros.get(i));
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Sua lista foi: "+listaNumeros+"\nOs números pares são: "+listaPares+"\nOs números impares são: "+listaImpares);
        
        
    }
    
    public static void exercicio02(){
        
        //Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista
        ArrayList<Double> temperaturas = new ArrayList<>();
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
        
        int i = 0;
        double somaTotal = 0;
        
        while(i < 12){
            
            String valor = JOptionPane.showInputDialog("Informe a temperatura do mês de "+(meses.get(i+1)));
            double temperaturaConvertida = Double.parseDouble(valor);
            temperaturas.add(temperaturaConvertida);
            somaTotal = somaTotal + temperaturas.get(i);
            i++;
            
        }
       
        double media = somaTotal / temperaturas.size();
        
        for (int j = 0; j < temperaturas.size(); j++) {
            
            if(temperaturas.get(j) > media){
                
                System.out.println("Mês "+meses.get(j+1)+": "+temperaturas.get(j)+" C°");
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "as temperaturas dos meses foram: "+temperaturas+"\n\n E a média foi de: "+media);
        
        
    }
}
