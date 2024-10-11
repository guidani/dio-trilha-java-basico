# Facade Pattern

O Facade Pattern (Padrão de Fachada) é um padrão de design estrutural que fornece uma interface simplificada para um subsistema complexo, ocultando os detalhes internos das classes e suas interações. Ele é útil quando você quer reduzir a complexidade de um sistema ou oferecer uma interface mais amigável ao cliente.

Aqui estão alguns exemplos de projetos onde você pode aplicar o Facade Pattern:

## Sistema de Home Theater
Imagine que você tem um sistema de home theater com vários componentes, como DVD player, projetor, luzes, sistema de som, etc. Cada um desses componentes tem uma série de métodos e interações complexas que o usuário precisa conhecer para operar o sistema corretamente.

Problema:
Controlar todos esses dispositivos manualmente pode ser complicado e exigir muito conhecimento sobre os detalhes de implementação.

Aplicação do Facade Pattern:
Crie uma classe HomeTheaterFacade que encapsula toda a complexidade e fornece métodos simplificados como assistirFilme() e encerrarFilme().
O usuário do sistema só precisa interagir com a fachada, que lida com a operação dos componentes internos.

```java
public class DVDPlayer {
    public void ligar() {
        System.out.println("DVD Player ligado.");
    }

    public void reproduzirFilme(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }

    public void desligar() {
        System.out.println("DVD Player desligado.");
    }
}

public class Projetor {
    public void ligar() {
        System.out.println("Projetor ligado.");
    }

    public void desligar() {
        System.out.println("Projetor desligado.");
    }
}

public class Luzes {
    public void escurecer() {
        System.out.println("Luzes escurecidas.");
    }

    public void acender() {
        System.out.println("Luzes acesas.");
    }
}

public class SistemaDeSom {
    public void ajustarVolume(int nivel) {
        System.out.println("Volume ajustado para: " + nivel);
    }
}

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projetor projetor;
    private Luzes luzes;
    private SistemaDeSom som;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projetor projetor, Luzes luzes, SistemaDeSom som) {
        this.dvdPlayer = dvdPlayer;
        this.projetor = projetor;
        this.luzes = luzes;
        this.som = som;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir um filme...");
        luzes.escurecer();
        projetor.ligar();
        som.ajustarVolume(5);
        dvdPlayer.ligar();
        dvdPlayer.reproduzirFilme(filme);
    }

    public void encerrarFilme() {
        System.out.println("Encerrando o filme...");
        dvdPlayer.desligar();
        projetor.desligar();
        luzes.acender();
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projetor projetor = new Projetor();
        Luzes luzes = new Luzes();
        SistemaDeSom som = new SistemaDeSom();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projetor, luzes, som);
        homeTheater.assistirFilme("Matrix");
        homeTheater.encerrarFilme();
    }
}
```

## Sistema de Gerenciamento de Banco de Dados
Imagine que você tem um sistema que precisa lidar com várias operações de banco de dados, como conectar-se ao banco, executar consultas, fechar conexões, etc.

Problema:
O código para gerenciar conexões e executar comandos SQL pode ser repetitivo e propenso a erros, especialmente quando várias classes precisam realizar operações semelhantes.

Aplicação do Facade Pattern:
Crie uma classe DatabaseFacade que encapsula a complexidade de conectar, executar consultas, e fechar a conexão.
O cliente pode apenas chamar métodos como executarConsulta() sem se preocupar com os detalhes de configuração e fechamento da conexão.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseFacade {
    private Connection connection;
    private Statement statement;

    public void conectar(String url, String usuario, String senha) throws Exception {
        connection = DriverManager.getConnection(url, usuario, senha);
        statement = connection.createStatement();
        System.out.println("Conectado ao banco de dados.");
    }

    public void executarConsulta(String consulta) throws Exception {
        ResultSet resultSet = statement.executeQuery(consulta);
        while (resultSet.next()) {
            System.out.println("Resultado: " + resultSet.getString(1));
        }
    }

    public void desconectar() throws Exception {
        statement.close();
        connection.close();
        System.out.println("Desconectado do banco de dados.");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        try {
            DatabaseFacade dbFacade = new DatabaseFacade();
            dbFacade.conectar("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
            dbFacade.executarConsulta("SELECT * FROM tabela");
            dbFacade.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```

## Sistema de Reservas de Viagem
Imagine que você está desenvolvendo um sistema de reservas de viagens que envolve a compra de passagens de avião, reservas de hotéis e aluguel de carros, com APIs diferentes para cada um desses serviços.

Problema:
O cliente precisaria conhecer os detalhes de cada serviço (passagens, hotel, aluguel de carro) e saber como interagir com cada API individualmente, tornando o sistema complexo de usar.

Aplicação do Facade Pattern:
Crie uma classe ReservaViagemFacade que lida com as interações com cada subsistema (passagens, hotel, aluguel de carro) e fornece um método simples como reservarViagem().

```java
public class ReservaPassagem {
    public void reservarPassagem(String origem, String destino) {
        System.out.println("Passagem de " + origem + " para " + destino + " reservada.");
    }
}

public class ReservaHotel {
    public void reservarHotel(String cidade) {
        System.out.println("Hotel reservado em " + cidade + ".");
    }
}

public class AluguelCarro {
    public void alugarCarro(String cidade) {
        System.out.println("Carro alugado em " + cidade + ".");
    }
}

public class ReservaViagemFacade {
    private ReservaPassagem passagem;
    private ReservaHotel hotel;
    private AluguelCarro carro;

    public ReservaViagemFacade(ReservaPassagem passagem, ReservaHotel hotel, AluguelCarro carro) {
        this.passagem = passagem;
        this.hotel = hotel;
        this.carro = carro;
    }

    public void reservarViagem(String origem, String destino) {
        passagem.reservarPassagem(origem, destino);
        hotel.reservarHotel(destino);
        carro.alugarCarro(destino);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        ReservaPassagem passagem = new ReservaPassagem();
        ReservaHotel hotel = new ReservaHotel();
        AluguelCarro carro = new AluguelCarro();

        ReservaViagemFacade viagemFacade = new ReservaViagemFacade(passagem, hotel, carro);
        viagemFacade.reservarViagem("São Paulo", "Rio de Janeiro");
    }
}
```