package Aula07;

public class Veiculo {

    private void atualizaSensores(){
        System.out.println("Atualiza Sensores!");
    }

    public void calibrarPneu(){
        System.out.println("Calibrando..");
        this.atualizaSensores();
    }
    
}
