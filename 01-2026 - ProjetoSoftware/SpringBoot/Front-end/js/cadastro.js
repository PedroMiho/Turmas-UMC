//DOM - Manipular o HTML

//Maneiras de selecionar o HTML

//document.getElementById() - Selecionar pelo ID
//document.getElementsByTag() - Selecionar pela TAG
//document.getElementsByClass() - Selecionar pela CLASSE
//document.querySelector() - Selecionar pela CLASSE, ID ou TAG


const form = document.querySelector("#formProduto")

form.addEventListener('submit' , function(event) {
    event.preventDefault()

    const nomeProduto = document.querySelector("#nome").value
    const marca = document.querySelector("#marca").value
    const tamanho = document.querySelector("#tamanho").value
    const preco = document.querySelector("#preco").value
    const quantidade = document.querySelector("#quantidade").value

    const dados = {
        nomeProduto : nomeProduto,
        marca: marca,
        tamanho: tamanho,
        preco: parseFloat(preco),
        quantidade: parseInt(quantidade)
    }

    fetch('http://localhost:8080/roupa' , {
        method : 'POST',
        headers: {
            "Content-Type" : 'application/json'
        },

        body : JSON.stringify(dados)
    })

    .then(reponse => {


        if(reponse.ok) {
            Swal.fire({
                title : "ROUPA CADASTRADA COM SUCESSO" ,
                text: "ROUPA CADASTRADA" ,
                icon : "success"
            })
        } else {
            Swal.fire({
                title : "ERRO AO CADASTRAR A ROUPA" ,
                text: "ROUPA NÃO CADASTRADA" ,
                icon : "error"
            })
        }

    })

    .catch( erro => {
        Swal.fire({
            title : "ERRO AO CADASTRAR A ROUPA" ,
            text: "ROUPA NÃO CADASTRADA" ,
            icon : "error"
        })
    })

})