package com.clinica.recordatorios.service;

public interface CitaReminderService {
    int enviarRecordatoriosPendientes();
    public void enviarRecordatorioUrgente(Long citaId);
}