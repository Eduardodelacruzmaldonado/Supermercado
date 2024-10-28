package fes.aragon;

import java.util.Random;

public class Utilerias {
    public Utilerias() {
    }

    public static int randomCaja() {
        Random random=new Random();
        return random.nextInt(16);
    }
    public Cliente randomLlegadaCliente() {
        Random random=new Random();
        int i=random.nextInt(101);
        if (i<=60){
            Cliente cliente=new Cliente();
            return cliente;
        }else {
            return new Cliente();
        }
    }
}
