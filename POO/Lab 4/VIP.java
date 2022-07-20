public class VIP extends Ingresso{

    private int valorAdicional;

    public int getValorAdicional(){
        return valorAdicional;
    }
    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
        public int valorIngressVip (int valor){
            this.valorAdicional = valor;
            return this.valorAdicional + (this.valorAdicional + super.getValor());

    }
}
