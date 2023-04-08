import React, { useState } from "react";

const questoes = [
  {
    question: "Qual grande empresa foi responsável pelo desenvolvimento do React?",
    options: ["Facebook", "Google", "Twitter", "Oracle"],
    answer: 0,
  },
  {
    question: "No React, qual é o tipo de objeto que segura algumas informações mesmo após mudanças no longo do ciclo de vida de um component?",
    options: ["Event Handler", "DOM", "Props", "Estado do component"],
    answer: 3,
  },
  {
    question: "Em React, qual o nome dado aos valores transmitidos aos components em sua criação?",
    options: ["Props", "DOM", "Event", "PureComponent"],
    answer: 0,
  },
];

export default function Quiz() {
  const [questaoAtual, setQuestaoAtual] = useState(0);
  const [placar, setPlacar] = useState(0);
  const [mostrarPlacar, setMostrarPlacar] = useState(false);

  const gerenciarResposta = (indiceResposta) => {
    if (indiceResposta === questoes[questaoAtual].answer) {
      setPlacar(placar + 1);
    }

    const proximaQuestao = questaoAtual + 1;
    if (proximaQuestao < questoes.length) {
      setQuestaoAtual(proximaQuestao);
    } else {
      setMostrarPlacar(true);
    }
  };

  const criaQuestao = () => {
    const questao = questoes[questaoAtual];
    return (
      <div>
        <h2>{questao.question}</h2>
        {questao.options.map((option, index) => (
          <button key={index} onClick={() => gerenciarResposta(index)}>
            {option}
          </button>
        ))}
      </div>
    );
  };

  const criarPlacar = () => {
    return (
      <div>
        <h2>Você acertou {placar} de {questoes.length} questões.</h2>
        <button onClick={() => window.location.reload()}>Reiniciar</button>
      </div>
    );
  };

  return (
    <div>
      {mostrarPlacar ? criarPlacar() : criaQuestao()}
    </div>
  );
}
