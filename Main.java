public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.nome = "João";
        usuario.email = "joao@email.com";

        usuario.cadastrar();
        usuario.login();
        usuario.publicarResenha();
        usuario.favoritar();
        usuario.avaliar();

        Administrador administrador = new Administrador();

        administrador.nome = "Administrador";

        administrador.gerenciarUsuarios();
        administrador.moderarResenha();
        administrador.analisarDenuncia();

        Avaliacao avaliacao = new Avaliacao();

        avaliacao.nota = 9;
        avaliacao.registrarNota();

        Resenha resenha = new Resenha();

        resenha.titulo = "Minha primeira resenha";
        resenha.publicar();

        Comentario comentario = new Comentario();

        comentario.texto = "Gostei muito da resenha!";
        comentario.publicar();

        System.out.println("Sistema funcionando!");
    }
}

