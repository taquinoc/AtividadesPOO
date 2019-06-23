/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteescola;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author e6661387
 */
public class Principal {

    public static void main(String[] args) {

        String[] opcoes = {"Professor", "Tecnico", "Aluno"};
        int opcao;
        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Cadastramento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            );
            if (opcao == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Olá, você escolheu professor");

                Professor professor = new Professor();

                professor.setIdade(JOptionPane.showInputDialog("Insira a idade do professor: "));

                int idade;
                idade = Integer.parseInt(professor.getIdade());

                if (idade < 18) {
                    JOptionPane.showMessageDialog(null, "Desculpe o professor não poderá ser cadastrado");
                    break;
                } else if (idade > 4) {
                    JOptionPane.showMessageDialog(null, "O professor poderá efetuar corretamente o cadastro");
                }

                professor.setNome(JOptionPane.showInputDialog("Insira o nome do professor "));
                professor.setMatricula(JOptionPane.showInputDialog("Insira a matricula do professor "));
                professor.setSexo(JOptionPane.showInputDialog("Insira o sexo do professor (M/F) "));

                int op = 0;

                String dado = JOptionPane.showInputDialog("O professor precisa ministrar ao menos uma disciplina:"
                        + "\n1.Logica de Programação"
                        + "\n2.Redes"
                        + "\n3.Programação Orientada a Objetos"
                );

                op = Integer.parseInt(dado);
                //O professor está herdando a classe disciplina
                if (op == 1) {
                    professor.setDisciplinaMinistrada("Logica de Programação");

                    JOptionPane.showMessageDialog(null, "Discplina cadastrada");
                }

                if (op == 2) {
                    professor.setDisciplinaMinistrada("Redes");
                    JOptionPane.showMessageDialog(null, "Discplina cadastrada");
                }

                if (op == 3) {
                    professor.setDisciplinaMinistrada("Programação Orientada a Objetos");
                    JOptionPane.showMessageDialog(null, "Discplina cadastrada");

                }

                JOptionPane.showMessageDialog(null, "Parabéns, o professor: " + professor.getNome() + ""
                        + "\nMatricula: " + professor.getMatricula() + ""
                        + "\nSexo: " + professor.getSexo() + ""
                        + "\nIdade: " + professor.getIdade() + ""
                        + "\nDisciplina escolhida: " + professor.getDisciplinaMinistrada()+ "\nFoi cadastrado corretamente!");

            } else if (opcao == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Olá, você escolheu técnico, agora iremos efetuar seu cadastro");

                Tecnico tecnico = new Tecnico();

                tecnico.setIdade(JOptionPane.showInputDialog("Insira a idade do técnico: "));

                int idade;
                idade = Integer.parseInt(tecnico.getIdade());

                if (idade < 18) {
                    JOptionPane.showMessageDialog(null, "Desculpe o técnico não poderá ser cadastrado");
                    break;
                } else if (idade > 4) {
                    JOptionPane.showMessageDialog(null, "O técnico poderá efetuar corretamente o cadastro");
                }

                tecnico.setNome(JOptionPane.showInputDialog("Insira o nome do técnico "));
                tecnico.setMatricula(JOptionPane.showInputDialog("Insira a matricula "));
                tecnico.setSexo(JOptionPane.showInputDialog("Insira o sexo do técnico (M/F) "));

                int op = 0;

                String dado = JOptionPane.showInputDialog("O tecnico precisa trabalhar em  algum setor escolha uma:"
                        + "\n1.Técnico em Informatica"
                        + "\n2.Desenvolvimento"
                        + "\n3.Suporte"
                );

                op = Integer.parseInt(dado);

                if (op == 1) {
                    tecnico.setSetor("Informatica");

                    JOptionPane.showMessageDialog(null, "Setor cadastrado");
                }

                if (op == 2) {
                    tecnico.setSetor("Desenvolvimento");
                    JOptionPane.showMessageDialog(null, "Setor cadastrado");
                }

                if (op == 3) {
                    tecnico.setSetor("Suporte");
                    JOptionPane.showMessageDialog(null, "Setor cadastrado");

                }

                JOptionPane.showMessageDialog(null, "Parabéns, o técnico: " + tecnico.getNome() + ""
                        + "\nMatricula: " + tecnico.getMatricula() + ""
                        + "\nSexo: " + tecnico.getSexo() + ""
                        + "\nIdade: " + tecnico.getIdade() + ""
                        + "\nSetor escolhido: " + tecnico.getSetor() + "\nFoi cadastrado corretamente!");

            } else if (opcao == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Olá, você escolheu aluno! Agora iremos efetuar seu cadastro");

                Aluno aluno = new Aluno();

                aluno.setIdade(JOptionPane.showInputDialog("Insira a idade do aluno: "));

                int idade;
                idade = Integer.parseInt(aluno.getIdade());

                if (idade < 4) {
                    JOptionPane.showMessageDialog(null, "Desculpe o aluno não poderá ser cadastrado");
                    break;
                } else if (idade > 4) {
                    JOptionPane.showMessageDialog(null, "O aluno poderá efetuar corretamente o cadastro");
                }

                aluno.setNome(JOptionPane.showInputDialog("Insira o nome do aluno "));
                aluno.setMatricula(JOptionPane.showInputDialog("Insira a matricula "));
                aluno.setSexo(JOptionPane.showInputDialog("Insira o sexo do aluno (M/F) "));

                int op = 0;

                String dado = JOptionPane.showInputDialog("O aluno precisa se cadastrar em alguma discplina escolha uma:"
                        + "\n1.Lógica de programação"
                        + "\n2.Redes"
                        + "\n3.Programação Orientada a Objetos"
                );

                op = Integer.parseInt(dado);

                if (op == 1) {
                    aluno.setDisciplina("Logica de Programação");

                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada");
                }

                if (op == 2) {
                    aluno.setDisciplina("Redes");
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada");
                }

                if (op == 3) {
                    aluno.setDisciplina("Programação Orientada a Objetos");
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada");

                }

                JOptionPane.showMessageDialog(null, "Parabéns, o aluno: " + aluno.getNome() + ""
                        + "\nMatricula: " + aluno.getMatricula() + ""
                        + "\nSexo: " + aluno.getSexo() + ""
                        + "\nIdade: " + aluno.getIdade() + ""
                        + "\nDisciplina escolhida: " + aluno.getDisciplina() + "\nFoi cadastrado corretamente!");

            }

        } while (opcao != JOptionPane.CLOSED_OPTION);

    }
}
