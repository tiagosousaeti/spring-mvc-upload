package br.eti.tiagosousa.springmvcupload.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultipleFilesController {

	@GetMapping("/multiplefiles")
	public ModelAndView exibirVariosArquivos(){
		return new ModelAndView("multipleFiles");
	}
	
	@PostMapping("/multiplefiles")
    public @ResponseBody String multipleSave(@RequestParam("arquivos") MultipartFile[] arquivos){
		System.out.println(arquivos.length);
    	String fileName = null;
    	String msg = "";
    	if (arquivos != null && arquivos.length > 0) {
    		for(Integer i = 0; i < arquivos.length; i++){
	            try {
	                fileName = arquivos[i].getOriginalFilename();
	                byte[] bytes = arquivos[i].getBytes();
	                BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(fileName));
	                buffStream.write(bytes);
	                buffStream.close();
	                msg += "You have successfully uploaded " + fileName +"<br/>";
	            } catch (Exception e) {
	                return "Erro ao fazer upload do arquivo: " + fileName + "<br/> Mensagem do Erro: " + e.getMessage();
	            }
    		}
    		return msg;
        }
    	return "Upload interrompido. Arquivo não selecionado.<br /><a href='/springmvcupload/multiplefiles'>Voltar</a>";
    }
}