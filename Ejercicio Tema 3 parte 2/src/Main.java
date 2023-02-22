public class Main {
    public static void main(String[] args) {
        coche seat = new coche();
        seat.sumarpuertas();
        seat.sumarpuertas();
        System.out.println(seat.puertas);
    }
}
class coche {
    public int puertas = 0;

    public void sumarpuertas() {
        this.puertas++;
    }
}