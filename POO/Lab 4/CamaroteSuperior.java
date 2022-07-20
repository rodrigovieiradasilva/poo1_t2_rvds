public class CamaroteSuperior extends VIP {

    private int adc;

    public int getAdc() {
        return adc;
    }

    public void setAdc(int adc) {
        this.adc = adc;
    }

    public int vlradc (int vlradc){
        vlradc = this.adc;
        int vlradd = (this.adc + this.getvalor());
        return vlradd

    }
}
