package model;
// Generated 23/09/2015 18:27:47 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TbAvaliaEstagiario generated by hbm2java
 */
@Entity
@Table(name="tb_avalia_estagiario"
    ,catalog="bd_sge"
)
public class TbAvaliaEstagiario  implements java.io.Serializable {


     private int idtAvaliaEstagiario;
     private TbSupEstagio tbSupEstagio;
     private TbEstagiario tbEstagiario;
     private int ntaEstagiarioAvaliaEstagiario;
     private String comAvaliaEstagiario;

    public TbAvaliaEstagiario() {
    }

	
    public TbAvaliaEstagiario(int idtAvaliaEstagiario, TbSupEstagio tbSupEstagio, TbEstagiario tbEstagiario, int ntaEstagiarioAvaliaEstagiario) {
        this.idtAvaliaEstagiario = idtAvaliaEstagiario;
        this.tbSupEstagio = tbSupEstagio;
        this.tbEstagiario = tbEstagiario;
        this.ntaEstagiarioAvaliaEstagiario = ntaEstagiarioAvaliaEstagiario;
    }
    public TbAvaliaEstagiario(int idtAvaliaEstagiario, TbSupEstagio tbSupEstagio, TbEstagiario tbEstagiario, int ntaEstagiarioAvaliaEstagiario, String comAvaliaEstagiario) {
       this.idtAvaliaEstagiario = idtAvaliaEstagiario;
       this.tbSupEstagio = tbSupEstagio;
       this.tbEstagiario = tbEstagiario;
       this.ntaEstagiarioAvaliaEstagiario = ntaEstagiarioAvaliaEstagiario;
       this.comAvaliaEstagiario = comAvaliaEstagiario;
    }
   
     @Id 
    
    @Column(name="idt_avalia_estagiario", unique=true, nullable=false)
    public int getIdtAvaliaEstagiario() {
        return this.idtAvaliaEstagiario;
    }
    
    public void setIdtAvaliaEstagiario(int idtAvaliaEstagiario) {
        this.idtAvaliaEstagiario = idtAvaliaEstagiario;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_sup_estagio", nullable=false)
    public TbSupEstagio getTbSupEstagio() {
        return this.tbSupEstagio;
    }
    
    public void setTbSupEstagio(TbSupEstagio tbSupEstagio) {
        this.tbSupEstagio = tbSupEstagio;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_estagiario", nullable=false)
    public TbEstagiario getTbEstagiario() {
        return this.tbEstagiario;
    }
    
    public void setTbEstagiario(TbEstagiario tbEstagiario) {
        this.tbEstagiario = tbEstagiario;
    }
    
    @Column(name="nta_estagiario_avalia_estagiario", nullable=false)
    public int getNtaEstagiarioAvaliaEstagiario() {
        return this.ntaEstagiarioAvaliaEstagiario;
    }
    
    public void setNtaEstagiarioAvaliaEstagiario(int ntaEstagiarioAvaliaEstagiario) {
        this.ntaEstagiarioAvaliaEstagiario = ntaEstagiarioAvaliaEstagiario;
    }
    
    @Column(name="com_avalia_estagiario", length=200)
    public String getComAvaliaEstagiario() {
        return this.comAvaliaEstagiario;
    }
    
    public void setComAvaliaEstagiario(String comAvaliaEstagiario) {
        this.comAvaliaEstagiario = comAvaliaEstagiario;
    }




}


