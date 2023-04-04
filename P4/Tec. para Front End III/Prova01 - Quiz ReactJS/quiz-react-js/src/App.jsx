import React, { useState } from "react";

function App() {
  
  // Propriedades

  //Fazer isso em forma de alerta
  const [showResultadoFinal, setResultadoFinal] = useState(false);
  const [placar, setPlacar] = useState(0);
  const [perguntaAtual, setPerguntaAtual] = useState(0);

  const perguntas = [
    {
      text: "O que é Front End?",
      options: [
        { id: 0, text: "Opção X", isCorrect: false },
        { id: 1, text: "Opção 2", isCorrect: false },
        { id: 2, text: "Opção 3", isCorrect: false },
        { id: 3, text: "Opção Z", isCorrect: true },
      ],
    },
    {
      text: "Quais das opções abaixos são exemplos de tecnologias utilizadas no desenvolvimento Front End?",
      options: [
        { id: 0, text: "Opção 1", isCorrect: false },
        { id: 1, text: "Opção 2", isCorrect: false },
        { id: 2, text: "Opção 3", isCorrect: true },
        { id: 3, text: "Opção 4", isCorrect: false },
      ],
    },
    {
      text: "O que é React JS?",
      options: [
        { id: 0, text: "Opção 1", isCorrect: false },
        { id: 1, text: "Opção 2", isCorrect: false },
        { id: 2, text: "Opção 3", isCorrect: false },
        { id: 3, text: "Opção 4", isCorrect: true },
      ],
    }
  ]

  return (
    <div className="App">
      <h1>Quiz de Front-End</h1>

      <h2>Projeto de avaliação da disciplina de Tecnologias para Front-End III</h2>

      <h2>Placar atual: {placar}</h2>
      
      {showResultadoFinal ? (
        <div className="resultado-final">
        <h2>Resultado Final:</h2>
        <h3>
          {placar}/3
          <button>OK!</button>
        </h3>
      </div>
      ) : (
        <div className='perguntas'>
          <h3>Pergunta {perguntaAtual + 1} de {perguntas.length}:</h3>
          <h3 className="question-text">{perguntas[perguntaAtual.text]}</h3>

          <ul>
            {perguntas[perguntaAtual].options.map((option) => {
              return (
                <li onClick={() => optionClicked(option.isCorrect)} key={option.id}>{option.text}</li>
              );
            })}
          </ul>
      </div>
      )}   
    </div>
    
  )
}

export default App
