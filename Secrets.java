package secrets;

/**
 * Ejercicio 12: Secrets
 * Concepto: Bit Manipulation (Manipulación de bits a bajo nivel en Java)
 *
 * Implementa operaciones bit a bit comunes utilizadas en criptografía y sistemas:
 * - Desplazamiento a la derecha sin signo (>>>)
 * - Encender bits con máscara (OR |)
 * - Invertir bits con máscara (XOR ^)
 * - Limpiar/apagar bits con máscara (AND NOT & ~)
 */
public class Secrets {

    /**
     * Desplaza los bits de value hacia la derecha amount posiciones
     * rellenando con ceros a la izquierda (desplazamiento lógico sin signo).
     */
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    /**
     * Enciende (pone a 1) los bits donde la máscara tenga 1s (operador OR).
     */
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    /**
     * Invierte (hace flip) a los bits donde la máscara tenga 1s (operador XOR).
     */
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    /**
     * Limpia (pone a 0) los bits donde la máscara tenga 1s (operador AND con el complemento a 1).
     */
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}
