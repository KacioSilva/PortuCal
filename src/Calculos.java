public class Calculos {
    private int horas;
    private int minutos;
    private int dias;

    public int getDias(){
        return this.dias;
    }
    public void setDias(int dias){
        this.dias = dias;
    }
    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    public int getMinutos(){
        return this.minutos;
    }

    public double tempoTotal(){
        return (getMinutos() + (getHoras() * 60));
    }
    public double calcularTotal(){
        return ((4.25 * (getMinutos() + (getHoras() * 60) ) ) /60) * getDias();
    }
}
