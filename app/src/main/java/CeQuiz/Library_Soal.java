package CeQuiz;

import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

public class Library_Soal {

    private String pertanyaan_pilihanganda []= {
            "1. Hitunglah besarnya U32 dari barisan 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, …",
            "2. Berdasarkan barisan contoh soal nomor 1, hitunglah deret untuk 25 angka pertama.",
            "3. Tentukanlah suku tengah dari barisan 9, 11, 13, 15, 17, … 69.",
            "4. Berdasarkan barisan pada contoh soal (3), carilah besar n.",
            "5. Tentukanlah suku ke 11 dari barisan bilangan 1, 2, 4, 8, 16 …."
    };
    private String pilihanganda_jawaban[][]={
            {"80", "69", "79", "89", "99"},
            {"700", "776", "771", "755", "775"},
            {"39", "49", "29", "19", "59"},
            {"51", "41", "11", "21", "31"},
            {"1.124", "1.030", "1.000", "1.024", "1.014"}
    };
    private String pilihanganda_jawabanbenar []= {
            "69",
            "775",
            "39",
            "31",
            "1.024"
    };
    public int getLength(){
        return pertanyaan_pilihanganda.length;
    }
    public String getSoal(int option_a){
        String question=pertanyaan_pilihanganda[option_a];
        return question;
    }

    public String getChoice1(int option_a){
        String Choice1=pilihanganda_jawaban[option_a][0];
        return Choice1;
    }
    public String getChoice2(int option_a){
        String Choice2=pilihanganda_jawaban[option_a][1];
        return Choice2;
    }
    public String getChoice3(int option_a){
        String Choice3=pilihanganda_jawaban[option_a][2];
        return Choice3;
    }
    public String getChoice4(int option_a){
        String Choice4=pilihanganda_jawaban[option_a][3];
        return Choice4;
    }
    public String getChoice5(int option_a){
        String Choice5=pilihanganda_jawaban[option_a][4];
        return Choice5;
    }

    public String getJawabanBenar(int option_a){
        String answer = pilihanganda_jawabanbenar[option_a];
        return answer;
    }
}
