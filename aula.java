package Aula07;

public class aula {

    public static void main (String[] args){
        Bicicleta bicil = new Bicicleta();
        bicil.calibrarPneu();
        bicil.pedalar();

        Carro car1 = new Carro();
        car1.calibrarPneu();
        car1.dirigir();

        Conversivel conv1 = new Conversivel();
        conv1.abrirCapota();
        conv1.dirigir();
        conv1.calibrarPneu();


        //conv1.atualizaSensores();

    }
    
}
