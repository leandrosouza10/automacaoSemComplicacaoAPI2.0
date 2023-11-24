#language:pt

@filmes @regressivo
Funcionalidade: CRUD filme

  Contexto:
    Dado que tenha realizado o login com dados validos
    E que tenha um payload valido da API de Filme


  @cadastroFilme
  Cenario: Cadastro filme
    Quando enviar uma requisicao do tipo POST de Filme
    Entao validar que recebo status 201 no response
    E validar que no campo "categorias.tipo[1]" possui o valor "Comedia"
    E armazenar o id que recebo no response de Filme


  @consultaFilme
  Cenario: Consulta Filme
    Quando enviar uma requisicao do tipo GET de Filme atraves do nome
    Entao validar que recebo status 200 no response
    E validar que no campo "categorias[0].tipo[1]" possui o valor "Comedia"

  @alteracaoFilme
  Cenario: Alteracao Filme
    E alterar o tipo 1 da lista de categoria de filmes com os valores
      | tipo | Terror |
    Quando realizar uma requisicao do tipo PUT de Filme
    Entao validar que recebo status 200 no response
    E validar que no campo "categorias.tipo[1]" possui o valor "Terror"


  @consultaFilmeAposAlteracao
  Cenario: Consulta Filme apos alteracao
    Quando enviar uma requisicao do tipo GET de Filme atraves do nome
    Entao validar que recebo status 200 no response
    E validar que no campo "categorias[0].tipo[1]" possui o valor "Terror"


  @exclusaoFilme
  Cenario: Exclusao Filme
    Quando enviar uma requisicao do tipo DELETE de Filme
    Entao validar que recebo status 200 no response


  @consultaFilmeAposExclusao
  Cenario: Consulta Filme Apos Exclusao
    Quando enviar uma requisicao do tipo GET de Filme atraves do nome
    Entao validar que recebo status 200 no response
    E validar se a lista esta vazia no response