public class Usuario {

    int id;
    String nome;
    String email;
    String senha;
    String tipo;
    String interesses;
    String historico;

    public void cadastrar() {
        System.out.println("Usuário cadastrado.");
    }

    public void login() {
        System.out.println("Usuário realizou login.");
    }

    public void editarPerfil() {
        System.out.println("Perfil editado.");
    }

    public void favoritar() {
        System.out.println("Resenha favoritada.");
    }

    public void avaliar() {
        System.out.println("Resenha avaliada.");
    }

    public void publicarResenha() {
        System.out.println("Resenha publicada.");
    }

    public void denunciarConteudo() {
        System.out.println("Conteúdo denunciado.");
    }
}

