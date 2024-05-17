# BinaryTree
# Penjelasan Metode Traversal pada Pohon Biner Tree 1

Dalam konteks pohon biner, terdapat tiga metode traversal yang umum digunakan untuk mengurutkan node-node dalam pohon tersebut.
Metode tersebut adalah Pre Order, In Order, dan Post Order. 
Berikut adalah penjelasan dari ketiga metode:


## Pre Order
Pre Order mengunjungi akar terlebih dahulu, kemudian anak kiri, dan akhirnya anak kanan. Berdasarkan data yang diberikan:
- Mulai dari akar 20.
- Kemudian ke anak kiri 2.
- Lanjut ke anak kiri dari 2, yaitu 37.
- Kembali ke akar 37, tidak ada anak kiri lagi, jadi ke anak kanan 12.
- Setelah itu, kembali ke akar 12, yang tidak memiliki anak lagi.
- Kembali ke akar 2, ke anak kanan 25.
- Akhirnya, ke anak kiri 16 dari 25.


## In Order
In Order mengunjungi anak kiri terlebih dahulu, kemudian akar, dan akhirnya anak kanan. Berdasarkan data yang diberikan:
- Mulai dari anak kiri, yaitu 37.
- Lanjut ke akar 2.
- Kemudian ke anak kanan 12 dari 37.
- Kembali ke akar 12, yang tidak memiliki anak lagi.
- Lanjut ke akar kiri 20 dari 12.
- Lanjut ke akar kanan 25 dari 12
- Kembali ke anak kiri 16 dari 25.

## Post Order
Post Order mengunjungi anak kiri, anak kanan, dan terakhir akar. Berdasarkan data yang diberikan:

- Mulai utama atau akar memiliki nilai 37.
- Lanjut di sebelah kiri memiliki nilai 12.
- Kemudian note di sebelah kanan memiliki nilai 2.
- Lanjut Node di bawah node 2 memiliki dua anak yaitu 16 (sebelah kiri) dan 25 (sebelah kanan).
- Lanjut Node 16 tidak memiliki anak.
- Kemudian Node 25 memiliki satu anak yaitu 20.
- Kemudian Node 20 tidak memiliki anak.



Dengan demikian, kita dapat melihat urutan yang berbeda dari setiap metode traversal dalam mengunjungi node-node dalam pohon biner.
```