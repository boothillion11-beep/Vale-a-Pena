# Vale-a-Pena
Site de Resenhas

Sistema de Resenhas

Sistema desenvolvido utilizando Programação Orientada a Objetos (POO) para gerenciamento de resenhas, avaliações, comentários, favoritos, denúncias e recomendações.

Objetivo

O sistema permite que usuários publiquem e avaliem resenhas sobre diferentes categorias de conteúdo, além de possibilitar comentários, favoritos, pesquisas e recomendações personalizadas.

Tecnologias
Java
Programação Orientada a Objetos
Git
GitHub
Principais classes
Usuario
Administrador
Resenha
Categoria
Subgenero
Avaliacao
Comentario
Favorito
Denuncia
Recomendacao
FaixaEtaria
Pesquisa
LinkExterno
Estrutura
Usuario
 └── Administrador

Resenha
 ├── Categoria
 │    └── Subgenero
 ├── Avaliacao
 ├── Comentario
 ├── FaixaEtaria
 └── LinkExterno

Usuario
 ├── Avaliacao
 ├── Comentario
 ├── Favorito
 ├── Denuncia
 └── Recomendacao

Usuario
 └── Pesquisa

Funcionalidades
Usuários
Cadastro
Login
Edição de perfil
Favoritar resenhas
Avaliar resenhas
Publicar resenhas
Denunciar conteúdos
Resenhas
Publicação
Edição
Exclusão
Cálculo de nota média
Tags
Imagens
Links externos
Avaliações

As avaliações possuem notas entre 0 e 10.

A média das avaliações é calculada automaticamente.

Comentários

Os comentários permitem respostas utilizando a relação comentarioPai.

Recomendações

As recomendações podem considerar:

Interesses
Histórico
Avaliações
Favoritos
Pesquisas
Moderação

Administradores podem:

Gerenciar usuários
Moderar resenhas
Analisar denúncias
Gerenciar categorias
Gerenciar classificações
Bloquear usuários
Conceitos de POO utilizados
Encapsulamento
Herança
Associação
Composição
Polimorfismo
Responsabilidade única
Autor

Projeto acadêmico desenvolvido para estudo de Programação Orientada a Objetos.
