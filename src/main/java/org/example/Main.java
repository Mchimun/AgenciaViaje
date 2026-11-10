package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("AGENCIA DE VIAJES MARTOS S.A.");
        System.out.println("Vamos a calcular el gasto de cada viajero.");
        System.out.println("Todos pagarán lo mismo.");
        System.out.println();

        int opcion;
        int contadorViajeros = 0;

        int viajero1 = 0;
        int viajero2 = 0;
        int viajero3 = 0;
        int viajero4 = 0;
        int viajero5 = 0;

        int totalGastos = 0;
        double mediaGastos = 0;

        double saldo1 = 0;
        double saldo2 = 0;
        double saldo3 = 0;
        double saldo4 = 0;
        double saldo5 = 0;

        boolean datosIntroducidos = false;
        boolean calculoRealizado = false;

        do {
            System.out.println();
            System.out.println("Aquí tienes las opciones del menú:");
            System.out.println("1. Introducir los gastos de viaje.");
            System.out.println("2. Calcular reparto de gastos.");
            System.out.println("3. Mostrar el reparto entre los viajeros.");
            System.out.println("4. Salir.");
            System.out.println();

            System.out.print("Elige una opción: ");
            opcion = s.nextInt();

            switch (opcion) {

                case 1: {
                    if (datosIntroducidos == true){
                        System.out.println("Los gastos ya han sido introducidos, no se pueden volver a introducir.");
                        break;
                    }

                    System.out.println("1. Introducir los gastos de viaje.");
                    System.out.println("Introduce los gastos de cada viajero:");
                    System.out.println("Si introduces un valor negativo, el viajero no participará.");

                    contadorViajeros = 0;

                    System.out.print("¿Cuánto ha gastado el viajero 1? ");
                    viajero1 = s.nextInt();

                    System.out.print("¿Cuánto ha gastado el viajero 2? ");
                    viajero2 = s.nextInt();

                    System.out.print("¿Cuánto ha gastado el viajero 3? ");
                    viajero3 = s.nextInt();

                    System.out.print("¿Cuánto ha gastado el viajero 4? ");
                    viajero4 = s.nextInt();

                    System.out.print("¿Cuánto ha gastado el viajero 5? ");
                    viajero5 = s.nextInt();

                    if (viajero1 >= 0) {
                        contadorViajeros++;
                    }

                    if (viajero2 >= 0) {
                        contadorViajeros++;
                    }

                    if (viajero3 >= 0) {
                        contadorViajeros++;
                    }

                    if (viajero4 >= 0) {
                        contadorViajeros++;
                    }

                    if (viajero5 >= 0) {
                        contadorViajeros++;
                    }

                    System.out.println("Participan " + contadorViajeros + " viajeros.");

                    datosIntroducidos = true;
                    calculoRealizado = false;
                    break;
                }

                case 2: {

                    if (datosIntroducidos == false) {
                        System.out.println("Primero debes introducir los gastos (opción 1).");
                    } else if (contadorViajeros == 0) {
                        System.out.println("No hay viajeros para realizar el reparto.");
                    } else {

                        totalGastos = 0;

                        if (viajero1 >= 0) {
                            totalGastos = totalGastos + viajero1;
                        }

                        if (viajero2 >= 0) {
                            totalGastos = totalGastos + viajero2;
                        }

                        if (viajero3 >= 0) {
                            totalGastos = totalGastos + viajero3;
                        }

                        if (viajero4 >= 0) {
                            totalGastos = totalGastos + viajero4;
                        }

                        if (viajero5 >= 0) {
                            totalGastos = totalGastos + viajero5;
                        }

                        mediaGastos = (double) totalGastos / contadorViajeros;

                        saldo1 = 0;
                        saldo2 = 0;
                        saldo3 = 0;
                        saldo4 = 0;
                        saldo5 = 0;

                        if (viajero1 >= 0) {
                            saldo1 = viajero1 - mediaGastos;
                        }

                        if (viajero2 >= 0) {
                            saldo2 = viajero2 - mediaGastos;
                        }

                        if (viajero3 >= 0) {
                            saldo3 = viajero3 - mediaGastos;
                        }

                        if (viajero4 >= 0) {
                            saldo4 = viajero4 - mediaGastos;
                        }

                        if (viajero5 >= 0) {
                            saldo5 = viajero5 - mediaGastos;
                        }

                        System.out.println("Reparto calculado correctamente.");
                        calculoRealizado = true;
                    }
                    break;
                }

                case 3: {
                    if (datosIntroducidos == false) {
                        System.out.println("Primero debes introducir los gastos.");
                    } else if (calculoRealizado == false) {
                        System.out.println("Primero debes calcular el reparto.");
                    } else {
                        System.out.println();
                        System.out.println("Reparto de gastos entre los viajeros participantes: ");
                        System.out.println();

                        // Viajero 1
                        if (viajero1 < 0) {
                            System.out.println("Viajero 1: No participa.");
                        } else {
                            System.out.println("VIAJERO 1 - Gasto realizado: " + viajero1);
                            System.out.printf("Le correspondía pagar: %.2f%n", (viajero1 - saldo1));

                            if (saldo1 > 0) {
                                System.out.printf("Ha pagado de más. Debe recibir: %.2f%n", saldo1);
                            } else if (saldo1 < 0) {
                                System.out.printf("Ha pagado de menos. Debe aportar: %.2f%n", (-saldo1));
                            } else {
                                System.out.println("Ha pagado exactamente lo que le corresponde.");
                            }
                        }
                        System.out.println();

                        // Viajero 2
                        if (viajero2 < 0) {
                            System.out.println("Viajero 2: No participa.");
                        } else {
                            System.out.println("VIAJERO 2 - Gasto realizado: " + viajero2);
                            System.out.printf("Le correspondía pagar: %.2f%n", (viajero2 - saldo2));

                            if (saldo2 > 0) {
                                System.out.printf("Ha pagado de más. Debe recibir: %.2f%n", saldo2);
                            } else if (saldo2 < 0) {
                                System.out.printf("Ha pagado de menos. Debe aportar: %.2f%n", (-saldo2));
                            } else {
                                System.out.println("Ha pagado exactamente lo que le corresponde.");
                            }
                        }
                        System.out.println();

                        // Viajero 3
                        if (viajero3 < 0) {
                            System.out.println("Viajero 3: No participa.");
                        } else {
                            System.out.println("VIAJERO 3 - Gasto realizado: " + viajero3);
                            System.out.printf("Le correspondía pagar: %.2f%n", (viajero3 - saldo3));

                            if (saldo3 > 0) {
                                System.out.printf("Ha pagado de más. Debe recibir: %.2f%n", saldo3);
                            } else if (saldo3 < 0) {
                                System.out.printf("Ha pagado de menos. Debe aportar: %.2f%n", (-saldo3));
                            } else {
                                System.out.println("Ha pagado exactamente lo que le corresponde.");
                            }
                        }
                        System.out.println();

                        // Viajero 4
                        if (viajero4 < 0) {
                            System.out.println("Viajero 4: No participa.");
                        } else {
                            System.out.println("VIAJERO 4 - Gasto realizado: " + viajero4);
                            System.out.printf("Le correspondía pagar: %.2f%n", (viajero4 - saldo4));

                            if (saldo4 > 0) {
                                System.out.printf("Ha pagado de más. Debe recibir: %.2f%n", saldo4);
                            } else if (saldo4 < 0) {
                                System.out.printf("Ha pagado de menos. Debe aportar: %.2f%n", (-saldo4));
                            } else {
                                System.out.println("Ha pagado exactamente lo que le corresponde.");
                            }
                        }
                        System.out.println();

                        // Viajero 5
                        if (viajero5 < 0) {
                            System.out.println("Viajero 5: No participa.");
                        } else {
                            System.out.println("VIAJERO 5 - Gasto realizado: " + viajero5);
                            System.out.printf("Le correspondía pagar: %.2f%n", (viajero5 - saldo5));

                            if (saldo5 > 0) {
                                System.out.printf("Ha pagado de más. Debe recibir: %.2f%n", saldo5);
                            } else if (saldo5 < 0) {
                                System.out.printf("Ha pagado de menos. Debe aportar: %.2f%n", (-saldo5));
                            } else {
                                System.out.println("Ha pagado exactamente lo que le corresponde.");
                            }
                        }
                        System.out.println();

                    }
                    break;
                }

                case 4: {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                default: {
                    System.out.println("Opción incorrecta. Elige entre 1 y 4.");
                    break;
                }
            }

        } while (opcion != 4);
        System.out.println("Gracias por contratar los servicios de AGENCIA DE VIAJES MARTOS S.A.");
    }
}
