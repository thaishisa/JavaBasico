package com.thais.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato= new Contato();
		
		contato.setNome("Thais");
		//contato.setEndereco("Rua da Raiva");
		//contato.setTelefone("11 99999-9999");
		
		//criar objeto endereco - relacionamento tem-um endereco
		Endereco end= new Endereco();
		
		end.setNomeRua("Rua da bad");
		end.setNumero("501");
		end.setComplemento("-");
		end.setCep("05875-210");
		end.setCidade("Sao Paulo");
		end.setEstado("Sao Paulo");
		
		contato.setEndereco(end);
		
		//criar objeto telefone- relacionamento tem-um telefone//tem-muitos
		Telefone tel1=new Telefone();
		
		tel1.setTipo("residencial");
		tel1.setDdd("41");
		tel1.setNumero("5813-4532");
		
		Telefone tel2=new Telefone();
		
		tel2.setTipo("celular");
		tel2.setDdd("11");
		tel2.setNumero("98332-6011");
		
		Telefone[] telefones=new Telefone[2];
		telefones[0]=tel1;
		telefones[1]=tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone()); pega a referencia na memoria de onde o objeto esta
		//System.out.println(contato.getEndereco()); pega a referencia na memoria de onde o objeto esta
		
		if(contato!= null && contato.getEndereco()!=null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato!= null && contato.getTelefone()!=null) {
			System.out.println(contato.getTelefone().getDdd()+ " "+contato.getTelefone().getNumero());
		}*/
		
		if(contato!= null && contato.getTelefones()!=null) {
			/*for(Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd()+ " "+t.getNumero());
			}*/
			
			for(int i=0; i<telefones.length;i++) {
				System.out.println(telefones[i].getDdd()+ " "+telefones[i].getNumero());
			}
		}
	}

}
