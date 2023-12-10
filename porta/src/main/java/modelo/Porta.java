
package modelo;

/**
 *
 * @author Pichau
 */
public class Porta {

    public Porta(boolean b, String marrom, double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String estaAberta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void exibirInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void fechar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pintar(String branco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public class Porta {
    private boolean aberta;
    private String cor;
    private final double altura;
    private final double comprimento;

    // Construtor
     public Porta(boolean aberta, String cor, double altura, double comprimento) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Método para abrir a porta
    public void abrir() {
        if (!aberta) {
            System.out.println("A porta foi aberta.");
            aberta = true;
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (aberta) {
            System.out.println("A porta foi fechada.");
            aberta = false;
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Método para pintar a porta com uma nova cor
    public void pintar(String novaCor) {
        System.out.println("A porta foi pintada de " + novaCor + ".");
        cor = novaCor;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return aberta;
    }

    // Método para exibir informações sobre a porta
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Status: " + (aberta ? "Aberta" : "Fechada"));
    }
     public static void main(String[] args) {
        // Testando a classe Porta
        Porta minhaPorta = new Porta(false, "Marrom", 2.0, 0.8);

        minhaPorta.abrir();
        minhaPorta.exibirInformacoes();

        minhaPorta.fechar();
        minhaPorta.exibirInformacoes();

        minhaPorta.pintar("Branco");
        minhaPorta.exibirInformacoes();

        System.out.println("A porta está aberta? " + minhaPorta.estaAberta());
     }



