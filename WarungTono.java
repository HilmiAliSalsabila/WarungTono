
import java.util.ArrayList;

public class WarungTono {
    public static void main(String[] args) {
        int[] warung = { 10, 25, 30, 40, 50, 75, 80, 110, 130 }; // Array jarak titik warung
        int jarakTempuh = 140; // Jarak yang akan ditempuh Tono
        int jarakIstirahat = 30; // Jarak antara setiap tempat istirahat

        ArrayList<Integer> tempatIstirahat = new ArrayList<>();
        int totalJarak = 0;

        // Loop untuk menemukan titik-titik warung Tono akan berhenti
        for (int i = 0; i < warung.length; i++) {
            totalJarak = totalJarak + warung[i];
            System.out.println(totalJarak);

            // Cek apakah total jarak melebihi atau sama dengan jarak tempuh Tono
            if (totalJarak <= jarakTempuh) {
                tempatIstirahat.add(warung[i]);
                totalJarak += jarakIstirahat;
            } else {
                break;
            }
        }

        // Menampilkan output titik warung Tono akan berhenti
        System.out.println("Tono akan berhenti sesedikit mungkin di titik warung pada jarak: ");
        for (int i = 0; i < tempatIstirahat.size(); i++) {
            System.out.println(tempatIstirahat.get(i) + " km");
        }
    }
}