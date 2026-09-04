public class Denuncia {

    int id;
    Usuario usuario;
    String conteudo;
    String motivo;
    String status;
    String data;

    public void registrar() {
        System.out.println("Denúncia registrada.");
    }

    public void analisar() {
        System.out.println("Denúncia analisada.");
    }

    public void aprovar() {
        status = "Aprovada";
        System.out.println("Denúncia aprovada.");
    }

    public void rejeitar() {
        status = "Rejeitada";
        System.out.println("Denúncia rejeitada.");
    }
}

