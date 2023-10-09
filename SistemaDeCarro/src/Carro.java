public class Carro {

    //atributos nome, marca, ano, velocidade
    String nome;
    String marca;
    int ano;
    int vel;
    int marcha;

//metodos
    void freiar(int reduzir) {
        vel-=reduzir;
    }

 void buzinar (){
    System.out.println("Sai caralho");
 }

 void acelerar(int aceleracao) {
    vel += aceleracao;
    if (vel < 30) {
        marcha = 1; // Primeira marcha
    } else {
        marcha = 2; // Segunda marcha
    }
}

}
