export class Producto {
    id?: number;
    nombre: string;
    descripcion: string;
    autor: string;
    fecha: string;
    ejemplares: number;
    precio: number;

    constructor(nombre: string, descripcion: string, autor: string, fecha: string, ejemplares: number, precio:  number) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autor = autor;
        this.fecha=fecha;
        this.ejemplares=ejemplares;
        this.precio = precio;
    }
}


