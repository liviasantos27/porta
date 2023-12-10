/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class Principal {
    public class Porta {
    // (métodos e atributos da classe Porta)

    public static void main(String[] args) {
        // Testando a classe Porta
        Porta minhaPorta = new Porta(2.0+ 0.8+ false+ "Marrom");

        minhaPorta.abrir();
        minhaPorta.exibirInformacoes();

        minhaPorta.fechar();
        minhaPorta.exibirInformacoes();

        minhaPorta.pintar("Branco");
        minhaPorta.exibirInformacoes();

        System.out.println("A porta está aberta? " + minhaPorta.estaAberta());
    }

        private String estaAberta() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void exibirInformacoes() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }


        private void abrir() {
            throw new UnsupportedOperationException("Not supported yet."); 

        private void fechar() {
            throw new UnsupportedOperationException("Not supported yet.");
        }




