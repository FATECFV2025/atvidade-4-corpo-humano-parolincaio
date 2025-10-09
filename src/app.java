import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        /* =============================
           ENTRADA DE DADOS
           Criação do objeto Scanner (nomeado como 'sc') para capturar os valores.
        ============================== */
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        double massa = sc.nextDouble();

        System.out.print("Digite o volume inicial (m³): ");
        double volume = sc.nextDouble();

        System.out.print("Digite a densidade inicial (kg/m³): ");
        double densidade = sc.nextDouble();

        System.out.print("Digite a altura inicial (m): ");
        double altura = sc.nextDouble();

        // Instanciação do objeto CorpoHumano
        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);

        // Exibe os valores iniciais
        c1.exibirDados();

        /* =============================
           ALTERAÇÃO DE DADOS
           Demonstra o uso dos Setters para modificar atributos.
        ============================== */
        System.out.println("\n=== ALTERAÇÃO DE DADOS ===");
        System.out.print("Digite uma nova massa (kg): ");
        c1.setMassa(sc.nextDouble());

        System.out.print("Digite uma nova altura (m): ");
        c1.setAltura(sc.nextDouble());

        // Exibe os novos valores após alteração
        System.out.println("\n=== NOVOS VALORES ===");
        c1.exibirDados();

        sc.close();

        /* =============================
           CONCLUSÕES DAS QUESTÕES
           - Quando tentamos usar: c1.massa = "2";
             → Ocorre erro, pois 'massa' é privada (encapsulamento impede acesso direto).
             → Conclusão: atributos 'private' só podem ser acessados via getters/setters.

           - Quando mudamos 'private float massa' para 'public float massa':
             → Passa a permitir alteração direta.
             → Conclusão: perde-se o controle de acesso e segurança da classe.

           - Quando alteramos 'public void setVolume(float volume)' para 'private':
             → O método não pode mais ser acessado de fora da classe.
             → Conclusão: métodos 'private' só podem ser usados internamente.
        ============================== */
    }
}
