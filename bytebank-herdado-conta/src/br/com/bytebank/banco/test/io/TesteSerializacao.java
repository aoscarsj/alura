package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Artur Oscar Júnior");
        cliente.setProfissao("Dev");
        cliente.setCpf("12345678900");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bytebank-herdado-conta/cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
