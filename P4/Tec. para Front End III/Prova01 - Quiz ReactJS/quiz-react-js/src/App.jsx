import React, { useState } from "react";

function App() {
  
  // Propriedades

  //Fazer isso em forma de alerta
  const [placar, setPlacar] = useState(0);
  const [perguntaAtual, setPerguntaAtual] = useState(0);

  return (
    <div className="App">
      <h1>Quiz de Front-End</h1>

      <h2>Projeto de avaliação da disciplina de Tecnologias para Front-End III</h2>

      <h2>Placar atual: {placar}</h2>      
      
        <div className="resultado-final">
        <h2>Resultado Final:</h2>
        <h3>
          {placar}/3
          <button>OK!</button>
        </h3>
      </div>
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
    </div>
    
  )
}

export default App
