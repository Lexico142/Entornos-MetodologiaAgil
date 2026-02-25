public class Jugador1 extends Personaje {
    private int cantMana;
    private int danoCuerpoaCuerpo;
    private int danoMagia;
    private int vida;

    public Jugador1(int cantMana, int danoCuerpoaCuerpo, int danoMagia, int vida, String nombre, int skillPoints) {
        super(nombre, skillPoints);
        this.cantMana = cantMana;
        this.danoCuerpoaCuerpo = danoCuerpoaCuerpo;
        this.danoMagia = danoMagia;
        this.vida = vida;
    }

    public int getCantMana() {
        return cantMana;
    }

    public void setCantMana(int cantMana) {
        this.cantMana = cantMana;
    }

    public int getDanoCuerpoaCuerpo() {
        return danoCuerpoaCuerpo;
    }

    public void setDanoCuerpoaCuerpo(int danoCuerpoaCuerpo) {
        this.danoCuerpoaCuerpo = danoCuerpoaCuerpo;
    }

    public int getDanoMagia() {
        return danoMagia;
    }

    public void setDanoMagia(int danoMagia) {
        this.danoMagia = danoMagia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void mostrarEstadisticasJug1() {
        System.out.println("=======================================================");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Vida: " + this.vida);
        System.out.println("Cantidad mana: " + this.cantMana);
        System.out.println("Daño cuerpo a cuerpo: " + this.danoCuerpoaCuerpo);
        System.out.println("Ataque magico: " + this.danoMagia);
        System.out.println("=======================================================");
    }
}
