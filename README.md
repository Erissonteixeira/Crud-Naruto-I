🥷 Exercício POO - Anime Naruto

Projeto desenvolvido em Java, com objetivo de praticar Programação Orientada a Objetos (POO) utilizando personagens do anime Naruto. O projeto explora conceitos de herança, interfaces e encapsulamento.
---
📌 Tecnologias utilizadas

Java 17+ POO
---
📁 Estrutura de Pacotes
```
src/main/java/io/github/usuario/naruto/
├── model       # Classes de domínio (Personagem)
├── ninja       # Interfaces e classes de especialização Ninja (Taijutsu, Ninjutsu, Genjutsu)
└── Main.java   # Classe principal para executar o programa
```
---
⚡ Classes e Interfaces
### Classe Personagem

## Atributos:

- nome (String)

- idade (int)

- aldeia (String)

- jutsus (ArrayList<String>)

- chakra (int)

### Métodos:

## Construtor para inicializar os atributos.

- adicionarJutsu(String jutsu) → adiciona um novo jutsu ao personagem.

- aumentarChakra(int quantidade) → aumenta o chakra do personagem.

---
### Interface Ninja

## Métodos:

- usarJutsu() → exibe mensagem indicando que o personagem está usando um jutsu.

- desviar() → exibe mensagem indicando que o personagem está desviando de um ataque.
---
### Classes Especializadas

## Todas estendem Personagem e implementam a interface Ninja.

## NinjaDeTaijutsu

- usarJutsu() → indica que está usando um golpe de Taijutsu.

- desviar() → indica que está desviando usando Taijutsu.

### NinjaDeNinjutsu

- usarJutsu() → indica que está usando um jutsu de Ninjutsu.

- desviar() → indica que está desviando usando Ninjutsu.

### NinjaDeGenjutsu

- usarJutsu() → indica que está usando um jutsu de Genjutsu.

- desviar() → indica que está desviando usando Genjutsu.
