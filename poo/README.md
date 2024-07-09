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
        modelo
        sistemaOperacional
        armazenamento
        +ligar()
        +desligar()
    }

    ReprodutorMusical --> Funcionalidade
    AparelhoTelefonico --> Funcionalidade
    NavegadorInternet --> Funcionalidade
