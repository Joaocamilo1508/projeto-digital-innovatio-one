package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical tc = new ReprodutorMusical();
        tc.Tocar();
        tc.Pausar();
        tc.SelecionarMusica("2pac");

        Telefone ab = new Telefone();
        ab.ligar("1995996");
        ab.atender();
        ab.correioVoz();

        Navegador_Internet ni = new Navegador_Internet();
        ni.adicionarNovaAba();
        ni.atualizarPagina();
        ni.exibirPagina("http/fgkfkgjd");
    }
}