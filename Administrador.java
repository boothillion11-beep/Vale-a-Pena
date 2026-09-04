public class Administrador extends Usuario {

    String permissoes;

    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários.");
    }

    public void moderarResenha() {
        System.out.println("Moderando resenha.");
    }

    public void analisarDenuncia() {
        System.out.println("Analisando denúncia.");
    }

    public void gerenciarCategorias() {
        System.out.println("Gerenciando categorias.");
    }

    public void gerenciarClassificacoes() {
        System.out.println("Gerenciando classificações.");
    }

    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado.");
    }
}

