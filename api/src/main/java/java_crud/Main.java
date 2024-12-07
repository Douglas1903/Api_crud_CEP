package java_crud;

import java.io.IOException;

import java_crud.dto.EnderecoDTO;
import java_crud.serviço.ApiServico;

public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();

        try {
            EnderecoDTO enderecoDTO = apiServico.getEndereco("88330340");
            System.out.println(enderecoDTO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}