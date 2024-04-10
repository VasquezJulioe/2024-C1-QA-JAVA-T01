package com.sofka;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// Clase para representar un usuario
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol;

}
