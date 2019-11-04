package com.devBootcamp.Exercicio10;

import com.devBootcamp.Exercicio10.Cliente.Cliente;
import com.devBootcamp.Exercicio10.Cliente.ClienteService;
import com.devBootcamp.Exercicio10.Cliente.ClienteServiceImpl;
import com.devBootcamp.Exercicio10.Impl.ItemServiceImpl;
import com.devBootcamp.Exercicio10.Impl.PedidoItemImpl;
import com.devBootcamp.Exercicio10.Impl.PedidoServiceImpl;
import com.devBootcamp.Exercicio10.Impl.VendedorServiceImpl;
import com.devBootcamp.Exercicio10.Pedido.*;
import jdk.jfr.Experimental;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteServiceImpl();
        VendedorService vendedorService = new VendedorServiceImpl();
        ItemService itemService = new ItemServiceImpl();
        PedidoService pedidoIpml = new PedidoServiceImpl();
        PedidoItemService pedidoItemIpml = new PedidoItemImpl();

        //Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setEmail("jvrc2000@outlook.com");
        cliente.setCpf("9999999");
        cliente.setId(1);
        clienteService.save(cliente);

        //Vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Victor");
        vendedor.setPercentualComissao(10D);
        vendedor.setPercentualDescontoMaximo(10D);
        vendedorService.save(vendedor);

         //Item
        Item item = new Item();
        item.setQuantidadeEmEstoque(4);
        item.setInativo(false);
        item.setDescricao("Faca");
        item.setValorUnitario(BigDecimal.valueOf(35.30));
        itemService.save(item);

        Item item2 = new Item();
        item2.setQuantidadeEmEstoque(0);
        item2.setInativo(false);
        item2.setDescricao("Lampada");
        item2.setValorUnitario(BigDecimal.valueOf(35.30));
        itemService.save(item2);

        Item item3 = new Item();
        item3.setQuantidadeEmEstoque(3);
        item3.setInativo(false);
        item3.setDescricao("Chinelo");
        item3.setValorUnitario(BigDecimal.valueOf(35.30));
        itemService.save(item3);

        Item item4 = new Item();
        item4.setQuantidadeEmEstoque(2);
        item4.setInativo(false);
        item4.setDescricao("Capacete");
        item4.setValorUnitario(BigDecimal.valueOf(35.30));
        itemService.save(item4);

        //Pedido
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setDataDeCadastro(LocalDate.now());
        pedido.setDataValidade(LocalDate.now());
        pedido.setEnderecoEntrega("Rua Tapir, numero 1285");
        pedido.setFormaDePagamento(FormaDePagamento.BOLETO);
        pedido.setObservacao("Entregar em caixa rosa");
        pedido.setVendedor(vendedor);
        pedido.setPrevisaoEntrega(LocalDate.now());
        pedidoIpml.save(pedido);

        //PedidoItem
        PedidoItem pedidoItem = new PedidoItem();
        pedidoItem.setItem(item);
        pedidoItem.setPedido(pedido);
        pedidoItem.setValorUnitario(BigDecimal.valueOf(50));
        pedido.getPedidoItensList().add(pedidoItem);

        PedidoItem pedidoItem2 = new PedidoItem();
        pedidoItem2.setItem(item2);
        pedidoItem2.setPedido(pedido);
        pedidoItem2.setValorUnitario(BigDecimal.valueOf(50));
        pedido.getPedidoItensList().add(pedidoItem2);

        PedidoItem pedidoItem3 = new PedidoItem();
        pedidoItem3.setItem(item3);
        pedidoItem3.setPedido(pedido);
        pedidoItem3.setValorUnitario(BigDecimal.valueOf(50));
        pedido.getPedidoItensList().add(pedidoItem3);

        PedidoItem pedidoItem4 = new PedidoItem();
        pedidoItem4.setItem(item4);
        pedidoItem4.setPedido(pedido);
        pedidoItem4.setValorUnitario(BigDecimal.valueOf(50));
        pedido.getPedidoItensList().add(pedidoItem4);

        pedido.resumo();
    }
}
