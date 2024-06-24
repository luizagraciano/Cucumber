Feature: Cadastro
    Scenario: Cadastro com sucesso
    Given Usuário esteja na página principal
    And Usuário clique no botão "Login/ Signup"
    When Usuário inserir um nome no campo "Name"
    And Usuário inserir um email no campo "Email Address"
    And Usuário clicar no botão "Signup"
    Then Usuário deve ser redirecionado para a página de Cadastro

    Scenario: Cadastro com email já existente
    Given Usuário esteja na página principal
    And Usuário clique no botão "Login/ Signup"
    When Usuário inserir um nome no campo "Name"
    And Usuário inserir um email existente no campo "Email Address"
    And Usuário clicar no botão "Signup"
    Then Usuário deve receber mensagem de email já cadastrado