public class Avaliacao {

    int id;
    Usuario usuario;
    Resenha resenha;
    double nota;
    String data;

    public void registrarNota() {

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota registrada: " + nota);
        } else {
            System.out.println("A nota deve estar entre 0 e 10.");
        }
    }

    public void alterarNota() {
        System.out.println("Nota alterada.");
    }

    public void calcularMedia() {
        System.out.println("Calculando média.");
    }
}

