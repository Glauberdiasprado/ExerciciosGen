package br.com.generation.ExercicioHeranca;

public class TesteTudo {

	public static void main(String[] args) {
		
		Animal cachorro1 = new Animal();
		
		cachorro1.setNome("Hades");
		cachorro1.setSom("Latido");
		cachorro1.setCorrer("Correu 3km");
		cachorro1.setIdade(3);
		
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade());
		System.out.println("Som: " + cachorro1.getSom());
		System.out.println(cachorro1.getCorrer());
		System.out.println();
		
		Animal cavalo = new Animal();
		
		cavalo.setNome("vacalo");
		cavalo.setSom("Relinchar");
		cavalo.setCorrer("Correu 20km");
		cavalo.setIdade(10);
		
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Som: " + cavalo.getSom());
		System.out.println(cavalo.getCorrer());
		System.out.println("----------------------");
		
		Animal preguiça = new Animal();
		
		cavalo.setNome("vacalo");
		cavalo.setSom("Relinchar");
		cavalo.setCorrer("Correu 20km");
		cavalo.setIdade(10);
		
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Som: " + cavalo.getSom());
		System.out.println(cavalo.getCorrer());
		System.out.println("-----------------");
		System.out.println();
		
		Animal preguica = new Animal();

        preguica.setNome("Jerume");
        preguica.setIdade(90);
        preguica.setSom("sono ZzZzZzZzZ....");
        preguica.setSubir(" subiu 3 árvores em 10 dias.");

        System.out.println("Animal - PREGUIÇA");
        System.out.println("Nome da preguiça: "+preguica.getNome()+".");
        System.out.println("Idade da preguiça: "+preguica.getIdade()+" anos.");
        System.out.println("Som emitido: "+preguica.getSom());
        System.out.println("A preguiça " +preguica.getNome() +preguica.getSubir());
	}

}
