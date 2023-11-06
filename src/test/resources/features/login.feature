#language:pt

Funcionalidade: Realizar Login
  Testes de API de login

  Cenario: Realizar login com Sucesso
    Dado que tenha um payload valido da API de Login
    Quando envio uma requisição do tipo POST de Login
    Entao valido que recebo status 200 no response
    E armazeno o token que recebo no response de Login

  Cenario: Realizar Login com usuário inválido
    Dado que tenha um payload da API de Login com as seguintes imformações
      | email | invalido@email.com |
      | senha | 123456             |
    Quando envio uma requisição do tipo POST de Login
    Entao valido que recebo status 400 no response

