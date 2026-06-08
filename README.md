Apa fungsi @ConfigurationProperties?
Fungsinya untuk memetakan (binding) data konfigurasi yang berstruktur hierarki dari file eksternal (seperti application.yml atau application.properties) ke dalam sebuah objek Java biasa secara otomatis berdasarkan kesamaan nama prefiksnya (dalam kasus ini prefiks "store").

Apa fungsi ResourceLoader?
Fungsinya sebagai gerbang utama di Spring untuk mengambil atau memuat berkas aset eksternal dari berbagai lokasi penyimpanan secara fleksibel, baik itu dari dalam proyek (classpath seperti file banner-store.txt), dari penyimpanan lokal komputer (file system), maupun langsung diunduh lewat jaringan internet (URL).

Apa fungsi MessageSource?
Fungsinya untuk menangani internasionalisasi (i18n) dan lokalisasi teks pada aplikasi. MessageSource mengizinkan kita memisahkan teks statis atau pesan dinamis ke file eksternal (.properties) terpisah berdasarkan bahasa pembaca (Locale), sehingga aplikasi mampu menampilkan bahasa yang adaptif tanpa perlu mengubah logika kodenya.
<img width="1337" height="688" alt="SCREENSHOT OUTPUT" src="https://github.com/user-attachments/assets/cef9df4c-29a6-4654-b28c-bb8e00409519" />
