package fes.aragon.pruebas;

import fes.aragon.Cliente;
import fes.aragon.dinamicos.Cola;

public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        Cola<Cliente> cola=new Cola<>();
        cola.imprimir();
    }
}
