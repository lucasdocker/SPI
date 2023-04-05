import { useState } from 'react'

function App() {
  const [count, setCount] = useState(0);
  const [placar, setPlacar] = useState(0);
  const [finalizar, setFinalizar] = useState(true);

  return (
    <div className="App">
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
      </div>
      <div className='perguntas'>

        <h1>Quiz de Front-End</h1>

        <h2>Projeto de avaliação da disciplina de Tecnologias para Front-End III</h2>

        <h3>Pergunta Nº 1:</h3>
          <ul>
            <li>
              <button onClick={() => setPlacar((placar) => placar + 1)}>A</button>
              Questão correta
            </li>
            <li>
              <button>B</button>
              asoiajisjaiosjaoisjaoisjoa
            </li>
            <li>
              <button>C</button>
              odkapofsppokfpsd pdkpod poifspokf
            </li>
            <li>
              <button>D</button>
              ksapoksapovopkdpo riowejroijwr sdpoiada
            </li>
          </ul>

          <h3>Pergunta Nº 2:</h3>
          <ul>
            <li>
              <button>A</button>
              basiaoijdfoisjofijsdoifjsfj dijfoijd idjasoidja
            </li>
            <li>
              <button onClick={() => setPlacar((placar) => placar + 1)}>B</button>
              Questão correta
            </li>
            <li>
              <button>C</button>
              odkapofsppokfpsd pdkpod poifspokf
            </li>
            <li>
              <button>D</button>
              ksapoksapovopkdpo riowejroijwr sdpoiada
            </li>
          </ul>

          <h3>Pergunta Nº 3:</h3>
          <ul>
            <li>
              <button>A</button>
              basiaoijdfoisjofijsdoifjsfj dijfoijd idjasoidja
            </li>
            <li>
              <button>B</button>
              asoiajisjaiosjaoisjaoisjoa
            </li>
            <li>
              <button onClick={() => setPlacar((placar) => placar + 1)}>C</button>
              Questão correta
            </li>
            <li>
              <button>D</button>
              ksapoksapovopkdpo riowejroijwr sdpoiada
            </li>
          </ul>
      </div>

      <div className='questoes-respondidas'>
        
        <h3>Questões respondidas:</h3>    

      </div>

      <div className='Finalizar Quiz'>         

        <input type="button" onclick="funcao1()" value="Finalizar Quiz">
          { finalizar ? (
            <h3>Placar Final: {placar}/3</h3>
          ) : (
            function funcao1() {
              alert("Eu sou um\nAlert!")
            }
          )}
        </input>

      </div>

      <div className='Placar'>

        <h3>Placar Final: {placar}/3</h3>

      </div>

    </div>
  )
}

export default App
