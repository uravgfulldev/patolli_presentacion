/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Hiram Garcia
 */
public enum EstadoPartida implements Serializable{
    VACIA,
    CONFIGURACION,
    ESPERA,
    INICIADA,
    TERMINADA
}
