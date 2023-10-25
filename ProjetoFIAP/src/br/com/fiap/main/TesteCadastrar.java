package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteCadastrar {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Aluno objAluno = new Aluno();
		
		AlunoDAO dao = new AlunoDAO();
		
		objAluno.setRm(inteiro("RM"));
		objAluno.setNome(texto("Nome"));
		objAluno.setTurma(texto("Turma"));
		objAluno.setNota(real("Nota"));
		
		System.out.println(dao.inserir(objAluno));
		
		
		
		
		
		

	}

}
