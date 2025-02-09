public class Concessionaria {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022,0);

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();

        meuCarro.frear();
        meuCarro.frear();

        meuCarro.exibirInfo();
    }
}