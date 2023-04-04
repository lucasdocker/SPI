import React, { useState } from "react";

function App() {
  
  // Propriedades

  const [showResultadoFinal, setResultadoFinal] = useState(false);

  return (
    <div className="App">
      <h1>Quiz de Front-End</h1>

      <h2>Projeto de avaliação da disciplina de Tecnologias para Front-End III</h2>
      
      <div className='perguntas'>
        <h3>Pergunta Nº 1:</h3>

        <ul>
          <li>Opção 1</li>
          <li>Opção 2</li>
          <li>Opção 3</li>
          <li>Opção 4</li>
        </ul>

        <h3>Pergunta Nº 2:</h3>

        <ul>
          <li>Opção 1</li>
          <li>Opção 2</li>
          <li>Opção 3</li>
          <li>Opção 4</li>
        </ul>

      </div>

      <div className="resultado-final">
        <h2>Resultado Final:</h2>
        <h3>
          3/3

          <button>OK!</button>
        </h3>

      </div>
    
    </div>
    
  )
}

export default App
