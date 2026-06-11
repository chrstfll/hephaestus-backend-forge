# Posttest - Java Fundamental

Jawab pertanyaan berikut setelah membaca materi dan mengerjakan exercise Java Fundamental.

### 1. Apa itu variable?

Jawaban:

```text
Wadah untuk menyimpan suatu nilai atau data yang bisa berubah.
```

### 2. Apa perbedaan String, int, Long, dan boolean?

Jawaban:

```text
String digunakan untuk menyimpan teks atau kumpulan karakter seperti nama atau kalimat (misalnya "Halo"), sedangkan int (integer) digunakan untuk menyimpan angka bulat dalam rentang tertentu seperti 10 atau -5. Long juga menyimpan angka bulat, tetapi memiliki kapasitas yang lebih besar dibandingkan int sehingga bisa menampung nilai yang sangat besar. Sementara itu, boolean digunakan untuk menyimpan nilai logika yang hanya memiliki dua kemungkinan, yaitu benar (true) atau salah (false).
```

### 3. Kenapa Java menggunakan camelCase untuk variable?

Jawaban:

```text
Untuk penulisan standar penamaan yang membuat kode lebih mudah dibaca dan konsisten.
```

### 4. Apa perbedaan class dan object?

Jawaban:

```text
Class adalah template yang mendefinisikan atribut (data) dan metode (fungsi), object adalah hasil nyata (instance) dari class tersebut.
```

### 5. Apa itu field?

Jawaban:

```text
Field adalah variabel yang berada di dalam class, yang digunakan untuk menyimpan data atau atribut dari suatu object.
```

### 6. Apa itu method?

Jawaban:

```text
Method adalah fungsi atau aksi yang dimiliki oleh class dan digunakan untuk melakukan suatu proses atau perintah.
```

### 7. Apa itu parameter?

Jawaban:

```text
Parameter adalah nilai atau variabel yang dimasukkan ke dalam method agar method bisa bekerja dengan data tertentu.
```

### 8. Apa itu return value?

Jawaban:

```text
Return value adalah nilai yang dikembalikan oleh suatu method setelah dijalankan.
```

### 9. Apa fungsi constructor?

Jawaban:

```text
Constructor adalah method khusus dalam class yang digunakan untuk membuat object dan menginisialisasi nilai awal field.
```

### 10. Apa fungsi `this`?

Jawaban:

```text
this adalah keyword di Java yang digunakan untuk merujuk ke object saat ini (object yang sedang dipakai).
```

### 11. Kenapa field dibuat private?

Jawaban:

```text
Field biasanya dibuat private untuk menjaga keamanan dan kontrol data (konsep encapsulation).
```

### 12. Apa fungsi getter dan setter?

Jawaban:

```text
Getter dan setter adalah method yang digunakan untuk mengakses dan mengubah nilai field (biasanya yang private).
```

### 13. Apa itu encapsulation?

Jawaban:

```text
Encapsulation adalah konsep dalam pemrograman yang digunakan untuk membungkus data (field) dan method dalam satu class, serta membatasi akses langsung ke data tersebut.
```

### 14. Apa perbedaan List dan Map?

Jawaban:

```text
List dan Map adalah struktur data, tetapi cara menyimpan datanya berbeda.
```

### 15. Kenapa CustomerService menggunakan Map<Long, Customer>?

Jawaban:

```text
CustomerService menggunakan Map<Long, Customer> karena ingin menyimpan dan mengambil data customer dengan cepat menggunakan ID unik.
```

### 16. Kenapa getAllCustomers mengembalikan List<Customer>?

Jawaban:

```text
getAllCustomers mengembalikan List karena tujuannya adalah mengambil semua data customer dalam bentuk kumpulan/daftar yang bisa diiterasi.
```

### 17. Apa itu interface?

Jawaban:

```text
Interface adalah kontrak (aturan) yang berisi method tanpa isi, yang harus diimplementasikan oleh class lain.
```

### 18. Apa perbedaan interface dan abstract class?

Jawaban:

```text
Interface dan abstract class sama-sama digunakan untuk membuat “blueprint”, namun fungsi dari interface bersifat "wajib" digunakan oleh kelas yang mengimplementasikannya, berbeda dengan abstrak
```

### 19. Dari exercise, jelaskan flow createCustomer.

Jawaban:

```text
1. Input data masuk
Method createCustomer menerima data (misalnya nama, email, dll)
2. Generate ID
Sistem membuat ID unik (biasanya Long) untuk customer baru
3. Buat object Customer
Data dari input dimasukkan ke dalam object Customer
4. Simpan ke Map
5. Return hasil
Biasanya method mengembalikan object Customer yang baru dibuat
```

### 20. Bagian mana yang paling sulit?

Jawaban:

```text
Pemahaman alur data (flow).
```
