package com.clinica.recordatorios.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Data @NoArgsConstructor @AllArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pacienteNombre;

    @Column(nullable = false)
    private String pacienteContacto; // email o teléfono, según canalPreferido

    @Column(nullable = false)
    private LocalDateTime fechaHoraCita;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CanalNotificacion canalPreferido;

    @Column(nullable = false)
    private boolean recordatorioEnviado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPacienteNombre() {
        return pacienteNombre;
    }

    public void setPacienteNombre(String pacienteNombre) {
        this.pacienteNombre = pacienteNombre;
    }

    public String getPacienteContacto() {
        return pacienteContacto;
    }

    public void setPacienteContacto(String pacienteContacto) {
        this.pacienteContacto = pacienteContacto;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public CanalNotificacion getCanalPreferido() {
        return canalPreferido;
    }

    public void setCanalPreferido(CanalNotificacion canalPreferido) {
        this.canalPreferido = canalPreferido;
    }

    public boolean isRecordatorioEnviado() {
        return recordatorioEnviado;
    }

    public void setRecordatorioEnviado(boolean recordatorioEnviado) {
        this.recordatorioEnviado = recordatorioEnviado;
    }


}
