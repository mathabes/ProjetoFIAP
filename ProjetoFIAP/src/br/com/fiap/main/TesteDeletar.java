package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Aluno objAluno = new Aluno();
		
		AlunoDAO dao = new AlunoDAO();
		
		objAluno.setRm(inteiro("Digite o RM do Aluno a ser Deletado"));
		
		System.out.println(dao.deletar(objAluno));
		
		

	}

}
