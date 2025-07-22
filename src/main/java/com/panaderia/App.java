package com.panaderia;

import com.panaderia.model.*;
import com.panaderia.service.ManejarProducto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ManejarProducto service = new ManejarProducto();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Agregar Pan\n2. Agregar Galleta\n3. Listar Productos\n4. Exportar CSV\n5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("ID: ");
                        int idPan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombrePan = sc.nextLine();
                        System.out.print("Cantidad: ");
                        int cantidadPan = sc.nextInt();
                        System.out.print("Valor Producción: ");
                        int valorProdPan = sc.nextInt();
                        System.out.print("Valor Venta: ");
                        int valorVentaPan = sc.nextInt();
                        System.out.print("¿Tiene queso? (true/false): ");
                        boolean tieneQueso = sc.nextBoolean();
                        Pan pan = new Pan(idPan, nombrePan, cantidadPan, valorProdPan, valorVentaPan, tieneQueso);
                        service.agregarProducto(pan);
                        System.out.println("Pan agregado correctamente.");
                        break;
                    case 2:
                        System.out.print("ID: ");
                        int idGalleta = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreGalleta = sc.nextLine();
                        System.out.print("Cantidad: ");
                        int cantidadGalleta = sc.nextInt();
                        System.out.print("Valor Producción: ");
                        int valorProdGalleta = sc.nextInt();
                        System.out.print("Valor Venta: ");
                        int valorVentaGalleta = sc.nextInt();
                        System.out.print("¿Tiene chispas de chocolate? (true/false): ");
                        boolean tieneChispas = sc.nextBoolean();
                        Galleta galleta = new Galleta(idGalleta, nombreGalleta, cantidadGalleta, valorProdGalleta, valorVentaGalleta, tieneChispas);
                        service.agregarProducto(galleta);
                        System.out.println("Galleta agregada correctamente.");
                        break;
                    case 3:
                        System.out.println("\n--- Lista de productos ---");
                        for (Producto p : service.getTodos()) {
                            System.out.println(p.toCSV());
                        }
                        break;
                    case 4:
                        service.generarReporte(); 
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); 
            }
        }

        sc.close();
    }
}