public Class CadProduto
{
public Int cod;
public String name;
public String fab;
public Double preco;

public void mostrarProduto (){
	System.out.printf("/n Os produtos que foram cadastrados" + "/n O codigo do produto: " + this.cod + "/nName: " + this.name + "/n O fabricante eh" + this.fab);
}
}

public class Main {
	public static void mais(String[] args) {
	CadProduto Prod 1 = new CadProduto();
	prod1.cod = 22;
	prod1.name = "Constituicao federal";
	prod1.fab = "livraria"
	prod1.preco = 17;
	prod1.mostrarProduto ();

CadProduto Prod 2 = new CadProduto();
	prod2.cod = 81;
	prod2.name = "Camisa flamengo";
	prod2.fab = "adidas"
	prod2.preco = 309;
	prod2.mostrarProduto ();





