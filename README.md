# Ejercicio 12: Secrets

- **Concepto:** Bit Manipulation (Operadores a nivel de bits en Java)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Implementar las operaciones binarias necesarias para cifrar y descifrar mensajes secretos.

## Operaciones a Implementar en `Secrets.java`:
1. `shiftBack(int value, int amount)`: Desplazamiento lógico a la derecha sin signo (`>>>`).
2. `setBits(int value, int mask)`: Activa los bits usando la operación OR bit a bit (`|`).
3. `flipBits(int value, int mask)`: Invierte los bits usando la operación XOR bit a bit (`^`).
4. `clearBits(int value, int mask)`: Apaga los bits usando AND con la negación de la máscara (`& ~mask`).

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
