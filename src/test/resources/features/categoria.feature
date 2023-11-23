#language:pt
  @categoria
  Funcionalidade: Consulta Categoria

    Cenario: Realizar consulta categoria com sucesso

      Dado que tenha realizado o login com dados validos
      E que tenha um payload da API de categoria
      Quando realizar uma requisacao do tipo GET de Categoria
      Entao valido que recebo status 200 no response
      E valido que no campo "tipo[2]" possui o valor "Terror"