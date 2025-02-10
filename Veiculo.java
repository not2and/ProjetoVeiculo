public class Veiculo {
    //atributos
    String marca;
    String modelo;
    char cor;
    int velocidade;
    //metodos
    
    public void exibirVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println(String.format("Velocidade: %dkm/h\n ", velocidade));
    }
 
    public void acelerar(){
        velocidade ++;
    }

    public void frear(){
        velocidade --;
    }
}
