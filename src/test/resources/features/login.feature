#language:pt
@wip
Funcionalidade: Realizar Login
  Testes de API de login

  @loginSucesso
  Cenario: Realizar login com Sucesso
    Dado que tenha um payload valido da API de Login
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo status 200 no response
    E armazeno o token que recebo no response de Login

  @loginInvalido
  Esquema do Cenario: Realizar Login <cenario>
    Dado que tenha um payload da API de Login com as seguintes imformações
      | email | <email> |
      | senha | <senha> |
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo status 400 no response

    Exemplos:
      | cenario          | email              | senha    |
      | usuario invalido | invalido@email.com | 123456   |
      | senha invalida   | aluno@email.com    | invalido |
