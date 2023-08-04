package musicdbdata;

import java.io.* ;
import java.util.Random ;

public class DataGenerator {
	public static void main(String[] args) {


		Random generator = new Random() ;
		int NumArtists = 10000 ;
		int NumSongs = 10000 ;
		int NumUsers = 10000 ;
		int NumListens = 15000 ;


		try {
			String tuple ;				// a tuple/record of attributes
			String a1, a2, a3, a4, a5 ;     // attributes 1 .. 5
			int age ;
			File file = null ;
			FileWriter fw = null ;
			BufferedWriter bw = null ;


			// create the users relation

			file = new File("./data_users") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumUsers/5 ; i++) {
				a1 = "Oscar" + Integer.toString(i) ; // user name
				age = ( generator.nextInt(80) + 13 ) ;// user age
				a2 = Integer.toString ( age) ;
				a3 = "Fayetteville";	// user city 
				a4 = "NC" ;  // user state
				a5 = "2015-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + ","+ a5 + "\n";

				bw.write(tuple) ;

				a1 = "Bobby" + Integer.toString(i) ; // user name
				age = ( generator.nextInt(80) + 13 ) ;// user age
				a2 = Integer.toString ( age) ;
				a3 = "Aurora";	// user city 
				a4 = "CO" ;  // user state
				a5 = "2016-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + ","+ a5 + "\n";

				bw.write(tuple) ;

				a1 = "Susie" + Integer.toString(i) ; // user name
				age = ( generator.nextInt(80) + 13 ) ;// user age
				a2 = Integer.toString ( age) ;
				a3 = "Lincoln";	// user city 
				a4 = "NE" ;  // user state
				a5 = "2017-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + ","+ a5 + "\n";

				bw.write(tuple) ;

				a1 = "Jamiya" + Integer.toString(i) ; // user name
				age = ( generator.nextInt(80) + 13 ) ;// user age
				a2 = Integer.toString ( age) ;
				a3 = "Philadelphia";	// user city 
				a4 = "PA" ;  // user state
				a5 = "2019-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + ","+ a5 + "\n";

				bw.write(tuple) ;

				a1 = "Nadine" + Integer.toString(i) ; // user name
				age = ( generator.nextInt(80) + 13 ) ;// user age
				a2 = Integer.toString ( age) ;
				a3 = "Charlotte";	// user city 
				a4 = "NC" ;  // user state
				a5 = "2018-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + ","+ a5 + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;


			// create the artists relation

			file = new File("./data_artists") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumArtists/10 ; i++) {
				a1 = "Young Nudy" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Atlanta";	// city 
				a4 = "GA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "21 Savage" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Atlanta";	// city 
				a4 = "GA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "J. Cole" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Fayetteville";	// city 
				a4 = "NC" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "J.I.D." + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Atlanta";	// city 
				a4 = "GA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "SZA" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "St. Louis";	// city 
				a4 = "MO" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "Megan Thee Stallion" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Houston";	// city 
				a4 = "TX" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "Sade" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Ibadan";	// city 
				a4 = "Nigeria" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "The Isley Brothers" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Cincinnati";	// city 
				a4 = "OH" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "Rico Nasty" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Palmer Park";	// city 
				a4 = "MD" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

				a1 = "MF DOOM" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Long Island";	// city 
				a4 = "NY" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;

			}
			bw.close() ;

			// create the producer relation
			// use same data for engineers only

			file = new File("./data_producers") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumArtists/10 ; i++) {
				a1 = "Pi'erre Bourne" + Integer.toString(i) ; //  name
				age = ( generator.nextInt(80) + 18 ) ;//  age
				a2 = Integer.toString ( age) ;
				a3 = "Queens";	//  city 
				a4 = "NY" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Fayetteville";	// city 
				a4 = "NC" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "MF DOOM" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Long Island";	// city 
				a4 = "NY" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "Carter Lang" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Los Angeles";	// city 
				a4 = "CA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "Kenny Beats" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Los Angeles";	// city 
				a4 = "CA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "Juciy J" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Memphis";	// city 
				a4 = "TN" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "Mike Pela" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "London";	// city 
				a4 = "England" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
				
				a1 = "Robert Lord" + Integer.toString(i) ; // artist name
				age = ( generator.nextInt(80) + 18 ) ;// age
				a2 = Integer.toString ( age) ;
				a3 = "Chicago";	// city 
				a4 = "IL" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + "," + a4  + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;

			// create the music label relation
			file = new File("./data_labels") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumArtists/10 ; i++) {
				a1 = "Young Nudy LLC" + Integer.toString(i) ; //  name
				a2 ="Atlanta";	// city 
				a3 = "GA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;

				a1 = "Slaughter Gang LLC" + Integer.toString(i) ; //  name
				a2 ="Atlanta";	// city 
				a3 = "GA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;

				a1 = "Dreamville" + Integer.toString(i) ; //  name
				a2 = "Charlotte";	// city 
				a3 = "NC" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;

				a1 = "Top Dawg Entertainment" + Integer.toString(i) ; //  name
				a2 ="Los Angeles";	// city 
				a3 = "CA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;
				
				a1 = "Universal Music Group" + Integer.toString(i) ; //  name
				a2 = "Santa Monica";	// city 
				a3 = "CA" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;
				
				a1 = "Def Jam Recordings" + Integer.toString(i) ; //  name
				a2 = "Charlotte";	// city 
				a3 = "NC" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;
				
				a1 = "Motown Records" + Integer.toString(i) ; //  name
				a2 = "Detroit";	// city 
				a3 = "MI" ;  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;
				
				a1 = "Sony Music Entertainment" + Integer.toString(i) ; //  name
				a2 = "New York";	// city 
				a3 = "NY";  //  state
				tuple = a1 + "," + a2 + "," + a3 + ","   + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;


			// create the songs relation

			file = new File("./data_songs") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumSongs/10 ; i++) {
				a1 = "Hot Wings" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Dirty K" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Love Yourz" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Never" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Good Days" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Hot Girl Summer" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Kiss of Life" + Integer.toString(i) ; // song name
				a2 = "R&B/Soul"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(0);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString(i) ; // song name
				a2 = "R&B/Soul"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1975)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(0); // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "Don't Like Me" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;

