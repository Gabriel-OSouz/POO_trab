public class Test
{
	public static void main(String[] args)
	{
		Funcionario rog = new Funcionario("702","123","Rogerio",new Endereco("Logradouro","CEP","Uberlandia","Bairro","123","Comple","MG"), "Casado", "Ontem", "Cpts", "rg", 'm',"Chefe",10000.0,"111");
		Gerente ger = new Gerente("702","123","Rogerio",new Endereco("Logradouro","CEP","Uberlandia","Bairro","123","Comple","MG"), "Casado", "Ontem", "Cpts", "rg", 'm',	"Chefe",10000.0,"111","Agencia",true);
		Cliente cli = new Cliente("702","123","Rogerio",new Endereco("Logradouro","CEP","Uberlandia","Bairro","123","Comple","MG"), "Casado", "Ontem","Agencia","escola");
		ContaCorrente cc = new ContaCorrente("Agencia", "123", "conta", "ontem");
	CadastraArq aq = new CadastraArq(rog);
	CadastraArq aq2 = new CadastraArq(ger);
	CadastraArq aq3 = new CadastraArq(cli);
	CadastraArq aq4 = new CadastraArq(cc);
	}
}
