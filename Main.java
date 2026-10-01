package secrets;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 12: Secrets (Bit Manipulation)");
        System.out.println("==================================================");

        // 1. Desplazamiento sin signo: 8 (1000 en binario) >>> 2 = 2 (0010 en binario)
        int shift = Secrets.shiftBack(8, 2);
        System.out.println("1. shiftBack(8, 2): " + shift + " (Esperado: 2)");

        // 2. Encender bits: 5 (0101) | 2 (0010) = 7 (0111)
        int set = Secrets.setBits(5, 2);
        System.out.println("2. setBits(5, 2):   " + set + " (Esperado: 7)");

        // 3. Invertir bits: 6 (0110) ^ 5 (0101) = 3 (0011)
        int flip = Secrets.flipBits(6, 5);
        System.out.println("3. flipBits(6, 5):  " + flip + " (Esperado: 3)");

        // 4. Limpiar bits: 15 (1111) & ~6 (~0110 = 1001) = 9 (1001)
        int clear = Secrets.clearBits(15, 6);
        System.out.println("4. clearBits(15, 6): " + clear + " (Esperado: 9)");

        boolean ok = (shift == 2) && (set == 7) && (flip == 3) && (clear == 9);
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
