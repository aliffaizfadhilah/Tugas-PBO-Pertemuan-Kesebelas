# Tugas-PBO-Pertemuan-Kesebelas
Koneksi IReport, Jasper, File CSV dan JFrame Form Netbeans dengan JPA (Java Persistence API) Netbeans
# Java Persistence API (JPA)
Java Persistence API (JPA) adalah spesifikasi resmi Java yang digunakan untuk memetakan data dari database relasional ke dalam bentuk objek Java (Object Relational Mapping/ORM). Dengan JPA, pengembang dapat mengelola, menyimpan, dan mengambil data dari database tanpa perlu menulis banyak kode SQL secara langsung.
JPA bekerja dengan cara menghubungkan kelas Java yang disebut Entity dengan tabel di dalam database. Setiap objek dari kelas tersebut mewakili satu baris data di tabel. Proses pengelolaan data dilakukan melalui EntityManager, yang bertugas untuk menambah, memperbarui, mencari, dan menghapus data.
Selain itu, JPA juga menggunakan JPQL (Java Persistence Query Language), yaitu bahasa query yang mirip dengan SQL tetapi bekerja menggunakan nama kelas dan atribut, bukan nama tabel dan kolom. Konfigurasi koneksi dan pengaturan entitas JPA biasanya disimpan dalam file persistence.xml yang mendefinisikan unit persistensi.
JPA hanya merupakan spesifikasi, sehingga untuk menggunakannya dibutuhkan implementasi seperti Hibernate, EclipseLink, atau OpenJPA. Dengan JPA, pengembangan aplikasi menjadi lebih efisien karena data dapat diolah langsung melalui objek Java tanpa perlu berinteraksi langsung dengan perintah SQL, serta mendukung berbagai sistem database dengan sedikit perubahan kode.
# Persistence
Persistence dalam JPA adalah kemampuan untuk menyimpan data secara permanen ke dalam database melalui objek-objek Java. Dalam proyek JPA, pengaturan ini diatur melalui file konfigurasi bernama persistence.xml, yang berfungsi untuk menghubungkan aplikasi Java dengan database. File tersebut biasanya terletak di folder META-INF dan berisi informasi penting seperti nama unit persistensi, driver database, URL koneksi, username, password, serta pengaturan implementasi JPA seperti Hibernate. Dengan adanya konfigurasi ini, aplikasi dapat berinteraksi dengan database menggunakan objek Java tanpa perlu menulis perintah SQL secara langsung.
# Entity Classes from Database
Entity Classes from Database adalah fitur yang disediakan oleh IDE seperti NetBeans untuk membuat kelas entitas secara otomatis berdasarkan struktur tabel yang sudah ada di dalam database. Fitur ini sangat membantu karena menghemat waktu dan memastikan bahwa struktur kelas Java sesuai dengan tabel di database. Prosesnya dilakukan dengan memilih koneksi database, mencentang tabel yang ingin dijadikan entitas, lalu menentukan paket penyimpanan kelas. Setelah itu, NetBeans akan secara otomatis membuat kelas Java lengkap dengan anotasi JPA seperti @Entity, @Table, @Id, dan @Column. Setiap kelas yang dihasilkan mewakili satu tabel di database, dan setiap atributnya mewakili kolom pada tabel tersebut. Dengan demikian, pengembang dapat mengelola data secara berorientasi objek melalui JPA tanpa harus menulis query SQL secara manual.
# Langkah - langkah 
1. Membuat Proyek Baru di NetBeans.
Buka NetBeans → pilih File → New Project. Pilih Java Application dan beri nama proyek (misalnya: Pertemuan11). Hilangkan centang pada Create Main Class, lalu klik Finish.
2. Membuat Koneksi ke Database
Buka tab Services → Databases. Klik kanan pada Drivers → PostgreSQL → Connect Using. Masukkan informasi: Database: nama database dari pgAdmin. Username dan Password: sesuai dengan akun PostgreSQL kamu. Klik Test Connection untuk memastikan koneksi berhasil, lalu OK. Salin JDBC URL untuk digunakan nanti di konfigurasi persistence.
3. Menambahkan Library ke Proyek
Klik kanan pada folder proyek → pilih Properties → Libraries. Tambahkan: PostgreSQL JDBC Driver (untuk koneksi database). JasperReports Library (untuk laporan Jasper). Klik OK setelah library berhasil ditambahkan.
4. Membuat File Persistence (persistence.xml)
Klik kanan pada proyek → New → Other → Persistence → Persistence Unit. Beri nama (misalnya: PetshopPU). Pilih Provider: Hibernate dan Data Source sesuai koneksi database. Klik Finish. File persistence.xml akan muncul di folder META-INF. Pastikan isi file berisi informasi koneksi database, driver, username, dan password.
5. Membuat Entity Classes from Database
Klik kanan pada proyek atau package → New → Entity Classes from Database. Pilih koneksi database yang sudah dibuat. Pindahkan tabel-tabel yang ingin dijadikan entitas ke sisi kanan. Klik Next, centang opsi: Generate Named Query Annotation for Persistent Fields Use Column Names in Relationship Klik Finish. NetBeans otomatis membuat kelas entitas (Entity Class) dengan anotasi seperti @Entity, @Table, @Id, dan @Column.
6. Membuat JFrame Form
Klik kanan pada package → New → JFrame Form. Rancang tampilan form (tabel, tombol Insert, Update, Delete, Upload, dan Cetak). Tambahkan method: tampilData() untuk menampilkan data dari database. bersih() untuk membersihkan input. Hubungkan tombol-tombol CRUD dengan EntityManager agar terhubung ke database.
7. Menambahkan Fitur Upload File CSV
Tambahkan tombol Upload di JFrame. Gunakan JFileChooser untuk memilih file .csv. Baca data file CSV menggunakan BufferedReader dan simpan ke database melalui EntityManager.
8. Menambahkan Report Jasper
Klik kanan pada package → New → Report Wizard. Pilih jenis kertas dan beri nama file .jrxml. Hubungkan ke koneksi database. Pindahkan semua field ke kanan, lalu klik Finish. Gunakan tombol Cetak di JFrame untuk memanggil dan menampilkan laporan Jasper.
9. Menjalankan Program
Pastikan semua komponen (database, entity, persistence, dan form) sudah terhubung. Jalankan aplikasi melalui tombol Run (Shift + F6). Lakukan pengujian fitur Insert, Update, Delete, Upload CSV, dan Cetak Jasper.
