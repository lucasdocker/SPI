//Crie dois objetos com a estrutura abaixo:
// - Nome (tipo String)
// - Idade (tipo Number)
// - Filiacao (Array): nomeDoPai (tipo String) e nomeDaMae (tipo String)
// - Endereco (tipo Objeto): rua (tipo String), cidade (tipo String) e estado (tipo String)
// - dadosCompletos (tipo função) (verifica se os dados acimas estão preenchidos)
//Crie uma função que receba os dois objetos acima criados, imprima os valores de suas propriedades e por fim imprima o resultado da função chamada dadosCompleto() que deve verificar se todos os campos estão preenhidos.

var pessoa1 = {
    nome: 'Lucas Correia Lucena de Souza Ribeiro',
    idade: 29,
    filiacao: ['Christian Lucena', 'Zetinha Meneguel'],
    endereco: {
        rua: 'do Meio',
        cidade: 'João Pessoa',
        estado: 'Paraíba',
    },
    dadosCompletos: function(){
        if(this.nome != "" && this.idade == null && this.filiacao[0] == "" && this.filiacao[1] == "" && this.endereco.rua == "" && this.endereco.cidade == "" && this.endereco.estado == ""){
            return false
        } else{
            return true
        }
    }
}

var pessoa2 = {
    nome: 'Maria Joaquina de Amaral Pereira Goes',
    idade: 19,
    filiacao: ['Sergynho', 'Ivete Sangalo'],
    endereco: {
        rua: 'Pelourinho',
        cidade: 'Salvador',
        estado: 'Bahia',
    },
    dadosCompletos: function(){
        if(this.nome != "" && this.idade == null && this.filiacao[0] == "" && this.filiacao[1] == "" && this.endereco.rua == "" && this.endereco.cidade == "" && this.endereco.estado == ""){
            return false
        } else{
            return true
        }
    }
}

function impressora(pessoa1, pessoa2) {
    console.log('Pessoa 1\n');
    console.log('Nome: ' + pessoa1.nome);
    console.log('Idade: ' + pessoa1.idade);
    console.log('Filiação\nPai: ' + pessoa1.filiacao[0] + '\nMãe: ' + pessoa1.filiacao[1]);
    console.log('Endereço\n' + 'Rua: ' + pessoa1.endereco.rua + '\nCidade: ' + pessoa1.endereco.cidade + '\nEstado: ' + pessoa1.endereco.estado);
    console.log("Todos os campos estão preenchidos: " + pessoa1.dadosCompletos());
    console.log('\nPessoa 2\n');
    console.log('Nome: ' + pessoa2.nome);
    console.log('Idade: ' + pessoa2.idade);
    console.log('Filiação\nPai: ' + pessoa2.filiacao[0] + '\nMãe: ' + pessoa2.filiacao[1]);
    console.log('Endereço\n' + 'Rua: ' + pessoa2.endereco.rua + '\nCidade: ' + pessoa2.endereco.cidade + '\nEstado: ' + pessoa2.endereco.estado);
    console.log("Todos os campos estão preenchidos: " + pessoa2.dadosCompletos());
}

impressora(pessoa1, pessoa2);

console.log("\nFim do programa!")