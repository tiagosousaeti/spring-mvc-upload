package br.eti.tiagosousa.springmvcupload.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.eti.tiagosousa.springmvcupload.model.Album;

@Controller
public class PhotoAlbumController {

	@GetMapping("/photoAlbum")
	public ModelAndView exibirArquivoUnico(Model model){
		ModelAndView mv = new ModelAndView("photoAlbum");
		mv.addObject("album", new Album());
		return mv;
	}
	
	@PostMapping("/savePhotoAlbum")
    public ModelAndView uploadResources(@ModelAttribute Album album, Model model, HttpServletRequest servletRequest) {
		List<MultipartFile> fotos = album.getFotos();
        List<String> nomesDosArquivos = new ArrayList<String>();
        
        if (null != fotos && fotos.size() > 0) {
        	for (MultipartFile multipartFile : fotos) {
 
                String fileName = multipartFile.getOriginalFilename();
                nomesDosArquivos.add(fileName);
                
                model.addAttribute("album", album);
                return new ModelAndView("viewAlbum");
            }
        }        
        
        return exibirArquivoUnico(model);
    }
}