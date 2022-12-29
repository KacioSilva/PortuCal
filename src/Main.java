import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculos c1 = new Calculos();
        Scanner input = new Scanner(System.in);

        int horas;
        System.out.print("Informe quantas horas você trabalhou: ");
        horas = input.nextInt();
        c1.setHoras(horas);

        int minutos;
        System.out.print("Informe quantos minutos você trabalhou: ");
        minutos = input.nextInt();
        c1.setMinutos(minutos);

        int dias;
        System.out.print("Informe por quantos dias você trabalhou por esse mesmo tempo: ");
        dias = input.nextInt();
        c1.setDias(dias);

        System.out.println("Tempo Total: " + c1.tempoTotal() + " Minutos");

        System.out.print("Valor Total: " + c1.calcularTotal() + " Euros ");

    }
}