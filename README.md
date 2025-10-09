# Atividade: Modificadores de Acesso e Getters/Setters

## Descrição
Este projeto foi desenvolvido para simular o uso de **modificadores de acesso (private/public)** e **métodos Getters e Setters** em Java, utilizando a classe `CorpoHumano`.  
Também foi implementado o cálculo do **IMC (Índice de Massa Corporal)** como desafio extra.

---

## Estrutura do Projeto
- `App.java` → Classe principal, responsável pela interação com o usuário e execução do programa.
- `CorpoHumano.java` → Classe que representa o corpo humano, com atributos privados e métodos de acesso (get/set).

---

## Execução do Programa

### Exemplo de entrada:

=== CRIAÇÃO DO OBJETO CORPO HUMANO ===
Digite a massa inicial (kg): 70
Digite o volume inicial (m³): 0.07
Digite a densidade inicial (kg/m³): 1000
Digite a altura inicial (m): 1.75

### Saída esperada:

=== VALORES INICIAIS ===
Massa: 70.0 kg
Volume: 0.07 m³
Densidade: 1000.0 kg/m³
Altura: 1.75 m
IMC: 22.86

Digite uma nova massa (kg): 80
Digite uma nova altura (m): 1.80

Novos valores:
Massa: 80.0 kg
Altura: 1.8 m
Novo IMC: 24.69


---

## Questões solicitadas

### 1. Linha `c1.massa = "2";` após instanciar o objeto

**Ocorrência:**  
Ocorreu um erro de compilação. A variável `massa` é privada, portanto, **não pode ser acessada diretamente fora da classe `CorpoHumano`**.

**Conclusão:**  
O modificador `private` impede o acesso direto ao atributo, garantindo o **encapsulamento** e protegendo os dados.  
A modificação deve ser feita apenas por meio do **método setter**.

---

### 2. Alterar `private double massa` para `public double massa`

**Ocorrência:**  
O código passou a compilar e a execução permitiu alterar `massa` diretamente.

**Conclusão:**  
O modificador `public` permite acesso livre ao atributo, o que **quebra o encapsulamento**.  
Isso pode gerar inconsistências ou valores inválidos, por isso **não é uma boa prática**.

---

### 3. Alterar `public void setVolume(double volume)` para `private void setVolume(double volume)`

**Ocorrência:**  
Ao tentar chamar `c1.setVolume()` na `App.java`, o compilador exibiu erro de acesso.

**Conclusão:**  
Um método `private` só pode ser usado dentro da própria classe.  
Torná-lo `private` impede que código externo (como `App.java`) altere o volume diretamente.  
Essa proteção é útil quando você quer controlar totalmente como o atributo é alterado.

---

## Desafio Extra

Foi adicionado o atributo **Altura** e os métodos `getAltura()` e `setAltura()`.

Além disso, foi implementado o método:

`
java
public double calcularIMC() {
    return massa / (altura * altura);
}
` 

---

## Autor
Caio Parolin
