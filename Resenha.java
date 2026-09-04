public class Resenha {

    int id;
    String titulo;
    String texto;
    double nota;
    Usuario usuario;
    Categoria categoria;
    Subgenero subgenero;
    FaixaEtaria faixaEtaria;
    String tags;
    String imagens;
    String linksExternos;
    String dataPublicacao;

    public void publicar() {
        System.out.println("Resenha publicada.");
    }

    public void editar() {
        System.out.println("Resenha editada.");
    }

    public void excluir() {
        System.out.println("Resenha excluída.");
    }

    public void calcularNotaMedia() {
        System.out.println("Calculando nota média.");
    }

    public void adicionarTag() {
        System.out.println("Tag adicionada.");
    }

    public void adicionarImagem() {
        System.out.println("Imagem adicionada.");
    }

    public void adicionarLink() {
        System.out.println("Link adicionado.");
    }
}

