package com.github.gaalgergo.ein.app.entity;

import com.github.gaalgergo.ein.app.kozos.AlapEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tanorak")
public class TanOraEntity extends AlapEntity {
    private OktatoEntity oktato;
    private TantargyEntity tantargy;
    private String osztaly;
    private String tanterem;
    private LocalDateTime idopont;
}
