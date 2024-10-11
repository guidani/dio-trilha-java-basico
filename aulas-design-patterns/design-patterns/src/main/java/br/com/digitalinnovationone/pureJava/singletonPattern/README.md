# Singleton Pattern

O Singleton Pattern (Padrão Singleton) é um padrão de design criacional que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. Esse padrão é útil quando se deseja controlar o acesso a certos recursos que devem existir apenas uma vez em toda a aplicação, como uma conexão com banco de dados, logger, ou gerenciador de configurações.

Aqui estão alguns exemplos de projetos onde o Singleton Pattern pode ser aplicado para estudo:

## Gerenciamento de Conexão com Banco de Dados
Imagine que você tem um sistema que precisa garantir que apenas uma conexão com o banco de dados seja usada ao longo da aplicação para evitar a sobrecarga de múltiplas conexões.

Problema:
Abrir várias conexões com o banco pode ser caro em termos de recursos e pode causar inconsistências se várias conexões forem usadas simultaneamente.

Aplicação do Singleton Pattern:
Crie uma classe DatabaseConnection que seja responsável por fornecer uma única instância de conexão ao banco de dados.
O método getInstance() garante que a conexão seja criada uma única vez e reutilizada.

```java
public class DatabaseConnection {
    private static DatabaseConnection instancia;
    private Connection conexao;

    private DatabaseConnection() {
        try {
            // Simulando conexão com banco de dados
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (instancia == null) {
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    public Connection getConnection() {
        return conexao;
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2);  // Retorna true, mostrando que é a mesma instância
    }
}

```

## Sistema de Log
Imagine que você está desenvolvendo um sistema que precisa registrar logs de ações e eventos da aplicação, e você quer garantir que todas as classes usem o mesmo sistema de logs.

Problema:
Se houver múltiplas instâncias de uma classe de log, você pode acabar com logs fragmentados ou em diferentes arquivos, tornando difícil rastrear os eventos da aplicação.

Aplicação do Singleton Pattern:
Crie uma classe Logger que garante que todos os logs sejam registrados em um único arquivo ou local centralizado.
A classe usa o getInstance() para garantir que apenas uma instância da classe de log exista.

```java
public class Logger {
    private static Logger instancia;
    private BufferedWriter escritor;

    private Logger() {
        try {
            escritor = new BufferedWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        try {
            escritor.write(mensagem);
            escritor.newLine();
            escritor.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Aplicação iniciada");

        Logger logger2 = Logger.getInstance();
        logger2.log("Outra ação registrada");

        // Ambos loggers são a mesma instância
    }
}
```

## Gerenciamento de Configurações da Aplicação
Em muitas aplicações, especialmente as maiores, é necessário carregar e acessar configurações a partir de um arquivo central (como um arquivo .properties ou .json). O Singleton Pattern garante que as configurações sejam carregadas apenas uma vez e reutilizadas durante toda a aplicação.

Problema:
Carregar repetidamente as mesmas configurações pode ser ineficiente, além de causar inconsistências se diferentes partes da aplicação modificarem essas configurações de maneira não controlada.

Aplicação do Singleton Pattern:
Crie uma classe ConfigManager que carrega as configurações do sistema uma única vez e fornece acesso a essas configurações para o resto da aplicação.

```java
import java.util.Properties;
import java.io.InputStream;

public class ConfigManager {
    private static ConfigManager instancia;
    private Properties propriedades;

    private ConfigManager() {
        propriedades = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Desculpe, não foi possível encontrar config.properties");
                return;
            }
            propriedades.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConfigManager getInstance() {
        if (instancia == null) {
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getPropriedade(String chave) {
        return propriedades.getProperty(chave);
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        String dbUrl = config.getPropriedade("db.url");
        System.out.println("Database URL: " + dbUrl);
    }
}
```

## Gerenciador de Thread Pool
Imagine que você tem um sistema que lida com a execução de múltiplas tarefas em paralelo usando threads. Você quer garantir que haja um controle central sobre quantas threads estão sendo criadas e gerenciadas.

Problema:
Criar múltiplas instâncias de ThreadPool pode causar a criação descontrolada de threads, resultando em sobrecarga de recursos.

Aplicação do Singleton Pattern:
Crie uma classe ThreadPoolManager que mantém um número fixo de threads e garante que todas as partes da aplicação usem o mesmo pool de threads.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolManager {
    private static ThreadPoolManager instancia;
    private ExecutorService executor;

    private ThreadPoolManager() {
        executor = Executors.newFixedThreadPool(10); // pool com 10 threads
    }

    public static ThreadPoolManager getInstance() {
        if (instancia == null) {
            instancia = new ThreadPoolManager();
        }
        return instancia;
    }

    public void executarTarefa(Runnable tarefa) {
        executor.execute(tarefa);
    }

    public void shutdown() {
        executor.shutdown();
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        ThreadPoolManager pool = ThreadPoolManager.getInstance();
        pool.executarTarefa(() -> {
            System.out.println("Tarefa executada na thread pool");
        });

        ThreadPoolManager pool2 = ThreadPoolManager.getInstance();
        pool2.executarTarefa(() -> {
            System.out.println("Outra tarefa executada");
        });
    }
}

```

## Sistema de Gerenciamento de Cache
Imagine que você está desenvolvendo um sistema que precisa armazenar temporariamente dados em memória (cache) para melhorar o desempenho e evitar buscas repetidas de dados.

Problema:
Se múltiplas instâncias de cache forem criadas, você pode acabar armazenando informações duplicadas ou inconsistentes, o que diminui a eficiência do cache.

Aplicação do Singleton Pattern:
Crie uma classe CacheManager que garante que apenas uma instância de cache exista e seja compartilhada em toda a aplicação.

```java
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static CacheManager instancia;
    private Map<String, Object> cache;

    private CacheManager() {
        cache = new HashMap<>();
    }

    public static CacheManager getInstance() {
        if (instancia == null) {
            instancia = new CacheManager();
        }
        return instancia;
    }

    public void adicionar(String chave, Object valor) {
        cache.put(chave, valor);
    }

    public Object obter(String chave) {
        return cache.get(chave);
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        CacheManager cache = CacheManager.getInstance();
        cache.adicionar("usuario", "João");

        CacheManager cache2 = CacheManager.getInstance();
        System.out.println(cache2.obter("usuario"));  // Retorna "João", mesma instância de cache
    }
}

```