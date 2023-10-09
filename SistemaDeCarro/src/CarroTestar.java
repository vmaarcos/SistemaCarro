public class CarroTestar {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 10; //velocidade padrão

        c1.acelerar(10); //selecione a velocidade do carro.

        // se a velocidade for maior que 30 passara para a segunda marcha
        if (c1.vel >= 30) {
            System.out.println("O carro passou para segunda marcha");
        }

        System.out.println("Velocidade: " + c1.vel + " km/h");
    }
}
