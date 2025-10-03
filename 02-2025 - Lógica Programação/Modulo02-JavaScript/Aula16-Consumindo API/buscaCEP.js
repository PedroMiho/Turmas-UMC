//https://viacep.com.br/ws/COLOCAR CEP/json

const cep = document.getElementById("cep")

cep.addEventListener("change" , () => {
    buscaCEP(cep.value)
})

async function buscaCEP(cepUsuario){
    
    let erroCep = document.getElementById("erro")
    erroCep.innerHTML = ""


    try {
        let consultaCEP = await fetch(`https://viacep.com.br/ws/${cepUsuario}/json`)
        console.log(consultaCEP);
        
        let consultaCEPJson = await consultaCEP.json()
        
        console.log(consultaCEPJson);
        
        if (consultaCEPJson.erro){
            throw Error ("CEP INEXISTENTE")
        }

        preencheCampos(consultaCEPJson)

        
    }
    catch {
        erroCep.innerHTML = "CEP INVÁLIDO, TENTE NOVAMENTE !!"
        apagarCampos()
        
    }

    
}


function preencheCampos(cepJson){
    console.log(cepJson);
    console.log(cepJson.logradouro);

    let rua = document.getElementById("rua")
    let bairro = document.getElementById("bairro") 
    let cidade = document.getElementById("cidade")
    let estado = document.getElementById("estado")
    
    rua.value = cepJson.logradouro
    bairro.value = cepJson.bairro
    cidade.value = cepJson.localidade
    estado.value = cepJson.uf
}


function apagarCampos(){
    let rua = document.getElementById("rua")
    let bairro = document.getElementById("bairro") 
    let cidade = document.getElementById("cidade")
    let estado = document.getElementById("estado")
    
    rua.value = ""
    bairro.value = ""
    cidade.value = ""
    estado.value = ""
}
