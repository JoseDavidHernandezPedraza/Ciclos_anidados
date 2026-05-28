README - Suma de la Diagonal de una Matriz en Java
Descripción

Este programa en Java permite:

Crear una matriz de 3x3
Ingresar valores manualmente por teclado
Mostrar la matriz en pantalla
Calcular la suma de los elementos de la diagonal principal

La diagonal principal corresponde a los elementos donde la fila y la columna tienen el mismo índice:

[0][0]
[1][1]
[2][2]
Tecnologías utilizadas
Java
Scanner (java.util.Scanner)
Estructura del programa

El programa realiza los siguientes pasos:

Solicita al usuario ingresar los elementos de la matriz.
Guarda los valores en una matriz bidimensional.
Imprime la matriz completa.
Recorre la diagonal principal.
Calcula y muestra la suma total.
Código principal
package ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v1[][] = new int[3][3];

        System.out.println("Digite elementos de una matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Rellene la matriz");
                v1[i][j] = sc.nextInt();

            }
        }

        // Mostrar matriz
        for (int i = 0; i < 3; i++) {

            System.out.println("");

            for (int j = 0; j < 3; j++) {
                System.out.print(v1[i][j] + " ");
            }
        }

        System.out.println("");

        // Suma de la diagonal principal
        int k = 0;

        for (int i = 0; i < 3; i++) {
            k += v1[i][i];
        }

        System.out.println("Suma = " + k);
    }
}
Ejemplo de ejecución
Digite elementos de una matriz

Rellene la matriz
1
Rellene la matriz
2
Rellene la matriz
3
Rellene la matriz
4
Rellene la matriz
5
Rellene la matriz
6
Rellene la matriz
7
Rellene la matriz
8
Rellene la matriz
9

123
456
789

Suma = 15
Explicación de la suma

La diagonal principal de la matriz:

1 2 3
4 5 6
7 8 9

Es:

1 + 5 + 9 = 15
Autor

Proyecto básico de práctica en Java usando ciclos y matrices.
