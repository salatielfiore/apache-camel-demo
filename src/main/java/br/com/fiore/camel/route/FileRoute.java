package br.com.fiore.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("{{file.route.directory.entrada}}") // Define o diretório de onde os arquivos serão lidos
                .log("Arquivo lido: ${header.CamelFileName}") // Exibe o nome do arquivo lido no console
                .to("{{file.route.directory.saida}}"); // Define o destino dos dados lidos (neste caso, envia para o diretorio saida)
    }
}

