import java.util.*;
public class mudikeuy3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double totwak, jartot, gg, gg2, gg3, jar, jar2, jar3, w, w2, w3, kec, kec2, kec3;

		System.out.print("Total jarak (dalam satuan Km): ");
		jartot = in.nextInt();
		System.out.print("Gigi yang digunakan: ");
		gg = in.nextInt();
	
		System.out.print("Jarak yang sudah ditempuh sampai tempat istirahat: ");
		jar = in.nextInt();

		System.out.print("Gigi yang digunakan: ");
		gg2 = in.nextInt();
		

		System.out.print("Jarak yang sudah ditempuh sampai tempat istirahat kedua (Km)");
		jar2 = in.nextInt();
		

		System.out.print("Gigi yang digunakan: ");
		gg3 = in.nextInt();
		
		// batas bener
		if(gg==1){
			kec=40;
			w=jar/kec;
				if(gg2==1){
					kec2=40;
					w2=jar2/kec2;
							if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==2){
					kec2=60;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==3){
					kec2=80;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==4){
					kec2=100;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}
		}else if(gg==2){
			kec=60;
			w=jar/kec;
				if(gg2==1){
					kec2=40;
					w2=jar2/kec2;
							if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==2){
					kec2=60;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==3){
					kec2=80;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==4){
					kec2=100;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}
		}else if(gg==3){
			kec=80;
			w=jar/kec;
				if(gg2==1){
					kec2=40;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==2){
					kec2=60;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}

				}else if(gg2==3){
					kec2=80;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==4){
					kec2=100;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}
		}else if(gg==4){
			kec=100;
			w=jar/kec;
				if(gg2==1){
					kec2=40;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==2){
					kec2=60;
					w2=jar2/kec2;
							if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==3){
					kec2=80;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}else if(gg2==4){
					kec2=100;
					w2=jar2/kec2;
												if(gg3==1){
								jar3 = jartot-(jar+jar2);
								kec3=40;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==2){
								jar3 = jartot-(jar+jar2);
								kec3=60;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==3){
								jar3 = jartot-(jar+jar2);
								kec3=80;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}else if(gg3==4){
								jar3 = jartot-(jar+jar2);
								kec3=100;
								w3=jar3/kec3;
								totwak = (jar/kec)+(jar2/kec2)+(jar3/kec3);
								System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");
							}
				}
		}
		
		

	}
}