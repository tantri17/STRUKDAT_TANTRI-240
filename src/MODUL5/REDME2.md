# Binary Search Tree
# Penjelasan Pohon Biner Search Tree 2

Dalam kasus pohon biner dengan data sebagai berikut:

**Pre Order**: 20, 2, 16, 25, 37

**In Order**: 2, 16, 20, 25, 37

**Post Order**: 16, 2, 37, 25, 20

Berikut adalah penjelasan untuk setiap metode:

## Pre Order
Dalam Pre Order, kita mulai dengan mengunjungi akar pohon terlebih dahulu. Kemudian, kita lanjutkan dengan mengunjungi setiap node secara rekursif, dimulai dari anak kiri dari setiap node dan kemudian anak kanan.

- Akar: 20
- Kemudian Node kiri dari 20: 2
- Lanjut Node kiri dari 2: 16
- Lanjut Node kanan dari 2: tidak ada (nilainya kosong)
- Kemudian kanan dari 20: 25
- Kemudian kiri dari 25: tidak ada (nilainya kosong)
- Lanjut kanan dari 25: 37
- Kemudian kiri dari 37: tidak ada (nilainya kosong)
- Kemudian kanan dari 37: tidak ada (nilainya kosong)

Jadi, urutan Pre Order adalah 20, 2, 16, 25, 37.

## In Order
Dalam ilustrasi ini, node-node disusun secara hierarkis dari kiri ke kanan, menggambarkan struktur dari pohon biner yang dihasilkan oleh kode program. Urutan In Order dari node-node dalam pohon ini adalah sebagai berikut:

- Awal Node 2 dikunjungi terlebih dahulu karena merupakan node terkiri.
- Setelah itu, node 16 dikunjungi karena merupakan anak dari node 2.
- Kemudian Node 20 dikunjungi kemudian karena merupakan anak dari node 16.
- Lanjut Node 25 dikunjungi karena merupakan anak dari node 20.
- Akhirnya, node 37 dikunjungi, yang menjadi node terakhir dalam urutan In Order karena merupakan anak dari node 25.

Jadi, urutan In Order adalah 2, 16, 20, 25, 37.

## Post Order
Penjelasan Output Post Order:

- Awal Node 16: Pertama, kita kunjungi node 16, karena ini adalah node terkiri.
- Kemudian Node 2: Kemudian, kita kunjungi node 2 yang merupakan anak kiri dari node 16.
- Setelah itu Node 37: Setelah itu, kita kunjungi node 37, yang merupakan anak kanan dari node 16.
- Lanjut Node 25: Selanjutnya, kita kunjungi node 25, yang merupakan anak kanan dari node 37.
- Lanjut Akar 20: Akhirnya, kita kunjungi akar pohon, yaitu node 20.

Maka, urutan output Post Order dari pohon biner ini adalah: 16, 2, 37, 25, 20.


