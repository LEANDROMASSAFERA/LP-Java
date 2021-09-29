
public class TesteMetodoCachorro {
	
		public static void main(String[] args) {
			
			Cachorro cachorro = new Cachorro();
			cachorro.setNome("Astor");
			cachorro.setPedigree("rosa");
			cachorro.setPeso(40);
			cachorro.setAltura(50);
			cachorro.setIdade(7);
			cachorro.setPelagem("longa");
			
			Canil canil = new Canil ();
			canil.setNome("Splendour");
			canil.setLocalidade("São Paulo");
			canil.setMedalhas(57);
			canil.setCriação(1982);
 
			Competição competição = new Competição();
			competição.setPaís("Italia");
			competição.setCidade("Florença.");
			competição.setPeriodo("21 de Dezembro de 2021");
			competição.setEdicao(30);
			
			

			System.out.println("Este é o cachorro de pedigree " + cachorro.pedigree + ", seu nome é " + cachorro.nome + ", sua pelagem é " 
					+ cachorro.pelagem + ", sua idade é de " + cachorro.idade + " anos" + ". Seu peso é de " + cachorro.peso + "kg." + " e sua altura é de " + cachorro.altura + "cm."
					+ " Foi criado no canil " + canil.nome + ", localizado em " + canil.localidade + " criado em " + canil.criação + " e ganhador de " + canil.medalhas + " medalhas de ouro."
					+ " Em " + competição.periodo  + " participará da " + competição.edicao + " competição realizada na " + competição.país+ " , na cidade de " + competição.cidade);
		}
	}

