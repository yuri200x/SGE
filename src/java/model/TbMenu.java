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
 * TbMenu generated by hbm2java
 */
@Entity
@Table(name="tb_menu"
    ,catalog="bd_sge"
)
public class TbMenu  implements java.io.Serializable {


     private Integer idtMenu;
     private TbModulo tbModulo;
     private String usrMenuCad;
     private Date dtaMenuCad;
     private String nmeMenu;
     private String descMenu;
     private Set<TbOpcao> tbOpcaos = new HashSet<TbOpcao>(0);

    public TbMenu() {
    }

	
    public TbMenu(TbModulo tbModulo, String usrMenuCad, Date dtaMenuCad, String nmeMenu, String descMenu) {
        this.tbModulo = tbModulo;
        this.usrMenuCad = usrMenuCad;
        this.dtaMenuCad = dtaMenuCad;
        this.nmeMenu = nmeMenu;
        this.descMenu = descMenu;
    }
    public TbMenu(TbModulo tbModulo, String usrMenuCad, Date dtaMenuCad, String nmeMenu, String descMenu, Set<TbOpcao> tbOpcaos) {
       this.tbModulo = tbModulo;
       this.usrMenuCad = usrMenuCad;
       this.dtaMenuCad = dtaMenuCad;
       this.nmeMenu = nmeMenu;
       this.descMenu = descMenu;
       this.tbOpcaos = tbOpcaos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idt_menu", unique=true, nullable=false)
    public Integer getIdtMenu() {
        return this.idtMenu;
    }
    
    public void setIdtMenu(Integer idtMenu) {
        this.idtMenu = idtMenu;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_modulo", nullable=false)
    public TbModulo getTbModulo() {
        return this.tbModulo;
    }
    
    public void setTbModulo(TbModulo tbModulo) {
        this.tbModulo = tbModulo;
    }
    
    @Column(name="usr_menu_cad", nullable=false, length=20)
    public String getUsrMenuCad() {
        return this.usrMenuCad;
    }
    
    public void setUsrMenuCad(String usrMenuCad) {
        this.usrMenuCad = usrMenuCad;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dta_menu_cad", nullable=false, length=10)
    public Date getDtaMenuCad() {
        return this.dtaMenuCad;
    }
    
    public void setDtaMenuCad(Date dtaMenuCad) {
        this.dtaMenuCad = dtaMenuCad;
    }
    
    @Column(name="nme_menu", nullable=false, length=45)
    public String getNmeMenu() {
        return this.nmeMenu;
    }
    
    public void setNmeMenu(String nmeMenu) {
        this.nmeMenu = nmeMenu;
    }
    
    @Column(name="desc_menu", nullable=false, length=100)
    public String getDescMenu() {
        return this.descMenu;
    }
    
    public void setDescMenu(String descMenu) {
        this.descMenu = descMenu;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tbMenu")
    public Set<TbOpcao> getTbOpcaos() {
        return this.tbOpcaos;
    }
    
    public void setTbOpcaos(Set<TbOpcao> tbOpcaos) {
        this.tbOpcaos = tbOpcaos;
    }




}

