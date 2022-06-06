public class Conta {
 private double limite ;
 private double saldo ;
 public double getSaldo () {
 return saldo ;
 }
public void setSaldo ( double x) {
 saldo = x ;
 }
 public double getLimite () {
 return limite ;
 }
 public void setLimite ( double y) {
 limite = y;
 }
 }
 public class Banco
 {
 public static void main ( String args [] )
 {
 Conta c1 = new Conta () ;
 c1 . setSaldo ( 1000 );
 c1 . setLimite ( 1000 );
 double saldoAtual = c1 . getSaldo () ;
 System . out . println ( " Saldo atual é " + saldoAtual ) ;
 double limiteConta = c1 . getLimite () ;
 System . out . println ( " Limite é " + limiteConta );
 }
 }

 public class Conta {
 private double saldo ;
 private double limite ;
 public void depositar ( doublex )
 {
 saldo = saldo + x;
 }
 public void sacar ( double x )
 {
 saldo = saldo - x;
}
 public double getSaldo ()
 {
 return saldo ;
 }

 public void setLimite ( doublex )
 {
 limite = x;
 }

 public double getLimite ()
 {
 return limite ;
 }
 }

 public class Banco
 {
 public static void main ( String args [] )
 {
 Conta c1 = new Conta () ;
 c1 . setLimite ( 300 );
 c1 . depositar ( 500 );
 c1 . sacar ( 200 );
 System . out . println ( "O saldo é " + c1 . getSaldo () );
 }
 }

public void sacar ( double x) {
 if ( saldo + limite >= x )
 saldo = saldo - x;
}

class Veiculo
 {
 private String marca ;
 private String placa ;
 private int kilometragem ;
 public Veiculo ( String m , String p , int k )
 {
 marca = m ;
 placa = p ;
 kilometragem = k;
 }
 public String getPlaca ()
 {
 return placa ;
 }
 public String getMarca ()
 {
 return marca ;
}

 public int getKilometragem ()
 {
 return kilometragem ;
 }
 public void setKilometragem ( int k )
 {
 kilometragem = k;
 }
 }

 class AcessaCarro
 {
 public static void main ( String args [])
 {
 Veiculo meuCarro = new Veiculo (" Escort ","XYZ -3456 " ,60000) ;
 String marca ;
 int kilometragem ;
 marca = meuCarro . getMarca () ;
 System . out . println ( marca );
 kilometragem = meuCarro . getKilometragem () ;
 System . out . println ( kilometragem );
 meuCarro . setKilometragem ( 100000 );
 System . out . println ( kilometragem );
}
}
