package java_crud.serviço;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import java_crud.dto.EnderecoDTO;

public class ApiServico {

    EnderecoDTO enderecoDto = new EnderecoDTO();

    public EnderecoDTO getEndereco(String cep) throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            enderecoDto = mapper.readValue(response.body(), EnderecoDTO.class); 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return enderecoDto;
    }
}
