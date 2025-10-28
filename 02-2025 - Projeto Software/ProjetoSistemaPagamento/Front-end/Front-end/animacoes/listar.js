function buscaPagamentos() {
    let tipoPagamento = document.getElementById("filtroTipo").value
    console.log(`http://localhost:8080/pagamentos/tipo/${tipoPagamento}`);
    fetch(`http://localhost:8080/pagamentos/tipo/${tipoPagamento}`)
        .then(res => res.json())
        .then(dados => {
            console.log(dados)
            exibePagamentos(dados);
        })
}

let tabelaPagamentos = document.getElementById("tabelaPagamentos")

function exibePagamentos(dados) {

    //Resetar a tabela
    tabelaPagamentos.innerHTML = ""

    dados.forEach(pagamento => {
        //Cria os elementos da tabela
        let linhaPagamento = document.createElement("tr")
        let tipoPagamentoTd = document.createElement("td")
        let nomeCliente = document.createElement("td")
        let descricao = document.createElement("td")
        let data = document.createElement("td")
        let valor = document.createElement("td")

        //Adiciona as informações nas tag em HTML a partir do JSON retornado da API
        tipoPagamentoTd.textContent = pagamento.tipo
        nomeCliente.textContent = pagamento.nomeCliente
        descricao.textContent = pagamento.descricao
        data.textContent = pagamento.dataPagamento
        valor.textContent = "R$ " + parseFloat(pagamento.valor).toFixed(2)

        //Botão de Editar
        let btnEditar = document.createElement("button")
        btnEditar.textContent = "Editar"
        btnEditar.className = "btn-editar"
        btnEditar.dataset.id = pagamento.id

        btnEditar.addEventListener("click" , () => {
            abrirFormulario(pagamento)
        })

        //Botão de Exluir
        let btnExcluir = document.createElement("button")
        btnExcluir.textContent = "Exluir"
        btnExcluir.className = "btn-excluir"
        btnExcluir.dataset.id = pagamento.id

        //Cria o td ações
        let acoes = document.createElement("td")
        acoes.appendChild(btnEditar)
        acoes.appendChild(btnExcluir)


        //Informa que os TD são filhos do TR
        linhaPagamento.appendChild(tipoPagamentoTd)
        linhaPagamento.appendChild(nomeCliente)
        linhaPagamento.appendChild(descricao)
        linhaPagamento.appendChild(data)
        linhaPagamento.appendChild(valor)
        linhaPagamento.appendChild(acoes)

        //Informa que o TR é filho do table
        tabelaPagamentos.appendChild(linhaPagamento)

    });

}

function abrirFormulario(pagamento) {
    let formEdicao = document.getElementById("formEdicao")
    formEdicao.style.display = "block"
    
    document.getElementById("editNome").value = pagamento.nomeCliente
    document.getElementById("editDescricao").value = pagamento.descricao
    document.getElementById("editValor").value = pagamento.valor
    document.getElementById("editData").value = pagamento.dataPagamento
}

function cancelarEdicao(){
    let formEdicao = document.getElementById("formEdicao")
    formEdicao.style.display = "none"
}