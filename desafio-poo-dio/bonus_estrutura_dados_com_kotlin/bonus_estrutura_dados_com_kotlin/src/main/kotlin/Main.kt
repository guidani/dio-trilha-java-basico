package br.com.dio

import javax.swing.text.Position

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
data class  Produto(val name: String, val valor: Double)

class CarrinhoDeCompras(){
//    private val _listaDeProdutos: List<Produto> = listOf()
    private val _listaDeProdutos: MutableList<Produto> = mutableListOf()
    fun quantidadeDeProdutos(): Int{
        return _listaDeProdutos.size
    }
    fun listaProdutos(){
        println("Quantidade: ${quantidadeDeProdutos()} \n Produtos: \n $_listaDeProdutos")
    }
    fun adicionarProduto(produto: Produto){
        _listaDeProdutos.add(produto)
    }
    fun listarProdutosPorOrdem(){
        TODO()
    }
    fun removerProduto(posicao: Int){
        _listaDeProdutos.removeAt(posicao)
    }
    fun buscarProdutoPorNome(nome: String){
        val p = _listaDeProdutos.filter { p -> p.name.lowercase() == nome.lowercase() }
        if (p.isEmpty()) {
            println("Nada encontrado")
        }else{
            println(p)
        }
    }
    fun esvaziar(){
        _listaDeProdutos.removeAll(_listaDeProdutos)
    }
    fun produtoMaisCaro(): Produto? {
        return _listaDeProdutos.maxByOrNull { produto: Produto -> produto.valor }
    }
    fun produtoMaisBarato(): Produto?{
        return _listaDeProdutos.minByOrNull { produto: Produto -> produto.valor }
    }
    fun somaDosProdutos():Double{
        val acc = 0.0
//        return _listaDeProdutos.sumOf { produto: Produto -> produto.valor }
        return _listaDeProdutos.sumByDouble { it.valor }
    }

}

fun main() {
    println("-".repeat(10) + "ESTRUTURA DE DADOS BÁSICO COM KOTLIN" + "-".repeat(10))
    println("-".repeat(10) + "ARRAYS")

    val valores = DoubleArray(3)
    valores[0] = 1000.0
    valores[1] = 2000.0
    valores[2] = 3000.0

    println("Imprimindo")
    for (v in valores) println("Valor:  $v")
    println(valores.min())
    println(valores.max())
    println(valores.size)
    println(valores.first())
    println(valores.last())
    println(valores.sorted())
    println(valores.sorted().reversed())
    println(valores.sum())

    println("Outra forma de imprimir valores")
    for (i in valores.indices) println("Indice: $i \t Valor: ${valores[i]}")

    println("-".repeat(50))
    println("-".repeat(10) + "LISTA")
    val cc = CarrinhoDeCompras();
    val arroz = Produto("Arroz", 30.0)
    val feijao = Produto("Feijão", 20.0)
    cc.adicionarProduto(arroz)
    cc.adicionarProduto(feijao)
    println(cc.listaProdutos())
    cc.buscarProdutoPorNome("Arroz2")

    println("Soma dos produtos: ${cc.somaDosProdutos()}")

}