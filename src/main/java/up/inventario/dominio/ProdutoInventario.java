package up.inventario.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="produtoinventario")
public class ProdutoInventario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int produtoID;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="localizacaoID")
	private Localizacao localizacaoID;
	
	@Column(name = "estante", nullable = false)
	private String estante;
	
	@Column(name = "bin", nullable = true)
	private int bin;
	
	@Column(name = "quantidade", nullable = true)
	private int quantidade;

	@Column(name = "chave", nullable = true)
	private String chave;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datamodificacao", nullable = true)
	private Date datamodificacao;
	
	
	public int getProdutoID() {
		return produtoID;
	}

	public void setProdutoID(int produtoID) {
		produtoID = produtoID;
	}

	public Localizacao getLocalizacaoID() {
		return localizacaoID;
	}

	public void setLocalizacaoID(Localizacao localizacaoID) {
		this.localizacaoID = localizacaoID;
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

	public int getBin() {
		return bin;
	}

	public void setBin(int bin) {
		this.bin = bin;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Date getDatamodificacao() {
		return datamodificacao;
	}

	public void setDatamodificacao(Date datamodificacao) {
		this.datamodificacao = datamodificacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}
