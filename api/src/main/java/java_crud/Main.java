package java_crud;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java_crud.dto.EnderecoDTO;
import java_crud.serviço.ApiServico;

public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();

        try {
            EnderecoDTO enderecoDTO = apiServico.getEndereco("01153000");

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            String json = objectMapper.writeValueAsString(enderecoDTO);
            System.out.println(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}