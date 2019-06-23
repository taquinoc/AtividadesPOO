/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesbasicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal {

    public static void main(String[] args) {

        Operacao teste = new ExContas();
        Operacao testeRetangulo = new ExArea();

        String dado;
        int op;

        JOptionPane.showMessageDialog(null, "O programa selecionou os seguintes números, numero 1: " + teste.getNumero1() + " e o número 2: " + teste.getNumero2());

        dado = JOptionPane.showInputDialog("O que você deseja fazer?"
                + "\n 1.Somar"
                + "\n 2.Subtrair"
                + "\n 3.Multiplicar"
                + "\n 4.Dividir"
                + "\n 5.Calcular área do retangulo"
        );
        op = Integer.parseInt(dado);

        switch (op) {

            case 1:

                teste.calcularAdicao();
                break;

            case 2:

                teste.calcularSubtracao();
                break;

            case 3:
                teste.calcularMultiplicacao();

                break;

            case 4:

                teste.calcularDivisao();
                break;

            case 5:

                testeRetangulo.calcularAreaRetangulo();

                break;

        }

    }
}
