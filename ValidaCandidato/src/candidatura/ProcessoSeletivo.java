package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo!");
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecionarCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"MARIA", "JOSÉ", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "POLLYANNA", "CAUA", "MARIANA"};
        for(String candidato : candidatos){
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativas=1;
        boolean continuar=true;
        boolean atendeu=false;
        do{
            atendeu=atender();
            continuar = !atendeu;
            if(continuar){
                tentativas++;
            } else{
                System.out.println("Contato realizado com sucesso.");
            }

        }while(continuar && tentativas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativas+" tentativa.");
        } else {
            System.out.println("Não conseguimos contato com o candidato "+candidato+", número máximo de tentativas "+tentativas+" realizadas.");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"MARIA", "JOSÉ", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "POLLYANNA", "CAUA", "MARIANA"};
        System.out.println("Imprimindo a lista de candidateos informando o índice do elemento.");
        
        for(int indice=0; indice<candidatos.length; indice++){
            System.out.println("O candidato de nº "+(indice+1)+" é "+candidatos[indice]);
        }
        // ou foreach
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"MARIA", "JOSÉ", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "POLLYANNA", "CAUA", "MARIANA"};
        double salarioBase = 2000.0;
        int selecionados = 0;
        int candidatoAtual = 0;
        while(selecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" solicitou este valor: "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
                selecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
