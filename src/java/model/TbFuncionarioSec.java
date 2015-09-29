package model;
// Generated 23/09/2015 18:27:47 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TbFuncionarioSec generated by hbm2java
 */
@Entity
@Table(name="tb_funcionario_sec"
    ,catalog="bd_sge"
)
public class TbFuncionarioSec  implements java.io.Serializable {


     private Integer idtFuncionarioSec;
     private TbSecretariaSaude tbSecretariaSaude;
     private TbPessoa tbPessoa;

    public TbFuncionarioSec() {
    }

    public TbFuncionarioSec(TbSecretariaSaude tbSecretariaSaude, TbPessoa tbPessoa) {
       this.tbSecretariaSaude = tbSecretariaSaude;
       this.tbPessoa = tbPessoa;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_funcionario_sec", unique=true, nullable=false)
    public Integer getIdtFuncionarioSec() {
        return this.idtFuncionarioSec;
    }
    
    public void setIdtFuncionarioSec(Integer idtFuncionarioSec) {
        this.idtFuncionarioSec = idtFuncionarioSec;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_secretaria_saude", nullable=false)
    public TbSecretariaSaude getTbSecretariaSaude() {
        return this.tbSecretariaSaude;
    }
    
    public void setTbSecretariaSaude(TbSecretariaSaude tbSecretariaSaude) {
        this.tbSecretariaSaude = tbSecretariaSaude;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_pessoa", nullable=false)
    public TbPessoa getTbPessoa() {
        return this.tbPessoa;
    }
    
    public void setTbPessoa(TbPessoa tbPessoa) {
        this.tbPessoa = tbPessoa;
    }




}


