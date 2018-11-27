ADD FASILITAS "TV"
ADD FASILITAS "Monitor"
ADD FASILITAS "Papan Tulis"
ADD FASILITAS "Kolam Renang"
SHOW FASILITAS

ADD DOSEN "John1"
ADD DOSEN "John2"
ADD DOSEN "John3"
ADD DOSEN "John4"
ADD DOSEN "John5"
SHOW DOSEN

ADD RUANGAN "7774" (kapasitas: 100, fasilitas: ["TV", "Monitor"])
ADD RUANGAN "7771" (kapasitas: 80, fasilitas: ["Papan Tulis", "TV"])
ADD RUANGAN "7772" (kapasitas: 60, fasilitas: ["Monitor"])
ADD RUANGAN "7773" (kapasitas: 10, fasilitas: ["Kolam Renang", "Monitor"])
SHOW RUANGAN

ADD MATAKULIAH "RPL1" (kapasitas: 35, fasilitas: ["TV", "Monitor"], sks:4, tingkat:2)
SHOW MATAKULIAH

ASSIGN "RPL1" (ruang: "7774", dosen: "John3", hari: 4, jam: 3, durasi: 3)
REMOVE "7774" (hari: 4, jam: 3, durasi: 3)