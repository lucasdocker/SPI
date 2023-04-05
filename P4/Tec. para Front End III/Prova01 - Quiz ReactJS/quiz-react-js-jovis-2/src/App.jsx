import { useState } from 'react'

function App() {
  const [placar, setPlacar] = useState(0);
  const [finalizar, setFinalizar] = useState();

  return (
    <div className="App">
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

        <button onClick={() => setFinalizar(true)}>
          Finalizar Quiz
          { finalizar ? (
            alert("Placar Final: " + placar + "/3")
          ) : (
            alert("Você precisa responder todas as questões antes de finalizar o Quiz!")
          )}
        </button>        

      </div>

    </div>
  )
}

export default App
