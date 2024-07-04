public class VerificarUltimosDoisDigitos {
    public boolean verificarUltimosDoisDigitos(String a, String b) {
        boolean igual = false;
        String[] a1 = a.split("");
        String[] b1 = b.split("");
        if (a1[a1.length - 1].equals(b1[b1.length - 1]) && a1[a1.length - 2].equals(b1[b1.length - 2])) {
            igual = true;
        }
        return igual;
    }
}
