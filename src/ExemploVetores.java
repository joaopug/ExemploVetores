public class ExemploVetores {
    public static void main(String[] args) {

        char votopessoa1 = 10;
        char votopessoa2 = 23;
        char votopessoa3 = 10;
        char votopessoa4 = 10;
        char votopessoa5 = 99;
        char votopessoa6 = 10;
        char votopessoa7 = 99;
        char votopessoa8 = 10;
        char votopessoa9 = 23;
        char votopessoa10 = 99;

        int[] urna = new int[10];

        urna[0] = 1;
        urna[1] = 2;
        urna[2] = 3;
        urna[3] = 4;
        urna[4] = 5;
        urna[5] = 6;
        urna[6] = 7;
        urna[7] = 8;
        urna[8] = 9;
        urna[9] = 10;

        for (int j : urna) {
            System.out.println(j);
        }

        System.out.println((votopessoa1) + votopessoa2 + votopessoa3 + votopessoa4 + votopessoa5 + votopessoa6 + votopessoa7 + votopessoa8 + votopessoa9 + votopessoa10);

    }
}