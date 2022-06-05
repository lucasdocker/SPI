import random
import numpy as np 

class Listasequencial:
  def __init__(self, capacidade):
    self.capacidade = capacidade
    self.ultima_posicao = -1
    self.valores = np.empty(self.capacidade, dtype=int)

  # O(n)
  def imprime(self):
    if self.ultima_posicao == -1:
        print('\nA lista está vazia.')
    else:
        print("índice - valor")
        for i in range(self.ultima_posicao + 1):
            print(i, ' - ', self.valores[i])

  # O(1) - O(2)
  def insere(self, valor):
    if self.ultima_posicao == self.capacidade - 1:
      return -1
    else:
      self.ultima_posicao += 1 
      self.valores[self.ultima_posicao] = valor 

  # O(n)
  def pesquisar(self, valor):
    for i in range(self.ultima_posicao + 1):
      if valor == self.valores[i]:
        return i
    return -1

  # O(n)
  def excluir(self, valor):
    posicao = self.pesquisar(valor)
    if posicao == -1:
      return -1
    else:
      for i in range(posicao, self.ultima_posicao):
        self.valores[i] = self.valores[i + 1]
      
      self.ultima_posicao -= 1


def main():
    while True:
        try:
            n = int(input("Informe a quantidade de elementos da lista: "))
            break
        except:
            print("\nFormato Inválido! Por favor, informe um número inteiro.\n")
    lista = Listasequencial(n)


    while True:
        while True:
            try:
                print("\n{:~^50}".format(" MENU "))
                print('''
    [1] Verifique se um número pertence à lista.
    [2] Inserir um novo elemento na lista.
    [3] Remover um elemento da lista.
    [4] Imprimir os valores da lista.
    [5] Sair.''')
                opcao = int(input("> "))
                if opcao >= 1 and opcao <= 5:
                    break
                else:
                    print("\nOpção inválida! Só há opções entre 1 e 5.")
            except:
                print("\nOpção inválida! Insira um valor inteiro.")
        
        match opcao:
            case 1: # Verifique se um número pertence à lista.
                if(lista.ultima_posicao == -1):
                    print("\nA lista está vazia.")
                else:
                    while True:
                        try:
                            elemento = int(input("\nInforme o número a ser verificado: "))
                            break
                        except:
                            print("\nValor inválido! Por favor, insira um número inteiro.\n")
                    if(lista.pesquisar(elemento) == -1):
                        print("\nO número {} não consta na lista.".format(elemento))
                    else:
                        print("\nO número {} consta na lista.".format(elemento))
            case 2: # Inserir um novo elemento na lista.
                if(lista.ultima_posicao == lista.capacidade - 1):
                    print("\nNão há como adicionar mais elementos, pois a lista está cheia.")
                else:
                    while True:
                        try:
                            elemento = int(input("\nInforme o número a ser inserido na lista: "))
                            if(lista.pesquisar(elemento) == -1):
                                break
                            else:
                                print("\nEsse valor já consta na lista. Por favor, insira um número diferente.")
                        except:
                            print("\nValor inválido! Por favor, insira um número inteiro.\n")
                    lista.insere(elemento)
                    print("\nO elemento {} foi inserido na lista.".format(elemento))
            case 3: # Remover um elemento da lista.
                if(lista.ultima_posicao == -1):
                    print("\nA lista está vazia.")
                else:
                    while True:
                        try:
                            elemento = int(input("\nInforme o número a ser removido da lista: "))
                            break
                        except:
                            print("\nValor inválido! Por favor, insira um número inteiro.\n")
                    if(lista.pesquisar(elemento) == -1):
                        print("\nO número {} não consta na lista.".format(elemento))
                    else:
                        lista.excluir(elemento)
                        print("\nO número {} foi excluído da lista com êxito.".format(elemento))
            case 4: # Imprimir os valores da lista.
                lista.imprime()
            case 5: # Sair.
                print("\n{:~^50}".format(" FIM DO PROGRAMA "))
                exit()
main()