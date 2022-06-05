import numpy as np

class Pilha:
    def __init__(self, capacidade):
        self.__capacidade = capacidade
        self.__topo = -1
        self.__valores = np.empty(self.__capacidade, dtype=int)

    def get_topo(self):
        return self.__topo

    def get_valores(self):
        return self.__valores
  
    def pilha_vazia(self):
        if self.__topo == -1:
            return True
        else:
            return False

    def pilha_cheia(self):
        if self.__topo == self.__capacidade-1:
            return True
        else:
            return False

    def empilhar(self):
        if self.pilha_cheia():
            print('\nA rua está lotada')
        else:
            valor = int(input("\nInforme a placa do carro (parte numérica): "))
            if(self.carro_se_encontra(valor)):
                print("\nJá há na rua um carro com essa placa.")
            else:
                self.__topo += 1
                self.__valores[self.__topo] = valor

    def desempilhar(self):
        if self.pilha_vazia():
            print('\nA rua está vazia.')
        else:
            self.__topo-=1

    def ver_topo(self):
        if self.__topo != -1:
            return self.__valores[self.__topo]
        else:
            return -1

    def carro_se_encontra(self, placa):
        verificador = False
        i = 0
        while(i < (self.get_topo()+1)):
            if (placa == self.__valores[i]):
                verificador = True
                return verificador
            i += 1
        return verificador
    
    def retirar_carros(self, placa):
        print("\nSequência de carros que deverá sair:")
        while(placa != self.ver_topo()):
            print(self.ver_topo())
            self.desempilhar()
        print(f"Pode pegar o seu carro: {placa}")
            
def main():
    print("Desenvolva um programa em Python utilizando uma Pilha de acordo com a situação problema: Armazene as placas dos carros de luxos (apenas os números) que estão estacionados em um rua sem saída. Dado uma placa verifique se o carro está estacionado na rua. Caso esteja, informe a sequência de carros que deverá ser retirada para que o carro em questão consiga sair.\n")

    capacidade = int(input("Quantos carros cabem na rua? "))
    pilha = Pilha(capacidade)
    i = True
    while(i):
        resposta = int(input("\nDigite uma das opções:\n1- Adicionar Carro\n2- Retirar Último Carro\n3- Verificar Placa\n4- Sair\n> "))
        if(resposta == 1):
            pilha.empilhar()
            
        elif(resposta == 2):
            pilha.desempilhar()
        
        elif(resposta == 3):
            placa = int(input("Informe a placa do carro a verificar: "))
            if(pilha.carro_se_encontra(placa)):
                pilha.retirar_carros(placa)
                i = False
            else:
                print("Esse carro não se encontra na rua.")
                
        elif(resposta == 4):
            i = False
        else:
            print("\nOpção inválida.")
        
    print("\nFim do programa!")

main()