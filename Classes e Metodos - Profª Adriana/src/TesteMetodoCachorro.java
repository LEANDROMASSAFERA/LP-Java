
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
			canil.setLocalidade("S�o Paulo");
			canil.setMedalhas(57);
			canil.setCria��o(1982);
 
			Competi��o competi��o = new Competi��o();
			competi��o.setPa�s("Italia");
			competi��o.setCidade("Floren�a.");
			competi��o.setPeriodo("21 de Dezembro de 2021");
			competi��o.setEdicao(30);
			
			

			System.out.println("Este � o cachorro de pedigree " + cachorro.pedigree + ", seu nome � " + cachorro.nome + ", sua pelagem � " 
					+ cachorro.pelagem + ", sua idade � de " + cachorro.idade + " anos" + ". Seu peso � de " + cachorro.peso + "kg." + " e sua altura � de " + cachorro.altura + "cm."
					+ " Foi criado no canil " + canil.nome + ", localizado em " + canil.localidade + " criado em " + canil.cria��o + " e ganhador de " + canil.medalhas + " medalhas de ouro."
					+ " Em " + competi��o.periodo  + " participar� da " + competi��o.edicao + " competi��o realizada na " + competi��o.pa�s+ " , na cidade de " + competi��o.cidade);
		}
	}

