package innerclass.regular;

public class Hero {

    /*
    * Objetivo:
    * Criar classe Hero com uma munição associada e a classe Wepon com método shoot decrementando a munição
    *
    * */

    private int ammo;

    public Hero(int ammo){
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }


    public class Weapon {

        public void shoot(){
            ammo--;
        }
    }
}
