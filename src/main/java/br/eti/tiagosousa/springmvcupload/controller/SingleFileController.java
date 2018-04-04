package br.eti.tiagosousa.springmvcupload.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SingleFileController {

	@GetMapping("/singlefile")
	public ModelAndView exibirArquivoUnico(){
		return new ModelAndView("singleFile");
	}
	
	@PostMapping("/singlefile")
	public @ResponseBody String salvarArquivoUnico(@RequestParam("arquivo") MultipartFile arquivo){
    	String nomeDoArquivo = null;
    	if (!arquivo.isEmpty()) {
            try {
            	nomeDoArquivo = arquivo.getOriginalFilename();
                byte[] bytes = arquivo.getBytes();
                BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(nomeDoArquivo)));
                buffStream.write(bytes);
                buffStream.close();
                return "Arquivo enviado com sucesso. <br />Nome: " + nomeDoArquivo + "<br /><a href='/springmvcupload/singlefile'>Voltar</a>";
            } catch (Exception e) {
                return "Erro ao enviar o arquivo. <br />Nome: " + nomeDoArquivo + "<br /> Mensagem do erro: " + e.getMessage() + "<br /><a href='/springmvcupload/singlefile'>Voltar</a>";
            }
        } else {
            return "Upload interrompido. Arquivo não selecionado.<br /><a href='/springmvcupload/singlefile'>Voltar</a>";
        }
    }
}