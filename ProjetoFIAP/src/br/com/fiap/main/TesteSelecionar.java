package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		
		AlunoDAO dao = new AlunoDAO();
		
		List<Aluno> listaAlunos = (ArrayList<Aluno>) dao.selecionar();
		
		if(listaAlunos != null) {
			//foreach
			for(Aluno aluno : listaAlunos) {
				System.out.println(aluno.getRm() + " " + 
									aluno.getNome() + " " + 
									aluno.getTurma() + " " + 
									aluno.getNota() + " ");
			}
			
			
		}
		
		

	}

}
