package bean;
// Generated 27/10/2023 11:42:28 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VeccVendaProduto generated by hbm2java
 */
@Entity
@Table(name="vecc_venda_produto"
    ,catalog="db_victor_cardoso"
)
public class VeccVendaProduto  implements java.io.Serializable {


     private int veccIdvendaProduto;
     private VeccProduto veccProduto;
     private VeccVenda veccVenda;
     private String veccQuantidade;
     private String veccValor;

    public VeccVendaProduto() {
    }

	
    public VeccVendaProduto(int veccIdvendaProduto, VeccProduto veccProduto, VeccVenda veccVenda) {
        this.veccIdvendaProduto = veccIdvendaProduto;
        this.veccProduto = veccProduto;
        this.veccVenda = veccVenda;
    }
    public VeccVendaProduto(int veccIdvendaProduto, VeccProduto veccProduto, VeccVenda veccVenda, String veccQuantidade, String veccValor) {
       this.veccIdvendaProduto = veccIdvendaProduto;
       this.veccProduto = veccProduto;
       this.veccVenda = veccVenda;
       this.veccQuantidade = veccQuantidade;
       this.veccValor = veccValor;
    }
   
     @Id 

    
    @Column(name="vecc_idvenda_produto", unique=true, nullable=false)
    public int getVeccIdvendaProduto() {
        return this.veccIdvendaProduto;
    }
    
    public void setVeccIdvendaProduto(int veccIdvendaProduto) {
        this.veccIdvendaProduto = veccIdvendaProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vecc_fk_produtos", nullable=false)
    public VeccProduto getVeccProduto() {
        return this.veccProduto;
    }
    
    public void setVeccProduto(VeccProduto veccProduto) {
        this.veccProduto = veccProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vecc_fk_venda", nullable=false)
    public VeccVenda getVeccVenda() {
        return this.veccVenda;
    }
    
    public void setVeccVenda(VeccVenda veccVenda) {
        this.veccVenda = veccVenda;
    }

    
    @Column(name="vecc_quantidade", length=45)
    public String getVeccQuantidade() {
        return this.veccQuantidade;
    }
    
    public void setVeccQuantidade(String veccQuantidade) {
        this.veccQuantidade = veccQuantidade;
    }

    
    @Column(name="vecc_valor", length=45)
    public String getVeccValor() {
        return this.veccValor;
    }
    
    public void setVeccValor(String veccValor) {
        this.veccValor = veccValor;
    }




}


