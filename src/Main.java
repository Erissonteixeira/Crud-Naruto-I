public class Main {
    public static void main(String[] args) {
        NinjaDeTaijutsu rockLee = new NinjaDeTaijutsu(
                "Rock Lee",
                17,
                "Konoha",
                new String[]{"Punho Forte", "Lótus Primária"},
                500
        );

        NinjaDeNinjutsu naruto = new NinjaDeNinjutsu(
                "Naruto Uzumaki",
                16,
                "Konoha",
                new String[]{"Rasengan", "Clone das Sombras"},
                800
        );

        NinjaDeGenjutsu itachi = new NinjaDeGenjutsu(
                "Itachi Uchiha",
                21,
                "Konoha",
                new String[]{"Tsukuyomi", "Genjutsu do Corvo"},
                1000
        );

        rockLee.exibirInformacoes();
        System.out.println("-----------------------");
        naruto.exibirInformacoes();
        System.out.println("-----------------------");
        itachi.exibirInformacoes();

        System.out.println("\n=== Testando habilidades ===");
        rockLee.usarJutsu();
        rockLee.desviar();

        naruto.usarJutsu();
        naruto.desviar();

        itachi.usarJutsu();
        itachi.desviar();

        System.out.println("\n=== Testando aumento de chakra ===");
        naruto.aumentarChakra(200);
        naruto.exibirInformacoes();

        System.out.println("\n=== Adicionando novo jutsu ===");
        itachi.adicionarJutsu("Amaterasu");
        itachi.exibirInformacoes();
    }
}

