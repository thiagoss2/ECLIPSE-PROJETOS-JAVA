package br.com.app;

import java.util.ArrayList;
import java.util.List;

public class TestaContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Contato contato = new Contato("Pedro", "55 11 8922-7013");

        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Andre", "55 11 8933-7013"));
        contatos.add(new Contato("Joaquina", "55 11 8922-7012"));
        contatos.add(new Contato("Breatriz", "55 11 7960-1240"));

        contato.setContatos(contatos);

        contato.imprimeLista(contatos);
        
        System.out.println("\n");


        contato.ligarPara("Joaquina");
        
       
    

	}

}
