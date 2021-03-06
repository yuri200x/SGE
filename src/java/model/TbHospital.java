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
 * TbHospital generated by hbm2java
 */
@Entity
@Table(name="tb_hospital"
    ,catalog="bd_sge"
)
public class TbHospital  implements java.io.Serializable {


     private Integer idtHospital;
     private TbSecretariaSaude tbSecretariaSaude;
     private String nmeHospital;
     private String sglHospital;
     private String cnpjHospital;
     private String endHospital;
     private String telHospital;
     private Set<TbFuncionarioHosp> tbFuncionarioHosps = new HashSet<TbFuncionarioHosp>(0);
     private Set<TbRelatorio> tbRelatorios = new HashSet<TbRelatorio>(0);
     private Set<TbCenario> tbCenarios = new HashSet<TbCenario>(0);
     private Set<TbOcorrencia> tbOcorrencias = new HashSet<TbOcorrencia>(0);

    public TbHospital() {
    }

	
    public TbHospital(TbSecretariaSaude tbSecretariaSaude, String nmeHospital, String sglHospital, String cnpjHospital, String endHospital, String telHospital) {
        this.tbSecretariaSaude = tbSecretariaSaude;
        this.nmeHospital = nmeHospital;
        this.sglHospital = sglHospital;
        this.cnpjHospital = cnpjHospital;
        this.endHospital = endHospital;
        this.telHospital = telHospital;
    }
    public TbHospital(TbSecretariaSaude tbSecretariaSaude, String nmeHospital, String sglHospital, String cnpjHospital, String endHospital, String telHospital, Set<TbFuncionarioHosp> tbFuncionarioHosps, Set<TbRelatorio> tbRelatorios, Set<TbCenario> tbCenarios, Set<TbOcorrencia> tbOcorrencias) {
       this.tbSecretariaSaude = tbSecretariaSaude;
       this.nmeHospital = nmeHospital;
       this.sglHospital = sglHospital;
       this.cnpjHospital = cnpjHospital;
       this.endHospital = endHospital;
       this.telHospital = telHospital;
       this.tbFuncionarioHosps = tbFuncionarioHosps;
       this.tbRelatorios = tbRelatorios;
       this.tbCenarios = tbCenarios;
       this.tbOcorrencias = tbOcorrencias;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_hospital", unique=true, nullable=false)
    public Integer getIdtHospital() {
        return this.idtHospital;
    }
    
    public void setIdtHospital(Integer idtHospital) {
        this.idtHospital = idtHospital;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_secretaria_saude", nullable=false)
    public TbSecretariaSaude getTbSecretariaSaude() {
        return this.tbSecretariaSaude;
    }
    
    public void setTbSecretariaSaude(TbSecretariaSaude tbSecretariaSaude) {
        this.tbSecretariaSaude = tbSecretariaSaude;
    }
    
    @Column(name="nme_hospital", nullable=false, length=80)
    public String getNmeHospital() {
        return this.nmeHospital;
    }
    
    public void setNmeHospital(String nmeHospital) {
        this.nmeHospital = nmeHospital;
    }
    
    @Column(name="sgl_hospital", nullable=false, length=10)
    public String getSglHospital() {
        return this.sglHospital;
    }
    
    public void setSglHospital(String sglHospital) {
        this.sglHospital = sglHospital;
    }
    
    @Column(name="cnpj_hospital", nullable=false, length=15)
    public String getCnpjHospital() {
        return this.cnpjHospital;
    }
    
    public void setCnpjHospital(String cnpjHospital) {
        this.cnpjHospital = cnpjHospital;
    }
    
    @Column(name="end_hospital", nullable=false, length=45)
    public String getEndHospital() {
        return this.endHospital;
    }
    
    public void setEndHospital(String endHospital) {
        this.endHospital = endHospital;
    }
    
    @Column(name="tel_hospital", nullable=false, length=20)
    public String getTelHospital() {
        return this.telHospital;
    }
    
    public void setTelHospital(String telHospital) {
        this.telHospital = telHospital;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbHospital")
    public Set<TbFuncionarioHosp> getTbFuncionarioHosps() {
        return this.tbFuncionarioHosps;
    }
    
    public void setTbFuncionarioHosps(Set<TbFuncionarioHosp> tbFuncionarioHosps) {
        this.tbFuncionarioHosps = tbFuncionarioHosps;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbHospital")
    public Set<TbRelatorio> getTbRelatorios() {
        return this.tbRelatorios;
    }
    
    public void setTbRelatorios(Set<TbRelatorio> tbRelatorios) {
        this.tbRelatorios = tbRelatorios;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbHospital")
    public Set<TbCenario> getTbCenarios() {
        return this.tbCenarios;
    }
    
    public void setTbCenarios(Set<TbCenario> tbCenarios) {
        this.tbCenarios = tbCenarios;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbHospital")
    public Set<TbOcorrencia> getTbOcorrencias() {
        return this.tbOcorrencias;
    }
    
    public void setTbOcorrencias(Set<TbOcorrencia> tbOcorrencias) {
        this.tbOcorrencias = tbOcorrencias;
    }




}


