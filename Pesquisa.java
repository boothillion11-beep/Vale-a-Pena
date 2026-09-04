public class Pesquisa {

    String termo;
    Categoria categoria;
    Subgenero subgenero;
    FaixaEtaria faixaEtaria;
    double notaMinima;
    String tags;

    public void buscar() {
        System.out.println("Realizando pesquisa.");
    }

    public void filtrar() {
        System.out.println("Filtrando resultados.");
    }

    public void ordenarPorNota() {
        System.out.println("Ordenando por nota.");
    }

    public void ordenarPorPopularidade() {
        System.out.println("Ordenando por popularidade.");
    }
}

