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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TdQuestao generated by hbm2java
 */
@Entity
@Table(name="td_questao"
    ,catalog="bd_sge"
)
public class TdQuestao  implements java.io.Serializable {


     private Integer idtQuestao;
     private String nmeQuestao;
     private Set<TaQuestaoAvaliacao> taQuestaoAvaliacaos = new HashSet<TaQuestaoAvaliacao>(0);

    public TdQuestao() {
    }

	
    public TdQuestao(String nmeQuestao) {
        this.nmeQuestao = nmeQuestao;
    }
    public TdQuestao(String nmeQuestao, Set<TaQuestaoAvaliacao> taQuestaoAvaliacaos) {
       this.nmeQuestao = nmeQuestao;
       this.taQuestaoAvaliacaos = taQuestaoAvaliacaos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_questao", unique=true, nullable=false)
    public Integer getIdtQuestao() {
        return this.idtQuestao;
    }
    
    public void setIdtQuestao(Integer idtQuestao) {
        this.idtQuestao = idtQuestao;
    }
    
    @Column(name="nme_questao", nullable=false, length=300)
    public String getNmeQuestao() {
        return this.nmeQuestao;
    }
    
    public void setNmeQuestao(String nmeQuestao) {
        this.nmeQuestao = nmeQuestao;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tdQuestao")
    public Set<TaQuestaoAvaliacao> getTaQuestaoAvaliacaos() {
        return this.taQuestaoAvaliacaos;
    }
    
    public void setTaQuestaoAvaliacaos(Set<TaQuestaoAvaliacao> taQuestaoAvaliacaos) {
        this.taQuestaoAvaliacaos = taQuestaoAvaliacaos;
    }




}

