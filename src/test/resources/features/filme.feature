#language:pt

  Funcionalidade: CRUD filme

    @cadastroFilme
    Cenario: Cadastro filme

      Dado que tenha realizado o login com dados validos
      E que tenha um payload valido da API de Filme
      Quando envio uma requisicao do tipo POST de Filme
      Entao valido que recebo status 201 no response
      E valido que no campo "categorias.tipo[1]" possui o valor "Comedia"
      E armazeno o id que recebo no response de Filme

    Cenario: Consulta Filme

      Dado que tenha realizado o login com dados validos
      E que tenha um payload valido da API de Filme
      Quando envio uma requisicao do tipo GET de Filme atraves do nome
      Entao valido que recebo status 200 no response
      E valido que no campo "categorias.tipo[1]" possui o valor "Comedia"