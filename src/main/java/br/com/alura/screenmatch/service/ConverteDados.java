package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

<<<<<<< HEAD
public class ConverteDados implements IConverteDados{
        private ObjectMapper mapper = new ObjectMapper();

=======
public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
