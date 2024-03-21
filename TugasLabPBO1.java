public class TugasLabPBO1 {

    // Class with no-argument constructor

    public static class Kucing {

        String nama;
        int usia;
        String jenisBulu;
        boolean sukaMencakar;

        public Kucing(String nama, int usia, String jenisBulu, boolean sukaMencakar) {
            this.nama = nama;
            this.usia = usia;
            this.jenisBulu = jenisBulu;
            this.sukaMencakar = sukaMencakar;
        }

        public void bersuara() {
            System.out.println("Meow!");
        }

        public void makan() {
            System.out.println("Kucing sedang makan...");
        }

        public void tidur() {
            System.out.println("Kucing sedang tidur...");
        }

        public void bermain() {
            System.out.println("Kucing sedang bermain...");
        }
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Garfield", 5, "Pendek", false);
        Kucing kucing2 = new Kucing("Luna", 2, "Panjang", true);
        Kucing kucing3 = new Kucing("Milo", 3, "Keriting", false);

        // Tampilkan informasi setiap kucing
        System.out.println("Kucing 1:");
        System.out.println("Nama: " + kucing1.nama);
        System.out.println("Usia: " + kucing1.usia);
        System.out.println("Jenis Bulu: " + kucing1.jenisBulu);
        System.out.println("Suka Mencakar: " + kucing1.sukaMencakar);

        System.out.println("\nKucing 2:");
        System.out.println("Nama: " + kucing2.nama);
        System.out.println("Usia: " + kucing2.usia);
        System.out.println("Jenis Bulu: " + kucing2.jenisBulu);
        System.out.println("Suka Mencakar: " + kucing2.sukaMencakar);

        System.out.println("\nKucing 3:");
        System.out.println("Nama: " + kucing3.nama);
        System.out.println("Usia: " + kucing3.usia);
        System.out.println("Jenis Bulu: " + kucing3.jenisBulu);
        System.out.println("Suka Mencakar: " + kucing3.sukaMencakar);
    }
}
