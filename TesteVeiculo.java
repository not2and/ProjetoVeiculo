public class TesteVeiculo {
    public static void main(String[] args) {
        //criacao de um objeto da classe Veiculo
        Veiculo celtarebaixado = new Veiculo();
        //atribuicao de valores aos atributos do objeto

        celtarebaixado.marca = "Chevrolet";
        celtarebaixado.modelo = "Celta";
        celtarebaixado.cor = 'p';
        celtarebaixado.velocidade = 0;
        System.out.println("\n\t\t\t -- Meu Celta -- \n");
        celtarebaixado.exibirVeiculo();

        //acelerando o veiculo
        for (int i = 0; i < 120; i++)
            celtarebaixado.acelerar();

        System.out.println("\n\t\t\t -- Meu Celta No Autodromo -- \n");
        celtarebaixado.exibirVeiculo();

        for (int i = 0; i < 120; i++)
            celtarebaixado.desacelerar();

        System.out.println("\n\t\t\t -- Meu Celta Parado -- \n");
        celtarebaixado.exibirVeiculo();
    }
}