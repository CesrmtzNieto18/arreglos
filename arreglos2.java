import javax.swing.JOptionPane;

public class arreglos2 {
    public static void main(String[] args) {
        String encabezado[] = {" ", "0 ", "1 ", "2 "};
        String Columnas[] = {"0", "1", "2"};
        byte Numeros[][] = new byte[3][3];
        byte Numeros2[][] = new byte[3][3];
        byte Numeros3[][] = new byte[3][3];
        int x, y = 0;

        // Ingreso de datos para la primera tabla
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                Numeros[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero para la tabla 1 " + (y + 1)));
            }
        }

        // Ingreso de datos para la segunda tabla
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                Numeros2[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero para la tabla 2 " + (y + 1)));
            }
        }

        // Ingreso de datos para la tercera tabla
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                Numeros3[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero para la tabla 3 " + (y + 1)));
            }
        }

        // Impresión de encabezado
        for (String encabezadoTitulo : encabezado) {
            System.out.print(encabezadoTitulo + "\t");
        }
        System.out.print("\t");
        for (String encabezadoTitulo : encabezado) {
            System.out.print(encabezadoTitulo + "\t");
        }
        System.out.print("\t");
        for (String encabezadoTitulo : encabezado) {
            System.out.print(encabezadoTitulo + "\t");
        }
        System.out.println();

        // Impresión de tablas
        for (x = 0; x < 3; x++) {
            System.out.print(Columnas[x] + "\t");
            for (y = 0; y < 3; y++) {
                System.out.print(Numeros[x][y] + "\t");
            }
            System.out.print("\t");
            System.out.print(Columnas[x] + "\t");
            for (y = 0; y < 3; y++) {
                System.out.print(Numeros2[x][y] + "\t");
            }
            System.out.print("\t");
            System.out.print(Columnas[x] + "\t");
            for (y = 0; y < 3; y++) {
                System.out.print(Numeros3[x][y] + "\t");
            }
            System.out.println();
        }
    }
}