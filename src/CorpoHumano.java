public class CorpoHumano {

    /* =============================
       ATRIBUTOS DA CLASSE
       São definidos como 'private' para respeitar o encapsulamento,
       permitindo acesso apenas por meio dos métodos getters e setters.
    ============================== */
    private double massa;
    private double volume;
    private double densidade;
    private double altura;

    /* =============================
       CONSTRUTOR
       Responsável por inicializar os atributos com os valores informados.
    ============================== */
    public CorpoHumano(double massaInicial, double volumeInicial, double densidadeInicial, double alturaInicial) {
        this.massa = massaInicial;
        this.volume = volumeInicial;
        this.densidade = densidadeInicial;
        this.altura = alturaInicial;
    }

    /* =============================
       MÉTODOS GETTERS
       Permitem apenas a leitura dos valores dos atributos.
    ============================== */
    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }

    /* =============================
       MÉTODOS SETTERS
       Permitem modificar os valores dos atributos de forma controlada.
    ============================== */
    public void setMassa(double novaMassa) {
        this.massa = novaMassa;
    }

    public void setVolume(double novoVolume) {
        this.volume = novoVolume;
    }

    public void setDensidade(double novaDensidade) {
        this.densidade = novaDensidade;
    }

    public void setAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    /* =============================
       MÉTODO DE CÁLCULO DO IMC
       Fórmula: IMC = massa / (altura²)
    ============================== */
    public double calcularIMC() {
        return massa / (altura * altura);
    }

    /* =============================
       MÉTODO DE EXIBIÇÃO COMPLETA
       Mostra todos os valores formatados de forma organizada.
    ============================== */
    public void exibirDados() {
        System.out.println("\n=== DADOS DO CORPO HUMANO ===");
        System.out.println("Massa: " + massa + " kg");
        System.out.println("Volume: " + volume + " m³");
        System.out.println("Densidade: " + densidade + " kg/m³");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f\n", calcularIMC());
    }
}
