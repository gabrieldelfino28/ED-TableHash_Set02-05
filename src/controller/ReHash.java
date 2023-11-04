package controller;

import fateczl.Lista.model.Lista;
import model.Cliente;

public class ReHash {
    private Lista<Cliente>[] hash = new Lista[10000];
    public ReHash() {
        for (int i = 0; i < 10000; i++) {
            hash[i] = new Lista<>();
        }
    }

    public void createTable(Lista<Cliente> l) throws Exception{
        for (int i = 0; i < l.size(); i++) {
            Cliente aux = l.get(i);
            int pos = aux.numConta;
            hash[pos].addFirst(aux);
        }
    }

    public void print() throws Exception{
        for (int i = 0; i < hash.length; i++) {
            System.out.print("Hash " + i + " : ");
            for (int j = 0; j < hash[i].size(); j++) {
                if (!hash[i].isEmpty()) {
                    System.out.print(hash[i].get(j) + " -> ");
                }
            }
            System.out.print("null \n");
        }
    }
}
