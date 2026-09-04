public class Comentario {

    int id;
    Usuario usuario;
    Resenha resenha;
    String texto;
    String data;
    Comentario comentarioPai;

    public void publicar() {
        System.out.println("Comentário publicado.");
    }

    public void editar() {
        System.out.println("Comentário editado.");
    }

    public void excluir() {
        System.out.println("Comentário excluído.");
    }

    public void responder() {
        System.out.println("Comentário respondido.");
    }

    public void denunciar() {
        System.out.println("Comentário denunciado.");
    }
}

