class Carro {
    private String marca, modelo;
    private int ano;
    private double velocidadeAtual;

    Carro(String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual = 0;
    }
    public void acelerar() {
        this.velocidadeAtual = velocidadeAtual + 10;
        }
    public void frear() {
        this.velocidadeAtual = velocidadeAtual - 10;
        if (this.velocidadeAtual < 0){
        this.velocidadeAtual = 0;}
    }
    public void exibirInfo() {
        System.out.println("Dados do carro: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidadeAtual);
    }
    }
