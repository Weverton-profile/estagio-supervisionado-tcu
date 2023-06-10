# estagio-supervisionado-tcu
Projeto para a matéria de estagio supervisionado - Universidade Estadual do Piaui

<h1>AcordaoController</h1>

<h2>Listar Acordãos</h2>

<p><strong>Descrição:</strong> Retorna uma lista de acordãos com base na ordenação e página especificadas.</p>

<h3>URL</h3>
<p>/acordao/listar/{ordenacao}/{pagina}</p>

<h3>Método</h3>
<p>GET</p>

<h3>Parâmetros de Caminho (Path Parameters)</h3>
<table>
  <tr>
    <th>Parâmetro</th>
    <th>Tipo</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>ordenacao</td>
    <td>String</td>
    <td>A ordenação dos acordãos. Opções: "por-ano-desc" (ano de forma decrescente), "por-ano-asc" (ano de forma crescente), "sem-ordenacao" (sem ordenação).</td>
  </tr>
  <tr>
    <td>pagina</td>
    <td>int</td>
    <td>O número da página a ser retornada.</td>
  </tr>
</table>

<h3>Respostas</h3>
<table>
  <tr>
    <th>Código</th>
    <th>Descrição</th>
    <th>Corpo da Resposta</th>
  </tr>
  <tr>
    <td>200 OK</td>
    <td>Requisição bem-sucedida</td>
    <td>Lista paginada de acordãos</td>
  </tr>
</table>


<h1>AcordaoService</h1>

<h2>Listar Acordãos</h2>

<p><strong>Descrição:</strong> Retorna uma lista paginada de acordãos com base na ordenação especificada.</p>

<h3>Parâmetros</h3>
<table>
  <tr>
    <th>Parâmetro</th>
    <th>Tipo</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>ordenacao</td>
    <td>String</td>
    <td>A ordenação dos acordãos. Opções: "por-ano-desc" (ano de forma decrescente), "por-ano-asc" (ano de forma crescente), "sem-ordenacao" (sem ordenação).</td>
  </tr>
  <tr>
    <td>pagina</td>
    <td>int</td>
    <td>O número da página a ser retornada.</td>
  </tr>
</table>

<h3>Retorno</h3>
<p>Uma lista paginada de acordãos.</p>

<h1>TermosContratuaisController</h1>

<h2>Listar Termos Contratuais</h2>

<p><strong>Descrição:</strong> Retorna uma lista de termos contratuais com base na ordenação e página especificadas.</p>

<h3>URL</h3>
<p>/termos-contratuais/listar/{ordenacao}/{pagina}</p>

<h3>Método</h3>
<p>GET</p>

<h3>Parâmetros de Caminho (Path Parameters)</h3>
<table>
  <tr>
    <th>Parâmetro</th>
    <th>Tipo</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>ordenacao</td>
    <td>String</td>
    <td>A ordenação dos termos contratuais. Opções: "por-ano-desc" (ano de forma decrescente), "por-ano-asc" (ano de forma crescente), "por-valor-desc" (valor atualizado de forma decrescente), "por-valor-asc" (valor atualizado de forma crescente), "sem-ordenacao" (sem ordenação).</td>
  </tr>
  <tr>
    <td>pagina</td>
    <td>int</td>
    <td>O número da página a ser retornada.</td>
  </tr>
</table>

<h3>Respostas</h3>
<table>
  <tr>
    <th>Código</th>
    <th>Descrição</th>
    <th>Corpo da Resposta</th>
  </tr>
  <tr>
    <td>200 OK</td>
    <td>Requisição bem-sucedida</td>
    <td>Lista paginada de termos contratuais</td>
  </tr>
</table>


<h1>TermosContratuaisService</h1>

<h2>Listar Termos Contratuais</h2>

<p><strong>Descrição:</strong> Retorna uma lista paginada de termos contratuais com base na ordenação especificada.</p>

<h3>Parâmetros</h3>
<table>
  <tr>
    <th>Parâmetro</th>
    <th>Tipo</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>ordenacao</td>
    <td>String</td>
    <td>A ordenação dos termos contratuais. Opções: "por-ano-desc" (ano de forma decrescente), "por-ano-asc" (ano de forma crescente), "por-valor-desc" (valor atualizado de forma decrescente), "por-valor-asc" (valor atualizado de forma crescente), "sem-ordenacao" (sem ordenação).</td>
  </tr>
  <tr>
    <td>pagina</td>
    <td>int</td>
    <td>O número da página a ser retornada.</td>
  </tr>
</table>

<h3>Retorno</h3>
<p>Uma lista paginada de termos contratuais.</p>
