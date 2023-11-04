package view;

import controller.ReHash;
import fateczl.Lista.model.Lista;
import model.Cliente;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ReHash hash = new ReHash();
        Lista<Cliente> l = new Lista<>();
        Random rnd = new Random();
        for (int i = 0; i < 10000; i++) {
            Cliente c = new Cliente(i, "Cliete"+i, rnd.nextInt(20000));
            l.addFirst(c);
        }

        try {
            hash.createTable(l);
            hash.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
