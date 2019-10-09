
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menentukan kepribadian
 * seseorang dari warna yang dipilih
 *  
 */

package pbo1.pkg10118033.latihan29;

import java.util.Scanner;

public class PBO110118033Latihan29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char colorId = 'Z';
        String reset = "\u001b[0m";
        String black = "\u001b[30m";
        String white = "\u001b[37m";
        String red    = "\u001b[31m";
        String green  = "\u001b[32m";
        String yellow = "\u001b[33m";
        String cyan   = "\u001b[36m";
        String magenta = "\u001b[35m";
        String blue = "\u001b[34m";
        String bgRed = "\u001b[41m";
        String bgGreen = "\u001b[42m";
        String bgYellow = "\u001b[43m";
        String bgBlue = "\u001b[44m";
        String bgMagenta = "\u001b[45m";
        System.out.println(""+red+"YUK"+green+" CEK"+yellow+" KEPRIBADIANMU"+cyan+" DARI"+magenta+" WARNA"+blue+" FAVORITMU\n"+white);
        System.out.println(""+bgRed+"\t MERAH \t\t");
        System.out.println(""+bgGreen+"\t HIJAU \t\t");
        System.out.println(""+bgYellow+"\t KUNING \t");
        System.out.println(""+bgBlue+"\t BIRU \t\t");
        System.out.println(""+bgMagenta+"\t UNGU \t\t\n"+reset);
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        System.out.println("\n=====HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+"=====");
        if("Merah".equalsIgnoreCase(warna)){
            colorId = 'R';
        } else if ("Hijau".equalsIgnoreCase(warna)){
            colorId = 'G';
        } else if ("Kuning".equalsIgnoreCase(warna)){
            colorId = 'Y';
        } else if ("Biru".equalsIgnoreCase(warna)){
            colorId = 'B';
        } else if ("Ungu".equalsIgnoreCase(warna)){
            colorId = 'M';
        }
        switch(colorId){
            case 'R':
                System.out.println("Warna Favoritmu adalah : "+red+warna+reset);
                System.out.println("1. Periang\n2. Pemberani\n3. Berani mengambil resiko dalam setiap langkah\n"
                        + "4. Menyukai tantangan\n5. Kurang sabar\n6. Dapat menahan marah namun jika sudah tahap "
                        + "puncak toleransi, kemarahannya akan sulit dikontrol\n7. Memiliki energi kehangatan dan cinta");
                break;
            case 'G':
                System.out.println("Warna Favoritmu adalah : "+green+warna+reset);
                System.out.println("1. Romantis\n2. Menyukai hal yang berbau alami dan keindahan\n3. Teguh pada prinsip\n"
                        + "4. Menginginkan kesempurnaan cinta\n5. Mudah cemburu\n6. Mudah merasa iri\n7. Menjunjung tinggi "
                        + "suatu nilai toleransi dan kepercayaan");
                break;
            case 'Y':
                System.out.println("Warna Favoritmu adalah : "+yellow+warna+reset);
                System.out.println("1. Optimis\n2. Suka bergaul\n3. Periang\n4. Senang menolong\n5. Lincah dan aktif\n6. Tidak "
                        + "suka meremehkan kekurangan orang lain\n7. Loyal\n8. Hangat\n9. Meskipun karakternya optimis dan "
                        + "idealis, seringkali goyah dan tidak stabil\n10. Cenderung penakut");
                break;
            case 'B':
                System.out.println("Warna Favoritmu adalah : "+blue+warna+reset);
                System.out.println("1. Menyenangkan\n2. Bijaksana\n3. Pembawaan diri tenang saat menghadapi masalah\n4. Dinamis\n"
                        + "5. Senang berbagi\n6. Bersahabat\n7. Tidak terlalu suka menjadi sorotan banyak orang\n8. Menyembunyikan "
                        + "perasaan karena karakternya yang cenderung mencari jalan damai");
                break;
            case 'M':
                System.out.println("Warna Favoritmu adalah : "+magenta+warna+reset);
                System.out.println("1. Optimis\n2. Tidak pernah ragu\n3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang "
                        + "kuat\n4. Memiliki ambisi yang besar\n5. Memiliki empati yang besar\n6. Memiliki sisi misterius sebab seringkali "
                        + "menutup perasaannya\n7. Terkadang bersikap keras kepala dan angkuh");
                break;
            default :
                System.out.println("Oops.. Belum Teridentifikasi");
        }
        System.out.println("(Developed By : Ikrar AB)");
    }
}