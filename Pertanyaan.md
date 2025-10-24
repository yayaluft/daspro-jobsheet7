**--PERCOBAAN 1--**
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1! 
2.  Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0? 
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
for (int i=1; i<= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +i+ ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if(nilai < terendah) {
                terendah = nilai;
            }
        }
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah! 

**Jawaban:**
1. for (int i=1; i<= 10; i++)
    - *inisialisasi:* int i=1 (memberikan nilai i)
    - *kondisi     :* i <= 10 (apabila kondisi bersifat true, program akan lanjut berjalan)
    - *update      :* i++ (increment untuk menambah satu nilai i)
2. variabel tertinggi di inisialisasi 0 untuk mencari nilai maksimum, program akan selalu memperbarui inputan nilai ke nilai tertinggi sehingga dapat memenuhi kondisi (nilai > tertinggi). Sedangkan variabel terendah di inisialisasi 100 untuk mencari nilai minimum, program akan selalu memperbarui inputan nilai ke nilai terendah sehingga dapat memenuhi kondisi (nilai < terendah).
Apabila nilai variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0, maka output yang cetak variabel tertinggi adalah 100 dan variabel terendah adalah 0 karena kondisi yang diberikan bersifat tidak true atau false.
3. Fungsi dari code tersebut adalah untuk melakukan looping (perulangan) sebanyak 10 kali menerima inputan dari user serta mecari nilai tertinggi dan nilai terendah dari inputan tersebut. 
Alur kerja: 
- for (int i=1; i<= 10; i++) meminta user untuk memasukkan inputan nilai dari 10 mahasiswa, dan menambahkan nilai i sebanyak satu apabila kondisi bersifat true.
- if (nilai > tertinggi) : Mencari nilai tertinggi yang disimpan oleh variabel tertinggi. apabila program menerima inputan nilai yang lebih tinggi dari inputan sebelumnya, maka program akan mengeluarkan output nilai paling tinggi tersebut.
- if(nilai < terendah) : Mencari nilai terendah yang disimpan oleh variabel terendah. Apabila program menerima inputan nilai yang lebih rendah dari inputan sebelumnya, maka program akan mencetak output nilai paling rendah tersebut.
4. Saya menambahkan if else pada program tersebut
 if (nilai >= 60 ) {
    lulus++;
    } else {
        tidakLulus++;
    }