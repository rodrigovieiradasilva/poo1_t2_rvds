

public Class CadFunc
{
public Int cpf_fun;
public String name_func;
public String dt_nasc;
public String dt_ing;

public void mostrarFun (){
	System.out.printf("/n Os Funcionarios que foram cadastrados" + "/n O Cpf " + this.cpf_fun + "/n name_func: " + this.name_func + "/n O data de nascimento eh" + this.dt_nasc + dat de ingresso eh this.dt_ing);
}
}


CadFunc func1 = new CadFunc();
	func1.cpf_fun = 99999999911;
	func1.name_func = "Gabi Gol";
	func1.dt_nasc = "23/08/1995";
	func1.dt_ing = "06/06/2022";
	func1.mostrarFun();

CadFunc func2 = new CadFunc();
	func2.cpf_fun = 11111111199;
	func2.name_func = "Arrascaeta";
	func2.dt_nasc = "24/08/1995";
	func2.dt_ing = "04/06/2022";
	func2.mostrarFun();