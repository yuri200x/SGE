package model;
// Generated 23/09/2015 18:27:47 by Hibernate Tools 3.2.1.GA


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

/**
 * TbMedico generated by hbm2java
 */
@Entity
@Table(name="tb_medico"
    ,catalog="bd_sge"
)
public class TbMedico  implements java.io.Serializable {


     private Integer idtMedico;
     private TbPessoa tbPessoa;
     private String crmMedico;
     private Set<TbCenario> tbCenarios = new HashSet<TbCenario>(0);
     private Set<TbSupEstagio> tbSupEstagios = new HashSet<TbSupEstagio>(0);

    public TbMedico() {
    }

	
    public TbMedico(TbPessoa tbPessoa, String crmMedico) {
        this.tbPessoa = tbPessoa;
        this.crmMedico = crmMedico;
    }
    public TbMedico(TbPessoa tbPessoa, String crmMedico, Set<TbCenario> tbCenarios, Set<TbSupEstagio> tbSupEstagios) {
       this.tbPessoa = tbPessoa;
       this.crmMedico = crmMedico;
       this.tbCenarios = tbCenarios;
       this.tbSupEstagios = tbSupEstagios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_medico", unique=true, nullable=false)
    public Integer getIdtMedico() {
        return this.idtMedico;
    }
    
    public void setIdtMedico(Integer idtMedico) {
        this.idtMedico = idtMedico;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_pessoa", nullable=false)
    public TbPessoa getTbPessoa() {
        return this.tbPessoa;
    }
    
    public void setTbPessoa(TbPessoa tbPessoa) {
        this.tbPessoa = tbPessoa;
    }
    
    @Column(name="crm_medico", nullable=false, length=15)
    public String getCrmMedico() {
        return this.crmMedico;
    }
    
    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbMedico")
    public Set<TbCenario> getTbCenarios() {
        return this.tbCenarios;
    }
    
    public void setTbCenarios(Set<TbCenario> tbCenarios) {
        this.tbCenarios = tbCenarios;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbMedico")
    public Set<TbSupEstagio> getTbSupEstagios() {
        return this.tbSupEstagios;
    }
    
    public void setTbSupEstagios(Set<TbSupEstagio> tbSupEstagios) {
        this.tbSupEstagios = tbSupEstagios;
    }




}


