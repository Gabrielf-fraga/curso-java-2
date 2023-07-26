package bytebank_encapsulado;

public class TestagetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
        
        System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente(); 
        paulo.setNome("Paulo silveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("Programador");
	}

}
