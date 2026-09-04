public class Favorito {

    int id;
    Usuario usuario;
    Resenha resenha;
    String data;

    public void adicionar() {
        System.out.println("Resenha adicionada aos favoritos.");
    }

    public void remover() {
        System.out.println("Resenha removida dos favoritos.");
    }

    public void listarFavoritos() {
        System.out.println("Listando favoritos.");
    }
}

