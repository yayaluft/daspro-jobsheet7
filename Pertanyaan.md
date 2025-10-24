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

**--PERCOBAAN 2--**
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: 
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE? 
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
4.  Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! 
5. Commit dan push kode program ke Github 

**Jawaban:**
1. Fungsi dari potongan tersebut:
if (nilai < 0 || nilai > 100) program menggunakan operator logika OR untuk memeriksa nilai yang diinputan berada diluar rentang 0 hingga 100. Jika kondisi bersifat true program akan mencetak "Nilai tidak valid. Masukkan lagi nilai yang valid!". Karena nilai tersebut bersifat false program akan mengeksekusi sintaks continue yang dimana berfungsi untuk mengulang kembali pertanyaan awal.
2. Apabila posisi i++ diletakkan diawal, program akan menyelesaikan increantment i++ lalu di baris print menambahkan lagi nilai dengan angka 1 sehingga output yang dicetak adalah "Masukkan nilai mahasiswa ke-2: ". i++ ditulis diakhir bertujuan ketika menginputkan satu nilai, program akan melakukan perulangan ke mahasiswa selanjutnya.
3. Total perulangan WHILE sebanyak 19 kali. Program akan terus berjalan selama kondisi i < 19 bersifat true.
4. Saya menambahkan kode program:
System.our.println(:Bagus, pertahankan nilainya);

**--PERCOBAAN 3--**
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan? 
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? 
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update? 

**Jawaban:**
1. Program melakukan perulangan satu kali, karena menggunakan DO-WHILE yang dimana program dijalankan terlebih dahulu, setelah itu baru  memeriksa kondisinya. 
2. kondisi berhenti pada program terjadi pada break, karena  apabila kondisi terpenuhi maka program menjalankan kondisi break atau menghentikan eksekusi perulangan tersebut.
3. Apabila kondisi bernilai true, program akan terus melakukan perulangan terus menerus atau disebut infinite loop.
4. Karena kondisi tersebut infinite loop, sehingga sifatnya akan selalu bersifat TRUE sehingga tidak diperlukan inisialisasi.