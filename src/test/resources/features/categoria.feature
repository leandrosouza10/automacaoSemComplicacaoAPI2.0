#language:pt


  @categoria
  Funcionalidade: Consulta Categoria

    @categotiaSucesso
    Cenario: Realizar consulta categoria com sucesso

      Dado que tenha realizado o login com dados validos
      E que tenha um payload da API de categoria
      Quando realizar uma requisicao do tipo GET de Categoria
      Entao validar que recebo status 200 no response
      E validar que no campo "tipo[2]" possui o valor "Terror"

    @categoriaSemToken
    Cenario: Realizar consulta categoria sem token
      Quando realizar uma requisicao do tipo GET de Categoria
      Entao validar que recebo status 403 no response
      E validar que no campo "message" possui o valor "Access Denied"

    @categoriaTokenInvalido
    Cenario: Realizar consulta categoria com token invalido
      Dado que altero o campo "Authorization" para "invalido" do header de categoria
      Quando realizar uma requisicao do tipo GET de Categoria
      Entao validar que recebo status 403 no response
      E validar que no campo "message" possui o valor "Access Denied"