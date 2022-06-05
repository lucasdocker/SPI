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
      print('O vetor está vazio')
    else:
      for i in range(self.ultima_posicao + 1):
        print(i, ' - ', self.valores[i])

  # O(1) - O(2)
  def insere(self, valor):
    if self.ultima_posicao == self.capacidade - 1:
      print('Capacidade máxima atingida')
    else:
      self.ultima_posicao += 1 
      self.valores[self.ultima_posicao] = valor 

  # O(n)
  def pesquisar(self, valor):
    for i in range(self.ultima_posicao + 1):
      if valor == self.valores[i]:
        return i
    return -1

  def pesquisar_indice(self, indice):
    for i in range(self.ultima_posicao + 1):
      if i == indice:
        return self.valores[i]
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

  def contagem(self, escolha):
    indice = self.pesquisar(escolha)
    for i in range(escolha):
      if indice == self.ultima_posicao:
        indice = 0
      else:
        indice += 1
    return indice

def main():
    n = int(input("Informe o número de soldados: "))
    lista = Listasequencial(n)

    for i in range(n):
        lista.insere(int(input("Informe o número do chapéu do soldado ({}/{}): ".format(i + 1, n))))

    while lista.ultima_posicao > 0:
      escolha = random.choice(lista.valores)
      print("Soldado sorteado: ", escolha)
      print("Lista antes de apagar\n(índice - soldado)")
      lista.imprime()
      indice_do_valor_a_ser_apagado = lista.contagem(escolha)
      valor_a_ser_apagado = lista.pesquisar_indice(indice_do_valor_a_ser_apagado)
      print("Soldado convidado a se retirar: ", valor_a_ser_apagado)
      lista.excluir(valor_a_ser_apagado)
      print("Lista depois de apagar\n(índice - soldado)")
      lista.imprime()

    print("O soldado escolhido para a tarefa foi o soldade nº", lista.valores[0])

main()