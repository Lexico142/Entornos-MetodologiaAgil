public class Jugador2 extends Personaje {
    private int cantManaJug2;
    private int danoCuerpoaCuerpoJug2;
    private int danoMagiaJug2;
    private int vidaJug2;

    public Jugador2(String nombre, int skillPoints, int cantManaJug2, int danoCuerpoaCuerpoJug2, int danoMagiaJug2, int vidaJug2) {
        super(nombre, skillPoints);
        this.cantManaJug2 = cantManaJug2;
        this.danoCuerpoaCuerpoJug2 = danoCuerpoaCuerpoJug2;
        this.danoMagiaJug2 = danoMagiaJug2;
        this.vidaJug2 = vidaJug2;
    }

    public int getCantManaJug2() {
        return cantManaJug2;
    }

    public void setCantManaJug2(int cantManaJug2) {
        this.cantManaJug2 = cantManaJug2;
    }

    public int getDanoCuerpoaCuerpoJug2() {
        return danoCuerpoaCuerpoJug2;
    }

    public void setDanoCuerpoaCuerpoJug2(int danoCuerpoaCuerpoJug2) {
        this.danoCuerpoaCuerpoJug2 = danoCuerpoaCuerpoJug2;
    }

    public int getDanoMagiaJug2() {
        return danoMagiaJug2;
    }

    public void setDanoMagiaJug2(int danoMagiaJug2) {
        this.danoMagiaJug2 = danoMagiaJug2;
    }

    public int getVidaJug2() {
        return vidaJug2;
    }

    public void setVidaJug2(int vidaJug2) {
        this.vidaJug2 = vidaJug2;
    }

    public void mostrarEstadisticasJug2() {
        System.out.println("=======================================================");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Vida: " + this.vidaJug2);
        System.out.println("Cantidad mana: " + this.cantManaJug2);
        System.out.println("Daño cuerpo a cuerpo: " + this.danoCuerpoaCuerpoJug2);
        System.out.println("Ataque magico: " + this.danoMagiaJug2);
        System.out.println("=======================================================");
    }

}
