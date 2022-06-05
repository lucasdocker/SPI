import numpy as np

class FilaPrioridade:
  
    def __init__(self, capacidade):
        self.capacidade = capacidade
        self.numero_elementos = 0
        self.valores = np.empty(self.capacidade, dtype=int)
        self.primeiro = 0

    def __fila_vazia(self):
        return self.numero_elementos == 0

    def __fila_cheia(self):
        return self.numero_elementos == self.capacidade 
  
    def enfileirar(self, valor):
        if self.__fila_cheia():
            print('A fila está cheia')
            return
    
        if self.numero_elementos == 0:
            self.valores[self.numero_elementos] = valor
            self.numero_elementos += 1
        else:
            x = self.numero_elementos - 1
            while x >= 0:
                if valor > self.valores[x]:
                    self.valores[x + 1] = self.valores[x]
                else:
                    break
                x -= 1
            self.valores[x + 1] = valor
            self.numero_elementos += 1

    def desenfileirar(self):
        if self.__fila_vazia():
            print('A fila está vazia')
            return

        valor = self.valores[self.numero_elementos - 1]
        self.numero_elementos -= 1
        self.primeiro += 1
        return valor     
  
    def primeiro(self):
        if self.__fila_vazia():
            return -1
        return self.valores[self.numero_elementos - 1]

def main():
    while True:
        try:
            n = int(input("Informe o número de elementos da lista: "))
            break
        except:
            print("Mas tu sabe que 'quantidade' é um valor inteiro, né?!\n")

    fila = FilaPrioridade(n)

    for i in range(fila.capacidade):
        while True:
            try:
                fila.enfileirar(int(input("Informe um valor inteiro a enfileirar: ")))
                break
            except:
                print("Valor inválido! Favor, informe um valor inteiro.")
    
    print("Fila de prioridades enfileirada até o momento\n", fila.valores)
    
    for i in range(fila.numero_elementos):
        print("Desenfilerando elemento de maior prioridade: ", fila.valores[fila.primeiro])
        fila.desenfileirar()
    
    print("Desenfileirou tudo! Adeus!")

main()