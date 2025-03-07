/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;

/**
 *
 * @author restr
 */
public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void imprimir(){
        System.out.println("saldo:" + saldo);
        System.out.println("numero de Consignaciones:" + numeroConsignaciones);
        System.out.println("numer de retiros:" + numeroRetiros);
        System.out.println("tasa anual:" + tasaAnual);
        System.out.println("comision Mensual:" + comisionMensual);
        
    }
    
}
