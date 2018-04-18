package br.eti.tiagosousa.springmvcupload.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class Album implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Digite o nome")
    @Size(min=3, max=50, message = "O nome tem limite de 50 caracteres")
    private String nome;
	
	@Size(max=100, message = "A descrição tem limite de 100 caracteres")
    private String descricao;
 
    private List<MultipartFile> fotos;

	public Album() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<MultipartFile> getFotos() {
		return fotos;
	}

	public void setFotos(List<MultipartFile> fotos) {
		this.fotos = fotos;
	}

	@Override
	public String toString() {
		return "Album [nome=" + nome + ", descricao=" + descricao + ", fotos=" + fotos + "]";
	}
}