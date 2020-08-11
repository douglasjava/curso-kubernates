package com.kubernates.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/pepiline")
public class ControllerPipeline {

    @GetMapping("/livros")
    public List<String> livros() {
        return getLivros();
    }

    @GetMapping("/livro")
    public String livro() {
        int indice = ThreadLocalRandom.current().nextInt(getLivros().size());
        return getLivros().get(indice);
    }

    private List<String> getLivros() {
        List<String> livros = new ArrayList<>();
        livros.add("Orgulho e Preconceito - Jane Austen");
        livros.add("1984 - George Orwell");
        livros.add("Dom Quixote de la Mancha - Miguel de Cervantes");
        livros.add("O Pequeno Príncipe - Antoine de Saint-Exupéry\n");
        livros.add("Dom Casmurro - Machado de Assis");
        livros.add("O Bandolim do Capitão Corelli - Louis de Bernières");
        livros.add("O Conde de Monte Cristo - Alexandre Dumas");
        livros.add("Um Estudo em Vermelho - Arthur Conan Doyle\n");
        livros.add("O Processo - Franz Kafka");
        livros.add("Cem Anos de Solidão - Gabriel García Márquez\n");
        livros.add("O Coração das Trevas - Joseph Conrad");
        livros.add("Eu, Robô - Isaac Asimov");
        livros.add("O Senhor dos Anéis - J. R. R. Tolkien");
        livros.add("Guerra e Paz - Leo Tolstói");
        return livros;
    }

}
