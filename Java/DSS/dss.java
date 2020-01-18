import java.util.*;
public class dss {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		char opsi;
		do
		{
			char a, b, c, d, e, f;
			//program penasehat jerawat
			System.out.println("\n============================DSS-1187050030===============================");
			System.out.println("==================DIAGNOSA JENIS JERAWAT YANG DIDERITA===================");
			System.out.println("=============================Fathima Umar================================");

			System.out.println("\nPETUNJUK: \n1. Program ini dibuat untuk mengetahui kondisi kulit anda. \n2. Anda harus mengisi setiap soal dengan pilihan yang sudah tersedia. \n3. Isi sampai selesai." );
			System.out.println("\n--------------------------------START------------------------------------\n");
			
			//pertanyaan
			System.out.println("1. Apakah tipe kulit anda berminyak? ");
			System.out.println(" a. ya\n b. kombinasi\n c. tidak sama sekali");
			System.out.print(" => ");
			a = in.next().charAt(0);
			System.out.println("-------------------------------------------------------------------------");

			if(a=='a'){ //1.tipe: berminyak
				System.out.println("2. Seberapa banyak minyak anda?");
				System.out.println(" a. lumayan\n b. banyak\n c. tidak terhingga, seperti tambang minyak");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
				if(b=='a'){ //1.tipe: berminyak; 2.minyak: lumayan
					System.out.println("3. Seberapa sering anda berjerawat?");
					System.out.println(" a. Sering\n b. mayan\n c. cuman pas menjelang menstruasi");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: sering
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: suka
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='c'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: mens
						System.out.println("4. Biasanya berapa banyak jerawat yang muncul ketika anda sedang menstruasi?");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Tipe jerawat anda jerawat hormonal. jangan biarkan anda terlalu mumet dan tenggelam dalam fikiran. karena penyebab utama tipe jerawat hormonal adalah Stress yang memicu ekskresi minyak berlebih. jaga pola makan dan mood anda pada waktu pra-menstruasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat yang gitu mah sehari dua hari juga ilang. sabar aja. rajin-rajin mengkonsumsi vitamin E untuk perawatan internal, dan untuk eksternalnya, jangan lupa eksfoliasi wajah. menggunakan produk non-oil. jangan coba pencet jerawat pake tangan sendiri. omat. karena bisa menyebabkan inflamasi dan tumbuhnya jerawat baru.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else{

					}
				}else if(b=='b'){ //1.tipe: berminyak; 2.minyak: banyak
					System.out.println("3. Kapan biasanya jerawat anda muncul? ");
					System.out.println(" a. Selalu ada setiap saat\n b. kadang/cuman pas menjelang menstruasi");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada
						System.out.println("4. Berapa lama biasanya umur jerawat di wajah anda>");
						System.out.println(" a. Lama, bahkan sebulan pun belum ilang-ilang\n b. Kisaran seminggu-dua minggu\n c. kisaran hari");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada 4.lama:sebulan
							System.out.println("5. Apakah jerawat anda bernanah atau memiliki mata?");
							System.out.println(" a. ya\n b. tidak");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada 4.lama:sebulan 5.nanah:ya
								System.out.println("6. Ukuran jerawat?");
								System.out.println(" a. sangat besar\n b. besar\n c. kecil");
								System.out.print(" => ");
								f = in.next().charAt(0);
								System.out.println("-------------------------------------------------------------------------");
								if(f=='a'){
									System.out.println("7. Ukuran mata nanah pada jerawat yang berwarna putih");
									System.out.println(" a. sebesar jerawatnya (satu jerawat berwarna putih, nanahnya terlihat semua\n b. besar tapi tidak sebesar jerawatnya\n c. kecil)");
									System.out.print(" => ");
								}else if(f=='b'){

								}else if(f=='c'){

								}else{
									System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
								}
							}else if(e=='b'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada 4.lama:sebulan 5.nanah:tidak
								System.out.println("6. Ukuran jerawat?");
								System.out.println(" a. sangat besar\n b. besar\n c. kecil");
								f = in.next().charAt(0);
								if (f=='a'){
									System.out.println("Anda mengalami peradangan jerawat, dan tipe jerawat anda adalah papule. untuk mengobatinya, anda dapat menggunakan produk acne spot treatment atau jika masih belum terasa ampuh, anda dapat berkonsutlasi ke dokter kulit. karena beberapa jenis jerawat tidak mempan terhadap obat jerawat yang djiual bebas, melainkan. membutuhkan tindakan dari tenaga ahli. dalam kondisi wajah anda yang seperti ini, jangan coba-coba melakukan eksfoliasi kulit. hal tersebut malah akan menyebabkan inflamasi yang lebih parah.");
								}else if(f=='b'){
									System.out.println("anda mengalami peradangan jerawat. jangan sekali-kali pencet itu jerawat, sebelum si jerawat punya katup yang sudah mengering. karena hal itu akan menyebabkan bakteri yang ada didalam jerawat menyebar, dan akan menimbulkan jerawat baru di daerah sekitarnya.");
								}else if(f=='c'){
									System.out.println("Penyebab utama jerawat anda adalah kebersihan. jangan biarkan wajah anda digelinangi minyak. biasakan cuci muka yang rutin. dan lakukan eksfoliasi 2 kali seminggu.");
								}else{
									System.out.println("Isi nu baleg;(");
								}
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada 4.lama:kisaran minggu
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri.");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}else if(d=='c'){ //1.tipe:berminyak; 2.minyak:banyak 3.kapan:selalu ada 4.lama:kisaran hari
							System.out.println("Jerawat anda bukan jerawat hormonal. jadi tenang, akan lebih mudah dalam mengobatinya. penyebab jerawat kamu muncul adalah kebersihan. sadar diri harusnya, dah tau muka berminyak tu dirawat. rajin2 cuci muka. jan dibiarin hinyai. ntar jadi jerawat sisttt.");
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: banyak 3.kapan:pas mens
						System.out.print("Tipe jerawat anda jerawat hormonal. jangan biarkan anda terlalu mumet dan tenggelam dalam fikiran. karena penyebab utama tipe jerawat hormonal adalah Stress yang memicu ekskresi minyak berlebih. jaga pola makan dan mood anda pada waktu pra-menstruasi.");
					}else{
						System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
					}
				}else if(b=='c'){ //1.tipe: berminyak; 2.minyak: tidak terhingga
					System.out.println("3. Apakah diwajah anda selalu ada jerawat? baik saat haid ataupun tidak");
					System.out.println(" a. Ya\n b. Ga juga, kadang enggak");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada
						System.out.println("4. Seberapa banyak jerawat anda dalam satu waktu?");
						System.out.println(" a. sedikit-sedang\n b. memenuhi seluruh wajah");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.sedikit-sedang
							System.out.println("5. Apakah jerawat anda bermata (bernanah)?");
							System.out.println(" a. ya\n b. tidak");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.sedikit-sedang 5.bernanah
								System.out.println("6. Berapa lama jerawat anda kempes?");
								System.out.println(" a. hitungan hari\n b. hitungan minggu bahkan satu bulan lebih");
								System.out.print(" => ");
								f = in.next().charAt(0);
								System.out.println("-------------------------------------------------------------------------");
								if(f=='a'){
									System.out.println("Tipe jerawat: pustules\nPenyebab: hormon dan kebersihan\nAnda mengalami radang jerawat yang belum terlalu parah. coba konsultasikan masalah jerawat in pada dokter kulit. karena penanganan yang tidak tepat atau pemakaian produk yang tidak tepat hanya akan membuat radang jerawat anda menjadi radang akut.");
								}else if(f=='b'){
									System.out.println("Tipe jerawat: pustules\nPenyebab: Hormon/kebersihan/ketidak-cocokan produk\nAnda mengalami radang jerawat akut, jerawat dengan tipe seperti ini sudah tidak bisa diatasi dengan produk skincare yang dijual pasaran. melalinkan harus ditangani langsung oleh tenaga ahli. dan memerlukan dosis khusus untuk obatnya. coba kontrol ke dokter kulit terdekat");
								}
							}else if(e=='b'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.sedikit-sedang 5.tidak bernanah
								System.out.println("6. Berapa lama jerawat anda kempes?");
								System.out.println(" a. hitungan hari\n b. hitungan minggu bahkan satu bulan lebih");
								System.out.print(" => ");
								f = in.next().charAt(0);
								System.out.println("-------------------------------------------------------------------------");
								if(f=='a'){
									System.out.println("Tipe jerawat: papule\nPenyebab: hormon dan ketidakteraturan kelenjar sebum\nAnda mengalami radang jerawat yang belum terlalu parah. coba konsultasikan masalah jerawat in pada dokter kulit. karena penanganan yang tidak tepat atau pemakaian produk yang tidak tepat hanya akan membuat radang jerawat anda menjadi radang akut.");
								}else if(f=='b'){
									System.out.println("Tipe jerawat: papule\nPenyebab: Hormon atau ketidak-cocokan produk\nAnda mengalami radang jerawat akut, jerawat dengan tipe seperti ini sudah tidak bisa diatasi dengan produk skincare yang dijual pasaran. melalinkan harus ditangani langsung oleh tenaga ahli. dan memerlukan dosis khusus untuk obatnya. coba kontrol ke dokter kulit terdekat");
								}
							}else{
								System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
							}
						}else if(d=='b'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.banyak
							System.out.println("5. Apakah jerawat anda bermata (bernanah)?");
							System.out.println(" a. ya\n b. tidak");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.sedikit-sedang 5.bernanah
								System.out.println("6. Berapa lama jerawat anda kempes?");
								System.out.println(" a. hitungan hari\n b. hitungan minggu bahkan satu bulan lebih");
								System.out.print(" => ");
								f = in.next().charAt(0);
								System.out.println("-------------------------------------------------------------------------");
								if(f=='a'){
									System.out.println("Tipe jerawat: pustules\nPenyebab: hormon dan kebersihan\nAnda mengalami radang jerawat yang belum terlalu parah. coba konsultasikan masalah jerawat in pada dokter kulit. karena penanganan yang tidak tepat atau pemakaian produk yang tidak tepat hanya akan membuat radang jerawat anda menjadi radang akut.");
								}else if(f=='b'){
									System.out.println("Tipe jerawat: pustules\nPenyebab: Hormon/kebersihan/ketidak-cocokan produk\nAnda mengalami radang jerawat akut, jerawat dengan tipe seperti ini sudah tidak bisa diatasi dengan produk skincare yang dijual pasaran. melalinkan harus ditangani langsung oleh tenaga ahli. dan memerlukan dosis khusus untuk obatnya. coba kontrol ke dokter kulit terdekat");
								}
							}else if(e=='b'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.selalu ada 4.sedikit-sedang 5.tidak bernanah
								System.out.println("6. Berapa lama jerawat anda kempes?");
								System.out.println(" a. hitungan hari\n b. hitungan minggu bahkan satu bulan lebih");
								System.out.print(" => ");
								f = in.next().charAt(0);
								System.out.println("-------------------------------------------------------------------------");
								if(f=='a'){
									System.out.println("Tipe jerawat: papule\nPenyebab: hormon dan ketidakteraturan kelenjar sebum\nAnda mengalami radang jerawat yang belum terlalu parah. coba konsultasikan masalah jerawat in pada dokter kulit. karena penanganan yang tidak tepat atau pemakaian produk yang tidak tepat hanya akan membuat radang jerawat anda menjadi radang akut.");
								}else if(f=='b'){
									System.out.println("Tipe jerawat: papule\nPenyebab: Hormon atau ketidak-cocokan produk\nAnda mengalami radang jerawat akut, jerawat dengan tipe seperti ini sudah tidak bisa diatasi dengan produk skincare yang dijual pasaran. melalinkan harus ditangani langsung oleh tenaga ahli. dan memerlukan dosis khusus untuk obatnya. coba kontrol ke dokter kulit terdekat");
								}
							}else{
								System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
							}
						}else{
							System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: tidak terhingga 3.ga selalu ada
						System.out.println("4. Sebanyak apa jerawat ketika sedang muncul?");
						System.out.println(" a. banyak\n b. biasa");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){
							System.out.println("Penyebab jerawat: hormon dan kebersihan\nTips: Anda harus sering-sering mengkonsumsi vitamin E dan mengurangi makanan berminyak dan pedas. karena akan memicu kelenjar minyak mengeluarkan minyak berlebih. untuk kebersihan, jangan malas untuk melakukan eksfoliasi rutin 2 kali dalam seminggu, agar kulit anda terbebas dari sel kulit mati yang akan menyumbat minyak anda sehingga menyebabkan jerawat.");
						}else if(d=='b'){
							System.out.println("Jerawat anda normal, dan hormonal. untuk merawat kulit anda, anda bisa memilih rangkaian produk skincare. untuk ukuran tipe kulit wajah yang sangat berminyak seperti anda, anda tergolong baik dalam merawat kulit. karena pada umumnya, orang yang mempunyai minyak berlebihan cenderung mengalami radang jerawat yang harus ditangani oleh dokter kulit");
						}else{
							System.out.println("yang bener dong inputnya sist:(");
						}
					}else{
						System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
					}
				}

			}else if(a=='b'){ //1.tipe: kombinasi
				System.out.println("2. Apakah anda memiliki tipe kulit sensitif?");
				System.out.println(" a. ya\n b. tidak");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
	    		if(b=='a'){//1.tipe: kombinasi; 2.sensitif; 
					System.out.println("3. Seberapa sering anda berjerawat?");
					System.out.println(" a. Sering\n b. mayan\n c. cuman pas menjelang menstruasi");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: sering
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit anda misalnya rutin pake sheetmask yang acne reducer. tapi, jangan coba2 pake produk eksfoliasi yang butiran scrubnya kasar, karena tidak baik untuk kulit sensitif anda. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi. tapi jangan pilih produk dengan butiran scrub yang kasar, karena tidak baik untuk kulit dengan tipe sensitif seperti anda.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.\n4. tapi, jangan coba2 pake produk eksfoliasi yang butiran scrubnya kasar, karena tidak baik untuk kulit sensitif anda.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: suka
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan facial washing 2 kali dalam sehari dan eksfoliasi 2 kali dalam seminggu, tapi hati-hati dalam memilih produk eksfoliasi, karena produk dengan scrub yang kasar hanya akan memperparah kondisi kulit anda yang sensitif. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah tapi, jangan coba2 pake produk eksfoliasi yang butiran scrubnya kasar, karena tidak baik untuk kulit sensitif anda.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='c'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: mens
						System.out.println("4. Biasanya berapa banyak jerawat yang muncul ketika anda sedang menstruasi?");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Tipe jerawat anda jerawat hormonal. jangan biarkan anda terlalu mumet dan tenggelam dalam fikiran. karena penyebab utama tipe jerawat hormonal adalah Stress yang memicu ekskresi minyak berlebih. jaga pola makan dan mood anda pada waktu pra-menstruasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat yang gitu mah sehari dua hari juga ilang. sabar aja. rajin-rajin mengkonsumsi vitamin E untuk perawatan internal, dan untuk eksternalnya, jangan lupa eksfoliasi wajah. menggunakan produk non-oil. jangan coba pencet jerawat pake tangan sendiri. omat. karena bisa menyebabkan inflamasi dan tumbuhnya jerawat baru.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("Kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan ringan.");
							}
						}
					}else{
						System.out.println("Nginputna cing baleg atuh sultan:(");
					}
				}else if(b=='b'){//1.tipe: kombinasi; 2.tidak sensitif;
					System.out.println("3. Seberapa sering anda berjerawat?");
					System.out.println(" a. Sering\n b. mayan\n c. cuman pas menjelang menstruasi");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: sering
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: suka
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='c'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: mens
						System.out.println("4. Biasanya berapa banyak jerawat yang muncul ketika anda sedang menstruasi?");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Tipe jerawat anda jerawat hormonal. jangan biarkan anda terlalu mumet dan tenggelam dalam fikiran. karena penyebab utama tipe jerawat hormonal adalah Stress yang memicu ekskresi minyak berlebih. jaga pola makan dan mood anda pada waktu pra-menstruasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat yang gitu mah sehari dua hari juga ilang. sabar aja. rajin-rajin mengkonsumsi vitamin E untuk perawatan internal, dan untuk eksternalnya, jangan lupa eksfoliasi wajah. menggunakan produk non-oil. jangan coba pencet jerawat pake tangan sendiri. omat. karena bisa menyebabkan inflamasi dan tumbuhnya jerawat baru.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else{
						System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
					}
				}
			}else if(a=='c'){//1.tipe: tidak sama sekali
				System.out.println("2. Tapi suka berjerawat ga? :(");
				System.out.println(" a. suka\n b. ga ");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
				if(b=='a'){//1.tipe: tidak sama sekali; 2.jerawat: suka
					System.out.println("3. Seberapa sering anda berjerawat?");
					System.out.println(" a. Sering\n b. mayan\n c. cuman pas menjelang menstruasi");
					System.out.print(" => ");
					c = in.next().charAt(0);
					System.out.println("-------------------------------------------------------------------------");
					if(c=='a'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: sering
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='b'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: suka
						System.out.println("4. Biasanya berapa banyak jerawat anda dalam satu waktu");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil seperti komedo");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Jerawat anda normal. tapi tetaplah lakukan perawatan yang rutin pada kulit\nanda, khususnya eksfoliasi. karena jika kulit anda dibiarkan kotor, jerawat anda akan berpotensi mengalami inflamasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat anda normal, untuk mencegah terjadinya jerawat, anda harus rutin melakukan eksfoliasi 2 kali dalam seminggu, dan facial washing 2 kali dalam sehari. anda juga boleh mencoba menggunakan masker wajah untuk perawatan mingguan, disamping menggunakan scrub untuk eksfoliasi.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else if(c=='c'){ //1.tipe: berminyak; 2.minyak: lumayan 3.sering: mens
						System.out.println("4. Biasanya berapa banyak jerawat yang muncul ketika anda sedang menstruasi?");
						System.out.println(" a. 0-2\n b. 2-5");
						System.out.print(" => ");
						d = in.next().charAt(0);
						System.out.println("-------------------------------------------------------------------------");
						if(d=='a'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:0-2
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. kecil merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Tipe jerawat anda jerawat hormonal. jangan biarkan anda terlalu mumet dan tenggelam dalam fikiran. karena penyebab utama tipe jerawat hormonal adalah Stress yang memicu ekskresi minyak berlebih. jaga pola makan dan mood anda pada waktu pra-menstruasi.");
							}else if(e=='b'){
								System.out.print("Anda harus lebih hati-hati dalam memilih makanan dan jajanan sehari-hari. karena jerawat ini biasanya disebabkan oleh faktor internal, seperti makanan dan hormon. jauhi makanan berminyak, dan diary food. dan juga jan sering-sering ngebatin ai idup teh! matak jarawat eta teh! :(");
							}else if(e=='c'){
								System.out.print("Jerawat yang gitu mah sehari dua hari juga ilang. sabar aja. rajin-rajin mengkonsumsi vitamin E untuk perawatan internal, dan untuk eksternalnya, jangan lupa eksfoliasi wajah. menggunakan produk non-oil. jangan coba pencet jerawat pake tangan sendiri. omat. karena bisa menyebabkan inflamasi dan tumbuhnya jerawat baru.");
							}
						}else if(d=='b'){ //1.tipe:berminyak; 2.minyak:lumayan 3.sering:sering 4.banyak:2-5
							System.out.println("5. Nampak jerawat: ");
							System.out.println(" a. besar dan merah\n b. besar dan mendem\n c. besar dan bermata (bernanah)\n d. kecil bernanah\n e. kecil dan merah");
							System.out.print(" => ");
							e = in.next().charAt(0);
							System.out.println("-------------------------------------------------------------------------");
							if(e=='a'){
								System.out.print("Anda berpotensi mengalami peradangan jerawat. yang harus anda lakukan:\n1. Menjaga pola makan, lakukan lah diet terhadap makanan berminyak, dan makanan yang mengandung susu, atau produk olahan susu, kurangi juga asupan karbohidrat.\n2. Anda harus memulai menggunakan rangkaian skincare yang terdiri dari krim malam untuk jerawat, krim siang untuk melapisi dari matahari, dan obat jerawat.\n3. rutin mencuci wajah dan eksfoliasi agar tidak ada sel kulit mati yang menyebabkan tersumbatnya minyak.");
							}else if(e=='b'){
								System.out.print("anda memiliki jerawat hormonal, perbaiki asupan makanan. hindari makanan pemicu jerawat seperti gorengan. selain makanan, jangan biarkan anda terlalu stress juga, karena itu sangat berpengaruh. terus harus rajin-rajin perawatan juga ya!");
							}else if(e=='c'){
								System.out.print("kamu berpotensi mengalami radang jerawat. kalau abis pulang dari mana-mana teh, cuci muka. jangan biarkan minyak dimuka anda jadi sarang kotoran dan bakteri untuk menempel di kulit wajah anda. karena kalau dibiarin, kotoran tersebut bisa menyumbat pori-pori dan bakteri akan berkembang di bawah lapisan kulit sehingga timbul lah nanah(yang biasa kita lihat sebagai mata jerawat) pada jerawat yang berperan sebagai pembunuh bakteri");
							}else if(e=='d'){
								System.out.print("udah gapapa jerawat kek gitu mah, normal. rajin-rajin aja cuci muka, dan eksfoliasi rutin 2 kali dalam seminggu. jangan pernah sentuh jerawat anda, apalagi mencet-mencet!");
							}else if(e=='e'){
								System.out.print("kamu kurang menjaga kebersihan wajah, dan kurang menjaga pola makan yang baik. jangan pernah pencet jerawat anda. karena akan menyebabkan peradangan.");
							}
						}
					}else{
						System.out.println("isi nu baleg atuh wa:( jadi weh kudu balikan deui ti awal kan. hemm. mampus.");
					}
				}else if(b=='b'){//1.tipe: tidak sama sekali; 2.jerawat: ga
					System.out.println("Yaudah si, ngapain lu isi program jerawat ini bambang?");
					System.out.println("-------------------------------------------------------------------------");
				}
			}else{
				System.out.println("input yang bener dong sist:(");
			}


			//akses keluar dari sistem
			System.out.print("\n\nApakah Anda Ingin Keluar ? ");
			System.out.print("\n1. Ya\n2. Tidak\n");
			System.out.print("=> ");
			opsi = in.next().charAt(0);
		
		}while(opsi == 'n' || opsi == 'N');
	}
}	