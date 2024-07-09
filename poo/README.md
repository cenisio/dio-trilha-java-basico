### Diagrama UML iPhone (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Funcionalidade{
        +iniciar()
        +parar()
    }

    class iPhone {
        modelo: String
        sistemaOperacional: String
        armazenamento: int
        +ligar()
        +desligar()
    }

    ReprodutorMusical --> Funcionalidade
    AparelhoTelefonico --> Funcionalidade
    NavegadorInternet --> Funcionalidade
    Funcionalidade --> iPhone
```

### Explicação do Diagrama

- **iPhone** é a classe principal que representa o dispositivo iPhone. Ele possui atributos como: modelo, sistema operacional e armazenamento. E métodos básicos para ligar e desligar o dispositivo.
- **Funcionalidade** é uma classe base abstrata que define a estrutura básica para funcionalidades específicas do iPhone como iniciar e parar..
- **ReprodutorMusical**: Classe que herda de Funcionalidade, responsável por tocar, pausar e selecionar músicas.
- **AparelhoTelefonico**: Classe que herda de Funcionalidade, responsável por ligar, atender chamadas e iniciar correio de voz. 
- **NavegadorInternet**: Classe que herda de Funcionalidade, responsável por exibir página, adicionar nova aba e atualizar páginas da web.