				a1 = "One Beer" + Integer.toString(i) ; // song name
				a2 = "Hip-Hop/Rap"; //genre
				a3 = Integer.toString(generator.nextInt(25)+1995)+ "-" + Integer.toString(generator.nextInt(12)+1) + 
						"-" + Integer.toString(generator.nextInt(28)+1) ; //date joined;	// date 
				a4 = Integer.toString(1);  // isExplicit
				a5 = Integer.toString(generator.nextInt(700000000) + 1); //numListens
				tuple = a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;



			// NOTE: we know there are sailor tuples for sid 1..NumSailors
			//       at that there are boat tuples for bid 1..NumBoats,
			//       so we just draw random numbers from those ranges

			//create the listens relation
			file = new File("./data_listens") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumListens/5 ; i++) {
				// user name
				a1 = "Oscar" + Integer.toString( generator.nextInt(NumUsers/5)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			

			for (int i = 1 ; i <= NumListens/5 ; i++) {
				// user name
				a1 = "Jamiya" + Integer.toString( generator.nextInt(NumUsers/5)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			

			for (int i = 1 ; i <= NumListens/5 ; i++) {
				// user name
				a1 = "Nadine" + Integer.toString( generator.nextInt(NumUsers/5)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			

			for (int i = 1 ; i <= NumListens/5 ; i++) {
				// user name
				a1 = "Bobby" + Integer.toString( generator.nextInt(NumUsers/5)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			

			for (int i = 1 ; i <= NumListens/5 ; i++) {
				// user name
				a1 = "Susie" + Integer.toString( generator.nextInt(NumUsers/5)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}		
			bw.close() ;

			// create the performs relation
			file = new File("./data_performs") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumSongs/10 ; i++) {
				// user name
				a1 = "Young Nudy" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// num producers
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			
				a1 = "21 Savage" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J.I.D" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "SZA" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Megan Thee Stallion" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Sade" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "The Isley Brothers" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Rico Nasty" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "MF DOOM" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;

			// create the makes relation
			file = new File("./data_makes") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumSongs/10 ; i++) {
				// user name
				a1 = "Pi'erre Bourne" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// num producers
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			
				a1 = "Pi'erre Bourne" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Carter Lang" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Juicy J" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Mike Pela" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Robert Lord" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Kenny Beats" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "MF DOOM" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}		
			
			bw.close() ;

			// create the mixes and masters relation
			file = new File("./data_mixes_and_masters") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumSongs/10 ; i++) {
				// user name
				a1 = "Pi'erre Bourne" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// num producers
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			
				a1 = "Pi'erre Bourne" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "J. Cole" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(generator.nextInt(500)+1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Carter Lang" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Juicy J" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Mike Pela" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Robert Lord" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "Kenny Beats" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
				
				a1 = "MF DOOM" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				// times listened to
				a3 = Integer.toString(1) ;

				tuple = a1 + "," + a2 + "," + a3 + "\n";

				bw.write(tuple) ;
			}
			bw.close() ;

			// create the sources relation
			file = new File("./data_sources") ;
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;

			for (int i = 1 ; i <= NumSongs ; i++) {
				// user name
				a1 = "Young Nudy LLC" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;

				// song name
				a2 = "Hot Wings" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;


				tuple = a1 + "," + a2 + "," + "\n";

				bw.write(tuple) ;
			
			
				a1 = "Slaughter Gang LLC" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				
				a2 = "Dirty K" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Dreamville" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Love Yourz" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Dreamville" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Never" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Top Dawg Entertainment" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Good Days" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Universal Music Group" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Hot Girl Summer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Def Jam Recordings" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Kiss of Life" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Motown Records" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "This Old Heart Of Mine (Is Weak For You)" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;
				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Sony Music Entertainment" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "Don't Like Me" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				tuple = a1 + "," + a2 + "," + "\n";
				bw.write(tuple) ;
				
				a1 = "Sony Music Entertainment" + Integer.toString( generator.nextInt(NumArtists/10)+1 ) ;
				// song name
				a2 = "One Beer" + Integer.toString( generator.nextInt(NumSongs/10)+1 ) ;

				tuple = a1 + "," + a2 + "," +  "\n";

				bw.write(tuple) ;
			}
			bw.close() ;

		}
		catch (IOException e) {
			e.printStackTrace() ;
		}




	}
}

