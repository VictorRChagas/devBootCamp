package com.devBootcamp.exercicioModelo;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente(1,"Joao Victor","55555");
        cliente.adicionarEndereco(1, "Rua Tapir", "1285", "Centro", TipoEndereco.ENTREGA);
        cliente.adicionarEndereco(2, "Avenida Tupi", "500", "Fraron", TipoEndereco.ENTREGA);

        Produto lampada = new Produto(1,"Lampada",2,5.5);

        NotaFiscal notaFiscal = new NotaFiscal(1,22,cliente,55);

        NotaFiscalItem notaFiscalItem = new NotaFiscalItem(1, notaFiscal, lampada, 2, 5.0);
        notaFiscal.addItem(notaFiscalItem);

        notaFiscal.resumoNota();

    }
}
