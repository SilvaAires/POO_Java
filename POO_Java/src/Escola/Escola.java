package Escola;

public class Escola {
	public static void main(String[] args) {
		Aluno fe = new Aluno();
		fe.setNome("Felipe");
		fe.setIdade(8);
		
		System.out.println("Nome "+fe.getNome()+" Idade "+fe.getIdade());
	}
}
