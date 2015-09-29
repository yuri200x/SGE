package model;
// Generated 23/09/2015 18:27:47 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbOpcao generated by hbm2java
 */
@Entity
@Table(name="tb_opcao"
    ,catalog="bd_sge"
)
public class TbOpcao  implements java.io.Serializable {


     private Integer idtOpcao;
     private TbMenu tbMenu;
     private String usrOpcaoCad;
     private Date dtaOpcaoCad;
     private String nmeOpcao;
     private String descOpcao;
     private Set<TbMapeamento> tbMapeamentos = new HashSet<TbMapeamento>(0);

    public TbOpcao() {
    }

	
    public TbOpcao(TbMenu tbMenu, String usrOpcaoCad, Date dtaOpcaoCad, String nmeOpcao, String descOpcao) {
        this.tbMenu = tbMenu;
        this.usrOpcaoCad = usrOpcaoCad;
        this.dtaOpcaoCad = dtaOpcaoCad;
        this.nmeOpcao = nmeOpcao;
        this.descOpcao = descOpcao;
    }
    public TbOpcao(TbMenu tbMenu, String usrOpcaoCad, Date dtaOpcaoCad, String nmeOpcao, String descOpcao, Set<TbMapeamento> tbMapeamentos) {
       this.tbMenu = tbMenu;
       this.usrOpcaoCad = usrOpcaoCad;
       this.dtaOpcaoCad = dtaOpcaoCad;
       this.nmeOpcao = nmeOpcao;
       this.descOpcao = descOpcao;
       this.tbMapeamentos = tbMapeamentos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_opcao", unique=true, nullable=false)
    public Integer getIdtOpcao() {
        return this.idtOpcao;
    }
    
    public void setIdtOpcao(Integer idtOpcao) {
        this.idtOpcao = idtOpcao;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_menu", nullable=false)
    public TbMenu getTbMenu() {
        return this.tbMenu;
    }
    
    public void setTbMenu(TbMenu tbMenu) {
        this.tbMenu = tbMenu;
    }
    
    @Column(name="usr_opcao_cad", nullable=false, length=45)
    public String getUsrOpcaoCad() {
        return this.usrOpcaoCad;
    }
    
    public void setUsrOpcaoCad(String usrOpcaoCad) {
        this.usrOpcaoCad = usrOpcaoCad;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dta_opcao_cad", nullable=false, length=10)
    public Date getDtaOpcaoCad() {
        return this.dtaOpcaoCad;
    }
    
    public void setDtaOpcaoCad(Date dtaOpcaoCad) {
        this.dtaOpcaoCad = dtaOpcaoCad;
    }
    
    @Column(name="nme_opcao", nullable=false, length=45)
    public String getNmeOpcao() {
        return this.nmeOpcao;
    }
    
    public void setNmeOpcao(String nmeOpcao) {
        this.nmeOpcao = nmeOpcao;
    }
    
    @Column(name="desc_opcao", nullable=false, length=100)
    public String getDescOpcao() {
        return this.descOpcao;
    }
    
    public void setDescOpcao(String descOpcao) {
        this.descOpcao = descOpcao;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbOpcao")
    public Set<TbMapeamento> getTbMapeamentos() {
        return this.tbMapeamentos;
    }
    
    public void setTbMapeamentos(Set<TbMapeamento> tbMapeamentos) {
        this.tbMapeamentos = tbMapeamentos;
    }




}

