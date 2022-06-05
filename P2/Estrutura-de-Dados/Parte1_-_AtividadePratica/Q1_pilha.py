import numpy as np

class Pilha:
    def __init__(self, capacidade):
        self.__capacidade = capacidade
        self.__topo = -1
        self.__valores = np.empty(self.__capacidade, dtype=int)

    def __pilha_vazia(self):
        if self.__topo == -1:
            return True
        else:
            return False

    def __pilha_cheia(self):
        if self.__topo == self.__capacidade-1:
            return True
        else:
            return False

    def empilhar(self,valor):
        if self.__pilha_cheia():
            print('A pilha está cheia')
        else:
            self.__topo+=1
            self.__valores[self.__topo]=valor

    def desempilhar(self):
        if self.__pilha_vazia():
            print('A pilha está vazia')
        else:
            self.__topo-=1

    def ver_topo(self):
        if self.__topo != -1:
            return print(self.__valores[self.__topo])
        else:
            return -1

def main():
    print("Construa uma Pilha utilizando a linguagem Python. Dada uma sequência contendo N (N>0) números inteiros, imprimi-la na ordem inversa.\n")
    capacidade = int(input("Quantos números inteiros você irá informar? "))
    pilha = Pilha(capacidade)
    
    for x in range(capacidade):
        pilha.empilhar(int(input("Informe um número inteiro ({}/{}): ".format(x + 1, capacidade))))
    
    print("\nA ordem inversa ficará da seguinte forma:")

    for x in range(capacidade):
        pilha.ver_topo()
        pilha.desempilhar()

    print("\nFim do programa!")

main()